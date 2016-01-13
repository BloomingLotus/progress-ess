/**
 * 
 */

var AppRouter = Backbone.Router.extend({
	initialize: function(options) {
		if(options.mainEmployeeView != null) {
			this.mainEmployeeView = options.mainEmployeeView; 
		}
		// this.educationTabView = new EducationTabView({el: "#educationTab"});
		this.educationTabView = new TabView({
			el: "#EducationTab",
			tabName: "Education",
			newCollection: function() { return new ess.Collection.Educations},
			newModel:function() {return new ess.Model.Education},
			modelType: ess.Model.Education
		});
		
		this.computerExperienceTabView = new TabView({
			el: "#ComputerExperienceTab",
			tabName: "ComputerExperience",
			newCollection: function() { return new ess.Collection.ComputerExperiences},
			newModel:function() {return new ess.Model.ComputerExperience},
			modelType: ess.Model.ComputerExperience
		});
		
		this.projectOnHandTabView = new TabView({
			el: "#ProjectOnHandTab",
			tabName: "ProjectOnHand",
			newCollection: function() { return new ess.Collection.ProjectOnHands},
			newModel:function() {return new ess.Model.ProjectOnHand},
			modelType: ess.Model.ProjectOnHand
		});
		
		this.trainingTabView = new TabView({
			el: "#TrainingTab",
			tabName: "Training",
			newCollection: function() { return new ess.Collection.Trainings},
			newModel:function() {return new ess.Model.Training},
			modelType: ess.Model.Training,
			datepickerField: ['beginDate', 'endDate']
		});
		
		this.workExperienceTabView = new TabView({
			el: "#WorkExperienceTab",
			tabName: "WorkExperience",
			newCollection: function() { return new ess.Collection.WorkExperiences},
			newModel:function() {return new ess.Model.WorkExperience},
			modelType: ess.Model.WorkExperience,
			datepickerField: ['beginDate', 'endDate']
		});
		
		this.certifiedTabView = new TabView({
			el: "#CertifiedTab",
			tabName: "Certified",
			newCollection: function() { return new ess.Collection.Certifieds},
			newModel:function() {return new ess.Model.Certified},
			modelType: ess.Model.Certified,
			datepickerField: ['certifiedDate', 'certifiedExpired']
		});
		
		this.familyTabView = new TabView({
			el: "#FamilyTab",
			tabName: "Family",
			newCollection: function() { return new ess.Collection.Familys},
			newModel:function() {return new ess.Model.Family},
			modelType: ess.Model.Family
		});
		
		this.emergencyContactTabView = new TabView({
			el: "#EmergencyContactTab",
			tabName: "EmergencyContact",
			newCollection: function() { return new ess.Collection.EmergencyContacts},
			newModel:function() {return new ess.Model.EmergencyContact},
			modelType: ess.Model.EmergencyContact
		});
		
		this.registeredAddressTabView = new TabView({
			el: "#RegisteredAddressTab",
			tabName: "RegisteredAddress",
			newCollection: function() { return new ess.Collection.Addresses},
			newModel:function() {return new ess.Model.Address},
			modelType: ess.Model.Address
		});
		
		this.currentAddressTabView = new TabView({
			el: "#CurrentAddressTab",
			tabName: "CurrentAddress",
			newCollection: function() { return new ess.Collection.Addresses},
			newModel:function() {return new ess.Model.Address},
			modelType: ess.Model.Address
		});
	},
	
	routes: {
		"*action" : "defaultRoute"
	},
	
	defaultRoute: function(action) {
		this.mainEmployeeView.render();
		this.educationTabView.render();
		this.computerExperienceTabView.render();
		this.projectOnHandTabView.render();
		this.trainingTabView.render();
		this.workExperienceTabView.render();
		this.certifiedTabView.render();
		this.familyTabView.render();
		this.emergencyContactTabView.render();
		this.currentAddressTabView.render();
		this.registeredAddressTabView.render();
	}
});
/**
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
**/
var TabView = Backbone.View.extend({
	initialize: function(options) {
		this.tabName = options.tabName;
		this.newCollection = options.newCollection;
		this.newModel = options.newModel;
		this.modelType = options.modelType;
		this.datepickerField = options.datepickerField;
		
		this.tabTemplate = Handlebars.compile($("#"+this.tabName +"TabTemplate").html());
		this.collection = this.newCollection();
		
		this.modal = new TabModal({
				el: "#"+this.tabName+"TabModal",
				empId : empId,
				parentView: this,
				tabName: this.tabName,
				datepickerField: this.datepickerField
		});
	},
	events : {
		"click #addBtn" : "onClickAddBtn",
		"click #editBtn" : "onClickEditBtn",
		"click #deleteBtn" : "onClickDeleteBtn",
		"click #addOrUpdateBtn" : "onClickAddOrUpdateBtn"
			
			
	},
	onClickAddOrUpdateBtn : function(e) {
		var id=$(e.currentTarget).attr('data-id'); 
		if(id == null || id.length == 0) {
			this.modal.setModel(this.newModel());
			this.modal.render();
		} else {
			var model = this.modelType.findOrCreate({id: id});
			this.modal.setModel(model);
			this.modal.render();
		}
		
	},
	
	onClickAddBtn: function(e) {
		this.modal.setModel(this.newModel());
		this.modal.render();
	},
	onClickDeleteBtn: function(e) {
		var id=$(e.currentTarget).attr('data-id'); 
		var model = this.modelType.findOrCreate({id: id});
		
		var r = confirm("คุณต้องการลบข้อมูล: " + model.get('id'));
		if (r == true) {
		    model.destroy({
		    	success: _.bind(function() {
		    		alert("ลบข้อมูลเรียบร้อยแล้ว");
		    		this.render();
		    	}, this)
		    });
		} else {
		    return;
		}
	},
	onClickEditBtn: function(e) {
		var id=$(e.currentTarget).attr('data-id'); 
		var model = this.modelType.findOrCreate({id: id});
		this.modal.setModel(model);
		this.modal.render();
	},
	render: function() {
		
		this.collection.fetch({
			url: appUrl('Employee/' + empId + '/'+this.tabName+'s'),
			success: _.bind(function() {
				
				var changeSetModel =  _.where(currentRequests.toJSON(), {domain: this.tabName});
				var json={};
				 if(this.collection != null) {
					
				 	json.collection=this.collection.toJSON();
				 	json.model = json.collection[0];
				 } else {
					 json.collection ={};
					 json.model = {};
				 }
				 
				 if(changeSetModel != null) {
					 
					 for(var i=0; i< changeSetModel.length; i++) {
						 var changeModel = changeSetModel[i];
						 
						 var changeSetJson = JSON.parse(changeModel.newChangeSet);

						 
						 if(changeSetJson.id == null) {
							 changeSetJson.hasChangeSet = true;
							 changeSetJson.changsetIcon = 'fa-plus-circle';
							 changeSetJson.isChangeOrAdd = true;
							 json.collection.push(changeSetJson);
							 
						 } else {
							 var jsonModel =_.findWhere(json.collection, {id: changeSetJson.id});
							 if(jsonModel != null) {
								jsonModel.hasChangeSet = true;
								if(changeModel.currentState == "REQUESTED_CHANGE") {
									jsonModel.isChangeOrAdd = true;
									jsonModel.changsetIcon = 'fa-exclamation-circle';
									for(var key in changeSetJson){
									      jsonModel[key] = changeSetJson[key];
									  }
								} else {
									jsonModel.changsetIcon = 'fa-times-circle';
									jsonModel.isDeleteChangeSet = true;
								}
							}
						 }
					 }
				 }
				 
				 this.$el.html(this.tabTemplate(json));
			}, this)
		})
		
		 return this;
	}
});

