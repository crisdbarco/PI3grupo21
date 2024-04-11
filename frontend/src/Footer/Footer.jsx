import {
  Collapse,
  Navbar,
  NavbarToggler,
  Nav,
  NavItem,
  NavLink,
  UncontrolledDropdown,
  DropdownToggle,
 } from 'reactstrap';

function Footer() {
    return (
      <>
        <footer>
        <Navbar color="secondary" light expand="md">
             <Nav className="ml" navbar>
               <NavItem>
                 <NavLink style={{ color: '#ffff' }} href="/components/">Contato</NavLink>
               </NavItem>
               <NavItem>
                 <NavLink style={{ color: '#ffff' }} href="/Login">Sobre</NavLink>
               </NavItem>
             <NavItem>
                 <NavLink style={{ color: '#ffff' }} href="/register">Cadastro</NavLink>
            </NavItem>
               <NavItem>
                 <NavLink style={{ color: '#ffff'}} href="/contato">Contato</NavLink>
               </NavItem>
             </Nav>
         </Navbar>
        </footer>


      </> 
    )
  }
  export default Footer;