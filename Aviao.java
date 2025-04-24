public class Aviao extends Veiculo{
   private double altitude;
   private boolean tremDePousoBaixado;

   public Aviao(String marca, String modelo, int ano, double combustivel){
          super(marca, modelo, ano, combustivel);
   }
    @Override   
    private void acelerar(){
        super.acelerar();
        super.setVelocidadeAtual(240);
    }
   public void decolar(){
        if(this.altitude == 0 && super.getMotorLigado()){
            this.tremDePousoBaixado = false;
            this.altitude = 10000;
            System.out.println("Aviao decolou");
        }else{
            System.out.println("Aviao ja esta em voo");

        }
    }
    public void subir(){
        if(this.altitude >0){
            this.altitude +=1000;
            System.out.println("Aviao subiu para" + this.altitude);
        }else{
            System.out.println("Aviao nao pode subir, pois esta no solo");
        }
    }
    public void descer(){
        if(this.altitude > 0 ){
            this.altitude -= 1000;
            System.out.println("aviao ja desceu para" + this.altitude);
        } else{
            System.out.println("aviao ja esta no chao");
        }
    }
    public void aterrisar(){
        if(this.altitude > 0 ){
            for(;this.altitude > 0; this.altitude -= 1000){
              if(this.altitude <= 1000){
                this.tremDePousoBaixado = true;
                System.out.println("trem de pouso baixado");
              }
            }
        }else{
            System.out.println("o aviao ja esta no solo");
            
        }
    }


    

    

    
}
