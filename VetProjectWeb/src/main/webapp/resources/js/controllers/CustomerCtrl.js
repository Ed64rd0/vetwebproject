var customerCtrl = angular.module('customerCtrl', []);

customerCtrl.controller('CustomerCtrl', ['$scope', '$location', 'CustomerService',
  function ($scope, $location, CustomerService) {
  	
  	$scope.saveCustomer = function() {
  		
  		var customer = $scope.customer;
  		CustomerService.saveCustomer(customer, function (application) {
  			$scope.customer = application;
  			$location.path('/pet');
  		});
  	}
  }

]);