import React from "react";
import "./App.css";

import 'bootstrap/dist/css/bootstrap.min.css';

import Home from './Home/Home'
import Header from "./Header/Header";
import Footer from "./Footer/Footer";


function App() {
  return (
    <div className="app">
        <Header/>
        <Home/>
        <Footer/>
       
    </div>
  );
}
export default App;