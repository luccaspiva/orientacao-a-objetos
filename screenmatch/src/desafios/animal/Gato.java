package desafios.animal;

public class Gato extends Animal {

    @Override
    public void emitirSom() {
        System.out.println("Som do gato");
    }

    public void miar(){
        System.out.println("Miando");
    }
}
