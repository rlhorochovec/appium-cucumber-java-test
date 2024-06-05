package br.rafaelhorochovec.appium.screen;

import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListScreen extends BaseScreen {

    By text_nome = By.id("name");
    By text_armadura = By.id("armor");

    public void validaItemLista(String nome, String armadura) {

        String name = obterTexto(text_nome);
        String armor = obterTexto(text_armadura);

        assertEquals(name, nome);
        assertEquals(armor, armadura);
    }
}
