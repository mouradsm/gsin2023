# Classe Militar

A classe `Militar` é uma classe abstrata que fornece uma base para representar militares. Ela contém Atributos e métodos que podem ser compartilhados por várias subclasses que representam diferentes categorias de militares como Sargento, Aluno e Oficial.

## Atributos

- `private String nomeGuerra;`
    - Atributo que armazena o nome de guerra do militar.

- `private String saram;`
    - Atributo que armazena o número SARAM do militar.

- `private String identidadeMilitar;`
    - Atributo que armazena a identidade do militar.

- `private double soldo;`
    - Atributo que armazena o soldo (salário) do militar.

## Construtor

- `public Militar(String nomeGuerra, String saram) {`
    - Construtor da classe `Militar`, que recebe os parâmetros `nomeGuerra` e `saram`. Inicializa as Atributos `nomeGuerra` e `saram` com os valores passados.

## Métodos

### Método Estático gerarSaram

- `public static String gerarSaram() {`
    - Método estático que gera um número SARAM aleatório. Retorna uma representação do número aleatório gerado.

### Método Marchar

- `public void marchar() {`
    - Método que realiza a ação de marchar, imprimindo uma mensagem indicando que o militar está marchando.

### Método Prestar Continência

- `public void prestarContinencia() {`
    - Método que realiza a ação de prestar continência, imprimindo uma mensagem indicando que o militar prestou continência.

### Métodos Getters e Setters

A classe `Militar` fornece métodos getters e setters para suas Atributos.

- `public String getNomeGuerra() {`
- `public void setNomeGuerra(String nomeGuerra) {`

- `public String getSaram() {`
- `public void setSaram(String saram) {`

- `public String getIdentidadeMilitar() {`
- `public void setIdentidadeMilitar(String identidadeMilitar) {`

- `public double getSoldo() {`
- `public void setSoldo(double soldo) {`

Essa classe exemplifica a criação de uma classe abstrata que define atributos e métodos compartilhados por várias subclasses. É uma base para representar diferentes tipos de militares e suas características.
