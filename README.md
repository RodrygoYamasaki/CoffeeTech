# ☕CoffeeTech
Este projeto é uma API REST robusta desenvolvida com Spring Boot para o gerenciamento de uma cafeteria moderna. A aplicação permite o controle completo do cardápio de cafés, gestão de clientes e o processamento de pedidos em tempo real.

## 📋Tecnologias e Dependências
- **Java:** Linguagem principal do projeto.
- **Maven:** Ferramenta de automação de build e gerenciamento de dependências.
- **Insomnia:** Ferramenta de testes de API REST.
- **Spring Web:** Módulo do Spring responsável pela criação de aplicações web, incluindo suporte a RESTful APIs.
- **Spring Boot DevTools:** Ferramenta que facilita o desenvolvimento, oferecendo recursos como reinicialização automática e live reload.
- **Spring Data JPA:** Abstração da persistência de dados que simplifica a implementação de repositórios usando JPA.
- **SpringDoc OpenAPI:** Documentação automatizada da API e interface Swagger.
- **Lombok:** Biblioteca que gera automaticamente getters, setters, construtores e outros métodos com anotações simples.
- **H2 Database:** Banco de dados relacional em memória, ideal para testes e desenvolvimento local.
- **Validation:** Ferramenta para validar dados de entrada.
- **Docker:** Conteinerização e isolamento de ambiente.
- **Docker-Compose:** Orquestração e implantação de múltiplos containers.

---

## 💻 Como Usar

1. **Clone o repositório:**

   ```bash
   https://github.com/RodrygoYamasaki/CoffeeTech.git
   ```

2. **Acesse a pasta do projeto:**

   ```bash
   cd CoffeeTech
   ```

3. **Construa e Execute o container em background:**

   ```bash
   docker-compose up -d
   ```

4. **Verificar se a API esta rodando:**

   ```bash
   docker ps
   ```

5. **Acesse a documentação da API:**

   ```bash
   localhost:8080/swagger-ui.html
   ```

6. **Use o Insomnia para testar os endpoints REST da API.**
