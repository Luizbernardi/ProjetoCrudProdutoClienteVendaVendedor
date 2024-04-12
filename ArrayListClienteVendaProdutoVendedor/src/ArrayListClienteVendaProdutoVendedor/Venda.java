package ArrayListClienteVendaProdutoVendedor;

public class Venda {
	
	public String toString() {
		return "Venda [idVenda=" + idVenda + ", quantidadeVenda=" + quantidadeVenda + ", precoVenda=" + precoVenda
				+ ", dataVenda=" + dataVenda + ", itensVenda=" + itensVenda + "]";
	}
	private String idVenda;
	private int quantidadeVenda;
	private double precoVenda;
	private String dataVenda;
	private Produto itensVenda;

	public Venda() {

	}
	public Venda(String id,int quantidade, double preco, String data, Produto itens) {
		this.idVenda = id;
		this.quantidadeVenda = quantidade;
		this.precoVenda = preco;
		this.dataVenda = data;
		this.itensVenda = itens;
	}


	public String getIdVenda() {
		return idVenda;
	}
	public void setIdVenda(String id) {
		this.idVenda = id;
	}
	public int getQuantidadeVenda() {
		return quantidadeVenda;
	}
	public void setQuantidadeVenda(int quantidade) {
		this.quantidadeVenda = quantidade;
	}
	public double getPrecoVenda() {
		return precoVenda;
	}
	public void setPrecoVenda(double preco) {
		this.precoVenda = preco;
	}
	public String getDataVenda() {
		return dataVenda;
	}
	public void setDataVenda(String data) {
		this.dataVenda = data;
	}
	public Produto getItensVenda() {
		return itensVenda;
	}
	public void setItensVenda(Produto itens) {
		this.itensVenda = itens;
	}

}