var TabModal = Backbone.View.extend({
	 initialize: function(options){
			this.parentView = options.parentView;
			this.empId = options.empId;
			this.tabName = options.tabName;
			this.datepickerField = options.datepickerField;
			this.modalTemplate = Handlebars.compile($("#"+this.tabName+"ModalTemplate").html());
			
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
				 url=appUrl('Employee/' + empId + '/'+this.tabName+'/' );
			 }  else {
				 url=appUrl('Employee/' + empId + '/'+this.tabName+'/' + this.model.get('id') );
			 }
			 
			 console.log(url);
			 
			this.model.save(null, {
				url: url,
				success:_.bind(function(model, response, options) {
					if(response.status != 'SUCCESS') {
						alert(response.status + " :" + response.message);
						
					}
					alert("บันทึกข้อมูลแล้ว");
					
					currentRequests.fetch({
						url: currentRequestsUrl,
						success: _.bind(function() {
							this.parentView.render();
							 this.$el.modal('hide');
						}, this)
					});
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
			 
			 this.$el.find('.modal-title').html("แก้ไขข้อมูล");
			 this.$el.find('.modal-body').html(this.modalTemplate(json));
			 
			 if(this.datepickerField != null) {
				 _.each(this.datepickerField,function(field){
					 var fieldTxt = "#"+field + "Txt";
					 $(fieldTxt).datepicker({
								format: 'dd/mm/yyyy',
								todayBtn: 'linked',
								autoclose : true,
								language: "th",
								orientation: "top left"
					 });
					 
				 },this);
			 }
			 
			 this.$el.modal({keyboard: false, backdrop: 'static'});
			 
			 
		 }
});

/**
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
**/

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
		 var changeSetModel = currentRequests.findWhere({domain: 'Employee'});
		 var changeSet = {};
		 var oldChangeSet = {};
		 if(changeSetModel != null) {
			 changeSet = JSON.parse(changeSetModel.get('newChangeSet'));
			 oldChangeSet = JSON.parse(changeSetModel.get('oldChangeSet'));
		 }
		 if(this.model != null) {
			
			//apply changeset to model
			json.model=this.model.toJSON();
			
			if(changeSetModel != null) {
				for(var key in changeSet){
				      json.model[key] = changeSet[key];
				  }
				json.model.hasChangeSet = true;
			}
			 } else {
			 json.model ={};
		 }
		 
		 this.$el.html(this.mainEmployeeDivTemplate(json));

		 // then change field to new Color
		 for(var key in changeSet) {
			 $('p[data-field='+key+']').addClass('static-form-change-request'); 
		     $('p[data-field='+key+']').parents('.form-group').addClass('has-warning');
		     $('p[data-field='+key+']').after("<i class='fa fa-exclamation-circle form-control-feedback'></i>");
		     $('p[data-field='+key+']').tooltip({title: "ข้อมูลเดิม: " + oldChangeSet[key]})
		  }
		 
		 return this;
	 }
});

