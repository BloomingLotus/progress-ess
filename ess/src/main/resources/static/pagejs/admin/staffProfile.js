/**
 * 
 */
var AppRouter = Backbone.Router.extend({
	initialize : function(options) {
		this.defaultBreadCrumb = Handlebars.compile($("#defaultBreadCrumbTemplate").html());
		this.newFormBreadCrumb = Handlebars.compile($("#newFormBreadCrumbTemplate").html());
		this.editFormBreadCrumb = Handlebars.compile($("#editFormBreadCrumbTemplate").html());
		this.$breadcrubmEl = $("#breadcrumb");
		
		if(options.formView != null) {
			this.formView = options.formView;	
		} 
		if(options.searchView != null) {
			this.searchView = options.searchView;
		}
		if(options.tableResultView != null) {
			this.tableResultView = options.tableResultView;
		}
		
	},
	routes: {
        "search" : "search",
        "Employee/:id" : "editForm",
        "*actions": "defaultRoute" // Backbone will try match the route above first
    },
    
    defaultRoute: function(action) {
    	// set breadcrumb
    	this.$breadcrubmEl.html(this.defaultBreadCrumb());
    	
    	// no table result
    	this.tableResultView.$el.empty();
    	
    	// no form
    	this.formView.$el.empty();

    	// show search
    	this.searchView.render();  	
    	
    	//this.searchWithModelAndPage(this.searchView.searchModel, 1);
    },
    searchWithModelAndPage: function(model, pageNum) {
    	// now table result
    	this.tableResultView.renderWithSearchModel(model, pageNum);
    },
    search: function() {
    	// set breadcrumb
    	this.$breadcrubmEl.html(this.defaultBreadCrumb());

    	// show search
    	this.searchView.render();
    	// no form
    	this.formView.$el.empty();
    	// no table result
    	this.tableResultView.render();
    },
    
    editForm: function(id){
    	this.searchView.$el.empty();
    	this.tableResultView.$el.empty()
    	var json={};
    	json.companyId=id;
    	this.$breadcrubmEl.html(this.editFormBreadCrumb(json));
    	
    	this.formView.editForm(id);
    }
    
    
});


var SearchView = Backbone.View.extend({
    initialize: function(options){
    	this.searchViewTemplate = Handlebars.compile($("#searchViewTemplate").html());

    	this.searchModel = new ess.Model.Employee();
    	this.searchModel.set("enFirstName", "");
    	this.searchModel.set("enLastName", "");
    	
    },
    
    events: {
    	"change .formSlt": "onChangeFormSlt",
    	"change .formTxt" : "onChangeFormTxt",
    	
    	"click #searchBtn" : "onClickSearchBtn",
    	"click #clearFormBtn" : "onClickClearFormBtn",
    	"submit #searchForm" : "onSubmitSearchForm"
    		
    },
    
    onClickClearFormBtn: function(e) {
    	this.searchModel = new ess.Model.Employee();
    	appRouter.search();
    },
    onSubmitSearchForm: function(e) {
    	this.onClickSearchBtn(e);
    	return false;
    },
    onChangeFormTxt: function(e) {
    	var value = $(e.currentTarget).val();
		var field=$(e.currentTarget).attr('data-field'); 
		this.searchModel.set(field, value);
    },
    onClickSearchBtn:function(e) {
    	appRouter.searchWithModelAndPage(this.searchModel, 1);
    },
    onChangeFormSlt: function(e) {
    	//get healthZone val
    	var id=$(e.currentTarget).val();
    	var field=$(e.currentTarget).attr('data-field'); 
    	
    	var model;
    	
    	if(id == 0) {
    		this.searchModel.set(field, null);
    	} else {
    		this.searchModel.set(field, model);
    	}
    	
    },
    resetForm: function() {
    	this.searchModel = new ess.Model.Employee();
    	this.render();
    }, 
    
    render: function() {
    	var json = {};
    	json.searchModel = this.searchModel.toJSON();
    	
    	this.$el.html(this.searchViewTemplate(json));
    	
    	return this;
	}	

});

var TableResultView = Backbone.View.extend({ 
	initialize: function(options){
		this.searchResults = new ess.Page.Employees();
		this.tableResultViewTemplate = Handlebars.compile($("#tableResultViewTemplate").html());
	},
	events: {
		"click .editBtn" : "onClickEditBtn",

    	"click .btnPageNav" : "onClickBtnPageNav",
    	"change #pageNavTxt" : "onChangePageNavTxt"
	},
	onChangePageNavTxt : function(e) {

		var newValue = $(e.currentTarget).val();
		var oldValue = $(e.currentTarget).attr('data-value');
		
		if(parseInt(newValue) > 0 && parseInt(newValue) <= this.searchResults.page.totalPages ) {
			
			$(e.currentTarget).attr('data-value', newValue);
			this.renderWithPage(parseInt(newValue));
			
		} else {
			alert('กรุณาระบุหน้าระหว่างเลข 1 ถึง '+ this.searchResults.page.totalPages);
			$(e.currentTarget).val(oldValue);
		}
		
		return false;
	},
    onClickBtnPageNav: function(e) {
    	var pageNum = $(e.currentTarget).attr('data-targetPage');
    	
    	if(pageNum > 0) {
    		this.renderWithPage(pageNum);
    	}
    },	
	onClickEditBtn: function(e) {
		var researchId = $(e.currentTarget).parents('tr').attr("data-id");
		appRouter.navigate("Employee/"+researchId, {trigger: true});
	},
	
	renderWithSearchModel: function(searchModel, pageNum) {
		this.searchModel = searchModel;
		this.pageNum = pageNum;
		this.render();
	},
	
	renderWithPage: function(pageNum) {
		this.pageNum = pageNum;
		this.render();
	},
	
	render: function() {
		if(this.searchModel != null) {
			__loaderInEl($(this.el));
			this.searchResults.fetch({
				url: appUrl('Employee/search'),
	    		type: 'POST',
	    		data: {
	    			enFirstName: this.searchModel.get('enFirstName'),
	    			pageNum: this.pageNum
	    		},
	    		success: _.bind(function(collection, response, options) {
	    			
					var json = {};
					json.page = this.searchResults.page;
					json.content = this.searchResults.toJSON();
					this.$el.html(this.tableResultViewTemplate(json));
	    		}, this)
	    	});
		}
		return this;
	}
});

