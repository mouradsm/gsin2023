# Classe Sargento

A classe `Sargento` é uma subclasse da classe `Militar`, o que significa que ela estende (herda) as propriedades e comportamentos da classe `Militar`.

## Construtor

O construtor da classe `Sargento` recebe dois parâmetros: `nomeGuerra` e `saram`. Ele chama o construtor da classe pai (`Militar`) usando `super(nomeGuerra, saram);`. Isso é feito para inicializar as propriedades da classe pai com os valores passados.

```java
public Sargento(String nomeGuerra, String saram) {
    super(nomeGuerra, saram);
}
