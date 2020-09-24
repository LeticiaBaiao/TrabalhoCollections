package Model;

public class Produto {

	private int codigo;
	private String descr;
	private float preco;

	public Produto(int codigo, String descr, float preco) {
		this.codigo = codigo;
		this.descr = descr;
		this.preco = preco;
	}

	public Produto() {
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	@Override
	public boolean equals(Object o) {
		if(this == o) { return true; }
		if(o == null || getClass() != o.getClass()) { return false; }

		Produto produto = (Produto) o;

		if(codigo != produto.codigo) { return false; }
		if(Float.compare(produto.preco, preco) != 0) { return false; }
		return descr != null ? descr.equals(produto.descr) : produto.descr == null;
	}

	@Override
	public int hashCode() {
		int result = codigo;
		result = 31 * result + (descr != null ? descr.hashCode() : 0);
		result = 31 * result + (preco != +0.0f ? Float.floatToIntBits(preco) : 0);
		return result;
	}

	public float getPreco() {
		return preco;
	}

	@Override
	public String toString() {
		return "Produto{" +
				"codigo=" + codigo +
				", descr='" + descr + '\'' +
				", preco=" + preco +
				'}';
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
}