var FormView = Backbone.View.extend({
	/**
	 * @memberOf FormView
	 */
	 
	 initialize: function(options){
		 this.formViewTemplate = Handlebars.compile($("#formViewTemplate").html());
	 },
	 events: {
		 "change .formSlt": "onChangeFormSlt",
		 "change .formTxt" : "onChangeTxtSlt",
		 "change input[type=radio]": "onChangeRadio",
		 
		"click #saveFormBtn" : "onClickSaveFormBtn",
		"click #backBtn" : "onClickBackBtn"
				 
		},
		
		
	onChangeRadio: function(e) {
		var value = $(e.currentTarget).val();
		var field=$(e.currentTarget).attr('data-field'); 
		this.model.set(field, value);
	},
 	onClickSaveFormBtn: function(e) {
		var validated = true;
		
		// we'll validate 
		this.$el.find('.formTxt').each(function(index, el){
			if( ($(el).val() == null ||  $(el).val().length == 0) && 
					$(el).attr('required') != null)	{
				$(el).parents('.form-group').addClass('has-error has-feedback');
				$(el).parent().after('<span class="fa fa-question-circle form-control-feedback"></span>');
				
				validated = false;
				
			}
		});
		
		if(this.model.get('action') == null) {
			alert('กรุณาระบุการอนุมัติการแก้ไข');
			validated = false;
		}
		
		if(!validated) {
			alert ('กรุณากรอกข้อมูลให้ครบถ้วน');
			return false;
		}
		
		this.model.save(null, {
			success:_.bind(function(model, response, options) {
				if(response.status != 'SUCCESS') {
					alert(response.status + " with error: \n" + response.message);
					
					// undo the saving 
					this.model.set('action', null);
				} else {

					alert("บันทึกข้อมูลแล้ว");
				}
				this.render();
		},this)});
	},
	onClickBackBtn: function(e) {
		appRouter.navigate("search", {trigger: true});
	},

	onChangeTxtSlt : function(e) {
		var value = $(e.currentTarget).val();
		
		if(value != null && value.length > 0) {
			// reset error
	    	$(e.currentTarget).parents('.form-group').removeClass('has-error');
	    	$(e.currentTarget).parents('.form-group').find('.form-control-feedback').remove()
		}
		
		var field=$(e.currentTarget).attr('data-field'); 
		this.model.set(field, value);
	},
	
	onChangeFormSlt: function(e) {
    	//get healthZone val
    	var id=$(e.currentTarget).val();
    	var field=$(e.currentTarget).attr('data-field');
    	
    	// reset error
    	$(e.currentTarget).parents('.form-group').removeClass('has-error');
    	
    	var model;
    	
    	 if(field == 'journalType') {
    		model = smt.Model.DV_JournalType.findOrCreate({id:id});
    	} else {
    		return;
    	}
    	this.model.set(field, model);
    	
    },
	
	
	editForm: function(id) {
		__loaderInEl(this.$el);
		this.model = ess.Model.Employee.findOrCreate({id: id});
		var formModel = this.model;
		formModel.fetch({
			success: _.bind(function() {
				// will have to get all infomation!
				var edu = new ess.Collection.Educations();
				edu.url=appUrl('Employee/'+this.model.get('id')+'/Educations');
				var proj = new ess.Collection.ProjectOnHands();
				proj.url=appUrl('Employee/'+this.model.get('id')+'/ProjectOnHands');
				var workExp = new ess.Collection.WorkExperiences();
				workExp.url=appUrl('Employee/'+this.model.get('id')+'/WorkExperiences');
				var comExp = new ess.Collection.ComputerExperiences();
				comExp.url=appUrl('Employee/'+this.model.get('id')+'/ComputerExperiences');
				var certificates =  new ess.Collection.Certifieds();
				certificates.url=appUrl('Employee/'+this.model.get('id')+'/Certifieds');
				
					$.when( edu.fetch(), proj.fetch(),workExp.fetch(), certificates.fetch(), comExp.fetch() ).done(
						_.bind(function ( eduData, projData, workExpData, certifiedData, comExpData ) {
							formModel.set('educations', edu);
							formModel.set('projectOnHands', proj);
							formModel.set('workExperiences', workExp);
							formModel.set('certificates', certificates);
							formModel.set('computerExperiences', comExp);
							
							this.render();	
					},this));
			},this)
		});
		
	},
	render: function() {
		var json={};
		json.model = this.model.toJSON();
		
		this.$el.html(this.formViewTemplate(json));

		return this;
	}
});
