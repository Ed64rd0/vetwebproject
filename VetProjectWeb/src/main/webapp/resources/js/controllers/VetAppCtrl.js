var vetApp = angular.module('vetAppCtrl', []);

vetApp.controller('VetAppCtrl', ['$scope', 'GeneralVetService',
  function($scope, GeneralVetService) {
	
	$scope.genders;
	$scope.species;

	GeneralVetService.getOptions().$promise.then(function (general) {
		if (general.responseType === 'SUCCESS') {
			$scope.genders = general.object.genders;
			$scope.species = general.object.species;
		}
	});
	
}]);