var vetApp = angular.module('vetAppCtrl', []);

vetApp.controller('VetAppCtrl', ['$scope', 'GeneralVetService',
  function($scope, GeneralVetService) {

	$scope.general = "";

	GeneralVetService.getOptions().$promise.then(function (general) {
		$scope.general = general;
	});
	
	$scope.test2 = "HOLA";
	
}]);