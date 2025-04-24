public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private double velocidadeAtual;
    private boolean motorLigado;
    private double combustivel;

    public Veiculo(String marca, String modelo, int ano, double combustivel){

        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.combustivel = combustivel;
        this.velocidadeAtual = 0;
        this.motorLigado = false;
        
    }
     public boolean getMotorLigado(){
        return this.motorLigado;
     }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public boolean isMotorLigado() {
        return motorLigado;
    }

    public void setMotorLigado(boolean motorLigado) {
        this.motorLigado = motorLigado;
    }

    public double getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(double combustivel) {
        this.combustivel = combustivel;
    }

    public void ligarMotor(){

        if(this.motorLigado){
            System.out.println("Motor já está ligado!");
        }

        if(this.combustivel <= 0){
            System.out.println("Não há combustível para ligar o motor!");
        }
        else{
            this.motorLigado = true;
            System.out.println("Motor ligado!");
        }
        
    }

    public void desligarMotor(){

        if(!this.motorLigado){
            System.out.println("Motor já está desligado!");
        }
        else{
            this.motorLigado = false;
            System.out.println("Motor desligado!");
        }

    }

    public void acelerar(){

        if(!this.motorLigado){
            System.out.println("Não foi possível acelerar, motor desligado!");
        }

        else{
            if(this.combustivel <= 0){
                System.out.println("Não foi possível acelerar, veículo sem combustível!");
            }
            else{
                this.velocidadeAtual = velocidadeAtual + 10;
                System.out.println("Velocidade atual: " + this.velocidadeAtual + " Km/h.");
            }
        }
    }

    public void frear(){

        if(this.velocidadeAtual > 0){
            this.velocidadeAtual = velocidadeAtual - 10;
            if(this.velocidadeAtual < 0){
                this.velocidadeAtual = 0;
            }
            System.out.println("Velocidade Atual: " + this.velocidadeAtual + " Km/h.");
        }

        if(this.velocidadeAtual == 0){
            System.out.println("Não foi possível frear, o veículo já está parado!");
        }
        
    }

    public void exibirInfo(){

        System.out.println("\n Marca:            " + this.marca           + 
                           "\n Modelo:           " + this.modelo          +
                           "\n Ano:              " + this.ano             +
                           "\n Velocidade Atual: " + this.velocidadeAtual +
                           "\n Combustivel:      " + this.combustivel
        );
        if(motorLigado){
            System.out.println("\n Estado do Motor: " + "Ligado");
        }
        else{
            System.out.println("\n Estado do Motor: " + "Desligado");
        }
    }

    public void abastecer(){

        if(this.motorLigado == true){
            System.out.println("Por favor desligue o motor para abastecer!");
        }
        if(this.velocidadeAtual > 0){
            System.out.println("Por favor pare o veiculo para abastecer!");
        }
        else{
            this.combustivel = combustivel + 10;
        }
    }
}
