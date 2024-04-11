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


function Home() { 
	return ( 
    <> 
    <div id="carouselExampleIndicators" class="carousel slide">
      <div class="carousel-indicators">
        <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
        <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="1" aria-label="Slide 2"></button>
        <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="2" aria-label="Slide 3"></button>
      </div>
    <div class="carousel-inner">
      <div class="carousel-item active">
        <img src={Banner2} class="d-block w-100" height={500}  alt="..."/>
      </div>
      <div class="carousel-item">
        <img src={Banner1} class="d-block w-100" height={400} alt="..."/>
      </div>
      <div class="carousel-item">
        <img src={Doacao} class="d-block w-100" height={400} alt="..."/>
      </div>
    </div>
      <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="prev">
      <span class="carousel-control-prev-icon" aria-hidden="true"></span>
      <span class="visually-hidden">Previous</span>
      </button>
      <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="next">
      <span class="carousel-control-next-icon" aria-hidden="true"></span>
      <span class="visually-hidden">Next</span>
      </button>
  </div>
 
  <div class="container marketing mt-4"> 
    <div class="row">
      <div class="col-lg-4">
        <img src={Avatar1} class="bd-placeholder-img rounded-circle" width="140" height="140" alt='Imagem ' />
        <h2 class="fw-normal">Heading</h2>
        <p>Some representative placeholder content for the three columns of text below the carousel. This is the first column.</p>
        <p><a class="btn btn-secondary" href="#">View details &raquo;</a></p>
      </div>
      <div class="col-lg-4">
        <img src={Avatar2} class="bd-placeholder-img rounded-circle" width="140" height="140" alt=''   preserveAspectRatio="xMidYMid slice" focusable="false"/>
        <h2 class="fw-normal">Heading</h2>
        <p>Another exciting bit of representative placeholder content. This time, we've moved on to the second column.</p>
        <p><a class="btn btn-secondary" href="#">View details &raquo;</a></p>
      </div>
      <div class="col-lg-4">
        <img src={Avatar3} class="bd-placeholder-img rounded-circle" width="140" height="140"  alt='' />
        <h2 class="fw-normal">Heading</h2>
        <p>And lastly this, the third column of representative placeholder content.</p>
        <p><a class="btn btn-secondary" href="#">View details &raquo;</a></p>
      </div>
    </div>

      <hr class="featurette-divider"/>

    <div class="row featurette">
      <div class="col-md-7">
        <h2 class="featurette-heading fw-normal lh-1"> Quem pode doar sangue? <span class="text-body-secondary"></span></h2>
        <p class="lead">Segundo a OMS é necessário cumprir alguns requisitos para você poder doar sangue. Veja abaixo algumas das principais dúvidas na hora de doar sangue:
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
      <div class="col-md-5">
        <img src={Mulher} class="bd-placeholder-img bd-placeholder-img-lg featurette-image  mx-auto"   aria-label="Placeholder: 500x500" width="100%" height="100%"  />
      </div>
    </div>

    <hr class="featurette-divider"/>

    <div class="row featurette">
      <div class="col-md-7 order-md-2">
        <h2 class="featurette-heading fw-normal lh-1">Como se preparar para a doação de sangue? <span class="text-body-secondary"></span></h2>
        <p class="lead">Alimente-se de forma leve e saudável antes de doar:
            Faça uma refeição saudável, evite comidas gordurosas como batatas fritas ou sorvete. Coma alimentos ricos em ferro, como carne vermelha, peixe, frango, feijão, espinafre, cereais com ferro ou uvas passas.
            Hidrate-se:
            Beba mais meio litro de água (ou outra bebida não alcoólica) antes do início da sua sessão.
            Descanse bem:
            Durma bem na noite anterior à doação.</p>
      </div>
      <div class="col-md-5 order-md-1">
      <img src={Mao} class="bd-placeholder-img bd-placeholder-img-lg featurette-image  mx-auto"  aria-label="Placeholder: 500x500" width="100%" height="100%"/>
      </div>
    </div>

      <hr class="featurette-divider"/>
    <div class="row featurette">
      <div class="col-md-7">
        <h2 class="featurette-heading fw-normal lh-1">Como a sua doação de sangue ajudam os pacientes que precisam?  <span class="text-body-secondary"></span></h2>
        <p class="lead">Pacientes com câncer precisam de sangue.
                Pacientes com anemia falciforme precisam de sangue.
                Pacientes vítimas de acidentes e queimaduras precisam de sangue
                Pacientes com doenças crônicas precisam de sangue.
                A cada dois segundos, alguém no mundo precisa de sangue. Todos os dias, doadores de sangue ajudam pacientes de todas as idades: vítimas de acidentes e queimaduras, pacientes de cirurgia cardíaca e transplante de órgãos, e aqueles que lutam contra o câncer.</p>
        </div>
        <div class="col-md-5">
          <img src={Boneco} class="bd-placeholder-img bd-placeholder-img-lg featurette-image  mx-auto"  role="img" aria-label="Placeholder: 500x500" width="100%" height="100%"alt=''/>
        </div>
      </div>
    </div> 
   
    <hr class="featurette-divider"/>
  </>

	); 
} 


export default Home;

