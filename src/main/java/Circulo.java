/**
 * Created by damian on 02/09/16.
 */
public class Circulo implements Figura {
    double  radio;

    public Circulo( int radio) {
        this.radio = radio;

    }




      public double area() {


        return (Math.PI * this.radio*this.radio);

    }


    public double perimetro() {
        return (Math.PI*this.radio);
    }

    public boolean compararPerimetros(Figura f2) {
        return  this.perimetro() >  f2.perimetro();

    }

    public boolean tieneAreaMayor(Circulo c2) {
        return (this.area() > c2.area());
    }
}


