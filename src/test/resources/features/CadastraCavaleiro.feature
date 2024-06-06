# language: pt
Funcionalidade: Cadastrar Cavaleiros do Zodíaco
  Eu como usuário do app
  Desejo cadastrar cavaleiros do zodíaco

  @bronze
  Esquema do Cenário: Cadastrar Cavaleiros de Bronze
    Dado que o usuário clicou em novo
    Quando inserir o nome do cavaleiro "<nome>" e sua armadura de "<armadura>"
    E clicar em Salvar
    Então o aplicativo apresentará o cavaleiro "<nome>" de "<armadura>" cadastrado
    Exemplos:
      | nome   | armadura |
      | Shiryu | Dragão   |

  @failed
  Cenário: Cadastrar Cavaleiros de Bronze
    Dado que o usuário clicou em novo
    Quando inserir o nome do cavaleiro "Seiya" e sua armadura de "Pégasos"
    E clicar em Salvar
    Então o aplicativo apresentará o cavaleiro "Ikki" de "Fênix" cadastrado