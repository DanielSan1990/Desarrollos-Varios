import calculadora.Division;
import calculadora.Multiplicacion;
import calculadora.Resta;
import calculadora.Suma;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {
    Double n1;
    Double n2;
    Double resultadoEsperado;
    @Before
    public void before(){
        n1=8.0;
        n2=15.0;
    }

    @Test
    public void sumaTest(){

        resultadoEsperado=23.0;

        Suma oper = new Suma(n1,n2);
        Double res = oper.getRes();
        verficarResultado(res,resultadoEsperado);
    }

    @Test public void restaTest(){

        resultadoEsperado=-7.0;

        Resta oper = new Resta(n1,n2);
        Double res = oper.getRes();
        verficarResultado(res,resultadoEsperado);

    }

    @Test public void divisionTest() throws Exception {

        n2=2.0;
        resultadoEsperado = 4.0;
        Division oper = new Division(n1,n2);
        Double res = oper.getRes();
        verficarResultado(res,resultadoEsperado);

    }

    @Test public void divisionPorCeroTest(){

        n2=0.0;
        try{
            Division oper = new Division(n1,n2);

        }catch (Exception e){
            Assert.assertNotNull("No es nulo",e.getMessage());
            Assert.assertTrue("No se ha obtenido el mensaje esperado",e.getMessage().contains("no se puede division entre cero"));
        }

    }

    @Test public void multiplicacionTest(){
        Multiplicacion oper = new Multiplicacion(n1,n2);
        Double res = oper.getRes();
        verficarResultado(res,120.0);
    }

    private void verficarResultado(Double resultado, Double resultEsperado){
        Assert.assertNotNull("El resultado es null", resultado);
        Assert.assertTrue("El  resultado es incorrecto", resultado.equals(resultEsperado));

     //  AssertThat(resultadoEsperado, is(oper(n1, n2)));

    }

}
