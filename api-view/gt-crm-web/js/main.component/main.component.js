(function() {

    'use strict';

    angular.module('appCRM')
        .controller('principal', mainController);

    mainController.$inject = ['$rootScope'];

    function mainController($rootScope) {
        var self = this;
        self.usuario = localStorage.username;
        console.log(self.usuario);

        console.log($rootScope.routes);
        console.log($rootScope.menu);


    }


})();