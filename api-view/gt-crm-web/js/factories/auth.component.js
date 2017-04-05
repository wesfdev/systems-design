(function() {

    'use strict';

    angular.module('appCRM')
        .factory('auth', ctrlAuth);

    ctrlAuth.$inject = ['$location', '$http', '$rootScope'];

    function ctrlAuth($location, $http, $rootScope) {
        var config = {
            secure: true
        };
        var array = {};
        var server = '';
        return {
            routes: function() {
                return $http.get("http://172.17.0.2:8989/gt-courier-web/rs/auth/routes/" + localStorage.role + "/" + localStorage.username);
            },
            mainRoute: function() {
                var url = "http://172.17.0.2:8989/gt-courier-web/rs/auth/main" + $location.path() + "/" + localStorage.username;
                return $http.get(url);
            },
            logout: function() {
                //al hacer logout eliminamos la cookie con $cookieStore.remove
                //$cookieStore.remove("username"),
                //$cookieStore.remove("password");
                //$cookieStore.remove("role");
                localStorage.removeItem("username");
                localStorage.removeItem("password");
                localStorage.removeItem("role");
                //mandamos al login
                $location.path("/login");
            },
            checkStatus: function() {
                if (typeof(localStorage.username) == "undefined") {
                    $location.path("/");

                } else {
                    this.routes().then(function(response) {
                        //$rootScope.routes = []; //Se agrego nueva validacion de rutas
                        $rootScope.routes = response.data.source;
                        /*angular.forEach(response.data.source, function(obj) {
                            $rootScope.routes.push(obj.typeValue);
                        });*/
                        console.log($rootScope.routes);
                        /*if (exists_array($location.path(), $rootScope.routes) && typeof(localStorage.username) != "undefined") {
                            console.log("la ruta es permitida");
                        } else {
                            console.log($location.path());
                            console.log($rootScope.routes);
                            console.log("la ruta no es permitida");
                            swal("Warning", "No tiene los privilegios suficientes.", "warning");
                            $location.path("/");


                        }*/

                        function exists_array(needle, haystack) {
                            var key = '';
                            for (key in haystack) {
                                if (haystack[key].url == needle) {
                                    return true;
                                }
                            }
                            return false;
                        }

                    });

                    this.mainRoute().then(function(response) {
                        $rootScope.menu = response.data.source;
                        console.log($rootScope.menu);
                        /*angular.forEach(response.data.source, function(obj) {
                            if (obj.typeValue == $location.path()) {}
                            $rootScope.menu.push(obj);
                        });*/

                    });

                }

                if (typeof(localStorage.username != "undefined" && $location.path() == "/login")) {
                    $location.path("/dashboard");
                }

            },
            in_array: function(needle, haystack) {
                var key = '';
                for (key in haystack) {
                    if (haystack[key].url == needle) {
                        return true;
                    }
                }
                return false;
            }
        }


    }

})();