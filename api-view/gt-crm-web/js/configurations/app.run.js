(function() {
    'use strict';

    angular.module('appCRM')
        .run(ctrlRun);

    ctrlRun.$inject = ['$rootScope', 'auth', '$location'];

    function ctrlRun($rootScope, auth, $location) {

        $rootScope.$on('$routeChangeStart', function() {
            $rootScope.viewMain = false;
            $rootScope.viewLogin = true;
            if ($location.path() === "/" || $location.path() === "/home") {
                $rootScope.viewMain = true;
                if (typeof(localstorage.username) == "undefined") {
                    $rootScope.viewLogin = true;
                } else {
                    $rootScope.viewLogin = false;
                }
            } else {
                $rootScope.viewMain = false;
            }
            //llamamos a checkStatus, el cual lo hemos definido en la factoria auth
            //la cuál hemos inyectado en la acción run de la aplicación
            auth.checkStatus();
        })

    }


})();