function toggleCheckbox(element) {
	var elementValue = element.value;
	alert(elementValue);
}

function changeAll(name) {
	var checks = document.getElementsByName(name);
	var mainCheck = document.getElementById("main").checked;
	for (i = 0; i < checks.length; i++) {
		checks[i].checked = mainCheck;
	}
}