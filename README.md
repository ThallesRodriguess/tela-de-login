# LoginScreen - Implementação Simples de Tela de Login

Este repositório contém um código Java simples para uma implementação de tela de login com autenticação de usuário e gerenciamento de usuários. O código inclui testes JUnit para verificar a funcionalidade da classe `LoginScreen`.

## Sumário
- [Introdução](#introdução)
- [Recursos](#recursos)
- [Uso](#uso)
- [Testes](#testes)
- [Contribuições](#contribuições)
- [Licença](#licença)

## Introdução

A classe `LoginScreen` foi projetada para fornecer autenticação básica de usuário e recursos de gerenciamento. Ela permite que os usuários façam login e adicionem novas credenciais de usuário a um banco de dados de usuários. Este código pode servir como ponto de partida para a construção de sistemas de autenticação mais avançados.

## Recursos

Os principais recursos da classe `LoginScreen` são:

- Autenticação de Usuário: Os usuários podem tentar fazer login fornecendo seu nome de usuário e senha. A classe verifica se as credenciais fornecidas correspondem às entradas no banco de dados de usuários e retorna um valor booleano indicando o resultado.

- Gerenciamento de Usuário: Os usuários podem adicionar novas credenciais ao banco de dados de usuários, permitindo a criação de novas contas de usuário.

## Uso

Para usar a classe `LoginScreen` em seu aplicativo Java, siga estas etapas:

1. Importe a classe `LoginScreen` para o seu projeto.
2. Crie uma instância da classe `LoginScreen`.
3. Use o método `login` para autenticar os usuários com seu nome de usuário e senha.
4. Use o método `addUser` para adicionar novas credenciais de usuário ao banco de dados.

Aqui está um exemplo simples de como usar a classe `LoginScreen`:

```java
// Crie uma instância do LoginScreen
LoginScreen loginScreen = new LoginScreen();

// Autentique um usuário
if (loginScreen.login("john1", "password123")) {
    // Login bem-sucedido
} else {
    // Login falhou
}

// Adicione um novo usuário
loginScreen.addUser("testuser", "testpassword");
```
## Testes

O repositório também inclui testes JUnit para a classe `LoginScreen` a fim de garantir a funcionalidade dos recursos de autenticação e gerenciamento de usuário. Os testes abrangem os seguintes cenários:

- `testSuccessfulLogin`: Testa uma tentativa de login bem-sucedida.
- `testFailedLogin`: Testa uma tentativa de login malsucedida.
- `testAddUser`: Testa a adição de um novo usuário ao banco de dados.

Para executar os testes, você pode utilizar a estrutura de testes JUnit no seu ambiente de desenvolvimento.
