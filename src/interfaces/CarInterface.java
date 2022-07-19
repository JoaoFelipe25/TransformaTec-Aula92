package interfaces;

interface CarInterface {
    
    //método abstrato  - sem corpo
    public void start(String partida);
    public void accelerate(String acelerando);
    public void brake(String freiar);

}

class Carr implements CarInterface{

    @Override
    public void start(String partida) {
        
        
        System.out.println(partida);
        
    }

    @Override
    public void accelerate(String acelerando) {
    
        
        System.out.println(acelerando);
        
    }

    @Override
    public void brake(String freiar) {
        
        System.out.println(freiar);
        
    }

    public static void main(String[] args) {

        Carr carr = new Carr();
    
        carr.start("brumm");
        carr.accelerate("vrommmmmmmmmmmmmmmmm");
        carr.brake("shhhhhhhhhhhhhhh");
            
    }
    
}



