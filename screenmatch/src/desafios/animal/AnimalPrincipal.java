package desafios.animal;

public class AnimalPrincipal {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();
        cachorro.latir();

        Gato gato = new Gato();
        gato.emitirSom();
        gato.miar();
    }
}
