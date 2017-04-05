(function() {

    'use strict';

    angular.module('appCRM')
        .component('principal', {
            templateUrl: './js/main.component/main.component.html',
            controller: mainController,
            controllerAs: 'vm'
        });


    function mainController() {
        var self = this;

    }


})();