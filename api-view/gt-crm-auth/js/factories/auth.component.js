(function() {

    'use strict';

    angular.module('appCRM')
        .factory('auth', ctrlAuth);

    ctrlAuth.$inject = ['$cookies', '$location', '$window'];

    function ctrlAuth($cookies, $location, $window) {
        return {

            login: function(username, password, role) {
                //creamos la cookie con el nombre que nos han pasado
                //$cookies.put('username', username);
                //$cookies.put('password', password);
                //$cookies.put('role', role);

                localStorage.setItem("username", username);
                localStorage.setItem("password", "********");
                localStorage.setItem("role", role);

                //mandamos a la home
                $window.location.href = "/gt-crm-web/#/";
            }
        }


    }

})();