import java.util.List;

/**
 * Created by damian on 02/09/16.
 */
public class Par<A,B> {

    private A first;
    private B second;

    public Par(A first, B second) {
        this.first =first;
        this.second =second;
    }


    public A first() {
        return this.first;
    }

    public B second () {
        return this.second;
    }
}
