function appUrl(url) {
	return '/ess/service/'+url;
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

ess.Model.Employee = Backbone.RelationalModel.extend({
	relations: [{
		type: Backbone.HasMany,
		key: 'educations',
		relatedModel: 'ess.Model.Education'
	}],
	urlRoot: appUrl('Employee')
});

})();