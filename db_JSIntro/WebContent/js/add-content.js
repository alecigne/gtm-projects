//alert("Hello!");

var today = new Date();
var hourNow = today.getHours();
var greeting;

if (hourNow < 12) {
	greeting = "Good morning!";
} else {
	greeting = "Good afternoon or night!";
}

document.write('<h3>' + greeting + '</h3>');

var element1 = document.getElementById("id1");
var element2 = document.getElementById("id2");

function myFunction() {
	element1.innerHTML = window.innerWidth;
	element2.innerHTML = window.innerHeight;
}

var element3 = document.getElementById("id3");

function formatDate(date) {
	  var monthNames = [
	    "January", "February", "March",
	    "April", "May", "June", "July",
	    "August", "September", "October",
	    "November", "December"
	  ];

	  var day = date.getDate();
	  var monthIndex = date.getMonth();
	  var year = date.getFullYear();
	  var hours = date.getHours();
	  var minutes = date.getMinutes();
	  var seconds = date.getSeconds();
	  var millis = date.getMilliseconds();

	  return day + ' ' + monthNames[monthIndex] + ' ' + year + ', '+ hours + ':' + minutes + ':' + seconds + '.' + millis 
	}

function myFunction2() {
	var today = new Date();
	element3.innerHTML = formatDate(today);
}