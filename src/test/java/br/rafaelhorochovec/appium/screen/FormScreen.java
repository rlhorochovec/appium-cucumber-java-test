package br.rafaelhorochovec.appium.screen;

import org.openqa.selenium.By;

public class FormScreen extends BaseScreen {

    By btn_mais = By.id("br.rafaelhorochovec.app_cdz_android:id/add_new");
    By input_nome = By.id("br.rafaelhorochovec.app_cdz_android:id/name_edittext");
    By input_armadura = By.id("br.rafaelhorochovec.app_cdz_android:id/armor_edittext");
    By btn_salvar = By.id("br.rafaelhorochovec.app_cdz_android:id/btn_save");

    public void clicaAdicionar() {
       clicar(btn_mais);
    }

    public void clicaSalvar() {
        clicar(btn_salvar);
    }

    public void preencheForm(String nome, String armadura) {
        escrever(input_nome, nome);
        escrever(input_armadura, armadura);
    }
}