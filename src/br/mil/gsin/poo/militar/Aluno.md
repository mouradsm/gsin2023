# Classe Aluno

A classe `Aluno` é uma subclasse da classe `Militar`, que herda suas propriedades e comportamentos, enquanto também adiciona funcionalidades específicas para alunos.

## Propriedades

- `private String milhao;`
    - Declaração da propriedade específica da classe `Aluno` chamada `milhao`.

## Construtor

- `public Aluno(String nomeGuerra, String saram) {`
    - Construtor da classe `Aluno`, que recebe dois parâmetros: `nomeGuerra` e `saram`. O construtor chama o construtor da classe pai (`Militar`) usando `super(nomeGuerra, saram);`. Isso é feito para inicializar as propriedades da classe pai com os valores passados.

## Métodos

### Método Pagar

- `public void pagar() {`
    - Método `pagar()` (ainda não implementado).

### Método Estudar

- `public void estudar() {`
    - Método `estudar()` que imprime uma mensagem indicando que o aluno está estudando.

## Métodos Getters e Setters

A classe `Aluno` também fornece métodos getters e setters para a propriedade `milhao`.

- `public String getMilhao() {`
- `public void setMilhao(String milhao) {`

Essa classe exemplifica o conceito de herança, onde uma subclasse pode estender as funcionalidades de sua classe pai. A classe `Aluno` herda propriedades e métodos da classe `Militar` e introduz funcionalidades específicas para representar um aluno.
