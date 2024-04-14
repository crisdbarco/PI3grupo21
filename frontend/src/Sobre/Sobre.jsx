import React from 'react';
import { Container} from 'reactstrap';


  function Sobre() {
      return (
        <>
        <Container fluid>
        <h2 className="display-3 text-center m-4" style={{ fontSize: '60px', fontWeight:'600',color:'#808080'  }}>Hemocentro Suzano</h2>
          <p className="lead">  A alta eficiência nos serviços de hemocentros é de importância vital para a saúde pública. A
            gestão de doadores e de estoque, que inclui a coleta, armazenamento e distribuição de sangue,
            é um componente crucial desses serviços.
            O Hemocentro Transfusão de Suzano, localizado na Região Metropolitana de São Paulo, foi
            fundado em 1996 e opera na captação de doadores, coleta de sangue, produção e fornecimento
            de hemocomponentes, controle imuno hematológico, sorológico, instalações de agências
            transfusionais em hospitais e serviços de coleta e processamento de sangue, seguindo as
            normas vigentes do Ministério da Saúde. O hemocentro atende não apenas a cidade de
            Suzano, mas também outros municípios da região, e promove campanhas de conscientização
            sobre a doação de sangue. Além destes serviços prestados à população, ainda ministra
            programas de educação continuada, abertos a profissionais da área de saúde, como o Curso de
            Hemoterapia, que oferece capacitação para profissionais interessados em atuar na área.
            Este trabalho foca no desenvolvimento de um sistema de gerenciamento de cadastros para o
            Hemocentro Transfusão de Suzano, fazendo utilização da linguagem de programação Java,
            usada para a construção do back-end; do framework Spring Boot, usado para comunicação e
            manipulação de um banco de dados relacional; e React, uma biblioteca da linguagem
            JavaScript para a construção de interfaces de usuário no front-end.
            O objetivo deste sistema é melhorar a eficiência dos processos de gerenciamento de cadastros,
            proporcionando uma interface online de usuário intuitiva, responsiva e fácil de usar, e
            garantindo a segurança e integridade dos dados. Através deste sistema, espera-se que o
            hemocentro possa melhorar a qualidade do atendimento à população, otimizar o uso de
            recursos e, por fim, salvar mais vidas.</p>
          
        </Container>
        </> 
      )
    }
    export default Sobre;