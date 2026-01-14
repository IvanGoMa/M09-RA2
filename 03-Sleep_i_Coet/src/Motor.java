import java.util.Random;

public class Motor extends Thread {
    private int potenciaObjectiu = 0;
    private int potenciaActual = 0;
    private int numMotor;


    public Motor(int n){
        numMotor = n;
    }
    public void setNumMotor(int numMotor) {
        this.numMotor = numMotor;
    }


    public void setPotencia(int p){
        potenciaObjectiu = p;
    }

    public int getPotenciaObjectiu() {
        return potenciaObjectiu;
    }

    public int getPotenciaActual() {
        return potenciaActual;
    }

     public int getNumMotor() {
        return numMotor;
    }

    
    @Override
    public void run(){
        boolean viu = true;
        while(viu){
            while (potenciaObjectiu != potenciaActual){

                boolean incrementa = potenciaObjectiu > potenciaActual;

                int intervalAleatori =new Random().nextInt(1000,2000);

                try{
                    Thread.sleep(intervalAleatori);
                } catch (Exception e){

                }
                if (incrementa) potenciaActual++;
                else potenciaActual--;

                String state = (potenciaActual==potenciaObjectiu)?"FerRes":incrementa?"Incre.":"Decre.";
                System.out.printf("Motor %d: %s Objectiu: %d Actual: %d\n",this.numMotor,state,this.potenciaObjectiu,this.potenciaActual);

            }
            if (potenciaObjectiu == 0 && potenciaActual == 0) {
                viu = false;
            }
            try{
            Thread.sleep(500);
            } catch (Exception e){}
        } 
        
        

    }


   
}
