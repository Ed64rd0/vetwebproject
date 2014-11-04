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
}]);

services.factory('PetService', ['$resource', function($resource) {
	return {
		save : $resource('pet/savePet', {}, {
			save: {method: 'POST', params: {}, isArray: false}
		}),
		getPets : $resource('pet/getPets/:customerId', {customerId: '@customerId'}, {
			getPets: {method: 'GET', params: {}, isArray: false}
		})
	};
}]);