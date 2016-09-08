import org.junit.Assert;
import org.junit.Test;

/**
 * Created by damian on 26/08/16.
 */
public class CirculoTest {

    @Test
    public void compararAreasCirc(){
        Circulo c1 = new Circulo  (10);
        Circulo c2 = new Circulo (3);

        boolean resultado;
        resultado = c1.tieneAreaMayor (c2);

        Assert.assertTrue(resultado);

    }




    @Test
    public void crearCirculo(){
        Circulo circulo = new Circulo(5);

        Assert.assertEquals(circulo.radio, 5,0);
    }

    @Test
    public void calcularArea(){
        Circulo circulo = new Circulo(10);
        Assert.assertEquals((Math.PI*10*10) , circulo.area(),0);
    }

    @Test
    public void calcularPerimetro(){
        Circulo circulo = new Circulo(10);
        Assert.assertEquals((Math.PI*10) , circulo.perimetro(),0);
    }
}
