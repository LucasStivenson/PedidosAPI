# Exercício - Sistema de Pedidos com Cálculo de Desconto

Este repositório contém a implementação de um sistema de pedidos com cálculo automático de descontos, desenvolvido como parte da disciplina **Desenvolvimento de Sistemas Computacionais** - **Turma 4A (2025/1)** do **IFSUL - Campus Sapucaia do Sul**.

## Descrição do Projeto

A aplicação consiste em uma **API REST** que permite:

- Criar pedidos de compra com múltiplos itens
- Calcular automaticamente o valor total de cada pedido
- Aplicar descontos com base no valor total da compra

## Regras de Negócio

- Se o valor total do pedido for superior a **R$ 500**, aplica-se um desconto de **10%**.
- Se o valor total ultrapassar **R$ 1000**, o desconto aplicado será de **15%**.
- O valor total e o desconto são **calculados automaticamente** no momento da criação do pedido.

## Tecnologias Utilizadas

- **Java 17+**
- **Spring Boot**
- **Spring Web**
- **Maven**

## Estrutura de Classes

- **Produto**  
  - `id`  
  - `nome`  
  - `preco`  

- **ItemPedido**  
  - `produto`  
  - `quantidade`  

- **Pedido**  
  - `id`  
  - `itens` (Lista de `ItemPedido`)  
  - `valorTotal` (calculado)  
  - `desconto` (calculado)

## Endpoints Disponíveis

- **POST** `/pedidos`  
  Cria um novo pedido com itens informados no corpo da requisição.

- **GET** `/pedidos/{id}`  
  Retorna um pedido específico pelo ID.

- **GET** `/pedidos`  
  Retorna a lista de todos os pedidos cadastrados.
