public class Musica extends Audio{
    private String artista;
    private String album;

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }
    @Override
    public void reproduzir(){
        super.reproduzir();
        System.out.println("Reproduzindo a faixa " + getNome() + " de " + getArtista());
    }
    public void exibirFichaTecnica() {
        System.out.println("Nome da faixa : " + getNome());
        System.out.println("Álbum : " + getAlbum() );
        System.out.println("Essa faixa tem " + getTempoDeDuracao() + " minutos");
        System.out.println("Vezes reproduzida : " + getTotalDeReproducoes());
        System.out.println("Essa faixa tem o total de " + getTotalDeCurtidas() + " curtidas");
        if (getTotalDeAvaliacoes() <= 0){
            System.out.println("Essa faixa ainda não foi avaliada.");
        }else {
            System.out.println("Classificação desta faixa : " + obterClassificacao());
        }

    }
}