public class MainDemoFil {
    public static void main(String[] args) {
        Thread current = Thread.currentThread();
        System.out.println("MainDemoFil.main:");
        System.out.printf("Prioritat  -> %d, Nom -> %s%n",current.getPriority(),current.getName());
        System.out.printf("toString() -> %s",current.toString());
    }
}
