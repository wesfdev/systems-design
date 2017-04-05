(function() {

    angular.module('appCRM')
        .config(ctrlConfig);

    ctrlConfig.$inject = ['$routeProvider'];

    function ctrlConfig($routeProvider) {

        $routeProvider.
        when('/', {
            template: '<login></login>'
        }).
        otherwise({
            redirectTo: '/not-found'
        });

    }



})();