var EmployeeBasicInfoModal = Backbone.View.extend({
	 initialize: function(options){
		this.parentView = options.parentView;
		this.model = options.model;
		
		this.employeeBasicInfoModalTemplate = Handlebars.compile($("#employeeBasicInfoModalTemplate").html());
		
		this.titles = new ess.Collection.Titles();
		this.titles.fetch();
		
		this.religions = new ess.Collection.DomainValues();
		this.religions.fetch({
			url: appUrl('Employee/Religions')
		});
		
		this.maritalStatus = new ess.Collection.DomainValues();
		this.maritalStatus.fetch({
			url: appUrl('Employee/MaritalStatus')
		});
		
		this.nationality = new ess.Collection.DomainValues();
		this.nationality.fetch({
			url: appUrl('Employee/Nationality')
		});
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
				alert("ส่งเรื่องขอแก้ไขข้อมูลแล้ว");
				currentRequests.fetch({
					url: currentRequestsUrl,
					success: _.bind(function() {
						this.parentView.render();
						 this.$el.modal('hide');
					}, this)
				});
		},this)});
	 },
	 render: function() {
		 var json={};
		 if(this.model != null) {
		 	json.model=this.model.toJSON();
		 } else {
			 json.model ={};
		 }
		 
		 json.model.titles = this.titles.toJSON();
		 __setSelectById(json.model.titles, json.model.titleId);
		 
		 json.model.religions = this.religions.toJSON();
		 __setSelectById(json.model.religions, json.model.religionId);
		 
		 json.model.maritalStatus = this.maritalStatus.toJSON();
		 __setSelectById(json.model.maritalStatus, json.model.statusId);
		 
		 json.model.nationality = this.nationality.toJSON();
		 __setSelectById(json.model.nationality, json.model.nationalityId);
		 
		 this.$el.find('.modal-title').html("แก้ไขประวัติส่วนบุคคล");
		 this.$el.find('.modal-body').html(this.employeeBasicInfoModalTemplate(json));
		 
		 this.$el.modal({keyboard: false, backdrop: 'static'});
		 
		 
	 }
});