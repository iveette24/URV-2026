/**
 * Classe amb métodes per controlar els camions.
 * 
 * @author Ivette Margalló.
 *
 */



public class Camio {
    
    private static final int MAX_PAQUETS = 100;

    private static int numCamionsPlens;
    private int kgMaxims = 0;
    private int kgActuals;
    private int paquetsActuals = 0;


    /**
	 * Getter
	 * 
	 * @return kgMaxims
	 */
    public int getCapacitatMaxima (int kgMaxims) {
        this.kgMaxims = kgMaxims;
        return kgMaxims;

    } 


}
