var vetApp = angular.module('vetApp', [ 'ngRoute', 'services', 'vetAppCtrl', 'customerCtrl', 'petCtrl' ]);
vetApp.config([ '$routeProvider', function($routeProvider) {
	$routeProvider.when('/home', {
		templateUrl : 'home'
	}).
	when('/customer', {
		templateUrl : 'customer'
	}).
	when('/pet', {
		templateUrl : 'pet'
	}).
	otherwise({
		redirectTo : '/home'
	});
} ]);