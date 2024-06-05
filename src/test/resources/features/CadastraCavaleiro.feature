# language: pt
Funcionalidade: Cadastrar Cavaleiros do Zodíaco
  Eu como usuário do app
  Desejo cadastrar cavaleiros do zodíaco

  @cvz
  Cenário: Cadastrar Cavaleiro de Dragão
    Dado que o usuário clicou em novo
    Quando inserir o nome do cavaleiro "Shiryu" e sua armadura de "Dragão"
    E clicar em Salvar
    Então o aplicativo apresentará o cavaleiro "Shiryu" de "Dragão" cadastrado

  @cvz
  Cenário: Cadastrar Cavaleiro de Pégasos
    Dado que o usuário clicou em novo
    Quando inserir o nome do cavaleiro "Seiya" e sua armadura de "Pégasos"
    E clicar em Salvar
    Então o aplicativo apresentará o cavaleiro "Seiya" de "Pégasos" cadastrado