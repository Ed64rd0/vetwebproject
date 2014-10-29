var petCtrl = angular.module('petCtrl', []);

petCtrl.controller('PetCtrl', ['$scope', '$location', 'PetService',
		function($scope, $location, PetService) {
	$scope.types = [];
	
	PetService.getTypes.getTypes(function (aplication) {
		alert("hola");
	});
	
	$scope.savePet = function() {
		alert("hola");
	};
	
}]);