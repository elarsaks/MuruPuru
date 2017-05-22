
/*	Make content editable when clicked. */
$('.content').click(function() {
	$(this).attr('contenteditable', 'true');
});

/* Save the updated data */
function save() {

	/* Save data to variable */
	var slogan = $('#c_slogan');
	var home = $('#home_d');
	var services = $('#services_d');
	var about = $('#about_d');
	var contact = $('#contact_d');
	var servicesH = $('#servicesH');
	var servH = $('#servH');
	var servTxt = $('#servTxt');
	var aboutTxt = $('#aboutTxt');
	var contactH = $('#contactH');
	var addressH = $('#addressH');
	var addressTxt = $('#addressTxt');
	var phoneH = $('#phoneH');
	var phoneTxt = $('#phoneTxt');
	var eMailTxt = $('#eMailTxt');
	var message = $('#message');
	var eMail = $('#eMail');

	/* Create JSON object with the data */
	var JSONObject = {
		"slogan" : slogan.text(),
		"home" : home.text(),
		"services" : services.text(),
		"about" : about.text(),
		"contact" : contact.text(),
		"servH" : servH.text(),
		"servTxt" : servTxt.text(),
		"aboutTxt" : aboutTxt.text(),
		"addressH" : addressH.text(),
		"addressTxt" : addressTxt.text(),
		"phoneH" : phoneH.text(),
		"phoneTxt" : phoneTxt.text(),
		"eMailTxt" : eMailTxt.text(),
		"message" : message.text(),
		"eMail" : eMail.text(),
	};
	
	
	/* Look from localStorage what language page is open*/
	var memory = localStorage.getItem('memory');
	console.log(memory);

	/* Send data to the database */
	$.ajax({
		type : 'PATCH',
		url : 'http://localhost:8080/api/pages/' + memory,
		contentType : 'application/json; charset=utf-8',
		data : JSON.stringify(JSONObject),
		dataType : 'json',
		async : true,
		success : function(pages) {
			console.log('Updated Successfully!');
		},
		error : function(jqXHR, textStatus, errorThrown) {
			alert(jqXHR.status + ' ' + jqXHR.responseText);
		}
	});
}


/* Save button from big screen menu */
$("#save").click(function() {
	save();
});

/* Save button from mobile menu */
$("#save_M").click(function() {
	save();
});