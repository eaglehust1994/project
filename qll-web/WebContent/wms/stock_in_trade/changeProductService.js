
angular.module('MetronicApp').factory('changeProductService', ['$http', '$q', 'RestEndpoint', 'Restangular', '$kWindow', function($http, $q, RestEndpoint, Restangular, $kWindow){
	 	var serviceUrl = RestEndpoint.ORDER_CHANGE_GOODS_URL;
	 	
	 	var serviceDetailURL=RestEndpoint.ORDER_CHANGE_GOODS_DETAIL_URL;
	    var factory = {
	        remove:remove,
	        createStock:createStock,
	        updateStock:updateStock,
	        doSearch : doSearch,
	        removeDetail:removeDetail,
	        createDetail:createDetail,
	        getReasonDelete : getReasonDelete,
	        doSearchDetail:doSearch,
	        importGoods:importGoods,
	        setCode:setCode,
			getCode:getCode,
			setData : setData,
			getData : getData,
			getReasonForCombobox:getReasonForCombobox,
			doSearchGoodsForImportReq:doSearchGoodsForImportReq,
			getOrderChangeById:getOrderChangeById,
			expOrderChangeErrorExcel:expOrderChangeErrorExcel
	    };
	   
	     return factory;
	 
	    function remove(obj) {
	    	return Restangular.all(serviceUrl+"/orderChangeGoods/remove").post(obj);
        }
	    
	    function removeDetail(obj) {
	    	return Restangular.one(serviceDetailURL+"/orderChangeGoodsDetail").post(obj); 	 
        }
	    function createDetail(obj) {
            return Restangular.all(serviceDetailURL+"/orderChangeGoodsDetail/add").post(obj); 	 
        }
	    
	    function createStock(obj) {
            return Restangular.all(serviceUrl+"/orderChangeGoods/add").post(obj); 	 
        }
	    
	    function updateStock(obj) {
            return Restangular.all(serviceUrl+"/orderChangeGoods/update").post(obj); 	 
        }
	    
	    function doSearch(obj) {
            return Restangular.all(serviceUrl+"/doSearch").post(obj); 	 
        }
	    
	    function doSearchDetail(obj) {
            return Restangular.all(serviceDetailURL+"/doSearch").post(obj); 	 
        }
	    
	    function getReasonDelete(obj) {
			return Restangular.all(RestEndpoint.REASON_URL + "/getForComboBox").post(obj);
		}
	    
	    function importGoods(item) {
			return Restangular.all(serviceUrl + "/orderChangeGoods/importGoods").post(item);
		}
	    function setData(data) {
			this.data = data;
		}
		function getData() {
			return this.data;
		}
		function setCode(code) {
			this.code = code;
		}
		function getCode() {
			return this.code;
		}
		function getReasonForCombobox(obj) {
			return Restangular.all(RestEndpoint.REASON_URL + "/getForComboBox").post(obj);
		}
		
		function doSearchGoodsForImportReq(obj) {
			return Restangular.all(serviceUrl + "/orderChangeGoods/doSearchGoodsForImportReq").post(obj);
		}
		 function getOrderChangeById(id) {
		    	return Restangular.all(serviceUrl+ "/orderChangeGoods/getOrderChangeById").post(id);
			}
		 function expOrderChangeErrorExcel(obj) {
				return Restangular.all(serviceUrl+ "/exportOrderChangeExcelError").post(obj);
		}
	    

	}]);
