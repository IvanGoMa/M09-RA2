import java.util.Random;

public class Futbolista extends Thread{

private final static int NUM_JUGADORS = 11;
private final static int NUM_TIRADES = 20;
private final static float PROBABILITAT = 0.5f;

private int ngols = 0;
private int ntirades = 0;

public Futbolista(String nom){
    super(nom);

}

public int getGols(){return this.ngols;}

@Override
public void run(){
    for (int i = 0; i < NUM_TIRADES; i++) {
        ntirades++;
        float intent = new Random().nextFloat();
        if (intent < PROBABILITAT){
            ngols++;
        }

    }
}

public static void main(String[] args) {
    String[] jugadors = {"Piqué","Vinicius","Torres","Ramos","Ronaldo","Lewan","Belli","Arnau","Aspas","Messi","MBapé"};
    Futbolista[] futbolistes = new Futbolista[NUM_JUGADORS];

    System.out.println("Inici dels xuts------");
    for (int i = 0; i < futbolistes.length; i++) {
        futbolistes[i] =  new Futbolista(jugadors[i]);
        futbolistes[i].start();

    }
    for (Futbolista futbolista : futbolistes){
        try{
            futbolista.join();
        } catch (Exception e){

        }
        
    }
    System.out.println("Fi dels xuts---------");
    System.out.println("Estadístiques--------");
    for (Futbolista futbolista : futbolistes){
        System.out.printf("%-10s -> %2d gols%n",futbolista.getName(), futbolista.getGols());
    }
}


}