# Resumo POOB - GSIN 2023 - Java
---

#### Criação de variáveis

**Identificadores válidos**: Os nomes de variáveis em Java devem começar com uma letra (a-z ou A-Z) ou com o caractere de sublinhado (_). Eles não podem começar com números ou outros caracteres especiais.

**Comprimento**: Os identificadores podem ter qualquer tamanho, mas é uma boa prática usar nomes significativos e concisos para tornar o código mais legível.

 **Letras maiúsculas e minúsculas**: Java é sensível a maiúsculas e minúsculas, o que significa que letras maiúsculas e minúsculas são distintas. Por exemplo, "idade" e "Idade" seriam duas variáveis diferentes.

 **Palavras reservadas**: É importante evitar o uso de palavras reservadas do Java como nomes de variáveis, pois elas têm significado especial na linguagem. Alguns exemplos de palavras reservadas são "int", "if", "while", "class", entre outras.


**Padrões de nomenclatura**: Existem convenções de nomenclatura amplamente aceitas na comunidade Java. Duas delas são:
   - **Camel Case**: Começa com uma letra minúscula e as palavras subsequentes começam com letra maiúscula, sem espaços ou caracteres especiais. Por exemplo: `idadeDoUsuario`, `numeroDeAlunos`, `nomeCompleto`.
   - **Pascal Case**: Cada palavra começa com letra maiúscula, incluindo a primeira. Por exemplo: `IdadeDoUsuario`, `NumeroDeAlunos`, `NomeCompleto`.


**Clareza e significado**: É fundamental escolher nomes que sejam claros e tenham significado no contexto do código. Evite nomes muito genéricos, como "a", "b", "x", e opte por nomes que expressem a finalidade da variável, facilitando a leitura e manutenção do código.


O formato para a criação de variáveis em Java segue o seguinte padrão:

```Java
// Tipo texto

int idade;
double salario;
String nome;
```

#### Estruturas de controle

**Estrutura de decisão `if`**:

```java
int idade = 18;

if (idade >= 18) {
    System.out.println("Você é maior de idade!");
} else {
    System.out.println("Você é menor de idade!");
}
```

**Estrutura de decisão `if-else if-else`**:

```java
int nota = 80;

if (nota >= 90) {
    System.out.println("Parabéns! Você tirou uma nota excelente!");
} else if (nota >= 70) {
    System.out.println("Sua nota foi boa. Continue assim!");
} else {
    System.out.println("Você precisa estudar mais para melhorar sua nota.");
}
```

**Estrutura de controle `switch-case`**:

```java
int diaSemana = 3;

switch (diaSemana) {
    case 1:
        System.out.println("Domingo");
        break;
    case 2:
        System.out.println("Segunda-feira");
        break;
    case 3:
        System.out.println("Terça-feira");
        break;
    // ... outros casos
    default:
        System.out.println("Dia inválido");
        break;
}
```

**Estrutura de repetição `for`**:

```java
for (int i = 1; i <= 5; i++) {
    System.out.println("Contagem: " + i);
}
```

**Estrutura de repetição `while`**:

```java
int contador = 1;
while (contador <= 5) {
    System.out.println("Contagem: " + contador);
    contador++;
}
```

**Estrutura de repetição `do-while`**:

```java
int contador = 1;
do {
    System.out.println("Contagem: " + contador);
    contador++;
} while (contador <= 5);
```




