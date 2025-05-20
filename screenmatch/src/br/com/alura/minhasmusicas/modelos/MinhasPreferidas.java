package br.com.alura.minhasmusicas.modelos;

import br.com.alura.minhasmusicas.Audio;

public class MinhasPreferidas {
    public void inclui(Audio audio){
        if (audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + " tem classificacao >= 9");
        } else {
            System.out.println(audio.getTitulo() + " tem classificacao <= 9");
        }
    }
}
