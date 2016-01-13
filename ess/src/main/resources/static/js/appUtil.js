/**
 * 
 */
//Globally register moment 
moment.locale("th");

// Global variable
__domainName = {
		"Employee" : "ข้อมูลทั่วไป",
		"ProjectOnHand" : "Project On Hand"
}

//Globally register console
if (typeof console === 'undefined') {
    console = { log: function() {} };
}

Handlebars.registerHelper("math", function(lvalue, operator, rvalue, options) {
    lvalue = parseFloat(lvalue);
    rvalue = parseFloat(rvalue);
        
    return {
        "+": lvalue + rvalue,
        "-": lvalue - rvalue,
        "*": lvalue * rvalue,
        "/": lvalue / rvalue,
        "%": lvalue % rvalue
    }[operator];
});

Handlebars.registerHelper('formatNumber', function(number) {
	return addCommas(number);
});

Handlebars.registerHelper('formatTimeStamp', function(number) {
	return moment(number).format('DD MMMM YYYY HH:mm.ss');
});

Handlebars.registerHelper('formatDate', function(number) {
	return moment(number).format('DD MMMM YYYY');
});

Handlebars.registerHelper('formatDomain', function(domainName) {
	return __domainName[domainName];
});

Handlebars.registerHelper('sltInput', function(model, collection, descField, field, label, labelSize, fieldSize, state) {
//	<div class="form-group">
//    <label for="inputEmail3" class="col-md-4 control-label">ประเภทงานวิจัย</label>
//    <div class="col-md-8">
//		<select class="form-control formSlt" id="journalTypesSlt" data-field="journalType">
//			{{#each this.journalTypes}}
//				<option value="{{id}}" {{#if selected}}selected="selected"{{/if}}>{{description}}</option>
//			{{/each}}
//		</select>				      
//    </div>
//</div>
	
	var s = "" +
			"<div class='form-group'> \n" +
			"	<label for='"+ field+"Txt' class='col-sm-"+labelSize+" control-label'>"+label+"</label> \n" +
			"	<div class='col-sm-"+fieldSize+"'> \n";
	
	s = s + "" +
			"<select class='form-control formSlt' id='"+field+"Slt' data-field='"+field+"'> \n ";
	for(var i=0; i<model[collection].length; i++) {
		var option = model[collection][i];
		var selected = "";
		if(model[collection][i].selected == true) {
			selected += selected='selected';
		}
		s+="<option value='"+model[collection][i].id+"' "+selected+">"+model[collection][i][descField]+"</option>"
	}
	s = s+ "</select>\n";
	s = s +	"	</div> \n" +
	"</div>"; 
	return new Handlebars.SafeString(s);
});


Handlebars.registerHelper('txtInput', function(model, field, label, labelSize, fieldSize, state) {
	
	var aValue = "-";
		
	if(model != null && typeof model[field] != "undefined" && model[field] != null 
		&& ((typeof model[field] == "string" && model[field].length > 0) ||  typeof model[field] == "number")) {
		aValue = model[field];
	} else {
		aValue = '-';
	}
	
	var readOnlyTxt = ""; 
	
	if(state == "readonly") {
		readOnlyTxt = "readonly";
	}
	
	var requiredTxt = "";
	if(state == "required") {
		requiredTxt = " required='required' ";
	}
	
	var s = "" +
			"<div class='form-group'> \n" +
			"	<label for='"+ field+"Txt' class='col-sm-"+labelSize+" control-label'>"+label+"</label> \n" +
			"	<div class='col-sm-"+fieldSize+"'> \n";
	if(state == "static") {
		s= s+ "	<p class='form-control-static' id='"+ field+"Txt' data-field='"+field+"'>"+ aValue +"</p>\n"
	} else {
		s= s+ "	<input type='text' class='form-control formTxt' id='"+ field+"Txt' data-field='"+field+"' value='"+aValue+"' "+readOnlyTxt+requiredTxt+"></input> \n";
	}
			
	s = s +	"	</div> \n" +
			"</div>"; 
	
	return new Handlebars.SafeString(s);
});
Handlebars.registerHelper('txtAreaInput', function(model, field, label, labelSize, fieldSize, state) {
	
	var aValue = "-";
	
	if(model != null && typeof model[field] != "undefined" && model[field] != null 
		&& ((typeof model[field] == "string" && model[field].length > 0) ||  typeof model[field] == "number")) {
		aValue = model[field];
	} else {
		aValue = '-';
	}
	
	var readOnlyTxt = ""; 
	
	if(state == "readonly") {
		readOnlyTxt = "readonly";
	}
	
	var requiredTxt = "";
	if(state == "required") {
		requiredTxt = " required='required' ";
	}
	
	var s = "" +
			"<div class='form-group'> \n" +
			"	<label for='"+ field+"Txa' class='col-sm-"+labelSize+" control-label'>"+label+"</label> \n" +
			"	<div class='col-sm-"+fieldSize+"'> \n";
	if(state == "static") {
		s= s+ "	<p class='form-control-static' id='"+ field+"Txt' data-field='"+field+"'>"+ aValue +"</p>\n"
	} else {
		s= s+  "	<textarea class='form-control formTxa' id='"+ field+"Txa' data-field='"+field +"' "+readOnlyTxt+requiredTxt+">"+aValue+"</textarea> \n";
	}
			
	s = s +	"	</div> \n" +
			"</div>"; 
	
	return new Handlebars.SafeString(s);
});
function __addCommas(nStr)
{
	if(nStr == null || isNaN(nStr)) {
		return '-';
	}
	nStr += '';
	x = nStr.split('.');
	x1 = x[0];
	x2 = x.length > 1 ? '.' + x[1] : '';
	var rgx = /(\d+)(\d{3})/;
	while (rgx.test(x1)) {
		x1 = x1.replace(rgx, '$1' + ',' + '$2');
	}
	return x1 + x2;
}

function __loaderHtml() {
	return "<div style='text-align: center; padding: 20px;'><img src='"+ appStaticUrl('images/loading.gif') +"'/></div>";
}

function __loaderInEl($el) {
	$el.html(__loaderHtml());
	$el.find('.loader').loader();
}

function __setSelectById(array, id) {
	if(id == null) return;
	
	for(var i=0; i< array.length; i++ ) {
		if(array[i].id == id) {
			array[i].selected = true;
			return;
		}
	}
}

function __setSelectByModel(array, model) {
	__setSelectById(array, model.get('id'));
}