var customerCtrl = angular.module('customerCtrl', []);

customerCtrl.controller('CustomerCtrl', ['$scope', '$location', 'CustomerService',
  function ($scope, $location, CustomerService) {
  	
  	$scope.saveCustomer = function() {
  		var customer = $scope.customer;
  		CustomerService.saveCustomer(customer, function (application) {
  			if (application.responseType === 'SUCCESS') {
  				$location.path('/pet');
  			}
  		});
  	}
  }

]);