public class Audio {
        private String nome;
        private int tempoDeDuracao;
        private int totalDeReproducoes;
        private int totalDeCurtidas;
        private int totalDeAvaliacoes;
        private double somaDasAvaliacoes;


        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getTempoDeDuracao() {
            return tempoDeDuracao;
        }

        public void setTempoDeDuracao(int tempoDeDuracao) {
            this.tempoDeDuracao = tempoDeDuracao;
        }

        public void curtir(){
            totalDeCurtidas++;
        }

        public void reproduzir(){
            totalDeReproducoes++;
        }

        public int getTotalDeCurtidas() {
            return totalDeCurtidas;
        }

        public int getTotalDeReproducoes() {
            return totalDeReproducoes;
        }
        public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }


    public void avaliar(double nota){
            somaDasAvaliacoes += nota;
            totalDeAvaliacoes++;
        }
        public double obterClassificacao() {
                return somaDasAvaliacoes / totalDeAvaliacoes;
        }


    }

