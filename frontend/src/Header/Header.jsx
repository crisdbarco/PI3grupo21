import React from 'react';
import Logo from '../assets/Logo.png'
import './Header.css'
import {
  Collapse,
  Navbar,
  NavbarToggler,
  NavbarBrand,
  Nav,
  NavItem,
  NavLink,
  UncontrolledDropdown,
  DropdownToggle,
  DropdownMenu,
  DropdownItem } from 'reactstrap';

export default class Header extends React.Component {
  constructor(props) {
    super(props);

    this.toggle = this.toggle.bind(this);
    this.state = {
      isOpen: false
    };
  }
  toggle() {
    this.setState({
      isOpen: !this.state.isOpen
    });
  }
  render() {
    return (
      <header>
        <Navbar  color="secondary" light expand="xl">
           <NavbarBrand style={{ color: '#ffff' }} href="/"> <img width={45} src={Logo} alt="" />Doe Sangue</NavbarBrand>
           <NavbarToggler onClick={this.toggle} />
           <Collapse isOpen={this.state.isOpen} navbar>
             <Nav className="ml-auto" navbar>
               <NavItem>
                 <NavLink style={{ color: '#ffff' }} href="/Sobre">Sobre</NavLink>
               </NavItem>
               <NavItem>
                 <NavLink style={{ color: '#ffff' }} href="/Login">Login</NavLink>
               </NavItem>
             <NavItem>
                 <NavLink style={{ color: '#ffff' }} href="/register">Cadastro</NavLink>
      </NavItem>
               <NavItem>
                 <NavLink style={{ color: '#ffff' }} href="/contato">Contato</NavLink>
               </NavItem>
      <UncontrolledDropdown nav inNavbar>
                 <DropdownToggle style={{ color: '#ffff' }} nav caret>
                 Doe Sangue
                 </DropdownToggle>
                 <DropdownMenu end>
                   <DropdownItem>
                   Option 1
                   </DropdownItem>
                  <DropdownItem>
                   Option 2
                 </DropdownItem>
                  <DropdownItem divider />
                   <DropdownItem>
                     Reset
                   </DropdownItem>
                 </DropdownMenu>
               </UncontrolledDropdown>
             </Nav>
           </Collapse>
         </Navbar>
        

      </header>
     
    );
  }
}