import java.util.ArrayList;
import java.util.List;

/**
 * Created by alumno on 15/09/16.
 */
public class Dibujo implements Figura{
    double area;

    List<Figura> figuritas;

    public Dibujo(List<Figura> figuras) {
        this.figuritas = figuras;

    }

    public double area(double area) {
        this.area = area;
        return area;
    }

    public double area() {
        double area = 0;
        for (Figura d : this.figuritas) {
            area = area + d.area();

        }
        return area;
    }

    @Override
    public double perimetro() {
        return 0;
    }


    @Override
    public boolean compararPerimetros(Figura f2) {
        return false;
    }



}
