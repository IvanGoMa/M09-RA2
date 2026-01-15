import java.util.Random;

public class Treballador extends Thread{
    private int sou_anual_brut;
    private int edat_inici_treball;
    private int edat_fi_treball;
    private int edat_actual;
    private float cobrat;
    private Random rnd = new Random();
    
    public Treballador(int sou, int edat_inici_treball, int edat_fi_treball, String nom){
        sou_anual_brut = sou;
        this.edat_inici_treball = edat_inici_treball;
        this.edat_fi_treball = edat_fi_treball;
        this.setName(nom);
        edat_actual = 0;
        cobrat = 0.0f;

    }

    
    public int getEdat() {
        return edat_actual;
    }
    
    public float getCobrat() {
        return cobrat;
    }

    public void cobra(){
        cobrat += sou_anual_brut/12.0;
    }

    public void pagaImpostos(){
        cobrat -= (sou_anual_brut/12.0)*0.24;
    }

    @Override
    public void run(){
        while (edat_actual < edat_fi_treball) {
            if (edat_actual>= edat_inici_treball){

                for (int j = 0; j < 12; j++) {
                    cobra();
                    pagaImpostos();
                    try{
                        Thread.sleep(rnd.nextInt(10));
                    } catch (Exception e){

                    }
                    
                }
            }
            edat_actual++;
        }
    }
    

}