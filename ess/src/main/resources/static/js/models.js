function appUrl(url) {
	return '/ess/service/'+url;
}

function appStaticUrl(url) {
	return '/ess/static/'+url;
}

(function(){

window.ess = {
  Model: {},
  Collection: {},
  Page: {},
  View: {}
};

Backbone.PageCollection = Backbone.Collection.extend({
	parse: function(response) {
		if(response.status == 'SUCCESS') {
			this.page = {};
			this.page.first = response.data.first;
	
			this.page.last = response.data.last;
			this.page.lastPage = response.data.lastPage;
			this.page.firstPage = response.data.firstPage;
			this.page.totalElements = parseInt(response.data.totalElements);
			this.page.totalPages = parseInt(response.data.totalPages);
			this.page.size = parseInt(response.data.size);
			this.page.number = parseInt(response.data.number);
			this.page.pageNumber = parseInt(response.data.number) + 1;
			this.page.numberOfElements = parseInt(response.data.numberOfElements);
			this.page.nextPage = this.page.pageNumber+1;
			this.page.prevPage = this.page.pageNumber-1;
			return response.data.content;
		}
		return null;
	}
});


ess.Model.Education = Backbone.RelationalModel.extend({
	urlRoot: appUrl('Education')
})

ess.Collection.Educations = Backbone.Collection.extend({
	model: ess.Model.Education,
	url: appUrl('Education/findAllEducation')
});

ess.Model.WorkExperience = Backbone.RelationalModel.extend({
	urlRoot: appUrl('WorkExperience')
})

ess.Collection.WorkExperiences = Backbone.Collection.extend({
	model: ess.Model.WorkExperience,
	url: appUrl('WorkExperience/findAllWorkExperience')
});

ess.Model.ComputerExperience = Backbone.RelationalModel.extend({
	urlRoot: appUrl('ComputerExperience')
})

ess.Collection.ComputerExperiences = Backbone.Collection.extend({
	model: ess.Model.ComputerExperience,
	url: appUrl('ComputerExperience/findAllComputerExperience')
});

ess.Model.ProjectOnHand = Backbone.RelationalModel.extend({
	urlRoot: appUrl('ProjectOnHand')
})

ess.Collection.ProjectOnHands = Backbone.Collection.extend({
	model: ess.Model.ProjectOnHand,
	url: appUrl('ProjectOnHand/findAllProjectOnHand')
});

ess.Model.Training = Backbone.RelationalModel.extend({
	urlRoot: appUrl('Training')
})

ess.Collection.Trainings = Backbone.Collection.extend({
	model: ess.Model.Training,
	url: appUrl('Training/findAllTraining')
});

ess.Model.Certified = Backbone.RelationalModel.extend({
	urlRoot: appUrl('Certified')
})

ess.Collection.Certifieds = Backbone.Collection.extend({
	model: ess.Model.Certified,
	url: appUrl('Certified/findAllCertified')
});

ess.Model.Family = Backbone.RelationalModel.extend({
	urlRoot: appUrl('Family')
})

ess.Collection.Familys = Backbone.Collection.extend({
	model: ess.Model.Family,
	url: appUrl('Family/findAllFamily')
});

ess.Model.EmergencyContact = Backbone.RelationalModel.extend({
	urlRoot: appUrl('EmergencyContact')
})

ess.Collection.EmergencyContacts = Backbone.Collection.extend({
	model: ess.Model.EmergencyContact,
	url: appUrl('EmergencyContact/findAllEmergencyContact')
});

ess.Model.Address = Backbone.RelationalModel.extend({
	urlRoot: appUrl('Address')
})

ess.Collection.Addresses = Backbone.Collection.extend({
	model: ess.Model.Address,
	url: appUrl('EmergencyContact/Address')
});

ess.Model.Employee = Backbone.RelationalModel.extend({
	relations: [{
		type: Backbone.HasMany,
		key: 'educations',
		relatedModel: 'ess.Model.Education'
	}],
	urlRoot: appUrl('Employee')
});
ess.Page.Employees = Backbone.PageCollection.extend({
	model: ess.Model.Employee,
	url: appUrl('Employee/search')
});



ess.Model.ChangeRequest = Backbone.RelationalModel.extend({
	relations: [{
		type: Backbone.HasOne,
		key: 'createdBy',
		relatedModel: 'ess.Model.Employee'
	},{
		type: Backbone.HasOne,
		key: 'lastUpdatedBy',
		relatedModel: 'ess.Model.Employee'
	}],
	urlRoot: appUrl('ChangeRequest')
});

ess.Model.ChangeRequestLog = Backbone.RelationalModel.extend({
	relations: [{
		type: Backbone.HasOne,
		key: 'actor',
		relatedModel: 'ess.Model.Employee'
	},{
		type: Backbone.HasOne,
		key: 'changeRequest',
		relatedModel: 'ess.Model.ChangeRequest'
	}],
	urlRoot: appUrl('ChangeRequestLog')
});

ess.Page.ChangeRequests = Backbone.PageCollection.extend({
	model: ess.Model.ChangeRequest,
	url: appUrl('ChangeRequest/search')
});

})();