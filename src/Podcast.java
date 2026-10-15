public class Podcast extends Audio{
    private String apresentador;

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    @Override
    public void reproduzir(){
    super.reproduzir();
        System.out.println("Reproduzindo : " + getNome() + " , apresentado por : " + getApresentador());
    }

    public void exibirFichaTecnica(){
        System.out.println("Nome do episódio : " + getNome());
        System.out.println("Duração do episódio em minutos : " + getTempoDeDuracao());
        System.out.println("Nome do apresentador : " + getApresentador());
        System.out.println("Total de reproduções : " + getTotalDeReproducoes());
        System.out.println("Total de curtidas : " + getTotalDeCurtidas());
        if (getTotalDeAvaliacoes() <= 0){
            System.out.println("Esse episódio ainda não foi avaliado.");
        }else {
            System.out.println("Classificação deste podcast : " + obterClassificacao());
        }

    }
}