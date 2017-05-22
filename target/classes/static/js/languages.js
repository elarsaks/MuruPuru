	
/* Set starting language and save it to the localStorage */
	var memory = 2;
	localStorage.setItem('memory', 2);

/* Angular Module */
var app = angular.module("website", [ "ui.materialize" ])

/* Page Controller */
.controller('pageCtrl', function($scope, $http) {

	function getData(memory) {
		$http.get('/api/pages/' + memory).success(function(response) {
			$scope.pages = response;
		})
	}

	/* Language Buttons */
	$('#eesti').click(function() {
		memory = 1;
		getData(memory);
		localStorage.setItem('memory', memory);
	});

	$('#english').click(function() {
		memory = 2;
		getData(memory);
		localStorage.setItem('memory', memory);
	});

	$('#suomi').click(function() {
		memory = 3;
		getData(memory);
		localStorage.setItem('memory', memory);
	});

	getData(memory);
});




