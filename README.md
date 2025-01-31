# appium-cucumber-java-test
Projeto de automação de testes mobile utilizando Appium, Cucumber e Java.

## Instalação
Baixando as dependências

```bash
  cd appium-cucumber-java-test
  mvn install
```

## Rodando os testes
Para rodar os testes, rode o seguinte comando

```bash
  mvn clean test
```

## Relatório dos testes
Gerar o Allure Report

```bash
  allure serve target/allure-results
```

Apagar o Allure Report de execuções anteriores

```bash
  allure generate --clean --output target/allure-results
```

## Screenshots
<img src="https://github.com/rlhorochovec/appium-cucumber-java-test/blob/develop/screenshots/intellij.png" width="400" /> <img src="https://github.com/rlhorochovec/appium-cucumber-java-test/blob/develop/screenshots/run.png" width="400" />
<img src="https://github.com/rlhorochovec/appium-cucumber-java-test/blob/develop/screenshots/overview.png" width="400" /> <img src="https://github.com/rlhorochovec/appium-cucumber-java-test/blob/develop/screenshots/allure.png" width="400" />