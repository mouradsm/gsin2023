# Classe Pagamento

A classe `Pagamento` é responsável por fornecer métodos estáticos para calcular adicionais de pagamento e realizar pagamentos a militares.

## Atributos Constantes

A classe possui três atributos constantes:

- `ADICIONAL_HABILITACAO`
- `ADICIONAL_DISPONIBILIDADE`
- `ADICIONAL_ATIVIDADE`

Esses atributos representam os percentuais dos adicionais a serem aplicados.

## Métodos Estáticos

A classe contém os seguintes métodos estáticos:

- `calcularAdicionalHabilitacao(double soldo)`: Calcula o adicional de habilitação com base no soldo passado como parâmetro.

- `calcularAdicionalDisponibilidade(double soldo)`: Calcula o adicional de disponibilidade com base no soldo passado como parâmetro.

- `calcularAdicionalAtividade(double soldo)`: Calcula o adicional de atividade com base no soldo passado como parâmetro.

## Pagamento de Militar

O método `pagarMilitar(Militar militar)` recebe um objeto da classe `Militar` (Sargento, Aluno ... ) como parâmetro e imprime informações sobre o pagamento, incluindo o nome do militar e o valor do salário.
