var petCtrl = angular.module('petCtrl', []);

petCtrl.controller('PetCtrl', ['$scope', '$location', 'PetService',
		function($scope, $location, PetService) {
	
	$scope.savePet = function() {
//		PetService.savePet($scope.pet, function(application) {
//			$location.path("/service");
//		});
	};

	$scope.changeAnimalType = function(species, typeId) {
		angular.forEach(species, function(type) {
			if (type.specieId === typeId) {
				$scope.races = type.races;
			}
		});
	};
	
}]);