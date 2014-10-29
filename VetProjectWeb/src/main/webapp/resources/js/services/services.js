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
		getTypes : $resource('pet/getTypes', {}, {
			getTypes: {method: 'GET', params: {}, isArray: false}
		}),
		getRaces : $resource('pet/getRaces/:typeId', {typeId: '@id'}, {
			getRaces: {method: 'GET', params: {}, isArray: false}
		})
	};
}]);