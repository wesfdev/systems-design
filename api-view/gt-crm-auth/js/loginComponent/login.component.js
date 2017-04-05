(function() {

    'use strict';

    angular.module('appCRM')
        .component('login', {
            templateUrl: './js/loginComponent/login.html',
            controller: loginCtrl,
            controllerAs: 'vm'
        });

    loginCtrl.$inject = ['$http', 'auth'];

    function loginCtrl($http, auth) {
        var self = this;
        var server = '';
        self.user = {};
        //la función login que llamamos en la vista llama a la función
        //login de la factoria auth pasando lo que contiene el campo
        //de texto del formulario
        self.login = function() {
            console.log(self.user);
            $http.post("http://172.17.0.2:8989/gt-courier-web/rs/auth/validate-user", self.user)
                .then(function(response) {
                    console.log(response);
                    if (response.data.code == 200) {
                        var usuario = response.data.source;
                        console.log(usuario);
                        //swal("Acceso al sistema", "Se ha logeado con exito.", 'success');
                        auth.login(self.user.usuario, self.user.contrasenia, usuario.perfil);

                    } else {
                        swal("Error", "Usuario/contraseña no validos. Intente de nuevo.", "warning");
                    }
                });


        }

    }


})();