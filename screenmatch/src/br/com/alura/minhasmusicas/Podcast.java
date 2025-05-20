package br.com.alura.minhasmusicas;

public class Podcast extends Audio{
    private String apresentador;
    private String descricao;

    @Override
    public int getClassificacao() {
        if(this.getTotalCurtidas() > 200){
            return 10;
        } else {
            return 8;
        }
    }

    //    GET/SET
    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
