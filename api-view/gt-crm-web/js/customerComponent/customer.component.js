(function() {

    'use strict';

    angular.module('appCRM')
        .component('customer', {
            templateUrl: './js/customerComponent/customerComponent.html',
            controller: ctrlCustomer,
            controllerAs: 'vm'
        });


    ctrlCustomer.$inject = [];

    function ctrlCustomer() {
        var self = this;
        self.a = "prueba";
        self.obj = {};
        self.array = [
            { id: 1, name: "sadad", edad: 32 },
            { id: 2, name: "5gfdgd", edad: 31 },
            { id: 3, name: "bvnfh", edad: 34 }
        ];

        self.save = function(param) {
            self.array.push(param);
            console.log(JSON.stringify(param));
        }


    }


})();