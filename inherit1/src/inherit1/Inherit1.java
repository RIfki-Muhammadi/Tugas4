
package inherit1;

public class Inherit1 {

    public static void main(String[] args) {
        Pesawat boeing = new Pesawat();
        PesawatTempur f16 = new PesawatTempur();
        
        boeing.terbang();
        f16.terbang();
        
        boeing.mendarat();
        f16.mendarat();
        
        //boeing.manuver();
        f16.manuver();
    }
}
