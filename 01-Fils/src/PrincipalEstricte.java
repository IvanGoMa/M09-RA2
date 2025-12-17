public class PrincipalEstricte {
    public static void main(String[] args) {
        Fil juan = new Fil("Juan", Thread.MAX_PRIORITY, 5);
        Fil pepe = new Fil("Pepe", Thread.MIN_PRIORITY,5 );

        pepe.start();
        juan.start();
        
        System.out.println("Termina thread main");
        
    }
}
