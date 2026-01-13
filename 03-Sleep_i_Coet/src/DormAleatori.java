import java.util.Random;

public class DormAleatori extends Thread{
    private String nom;
    private long creat;

    public DormAleatori(String nom){
        this.nom = nom;
        creat = System.currentTimeMillis();
    }

    public String getNom(){
        return nom;
    }

    public long getTemps(){
        return System.currentTimeMillis() - creat;
    }

    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            long intervalAleatori = (long)new Random().nextFloat()*1000;
            System.out.printf("%-4s(%d) a dormir %4dms total %5dms\n",nom,i,intervalAleatori,getTemps());
            try{
                Thread.sleep(intervalAleatori);
            } catch (Exception e){

            }
            
        }
    }

    public static void main(String[] args) {
        DormAleatori joan = new DormAleatori("Joan");
        DormAleatori pep = new DormAleatori("Pep");
        joan.start();
        pep.start();
    }
}
