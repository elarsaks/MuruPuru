
/* Angular Module */
  var app = angular.module("website", ["ui.materialize"])

	/* Page Controller */
	.controller('pageCtrl', function($scope, $http){
		
		 var memory = 2; 

		 function getData(memory){
		 	$http.get('/api/pages/' + memory)
		 	.success(function(response){
		 		$scope.pages = response;
		 	})
		 }
		 
		 
	/* Language Buttons */
		$('#eesti').click(function(){	
			memory = 1;
			getData(memory);
		});
		
		$('#english').click(function(){	
			memory = 2;
			getData(memory);
		});
		
		$('#suomi').click(function(){	
			memory = 3;
			getData(memory);
		});
				
		getData(memory);
	});	
