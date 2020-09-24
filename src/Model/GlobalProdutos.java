package Model;

import java.util.ArrayList;
import java.util.List;

public class GlobalProdutos {

	public static List<Produto> produtoList = new ArrayList<>();
	public static int idAlterar;

	public static int getIdAlterar() {
		return idAlterar;
	}

	public static void setIdAlterar(int idAlterar) {
		GlobalProdutos.idAlterar = idAlterar;
	}

	public static List<Produto> getProdutoList() {
		return produtoList;
	}

	@Override
	public String toString() {
		return "GlobalProdutos{}";
	}

	public static void setProdutoList(List<Produto> produtoList) {
		GlobalProdutos.produtoList = produtoList;
	}
}
