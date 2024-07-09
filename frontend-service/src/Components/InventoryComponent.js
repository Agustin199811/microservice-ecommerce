import React, { useEffect, useState } from "react";
import ecommerceServiceInstance from "../Service/EcommerceService";

export default function InventoryComponent() {
  const [inventories, setInventories] = useState([]);
  const [error, setError] = useState(null);

  useEffect(() => {
    fetchInventory();
  }, []);

  const fetchInventory = async () => {
    try {
      const response = await ecommerceServiceInstance.getAllInventory();
      console.log(response.data);
      setInventories(response.data); // Actualiza el estado con los datos recibidos
    } catch (error) {
      setError(error.message); // Maneja el error estableciendo el estado de error
      console.error("Error fetching inventories:", error);
    }
  };

  return (
    <div>
      {error && <p>Error fetching inventories: {error}</p>}
      <ul>
        {inventories.map((inventory) => (
          <li key={inventory.id}>{inventory.quantity}</li>
        ))}
      </ul>
    </div>
  );
}
