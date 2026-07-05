### Projeto da classe (UML)
# <img width="1205" height="556" alt="image" src="https://github.com/user-attachments/assets/3fd50823-bf38-4220-b79a-77cdd259ed69" />
# Product Stock

Projeto desenvolvido em **Java** com o objetivo de praticar os conceitos fundamentais de **Programação Orientada a Objetos (POO)**.

O sistema realiza o cadastro de um produto, permitindo informar seu nome, preço e quantidade em estoque. Após o cadastro, o usuário pode adicionar ou remover unidades do estoque, enquanto o sistema atualiza automaticamente a quantidade disponível e o valor total dos produtos armazenados.

Durante a execução do programa são realizadas as seguintes operações:

-  Cadastro do produto
- Exibição do nome, preço e quantidade em estoque
- Cálculo automático do valor total em estoque
-  Entrada de produtos no estoque
- Saída de produtos do estoque
- Atualização automática das informações após cada operação

## Tecnologias utilizadas

* Java
* Programação Orientada a Objetos (POO)
* Classes e Objetos
* Métodos
* Encapsulamento de comportamentos
* Scanner para entrada de dados
* Locale para formatação numérica

## Estrutura do projeto

```text
src
├── application
│   └── Main.java
└── entities
    └── Product.java
```
## Fluxo do sistema

1. O usuário informa o nome do produto.
2. Informa o preço do produto.
3. Informa a quantidade inicial em estoque.
4. O sistema exibe os dados do produto.
5. O usuário adiciona novas unidades ao estoque.
6. O sistema atualiza e exibe os novos dados.
7. O usuário remove unidades do estoque.
8. O sistema apresenta o estoque atualizado juntamente com o valor total dos produtos.

## 💻 Exemplo de execução
```text
Enter producto data:
Name: TV
Price: 900.00
Quantity in Stock: 10

TV, $900.00, 10 units, Total: $ 9000.00

Enter the number of product to be add in stock: 5

Updated data: TV, $900.00, 15 units, Total: $ 13500.00

Enter the number of product to be removed from stock: 3

Updated data: TV, $900.00, 12 units, Total: $ 10800.00

```
## Desenvolvido por **Thiago Sales** 

## Curso de referência

Este projeto foi desenvolvido durante os estudos do curso **Java COMPLETO – Programação Orientada a Objetos + Projetos**.

➡️ Java COMPLETO – Programação Orientada a Objetos + Projetos (Udemy)<br>
    https://www.udemy.com/course/java-curso-completo/
