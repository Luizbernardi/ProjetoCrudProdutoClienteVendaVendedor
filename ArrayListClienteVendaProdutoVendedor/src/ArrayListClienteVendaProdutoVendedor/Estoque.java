package ArrayListClienteVendaProdutoVendedor;

import java.util.ArrayList;
import java.util.List;

public class Estoque {

	private List<Produto> produtos;
	private List<Cliente> clientes;
	private List<Venda> vendas;
	private List<Vendedor> vendedores;

	public Estoque() { 
		this.produtos = new ArrayList<>();
		this.clientes = new ArrayList<>();
		this.vendas = new ArrayList<>();
		this.vendedores = new ArrayList<>();
	}

	public void cadastrarProduto(int id, String nome, String descricao, int quantidade, double preco) {
		Produto produto = new Produto(id, nome, descricao, quantidade, preco);
		produtos.add(produto);
	}
	public void removerProduto(String nome) {
		produtos.removeIf(produto -> produto.getNomeProduto().equalsIgnoreCase(nome));
	}
	public Produto consultarProduto(String nome) {
		for (Produto produto : produtos) {
			if (produto.getNomeProduto().equalsIgnoreCase(nome)) {
				return produto;
			}
		}
		return null;
	}	
	public void atualizarProduto(int novoId, String novoNome, String novaDescricao, int novaQuantidade, double novoPreco) {
		for (Produto produto : produtos) {
			if (produto.getNomeProduto().equalsIgnoreCase(novoNome)) {
				produto.setIdProduto(novoId);
				produto.setNomeProduto(novoNome);
				produto.setDescricaoProduto(novaDescricao);
				produto.setQuantidadeProduto(novaQuantidade);
				produto.setPrecoProduto(novoPreco);
				break;

			}
		}
	}
	public List<Produto> listarProdutos() {
		return produtos;
	}




	public Cliente consultarCliente(String nome) {
		for (Cliente cliente : clientes) {
			if (cliente.getNomeCliente().equalsIgnoreCase(nome)) {
				return cliente;
			}
		}
		return null;
	}	
	public void atualizarCliente(int novoId, String novoCpf, String novoNome, String novoTelefone, String novoEmail) {
		for (Cliente cliente : clientes) {
			if (cliente.getNomeCliente().equalsIgnoreCase(novoNome)) {
				cliente.setIdCliente(novoId);
				cliente.setNomeCliente(novoNome);
				cliente.setTelefoneCliente(novoTelefone);
				cliente.setNomeCliente(novoNome);
				break;

			}
		}


	}
	public void cadastrarCliente(int id, String cpf, String nome, String telefone, String email) {
		Cliente cliente = new Cliente(id, cpf, nome, telefone, email);
		clientes.add(cliente);
	}


	public void cadastrarVenda(String id,int quantidade, double preco, String data, Produto itens) {
		Venda venda = new Venda(id, quantidade, preco ,data, itens);
		vendas.add(venda);
	}
	public Venda consultarHistorico(String id) {
		for (Venda venda : vendas) {
			if (venda.getIdVenda().equalsIgnoreCase(id)) {
				return venda;
			}
		}
		return null;
	}
	public List <Venda> gerarRelatorio () {
		return vendas;
	}

	
	public void cadastrarVendedor(int id, String nome, String email, String cpf, String telefone) {
		Vendedor vendedor = new Vendedor(id, nome, email, cpf, telefone);
		vendedores.add(vendedor);
	}
	public void atualizarVendedor(int novoId, String novoNome, String novoEmail, String novoCpf, String novoTelefone) {
		for (Vendedor vendedor : vendedores) {
			if(vendedor.getNomeVendedor().equalsIgnoreCase(novoNome)) {
				vendedor.setIdVendedor(novoId);
				vendedor.setNomeVendedor(novoNome);
				vendedor.setEmailVendedor(novoEmail);
				vendedor.setCpfVendedor(novoCpf);
				vendedor.setTelefoneVendedor(novoTelefone);
			}
		}
	}
	public Vendedor consultarVendedor(String nome) {
		for (Vendedor vendedor : vendedores) {
			if (vendedor.getNomeVendedor().equalsIgnoreCase(nome)) {
				return vendedor;
			}
		}
		return null;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public List<Venda> getVendas() {
		return vendas;
	}

	public void setVendas(List<Venda> vendas) {
		this.vendas = vendas;
	}

	public List<Vendedor> getVendedores() {
		return vendedores;
	}

	public void setVendedores(List<Vendedor> vendedores) {
		this.vendedores = vendedores;
	}
	

}
