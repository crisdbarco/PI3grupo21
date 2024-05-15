import Doacao from './../assets/Doacao.png'
import Banner1 from './../assets/banner1.png'
import Banner2 from './../assets/banner2.png'
import Mulher from './../assets/mulher.png'
import Mao from './../assets/mao.png'
import Boneco from './../assets/boneco.png'
import Avatar1 from './../assets/avatar1.avif'
import Avatar2 from './../assets/avatar2.avif'
import Avatar3 from './../assets/avatar3.png'


import 'bootstrap/dist/css/bootstrap.min.css'; 
import 'bootstrap/dist/js/bootstrap.bundle.min.js';
import { useEffect } from 'react'; 

function Home() {
    useEffect(() => {
        
        // eslint-disable-next-line no-undef
        const carousel = new bootstrap.Carousel(document.getElementById('carouselExampleIndicators'), {
            interval: 2000 
        });

        
        return () => {
            carousel.dispose();
        };
    }, []);

    return (
        <>
    <div id="carouselExampleIndicators" class="carousel slide" data-bs-ride="carousel">
      <div class="carousel-indicators">
        <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
        <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="1" aria-label="Slide 2"></button>
        <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="2" aria-label="Slide 3"></button>
      </div>
    <div className="carousel-inner">
      <div className="carousel-item active">
        <img src={Banner2} className="d-block w-100" height={500}  alt="..."/>
      </div>
      <div className="carousel-item">
        <img src={Banner1} className="d-block w-100" height={400} alt="..."/>
      </div>
      <div className="carousel-item">
        <img src={Doacao} className="d-block w-100" height={400} alt="..."/>
      </div>
    </div>
      <button className="carousel-control-prev" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="prev">
      <span className="carousel-control-prev-icon" aria-hidden="true"></span>
      <span className="visually-hidden">Previous</span>
      </button>
      <button className="carousel-control-next" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="next">
      <span className="carousel-control-next-icon" aria-hidden="true"></span>
      <span className="visually-hidden">Next</span>
      </button>
  </div>
 
  <div className="container marketing mt-4"> 
    <div className="row">
      <div className="col-lg-4">
        <img src={Avatar1} className="bd-placeholder-img rounded-circle" width="140" height="140" alt='Imagem ' />
        <h2 className="fw-normal">Fundação pro sangue</h2>
        <p>A Fundação Pró-Sangue é uma Instituição pública ligada à Secretaria de Estado da Saúde e ao Hospital das Clínicas da Faculdade de Medicina da Universidade de São Paulo, instituída pela Lei Estadual nº 3.415, de 22 de julho de 1982, com as alterações dadas pela Lei nº 4.186, de 27 de julho de 1984, Lei nº 4.831 de 19 de novembro de 1985 e Lei nº 6.880 de 06 de junho de 1990, tendo seus Estatutos aprovados pelo Decreto nº 41.628, de 10 de março de 1997, e demais alterações.</p>
        <p><a className="btn btn-secondary" href="https://www.prosangue.sp.gov.br/home/">View details &raquo;</a></p>
      </div>
      <div className="col-lg-4">
        <img src={Avatar2} className="bd-placeholder-img rounded-circle" width="140" height="140" alt=''   preserveAspectRatio="xMidYMid slice" focusable="false"/>
        <h2 className="fw-normal">Ministério da Saúde</h2>
        <p>A Política Nacional de Sangue, Componentes e Hemoderivados tem por finalidade garantir a auto-suficiência do País nesse setor e harmonizar as ações do poder público em todos os níveis de governo, sendo implementada, no âmbito do Sistema Único de Saúde, pelo Sistema Nacional de Sangue, Componentes e Derivados – SINASAN, por meio da Rede de Serviços de Hemoterapia e dos centros de produção de hemoderivados (Art. 8º da Lei nº 10.205/2001).</p>
        <p><a className="btn btn-secondary" href="https://www.gov.br/saude/pt-br/composicao/saes/sangue">View details &raquo;</a></p>
      </div>
      <div className="col-lg-4">
        <img src={Avatar3} className="bd-placeholder-img rounded-circle" width="140" height="140"  alt='' />
        <h2 className="fw-normal">Banco de Sangue</h2>
        <p>Todos os dias acontecem centenas de acidentes, cirurgias e queimaduras violentas que exigem transfusão, assim como os portadores de hemofilia, leucemia e anemias.Além disso, doar sangue é um ato simples, tranquilo e seguro que não provoca risco.</p>
        <p><a className="btn btn-secondary" href="https://www.doesanguedoevida.com.br/">View details &raquo;</a></p>
      </div>
    </div>

      <hr className="featurette-divider"/>

    <div className="row featurette">
      <div className="col-md-7">
        <h2 className="featurette-heading fw-normal lh-1"> Quem pode doar sangue? <span className="text-body-secondary"></span></h2>
        <p className="lead">Segundo a OMS é necessário cumprir alguns requisitos para você poder doar sangue. Veja abaixo algumas das principais dúvidas na hora de doar sangue:
            Estar bem de saúde e ter entre 18 e 69 anos. Jovens a partir dos 16 anos já podem doar caso tenham autorização do responsável. O modelo estará disponível no hemocentro.
            Não estar em jejum.
            Ter dormido pelo menos seis horas nas últimas 24 horas.
            Pesar mais de 50kg.
            Não ter feito cirurgia de grande porte a menos de seis meses e de pequeno porte a menos de três meses.
            Não ter feito tratamento dentário a menos de 7 dias.
            Não estar grávida ou amamentando (mães que amamentam devem aguardar a criança completar 12 meses de vida).
            Em caso de parto normal, aguardar 3 meses; se cesariana, aguardar 6 meses.
            Não estar gripado ou ter tido febre nos últimos 7 dias.
            Não ter diabetes, cardiopatia e nem ter contraído hepatite após os 11 anos de idade.
            Caso tenha tomado vacina contra gripe, deve-se aguardar 48h; as demais vacinas com bactérias/vírus vivos, por exemplo sarampo e febre amarela, deve-se aguardar 4 semanas.
            Não ter doado sangue a menos de 60 dias (homens) e 90 dias (mulheres).
            Não ter tido comportamento de risco para contaminação pelo HIV.
            Não ter ingerido álcool nas 12 horas antes da doação.
            Não ter feito uso de drogas injetáveis ilícitas.
            Não ter feito piercing, acupuntura ou tatuagem a menos de 12 meses.
            Não ter feito endoscopia ou colonoscopia nos últimos seis meses.</p>
      </div>
      <div className="col-md-5">
        <img src={Mulher} className="bd-placeholder-img bd-placeholder-img-lg featurette-image  mx-auto"   aria-label="Placeholder: 500x500" width="100%" height="100%"  />
      </div>
    </div>

    <hr className="featurette-divider"/>

    <div className="row featurette">
      <div className="col-md-7 order-md-2">
        <h2 className="featurette-heading fw-normal lh-1">Como se preparar para a doação de sangue? <span className="text-body-secondary"></span></h2>
        <p className="lead">Alimente-se de forma leve e saudável antes de doar:
            Faça uma refeição saudável, evite comidas gordurosas como batatas fritas ou sorvete. Coma alimentos ricos em ferro, como carne vermelha, peixe, frango, feijão, espinafre, cereais com ferro ou uvas passas.
            Hidrate-se:
            Beba mais meio litro de água (ou outra bebida não alcoólica) antes do início da sua sessão.
            Descanse bem:
            Durma bem na noite anterior à doação.</p>
      </div>
      <div className="col-md-5 order-md-1">
      <img src={Mao} className="bd-placeholder-img bd-placeholder-img-lg featurette-image  mx-auto"  aria-label="Placeholder: 500x500" width="100%" height="100%"/>
      </div>
    </div>

      <hr className="featurette-divider"/>
    <div className="row featurette">
      <div className="col-md-7">
        <h2 className="featurette-heading fw-normal lh-1">Como a sua doação de sangue ajudam os pacientes que precisam?  <span className="text-body-secondary"></span></h2>
        <p className="lead">Pacientes com câncer precisam de sangue.
                Pacientes com anemia falciforme precisam de sangue.
                Pacientes vítimas de acidentes e queimaduras precisam de sangue
                Pacientes com doenças crônicas precisam de sangue.
                A cada dois segundos, alguém no mundo precisa de sangue. Todos os dias, doadores de sangue ajudam pacientes de todas as idades: vítimas de acidentes e queimaduras, pacientes de cirurgia cardíaca e transplante de órgãos, e aqueles que lutam contra o câncer.</p>
        </div>
        <div className="col-md-5">
          <img src={Boneco} className="bd-placeholder-img bd-placeholder-img-lg featurette-image  mx-auto"  role="img" aria-label="Placeholder: 500x500" width="100%" height="100%"alt=''/>
        </div>
      </div>
    </div> 
   
    <hr className="featurette-divider"/>
  </>

	); 
} 


export default Home;

