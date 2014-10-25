var services = angular.module('services', [ 'ngResource' ]);

services.factory('GeneralVetService', ['$resource', function($resource) {
	return $resource('vet/general', {}, {
		getOptions : {method: 'POST', params: {}, isArray: false}
	});
}]);

services.factory('CustomerService', ['$resource', function($resource) {
	return $resource('customer/save', {}, {
		saveCustomer : {method: 'POST', params: {}, isArray: false}
	});
}])