import React, { useEffect, useState } from "react";
import { useAuthState } from "react-firebase-hooks/auth";
import { Link, useNavigate,  } from "react-router-dom";
import {  } from "react-router-dom";
import {
  auth,
  registerWithEmailAndPassword,
  signInWithGoogle,
} from '../firebase';
import "./Register.css";
import '../Header/Header';
import {FormGroup,Input, Label, Col, Row, Form} from 'reactstrap';

function Register() {
  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");
  const [name, setName] = useState("");
  const [cidade, setCidade] = useState("");
  const [estado, setEstado] = useState("");
  const [numero, setNumero] = useState("");
  const [dataNascimento, setDatanascimento] = useState("");
  const [fatorrh, setFatorrh] = useState("");
  const [tipoSangue, setTioSangue] = useState("");
  const [telefone, setTelefone] = useState("");
  const [doador, setDoador] = useState("");
  const [rua, setRua] = useState("");
  const [user, loading] = useAuthState(auth);

  const navigate = useNavigate();
  const register = () => {
    if (!name) alert("Please enter name");
    registerWithEmailAndPassword(name, email, password);
  };
  useEffect(() => {
    if (loading) return;
    if (user) navigate("/dashboard");
  }, [user, loading]);
  return (
    
    <div className="container">
      <div className="register__container">
      <Form>
      <h2>Dados de cadastro doador</h2>
  <Row>

  <FormGroup>
      <Label for="nome"> Nome</Label>
            <Input valid className="register__textBox"   value={name} onChange={(e) => setName(e.target.value)} placeholder="Nome completo"/> 
        </FormGroup>
         <Col md={6}>
        <FormGroup>
        <Label for="nome"> Data de Nascimento</Label>
        <Input type="date" className="register__textBox" valid value={dataNascimento}
          onChange={(e) => setDatanascimento(e.target.value)} placeholder="Data de Nascimento"/>
        </FormGroup>
        </Col>

        <Col md={6}>
        <FormGroup>
        <Label for="phone">Telefone</Label>
        <Input name="email"className="register__textBox" valid  value={telefone}
          onChange={(e) => setTelefone(e.target.value)} placeholder="Telefone"type="phone"/>
      </FormGroup>
    </Col>
 
  </Row>
  <Row>
  <Col md={10}>
  <FormGroup>
    <Label for="exampleAddress">Endereço</Label>
    <Input name="address" className="register__textBox" valid   value={rua}onChange={(e) => setRua(e.target.value)}placeholder="Rua"/>
  </FormGroup>
  </Col>

  <Col md={2}>
  <FormGroup>
    <Label for="exampleAddress">Numero</Label>
    <Input className="register__textBox" valid  value={numero}onChange={(e) => setNumero(e.target.value)}placeholder="Numero"/>
  </FormGroup>
  </Col>
  
  </Row>

  <Row>
    <Col md={6}>
      <FormGroup>
        <Label for="exampleCity"> Cidade</Label>
        <Input valid name="city" className="register__textBox" value={cidade} onChange={(e) => setCidade(e.target.value)}/>
      </FormGroup>
    </Col>
    <Col md={4}>
      <FormGroup>
        <Label for="exampleState">Estado</Label>
        <Input valid name="state" className="register__textBox" value={estado} onChange={(e) => setEstado(e.target.value)}/>
      </FormGroup>
    </Col>
    <Col md={2}>
      <FormGroup>
        <Label for="exampleZip">CEP</Label>
        <Input name="zip" className="register__textBox" valid/>
      </FormGroup>
    </Col>

    <Col md={6}>
      <FormGroup>
        <Label for="exampleEmail"> Email</Label>
        <Input className="register__textBox" name="email" placeholder="Email" type="email" valid  value={email} onChange={(e) => setEmail(e.target.value)}/>
      </FormGroup>
    </Col>
    <Col md={6}>
      <FormGroup>
        <Label for="examplePassword">Senha</Label>
        <Input name="password" placeholder="Senha" type="password" className="register__textBox" valid value={password} onChange={(e) => setPassword(e.target.value)}/>
      </FormGroup>
    </Col>
  </Row>
  

<Row>
<Col md={4}>
      <FormGroup>
        <Label for="exampleCity"> E doador?</Label>
        <Input valid className="register__textBox" value={doador} onChange={(e) => setDoador(e.target.value)}placeholder="E doador?"/>
      </FormGroup>
    </Col>
    <Col md={4}>
      <FormGroup>
        <Label for="exampleState">Tipo Sanguineo</Label>
        <Input valid className="register__textBox" value={tipoSangue} onChange={(e) => setTioSangue(e.target.value)}placeholder="E doador?"/>
      </FormGroup>
    </Col>
    <Col md={4}>
      <FormGroup>
        <Label for="exampleZip">Fator RH</Label>
        <Input  className="register__textBox" valid value={fatorrh} onChange={(e) => setFatorrh(e.target.value)} placeholder="Fator RH"/>
      </FormGroup>
    </Col>
    </Row>
</Form>
  
        <button className="register__btn" onClick={register}> Cadastrar </button>
        <button className="register__btn register__google"
          onClick={signInWithGoogle}> Login com Google</button>
        <div>
          Já tem cadastro? <Link to="/login">Login</Link> agora.
        </div>
      </div>
    </div>
  );
}
export default Register;