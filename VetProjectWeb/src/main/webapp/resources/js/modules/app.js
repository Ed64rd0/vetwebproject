var vetApp = angular.module('vetApp', [ 'ngRoute', 'services', 'vetAppCtrl' ]);
vetApp.config([ '$routeProvider', function($routeProvider) {
	$routeProvider.when('/home', {
		templateUrl : 'home'
	}).
	otherwise({
		redirectTo : '/home'
	});
} ]);