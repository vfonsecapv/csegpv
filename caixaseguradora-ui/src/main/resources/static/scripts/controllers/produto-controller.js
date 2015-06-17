
app.controller('produtoCtrl', function ($scope, $http) {
    
	$scope.produtos = [];

	$http.get('/produtos').success(function(data) {
		$scope.produtos = data;
	});
	
});
