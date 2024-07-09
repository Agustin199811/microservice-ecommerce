import { BrowserRouter, Route, Routes } from "react-router-dom";
import './App.css';
import OrderComponent from "./Components/OrderComponent";
import InventoryComponent from "./Components/InventoryComponent";

function App() {
  return (
    <div className="App">
       <BrowserRouter>
        <div className="container">
          <Routes>
            <Route exact path="/" element={<OrderComponent/>}></Route>
            <Route path="/ecommerce/orders" element={<OrderComponent/>}></Route>
            <Route path="/ecommerce/inventory" element={<InventoryComponent/>}></Route>
          </Routes>
        </div>
      </BrowserRouter>
    </div>
  );
}

export default App;
