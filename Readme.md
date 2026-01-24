📚 Serviço Web com Spring Boot, JPA e Hibernate
Este projeto foi desenvolvido como parte dos meus estudos em Java com Spring Boot, aplicando conceitos de APIs RESTful, persistência com JPA/Hibernate e modelagem de entidades.
O objetivo é consolidar boas práticas de desenvolvimento backend e demonstrar minha evolução como desenvolvedor.

🚀 Tecnologias utilizadas

- Java 17

- Spring Boot

- Spring Data JPA / Hibernate

- H2 Database (ambiente de teste)

- Maven

🔑 Funcionalidades principais

- CRUD de Usuários: criação, leitura, atualização e exclusão.

- Tratamento de exceções: respostas padronizadas para erros de negócio e requisições inválidas.

- Associações entre entidades:

- One-to-One: Pagamento vinculado ao Pedido.

- One-to-Many: Produto e Itens de Pedido.

- Many-to-Many: Produtos e Categorias, com atributos extras em relacionamentos.

- Camada de serviço: abstração da lógica de negócios e integração com o repositório JPA.

- Banco de dados H2: perfil de teste com seeding automático de dados.

- Enum de status de pedidos: controle de estados com padrão ISO 8601 para datas.

📂 Estrutura do projeto

Código
src/
 ├── main/
 │   ├── java/com/projeto
 │   │    ├── entities/        # Classes de domínio
 │   │    ├── repositories/    # Interfaces JPA
 │   │    ├── services/        # Lógica de negócio
 │   │    └── resources/       # Endpoints REST
 │   └── resources/
 │        └── application.properties
 └── test/                     # Testes automatizados
 
⚙️ Como executar

Clone o repositório:

bash
git clone https://github.com/Eric1557/Servi-o-Web-Spring-Boot-JPA-Hibernate.git

Entre na pasta do projeto:

bash
cd Servi-o-Web-Spring-Boot-JPA-Hibernate

Execute com Maven:

bash
mvn spring-boot:run

Acesse os endpoints:

http://localhost:8080/users

http://localhost:8080/orders

http://localhost:8080/products

🎯 Objetivo do projeto

Este projeto foi construído para:

- Consolidar conhecimentos em APIs RESTful.

- Praticar modelagem de entidades e relacionamentos complexos.

- Implementar tratamento centralizado de exceções.

- Demonstrar habilidades em Java + Spring Boot para meu portfólio.

💡 Aprendizados

- Estruturação de camadas (resource, service, repository).

- Implementação de relacionamentos complexos entre entidades.

- Uso de perfis de aplicação para ambientes de teste.

- Boas práticas de desenvolvimento orientado a objetos.

📌 Próximos passos

- Implementar autenticação e autorização com Spring Security.

- Adicionar documentação da API com Swagger/OpenAPI.

Criar testes unitários e de integração mais robustos.

👨‍💻 Autor
Eric1557  
Meu github: https://github.com/Eric1557
