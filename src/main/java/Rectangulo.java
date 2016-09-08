import java.util.List;

/**
 * Created by damian on 02/09/16.
 */
public class Rectangulo implements Figura{
    int base;
    int altura;



    public Rectangulo(int base , int altura) {

          this.base = base;
          this.altura = altura;

    }


    public double area() {
        return (base*altura);
    }

    public double perimetro() {
        double perimetro = (2*base+2*altura);
        return (perimetro);
    }


        public boolean tieneAreaMayor(Rectangulo r2) {
            return (this.area()> r2.area());
    }
}
