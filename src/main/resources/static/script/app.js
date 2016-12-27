(function() {
    'use strict';

    angular.module('ProtobufTest', [])
        .controller('PersonController', PersonController);

    PersonController.$inject = ['$http'];
    function PersonController($http) {

        var controller = this;
        $http.get("/proto/person", {responseType: "arraybuffer"}).then(function(result){
            controller.words = result.data;
            console.log(controller.words);
        });
    }
})();