import React, { useEffect, useState } from "react";
import ecommerceServiceInstance from "../Service/EcommerceService";

export default function OrderComponent() {
  const [orders, setOrders] = useState([]);
  const [error, setError] = useState(null);

  useEffect(() => {
    fetchOrders();
  }, []);

  const fetchOrders = async () => {
    try {
      const response = await ecommerceServiceInstance.getAllOrders();
      console.log(response.data);
      setOrders(response.data); // Actualiza el estado con los datos recibidos
    } catch (error) {
      setError(error.message); // Maneja el error estableciendo el estado de error
      console.error("Error fetching orders:", error);
    }
  };

  return (
    <div>
      {error && <p>Error fetching orders: {error}</p>}
      <ul>
        {orders.map((order) => (
          <li key={order.id}>{order.status}</li>
        ))}
      </ul>
    </div>
  );
}
