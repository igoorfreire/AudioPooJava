# Modelagem de Áudio em Java (Músicas e Podcasts)

Projeto de console que modela um aplicativo de áudio com **músicas** e **podcasts**. Foi feito para praticar os pilares da orientação a objetos em Java: herança, encapsulamento e polimorfismo (sobrescrita de métodos). Nasceu de um desafio prático da Alura.

## Como as classes se relacionam

```text
        Audio (superclasse)
        /               \
   Musica               Podcast
```

| Classe | Papel |
| --- | --- |
| `Audio` | Superclasse com o que toda faixa tem: nome, duração, total de reproduções, curtidas e avaliações. Concentra a contagem em `reproduzir()`, `curtir()` e `avaliar()`, além de `obterClassificacao()` e `exibirFichaTecnica()` |
| `Musica` | Herda de `Audio` e acrescenta `artista` e `album`. Sobrescreve `reproduzir()` para mostrar o nome da faixa e o artista |
| `Podcast` | Herda de `Audio` e acrescenta `apresentador`. Sobrescreve `reproduzir()` e `exibirFichaTecnica()` com os dados do episódio |
| `Main` | Cria uma música e um podcast, simula reproduções, curtidas e uma avaliação, e exibe a ficha técnica de cada um |

## Conceitos praticados

- **Herança:** `Musica` e `Podcast` reaproveitam os atributos e métodos de `Audio` com `extends`
- **Encapsulamento:** todos os atributos de `Audio` são `private`. As subclasses acessam os dados por getters e pedem a contagem de reproduções à superclasse com `super.reproduzir()`
- **Polimorfismo por sobrescrita:** cada subclasse reescreve `reproduzir()` (e o `Podcast`, também `exibirFichaTecnica()`) com `@Override`, com comportamento próprio
- Média de avaliações calculada a partir da soma das notas, tratando o caso de faixa ainda sem avaliação

## Como executar

Pré-requisito: JDK 8 ou superior instalado.

```bash
git clone https://github.com/igoorfreire/audio-poo-java.git
cd audio-poo-java/src
javac *.java
java Main
```

Também é possível abrir a pasta no IntelliJ IDEA e executar a classe `Main`.

## Exemplo de saída

A `Main` reproduz a música 3 vezes e o podcast 2 vezes, curte as duas faixas e avalia o podcast com nota 8.5:

```text
Reproduzindo a faixa Traumatizei de Henrique & Juliano
Reproduzindo a faixa Traumatizei de Henrique & Juliano
Reproduzindo a faixa Traumatizei de Henrique & Juliano
Nome da faixa : Traumatizei
Essa faixa tem 2 minutos
Vezes reproduzida : 3
Essa faixa tem o total de 50 curtidas
Essa faixa ainda não foi avaliada.
Reproduzindo : Flow : Alura - Episódio 479 , apresentado por : Igor3K
Reproduzindo : Flow : Alura - Episódio 479 , apresentado por : Igor3K
Nome do episódio : Flow : Alura - Episódio 479
Duração do episódio em minutos : 110
Nome do apresentador : Igor3K
Total de reproduções : 2
Total de curtidas : 100
Classificação deste podcast : 8.5
```

## Próximos passos

- Guardar músicas e podcasts em uma `List<Audio>` e percorrer a lista chamando `reproduzir()`, para mostrar o polimorfismo em ação
- Avaliar a música na `Main` e exibir a classificação média
- Criar uma classe para gerenciar uma playlist de áudios

## Autor

**Igor Freire**, estudante de Análise e Desenvolvimento de Sistemas.

- LinkedIn: https://www.linkedin.com/in/igoor-freire/
- GitHub: https://github.com/igoorfreire
