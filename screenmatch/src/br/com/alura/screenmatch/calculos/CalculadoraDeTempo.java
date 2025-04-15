package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;
import jdk.dynalink.linker.support.TypeUtilities;

import java.util.concurrent.TimeUnit;

public class CalculadoraDeTempo {

    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

//--> tanto serie quanto filme sao um titulo, entao nao preciso reescrever o mesmo trecho de codigo...
//    public void inclui(Filme f){
//        tempoTotal += f.getDuracaoEmMinutos();
//    }
//
//    public void inclui(Serie s){
//        tempoTotal += s.getDuracaoEmMinutos();
//    }

    public void inclui (Titulo t){
        tempoTotal += t.getDuracaoEmMinutos();
    }

}
