package ArrayListClienteVendaProdutoVendedor;


public class Produto {
	private int idProduto;
	private String nomeProduto;
	private String descricaoProduto;
	private int quantidadeProduto;
	private double precoProduto;
	
	public Produto() {
		
	}
	
	public Produto(int id, String nome, String descricao, int quantidade, double preco) {
		this.idProduto = id;
		this.nomeProduto = nome;
		this.descricaoProduto = descricao;
		this.quantidadeProduto = quantidade;
		this.precoProduto = preco;
	}
	
	public int getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(int id) {
		this.idProduto = id;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nome) {
		this.nomeProduto = nome;
	}
	public int getQuantidadeProduto() {
		return quantidadeProduto;
	}
	public void setQuantidadeProduto(int quantidade) {
		this.quantidadeProduto = quantidade;
	}
	public double getPrecoProduto() {
		return precoProduto;
	}
	public void setPrecoProduto(double preco) {
		this.precoProduto = preco;
	}
	public String getDescricaoProduto() {
		return descricaoProduto;
	}
	public void setDescricaoProduto(String descricao) {
		this.descricaoProduto = descricao;
	}

	@Override
	public String toString() {
		return "Produto [idProduto=" + idProduto + ", nomeProduto=" + nomeProduto + ", descricaoProduto="
				+ descricaoProduto + ", quantidadeProduto=" + quantidadeProduto + ", precoProduto=" + precoProduto
				+ "]";
	}
}
