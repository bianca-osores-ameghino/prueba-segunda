
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by damian on 26/08/16.
 */
public class FigurasTest{

    @Test

    public void figuraDentroDefigura(){

        Figura c1 = new Cuadrado(5);

        Figura c2 = new Cuadrado(10);

        Figura r1 = new Rectangulo(10,100);

        List<Figura> imagen = new ArrayList<Figura>();

        imagen.add (c1);
        imagen.add (r1);

        Dibujo d1 = new Dibujo (imagen);

        List<Figura> imagen2 = new ArrayList<Figura>();
        imagen2.add (c2);
        imagen2.add (d1);
        imagen2.add (d1);

        Dibujo d2 = new Dibujo(imagen2);

        Assert.assertEquals(d2.area(),2150,   0);


    }


    @Test

    public void nTest (){

        Figura f1 = new Cuadrado (5);
        Figura f2 = new Circulo (10);
        Figura f3 = new Rectangulo(20,10);

    List<Figura> figuritas = new ArrayList<Figura>();

        figuritas.add (f1);
        figuritas.add (f2);
        figuritas.add (f3);


        Dibujo d = new Dibujo(figuritas);

    Assert.assertEquals(539,d.area(),10);

    }


    @Test

    public void compPar () {
        Figura f1 = new Circulo(5);
        Figura f2 = new Circulo(10);

        boolean comp = f2.compararPerimetros(f1);

        Assert.assertTrue(comp);
    }
    @Test
    public void calcularArea() {
        Figura fig = new Rectangulo(5,10);

        Assert.assertEquals(50, fig.area(), 0);

    }

    @Test
    public void calcularPerimetro() {
        Figura fig = new Circulo(10);

        Assert.assertEquals(Math.PI*10, fig.perimetro(),0);

    }

    @Test
    public void calcularAreas(){
        Cuadrado cuadrado = new Cuadrado(1);
        Figura fig  = new Cuadrado(5);
        Figura fig2 = new Rectangulo(5,10);
        Figura fig3 = new Circulo(20);

        List<Figura> figuras = Arrays.asList(fig,fig2,fig3);

        Assert.assertEquals(1331, cuadrado.sumarAreasDeFiguras(figuras),10);
    }
}
