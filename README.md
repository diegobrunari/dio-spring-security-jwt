# API Spring Boot com Segurança JWT

Esta é uma API REST construída com Spring Boot que implementa autenticação e autorização usando JWT (JSON Web Token). A segurança é configurada para validar o token JWT enviado no header das requisições, permitindo controle de acesso baseado em roles.

---

## Tecnologias utilizadas

- Java 17
- Spring Boot 2.6.x
- Spring Security
- JWT (com biblioteca jjwt)
- H2 Database (em memória)
- Maven

---

## Funcionalidades principais

- Login com usuário e senha via endpoint `/login`
- Geração de token JWT assinado
- Validação do token JWT em requisições autenticadas
- Controle de acesso baseado em roles (`ROLE_USERS`, `ROLE_MANAGERS`)
- Endpoints protegidos com diferentes níveis de permissão
- Console H2 habilitado para testes

---

## Como rodar

1. Clone o repositório

```bash
git clone <url-do-repositorio>
cd dio-spring-security-jwt
```

2. Build e execute com Maven
```bash
mvn clean install
mvn spring-boot:run
```

3. Acesse a API em: http://localhost:8080


4. Para acessar o console do banco H2:
```bash
http://localhost:8080/h2-console
```

JDBC URL: jdbc:h2:mem:testdb

Usuário: sa

Senha: sa

## Principais Endpoints

| Método | Endpoint    | Descrição                    | Autorização                 |
| ------ | ----------- | ---------------------------- | --------------------------- |
| POST   | `/login`    | Login e geração do JWT       | Público                     |
| POST   | `/users`    | Criar novo usuário           | Público                     |
| GET    | `/users`    | Listar usuários              | ROLE\_USERS, ROLE\_MANAGERS |
| GET    | `/managers` | Recursos exclusivos managers | ROLE\_MANAGERS              |


### Configurações:
```bash
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.username=sa
spring.datasource.password=sa
spring.h2.console.enabled=true

security.config.key=SECRET_KEY
security.config.prefix=Bearer
security.config.expiration=3600000
```

Qualquer dúvida ou sugestão, fique à vontade para abrir uma issue!
