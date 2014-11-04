var vetApp = angular.module('vetAppCtrl', []);

vetApp.controller('VetAppCtrl', ['$scope', 'GeneralVetService',
  function($scope, GeneralVetService) {
	
	$scope.genders;
	$scope.species;

	GeneralVetService.getOptions().$promise.then(function (application) {
		if (application.responseType === 'SUCCESS') {
			$scope.genders = application.object.genders;
			$scope.species = application.object.species;
		}
	});
	
}]);