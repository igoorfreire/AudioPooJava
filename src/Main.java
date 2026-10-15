public class Main {
    public static void main(String[] args) {
        Musica musica1 = new Musica();
        musica1.setNome("Traumatizei");
        musica1.setAlbum("Manifesto Musical");
        musica1.setArtista("Henrique & Juliano");
        musica1.setTempoDeDuracao(2);
        for (int i = 0; i < 3; i++) {
            musica1.reproduzir();
        }
        for (int i = 0; i < 50; i++) {
            musica1.curtir();
        }
        musica1.exibirFichaTecnica();


        Podcast podcast = new Podcast();
        podcast.setNome("Flow : Alura - Episódio 479");
        podcast.setApresentador("Igor3K");
        podcast.setTempoDeDuracao(110);
        for (int i = 0; i < 2; i++) {
            podcast.reproduzir();
        }
        for (int i = 0; i < 100; i++) {
            podcast.curtir();
        }
        podcast.avaliar(8.5);
        podcast.exibirFichaTecnica();

    }
}