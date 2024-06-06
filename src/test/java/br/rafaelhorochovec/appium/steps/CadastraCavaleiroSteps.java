package br.rafaelhorochovec.appium.steps;

import br.rafaelhorochovec.appium.screen.FormScreen;
import br.rafaelhorochovec.appium.screen.ListScreen;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class CadastraCavaleiroSteps {

    FormScreen form = new FormScreen();
    ListScreen list = new ListScreen();

    @Dado("que o usuário clicou em novo")
    public void queOUsuárioClicouEmNovo() {
        form.clicaAdicionar();
    }

    @Quando("inserir o nome do cavaleiro {string} e sua armadura de {string}")
    public void inserirONomeDoCavaleiroESuaArmaduraDe(String nome, String armadura) {
        form.preencheForm(nome, armadura);
    }

    @E("clicar em Salvar")
    public void clicarEmSalvar() {
        form.clicaSalvar();
    }

    @Então("o aplicativo apresentará o cavaleiro {string} de {string} cadastrado")
    public void oAplicativoApresentaráOCavaleiroDeCadastrado(String nome, String armadura) {
        list.validaItemLista(nome, armadura);
    }
}