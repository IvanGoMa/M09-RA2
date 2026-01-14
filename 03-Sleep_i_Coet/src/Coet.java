import java.util.Scanner;

public class Coet {
    private Motor[] motors = new Motor[4];


    public Coet(){
        for (int i = 0; i < motors.length; i++) {
            motors[i] = new Motor(i);
        }
    }
    public void passaAPotencia(int p) {
        if (p >= 0 && p <= 10){
            for (Motor m: motors){
                m.setPotencia(p);
            }
        } else{
            throw new IllegalArgumentException("El valor ha de ser entre 1 i 10");
        }
    }

    public void arranca(){
        for (Motor m: motors){
            m.start();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int target = Integer.parseInt(input.nextLine());
        Coet coet = new Coet();
        coet.passaAPotencia(target);
        coet.arranca();
        while (target !=0){
            
            target = Integer.parseInt(input.nextLine());
            coet.passaAPotencia(target);
        }
    }
}
