(function() {
    'use strict';

    angular.module('ProtobufTest', [])
        .controller('PersonController', PersonController);

    PersonController.$inject = ['$http'];

    function PersonController($http) {
        var controller = this;

        controller.getPerson = function() {
            $http.get("/proto/person", {responseType: "arraybuffer"}).then(function(result){
                var Person = protobuf.load("script/proto/person.proto", function(err, root) {
                    if (err) throw err;
                    var person = root.lookup("protobufexample.Person");
                    console.log(result.data);
                    controller.person = person.decode(result.data);
                });
            });
        }
    }
})();