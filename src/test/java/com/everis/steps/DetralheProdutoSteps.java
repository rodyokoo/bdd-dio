package com.everis.steps;

import com.everis.pages.DetalheProdutoPage;
import io.cucumber.java.pt.E;

public class DetralheProdutoSteps {

	@E("^aumenta a quantidade produto$")
	public void aumentarQuantidadeProduto() {
		DetalheProdutoPage detalheProdutoPage = new DetalheProdutoPage();
		detalheProdutoPage.aumentarQuantidadeProduto();
	}
	
}