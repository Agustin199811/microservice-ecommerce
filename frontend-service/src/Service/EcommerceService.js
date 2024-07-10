import axios from 'axios'
const ecommerce_service="http://18.224.17.184:8080/ecommerce";

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