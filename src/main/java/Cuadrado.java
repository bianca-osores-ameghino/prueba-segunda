import java.util.List;

/**
 * Created by damian on 02/09/16.
 */
public class Cuadrado implements Figura {

    double lado;


    public Cuadrado(double lado) {
        this.lado =lado;
    }


    public double area() {
        return(lado*lado);
    }

    public double perimetro() {
        return(lado*4);
    }

    public boolean compararPerimetros(Figura f2) {
        return  this.perimetro() >  f2.perimetro();
    }

    public double sumarAreasDeCuadrados(List<Cuadrado> cuadrados) {
        double sumarAreasDeCuadrados = 0;
        for (Cuadrado c: cuadrados){
            sumarAreasDeCuadrados= sumarAreasDeCuadrados + c.area();
        }
        return (sumarAreasDeCuadrados);
    }


    public double sumarAreasDeFiguras(List<Figura> rectangulos) {
        double sumarAreasDeFiguras = 0;
        for (Figura c : rectangulos){
            sumarAreasDeFiguras = sumarAreasDeFiguras + c.area();
        }

        return (sumarAreasDeFiguras);

    }

    public boolean tieneAreaMayor(Cuadrado c2) {
        return (this.area()> c2.area());
    }
}
