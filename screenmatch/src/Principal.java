import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {

    public static void main(String[] args) {

        Filme meuFilme = new Filme();
        meuFilme.setNome("Nome do Filme");
        meuFilme.setAnoLancamento(2023);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setIncluidoNoPlano(true);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(9);
        meuFilme.avalia(8);
        meuFilme.avalia(3);

        System.out.println("Duracao em minutos filme: " + meuFilme.getDuracaoEmMinutos());
        System.out.println("Total avaliacoes: " + meuFilme.getTotalAvaliacoes());
        System.out.println("media: " + meuFilme.pegaMedia());

        System.out.println("\n****** serie *******");

        Serie serie = new Serie();
        serie.setNome("GOT");
        serie.setAnoLancamento(2013);
        serie.setAtiva(false);
        serie.setTemporadas(6);
        serie.setMinutosPorEpisodio(40);
        serie.setEpisodiosPorTemporada(8);
        serie.exibeFichaTecnica();

        System.out.println("duracao em minutos serie: " + serie.getDuracaoEmMinutos());

        Filme outroFilme = new Filme();
        outroFilme.setNome("Outro nome do Filme");
        outroFilme.setAnoLancamento(2023);
        outroFilme.setDuracaoEmMinutos(100);
        outroFilme.setIncluidoNoPlano(true);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(serie);
        System.out.println(calculadora.getTempoTotal());
    }
}
