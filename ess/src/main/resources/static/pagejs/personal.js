/**
 * 
 */

var AppRouter = Backbone.Router.extend({
	initialize: function(options) {
		if(options.mainEmployeeForm != null) {
			this.mainEmployeeForm = options.mainEmployeeForm; 
		}
	},
	
	routes: {
		"*action" : "defaultRoute"
	},
	
	defaultRoute: function(action) {
		console.log(action);
	}
});

var MainEmployeeView = Backbone.View.extend({
	 initialize: function(options){
		 this.mainEmployeeDivTemplate = Handlebars.compile($("#mainEmployeeDivTemplate").html());
	 },
	 events: {
		 
	 },
	 render: function() {
		 var json={};
		 json.model={};
		 
		 this.$el.html(this.mainEmployeeDivTemplate(json));
		 
		 return this;
	 }
});