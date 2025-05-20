package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.Musica;
import br.com.alura.minhasmusicas.Podcast;
import br.com.alura.minhasmusicas.modelos.MinhasPreferidas;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Tusa");
        minhaMusica.setArtista("Karol G");

        for (int i = 0; i < 2000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

//        ****
        Podcast meuPodcast = new Podcast();
        meuPodcast.setApresentador("Camila Fremder");
        meuPodcast.setDescricao("Podcast bla bla bla bla");
        meuPodcast.setTitulo("Eh noia minha?");

        for (int i = 0; i < 500; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            meuPodcast.curte();
        }

//        ******
        MinhasPreferidas minhasPreferidas = new MinhasPreferidas();
        minhasPreferidas.inclui(meuPodcast);
        minhasPreferidas.inclui(minhaMusica);
    }
}
