public class Administracio {
    
    private int num_poblacio_activa = 50;
    private Treballador[] poblacio_activa = new Treballador[num_poblacio_activa];

    public Administracio(){
        for (int i = 0; i < poblacio_activa.length; i++) {
            
            poblacio_activa[i] = new Treballador(25000, 20, 65, ""+i);
            
        }
    }

    public static void main(String[] args) {
        Administracio a = new Administracio();

        for (Treballador t: a.poblacio_activa){
            t.start();
            
        }

        for (Treballador t: a.poblacio_activa){
            try{
                t.join();
            } catch (Exception e){

            }
            System.out.printf("Ciutadà-%-2s -> edat: %2d / total: %.2f\n",t.getName(),t.getEdat(), t.getCobrat());
            
        }
    }
}
