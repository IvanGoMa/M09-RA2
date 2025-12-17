public class Fil extends Thread{
    private String nom;
    private long id;
    private int contador = 0;
    private int delay;

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getDelay() {
        return delay;
    }
    public void setDelay(int delay) {
        this.delay = delay;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Fil(String nom, int priority) {
        this.nom = nom;
        this.setPriority(priority);
    }

    public Fil(String nom, int priority, int delay) {
        this.nom = nom;
        this.delay = delay;
        this.setPriority(priority);
    }
    

     @Override
    public void run() {
        for (int i = 0; i < 9; i++) {
            
            for (int j = 0; j < 1000; j++) {
                
            }
            contador++;
            System.out.println(nom + " " + contador);
            
            try{
                Thread.sleep(delay);
            } catch (Exception e){

            }
            
        }
        System.out.println("Acaba thread " + nom);
        
    }
    
}

