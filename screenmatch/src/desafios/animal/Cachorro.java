package desafios.animal;

public class Cachorro extends Animal {

    @Override
    public void emitirSom() {
        System.out.println("Som do cachorro");
    }

    public void latir(){
        System.out.println("Latindo");
    }
}

