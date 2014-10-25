var vetApp = angular.module('vetApp', [ 'ngRoute', 'services', 'vetAppCtrl', 'customerCtrl' ]);
vetApp.config([ '$routeProvider', function($routeProvider) {
	$routeProvider.when('/home', {
		templateUrl : 'home'
	}).
	when('/customer', {
		templateUrl : 'customer'
	}).
	otherwise({
		redirectTo : '/home'
	});
} ]);