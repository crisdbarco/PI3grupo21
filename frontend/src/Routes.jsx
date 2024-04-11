import { Route, Routes as Router} from 'react-router-dom'
import Login from './Login/Login';
import Register from './Register/Register';
import Reset from './Reset.css';
import Dashboard from './Dashboard/Dashboard';
import Home from './Home/Home'
// import Header from "./Header/Header";

function Routes(){
    return(
       
        <Router>
            <Route exact path="/" element={<Home />} />
            <Route exact path="/Login" element={<Login />} />
            <Route exact path="/register" element={<Register />} />
            <Route exact path="/reset" element={<Reset />} />
            <Route exact path="/dashboard" element={<Dashboard />} />
        </Router>
           
        
    )

}

export default Routes
