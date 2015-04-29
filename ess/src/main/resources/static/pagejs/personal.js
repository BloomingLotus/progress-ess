/**
 * 
 */

var AppRouter = Backbone.Router.extend({
	initialize: function(options) {
		if(options.mainEmployeeView != null) {
			this.mainEmployeeView = options.mainEmployeeView; 
		}
		this.educationTabView = new EducationTabView({el: "#educationTab"});
	},
	
	routes: {
		"*action" : "defaultRoute"
	},
	
	defaultRoute: function(action) {
		this.mainEmployeeView.render();
		this.educationTabView.render();
	}
});

var EducationTabModal = Backbone.View.extend({
	 initialize: function(options){
			this.parentView = options.parentView;
			this.empId = options.empId;
			this.educationModalTemplate = Handlebars.compile($("#educationModalTemplate").html());
		 },
		 events: {
			 "click .modalCloseBtn" : "onClickModalCloseBtn",
			 "click .modalSaveBtn" : "onClickModalSaveBtn",
			 "change .formTxt" : "onChangeFormTxt"
				 
		 }, 
		 onChangeFormTxt : function(e) {
			 var value = $(e.currentTarget).val();
			 var field=$(e.currentTarget).attr('data-field'); 
			 this.model.set(field, value);
		 },
		 onClickModalCloseBtn : function(e) {
			 this.parentView.render();
			 this.$el.modal('hide');
		 }, 
		 onClickModalSaveBtn : function(e) {
			 var url="";
			 if(this.model.get('id') == null) {
				 url=appUrl('Employee/' + empId + '/Education/' );
			 }  else {
				 url=appUrl('Employee/' + empId + '/Education/' + this.model.get('id') );
			 }
			 
			 console.log(url);
			 
			this.model.save(null, {
				url: url,
				success:_.bind(function(model, response, options) {
					if(response.status != 'SUCCESS') {
						alert(response.status + " :" + response.message);
					}
					alert("บันทึกข้อมูลแล้ว");
			},this)});
		 },
		 setModel: function(model) {
			this.model = model; 
		 }, 
		 render: function() {
			 var json={};
			 if(this.model != null) {
			 	json.model=this.model.toJSON();
			 } else {
				 json.model ={};
			 }
			 
			 this.$el.find('.modal-title').html("แก้ไขข้อมูลการศึกษา");
			 this.$el.find('.modal-body').html(this.educationModalTemplate(json));
			 
			 this.$el.modal({keyboard: false, backdrop: 'static'});
			 
			 
		 }
});

var EducationTabView = Backbone.View.extend({
	initialize: function(options) {
		this.educationTabTemplate = Handlebars.compile($("#educationTabTemplate").html());
		this.collection = new ess.Collection.Educations();
		
		this.educationTabModal = new EducationTabModal({el: "#educationTabModal", empId : empId, parentView: this});
	},
	events : {
		"click #addEducationBtn" : "onClickAddEducationBtn",
		"click #editEducationBtn" : "onClickEditEducationBtn",
		"click #deleteEducationBtn" : "onClickDeleteEducationBtn"
	},
	onClickAddEducationBtn: function() {
		this.educationTabModal.setModel(new ess.Model.Education());
		this.educationTabModal.render();
	},
	onClickDeleteEducationBtn: function(e) {
		var eduId=$(e.currentTarget).attr('data-id'); 
		var education = ess.Model.Education.findOrCreate({id: eduId});
		
		var r = confirm("คุณต้องการลบข้อมูลการศึกษา: " + education.get('instituteName'));
		if (r == true) {
		    education.destroy({
		    	success: _.bind(function() {
		    		alert("ลบข้อมูลเรียบร้อยแล้ว");
		    		this.render();
		    	}, this)
		    });
		} else {
		    return;
		}
	},
	onClickEditEducationBtn: function(e) {
		var eduId=$(e.currentTarget).attr('data-id'); 
		var education = ess.Model.Education.findOrCreate({id: eduId});
		this.educationTabModal.setModel(education);
		this.educationTabModal.render();
	},
	render: function() {
		
		this.collection.fetch({
			url: appUrl('Employee/' + empId + '/Educations'),
			success: _.bind(function() {
				var json={};
				 if(this.collection != null) {
					
				 	json.collection=this.collection.toJSON();
				 	console.log(json);
				 } else {
					 json.collection ={};
				 }
				 
				 this.$el.html(this.educationTabTemplate(json));
			}, this)
		})
		
		 return this;
	}
});

var MainEmployeeView = Backbone.View.extend({
	 initialize: function(options){
		 this.model = options.model;
		 
		 this.mainEmployeeDivTemplate = Handlebars.compile($("#mainEmployeeDivTemplate").html());
		 this.employeeBasicInfoModal = new EmployeeBasicInfoModal({el: "#employeeBasicModal", model : this.model, parentView: this});
	 },
	 events: {
		 "click #employeeInfoBtn" : "onClickEmployeeInfoBtn"
	 },
	 
	 onClickEmployeeInfoBtn: function(e) {
		 this.employeeBasicInfoModal.render();
	 },
	 render: function() {
		 var json={};
		 if(this.model != null) {
			
		 	json.model=this.model.toJSON();
		 	console.log(json);
		 } else {
			 json.model ={};
		 }
		 
		 this.$el.html(this.mainEmployeeDivTemplate(json));
		 
		 return this;
	 }
});

var EmployeeBasicInfoModal = Backbone.View.extend({
	 initialize: function(options){
		this.parentView = options.parentView;
		this.model = options.model;
		
		this.employeeBasicInfoModalTemplate = Handlebars.compile($("#employeeBasicInfoModalTemplate").html());
	 },
	 events: {
		 "click .modalCloseBtn" : "onClickModalCloseBtn",
		 "click .modalSaveBtn" : "onClickModalSaveBtn",
		 "change .formTxt" : "onChangeFormTxt"
			 
	 }, 
	 onChangeFormTxt : function(e) {
		 var value = $(e.currentTarget).val();
		 var field=$(e.currentTarget).attr('data-field'); 
		 this.model.set(field, value);
	 },
	 onClickModalCloseBtn : function(e) {
		 this.parentView.render();
		 this.$el.modal('hide');
	 }, 
	 onClickModalSaveBtn : function(e) {
		this.model.save(null, {
			success:_.bind(function(model, response, options) {
				if(response.status != 'SUCCESS') {
					alert(response.status + " :" + response.message);
				}
				alert("บันทึกข้อมูลแล้ว");
		},this)});
	 },
	 render: function() {
		 var json={};
		 if(this.model != null) {
		 	json.model=this.model.toJSON();
		 } else {
			 json.model ={};
		 }
		 
		 this.$el.find('.modal-title').html("แก้ไขประวัติส่วนบุคคล");
		 this.$el.find('.modal-body').html(this.employeeBasicInfoModalTemplate(json));
		 
		 this.$el.modal({keyboard: false, backdrop: 'static'});
		 
		 
	 }
});