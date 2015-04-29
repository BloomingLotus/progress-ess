/**
 * 
 */
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

Handlebars.registerHelper('txtInput', function(model, field, label, labelSize, fieldSize, state) {
	
	var aValue = "";
	
	if(model[field] != null) {
		aValue = model[field];
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
	return "<div class='loader-center'><div class='loader'></div>";
}

function __loaderInEl($el) {
	$el.html(__loaderHtml());
	$el.find('.loader').loader();
}

function __setSelect(array, model) {
	if(model == null) return;
	
	for(var i=0; i< array.length; i++ ) {
		if(array[i].id == model.get('id')) {
			array[i].selected = true;
			return;
		}
	}
}