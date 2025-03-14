# API de PDV (Ponto de Venda)

Esta é uma API para um sistema de PDV (Ponto de Venda) utilizando **Spring Boot**, **Java 17**, **Spring Data JPA** e **Railway** para deploy.

## Endpoints

- `POST /produtos`: Adiciona um novo produto ao estoque.
- `GET /produtos`: Lista todos os produtos.
- `POST /transacoes`: Registra uma nova venda.
- `GET /relatorios/vendas`: Gera um relatório de vendas.

## Rodando o Projeto

1. Clone este repositório.
2. Execute o comando `./gradlew bootRun` para rodar a aplicação.
3. A API estará disponível em `http://localhost:8080`.

## Dependências

- Spring Boot 3
- Spring Data JPA
- Banco de Dados PostgreSQL

## Licença

Este projeto está sob a licença MIT.
