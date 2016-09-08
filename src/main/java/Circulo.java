/**
 * Created by damian on 02/09/16.
 */
public class Circulo {
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

    public boolean tieneAreaMayor(Circulo c2) {
        return (this.area() > c2.area());
    }
}


