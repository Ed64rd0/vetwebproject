var vetApp = angular.module('vetApp', [ 'ngRoute', 'vetAppCtrl' ]);
vetApp.config([ '$routeProvider', function($routeProvider) {
	$routeProvider.when('/home', {
		templateUrl : 'home',
		controller : 'VetAppCtrl'
	}).
	otherwise({
		redirectTo : '/home'
	});
} ]);