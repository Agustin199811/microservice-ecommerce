import axios from 'axios'
const ecommerce_service="http://localhost:8080/ecommerce";

class EcommerceService {
    getAllOrders(){
        return axios.get(`${ecommerce_service}/orders`);
    }

    getAllInventory(){
        return axios.get(`${ecommerce_service}/inventory`);
    }

}

const ecommerceServiceInstance = new EcommerceService();
export default ecommerceServiceInstance;