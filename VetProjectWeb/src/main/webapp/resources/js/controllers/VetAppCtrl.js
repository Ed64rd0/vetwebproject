var vetApp = angular.module('vetAppCtrl', []);

vetApp.controller('VetAppCtrl', ['$scope', 'GeneralVetService',
  function($scope, GeneralVetService) {
	
	$scope.customer;
	$scope.pets;

	GeneralVetService.getOptions().$promise.then(function (application) {
		$scope.customer = application.customer;
		$scope.pets = application.pets;
	});
	
}]);