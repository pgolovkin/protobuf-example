(function() {
    'use strict';

    angular.module('ProtobufTest', [])
        .controller('PersonController', PersonController);

    PersonController.$inject = ['$http'];

    function PersonController($http) {
        var controller = this;

        controller.getPerson = function() {
            $http.get("/proto/person", {responseType: "application/json"}).then(function(result){
                controller.person = result.data;
            });
        }
    }
})();