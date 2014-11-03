var petCtrl = angular.module('petCtrl', []);

petCtrl.controller('PetCtrl', ['$scope', '$location', 'PetService',
		function($scope, $location, PetService) {
	
	$scope.pet = {'specieId' : 2};
	
	$scope.savePet = function() {
		$scope.testing = 1;
		alert($pet.name);
	};
	
	$scope.test = function(typeId) {
		angular.forEach($scope.species, function(type) {
			if (type.specieId === typeId) {
				$scope.races = type.races;
			}
		});
	};
	
}]);