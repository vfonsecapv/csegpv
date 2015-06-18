
app.controller('produtoCtrl', function ($scope, $http) {
    
	$scope.produtos = [];

	$http.get('/produtos/lista').success(function(data) {
		$scope.produtos = data;
	});
	
});
