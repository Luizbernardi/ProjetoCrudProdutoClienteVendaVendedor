package ArrayListClienteVendaProdutoVendedor;




import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class atividade03 {
	private static Estoque estoque = new Estoque();


	public static void main(String[] args) {
		menu();	

	}

	public static void menu () {
		int opcao;
		do {opcao = Integer.parseInt(JOptionPane.showInputDialog("=== Selecione o setor desejado ===\n" +
				"1. Produto \n" +
				"2. Venda \n" +
				"3. Vendedor \n" +
				"4. Cliente \n" +
				"0. Sair \n" +
				"Escolha uma opção:"));
		switch (opcao) {
		case 1:
			menuProduto();
			break;
		case 2:
			menuVenda();
			break;
		case 3:
			menuVendedor();
			break;
		case 4:
			menuCliente();
			break;
		case 0:
			JOptionPane.showMessageDialog(null, "Saindo");
			break;

		default:
			JOptionPane.showMessageDialog(null, "Opção invalida");
		}
		} while (opcao !=0);
	}


	private static void menuCliente() {
		int opcao;
		do {opcao = Integer.parseInt(JOptionPane.showInputDialog("=== Cliente ===\n" +
				"1. Cadastrar Cliente\n" +
				"2. Atualizar Cliente\n" +
				"3. Consultar Cliente\n" +
				"0. Sair\n" +
				"Escolha uma opção:"));
		switch (opcao) {
		case 1:
			cadastrarCliente(null);
			break;
		case 2:
			atualizarCliente();
			break;
		case 3:
			consultarCliente();
			break;
		case 0:
			JOptionPane.showMessageDialog(null, "Saindo");
			break;

		default:
			JOptionPane.showMessageDialog(null, "Opção invalida");
		}

		} while (opcao != 0);

	}


	private static void consultarCliente() {
	String nome = JOptionPane.showInputDialog("Digite o nome do cliente que deseja consultar");
	Cliente cliente = estoque.consultarCliente(nome);
	if (cliente != null) {
		JOptionPane.showMessageDialog(null, estoque.toString());
	} else {
		JOptionPane.showMessageDialog(null, "Cliente não encontrado");

	}

	}
	private static void atualizarCliente() {
		String nome = JOptionPane.showInputDialog("Digite o nome do cliente que deseja atualizar");
		Cliente cliente = estoque.consultarCliente(nome);
		if (cliente != null) {
			int novoId = (Integer.valueOf(JOptionPane.showInputDialog("Digite o novo ID do cliente")));
			String novoNome = (JOptionPane.showInputDialog("Digite o novo nome do cliente"));
			String novoCpf = (JOptionPane.showInputDialog("Digite o novo cpf do cliente"));
			String novoTelefone = (JOptionPane.showInputDialog("Digite o novo telefone do cliente"));
			String novoEmail = (JOptionPane.showInputDialog("Digite o novo email do cliente"));
			estoque.atualizarCliente(novoId, novoCpf, novoNome, novoTelefone, novoEmail);
			JOptionPane.showMessageDialog(null, "Cliente atualizado com sucesso");
		} else {
			JOptionPane.showMessageDialog(null, "Cliente não encontrado");
		}


	}

	private static void cadastrarCliente(Cliente cliente1) {
		int id = (Integer.valueOf(JOptionPane.showInputDialog("Digite o ID do cliente")));
		String cpf = (JOptionPane.showInputDialog("Digite o cpf do cliente"));
		String nome = (JOptionPane.showInputDialog("Digite o nome do cliente"));
		String telefone = (JOptionPane.showInputDialog("Digite o telefone do cliente"));
		String email =  (JOptionPane.showInputDialog("Digite o email do cliente"));
		estoque.cadastrarCliente(id, cpf, nome, telefone, email);
		JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso");


	}

	private static void menuVendedor() {
		int opcao;
		do {opcao = Integer.parseInt(JOptionPane.showInputDialog("=== Vendedor ===\n" +
				"1. Cadastrar Vendedor\n" +
				"2. Atualizar Vendedor\n" +
				"3. Consultar Vendedor\n" +
				"0. Sair\n" +
				"Escolha uma opção:"));
		switch (opcao) {
		case 1:
			cadastrarVendedor(null);
			break;
		case 2:
			atualizarVendedor();
			break;
		case 3:
			consultarVendedor();
			break;
		case 0:
			JOptionPane.showMessageDialog(null, "Saindo");
			break;

		default:
			JOptionPane.showMessageDialog(null, "Opção invalida");
		}

		} while (opcao != 0);


	}


	private static void atualizarVendedor() {
		String nome = JOptionPane.showInputDialog("Digite o nome do produto que deseja atualizar");
		Vendedor vendedor = estoque.consultarVendedor(nome);
			if (vendedor != null) {
				int novoId = (Integer.valueOf(JOptionPane.showInputDialog("digite o novo id do vendedor"))); 
				String novoNome = (JOptionPane.showInputDialog("Digite o novo nome do vendedor"));
				String novoEmail = (JOptionPane.showInputDialog("Digite o novo email do vendedor"));
				String novoCpf = (JOptionPane.showInputDialog("Digite o novo cpf do vendedor"));
				String novoTelefone = (JOptionPane.showInputDialog("Digite o novo nome do vendedor"));
				estoque.atualizarVendedor(novoId, novoNome, novoEmail, novoCpf, novoTelefone);
				JOptionPane.showMessageDialog(null, "Vendedor cadastrado com sucesso");
			} else {
				JOptionPane.showMessageDialog(null, "Vendedor não encontrado");
			}

	}

	private static void cadastrarVendedor(Vendedor vendedor1) {
		int id = (Integer.valueOf(JOptionPane.showInputDialog("Digite o ID do vendedor")));
		String nome = (JOptionPane.showInputDialog("Digite o nome do vendedor"));
		String email = (JOptionPane.showInputDialog("Digite o email do vendedor"));
		String cpf = (JOptionPane.showInputDialog("Digite o cpf do vendedor"));
		String telefone = (JOptionPane.showInputDialog("Digite o telefone do vendedor"));
		estoque.cadastrarVendedor(id, nome, email, cpf, telefone);
		JOptionPane.showMessageDialog(null, "Vendedor cadastrado com sucesso");
	}
	
	private static void consultarVendedor() {
		String nome = JOptionPane.showInputDialog("Digite o nome do vendedor");
		Vendedor vendedor = estoque.consultarVendedor(nome);
		if (vendedor != null) {
			JOptionPane.showMessageDialog(null, vendedor.toString());
		}
		else {
			JOptionPane.showMessageDialog(null, "Vendedor não encontrado");
			
		}
	}

	private static void menuVenda() {
		int opcao;
		do {opcao = Integer.parseInt(JOptionPane.showInputDialog("=== Venda ===\n" +
				"1. Registrar venda\n" +
				"2. Consultar historico de venda\n" +
				"3. Gerar relatorio venda \n" +
				"0. Sair\n" +
				"Escolha uma opção:"));
		switch (opcao) {
		case 1:
			cadastrarVenda(null);
			break;
		case 2:
			consultarHistorico();
			break;
		case 3:
			gerarRelatorio();
			break;
		case 0:
			JOptionPane.showMessageDialog(null, "Saindo");
			break;

		default:
			JOptionPane.showMessageDialog(null, "Opção invalida");
		}

		} while (opcao != 0);


	}


	private static void gerarRelatorio() {
		for(Venda venda : estoque.gerarRelatorio()) {
			JOptionPane.showMessageDialog(null, venda.toString());
		}
	}

	private static void consultarHistorico() {
		String nome = JOptionPane.showInputDialog("Digite o nome da venda que deseja consultar");
		Venda venda = estoque.consultarHistorico(nome);
		if (venda != null) {
			JOptionPane.showMessageDialog(null, venda.toString());
			
		} else {
			JOptionPane.showMessageDialog(null, "Produto não encontrado no estoque");

		}
	}

	private static void cadastrarVenda(Venda venda1){
		int id = (Integer.valueOf(JOptionPane.showInputDialog("Digite o ID da venda")));
		int quantidade = (Integer.valueOf(JOptionPane.showInputDialog("Digite a quantidade da venda")));
		double preco = (Double.parseDouble(JOptionPane.showInputDialog("Digite o preço da venda")));
		String data = (JOptionPane.showInputDialog("Digite a data da venda"));
		
		String stringProdutos = getStringProdutos();
		
		Integer idProduto = Integer.valueOf(JOptionPane.showInputDialog("Escolha o codigo do seu produto que será associado a venda \n" +
				stringProdutos));
		
		Produto produto = getProdutoById(idProduto);
		
		estoque.cadastrarVenda(data, quantidade, preco, data, produto);
		JOptionPane.showMessageDialog(null, "Venda cadastrada com sucesso");
		
	}

	private static Produto getProdutoById(Integer idProduto) {
		List<Produto> produtos = estoque.getProdutos();
		for (Produto produto : produtos) {
			if (produto.getIdProduto() == idProduto)
				return produto;
		}
		
		return null;
	}

	private static String getStringProdutos() {
		List<Produto> produtos = estoque.getProdutos();
		String stringProdutos = "";
		for (Produto produto : produtos) {
			stringProdutos += produto.toString() + "\n";
		}
		
		return stringProdutos;
	}

	public static void menuProduto () {
		int opcao;
		do {opcao = Integer.parseInt(JOptionPane.showInputDialog("=== Produto ===\n" +
				"1. Cadastrar produto\n" +
				"2. Atualizar produto\n" +
				"3. Consultar produto\n" +
				"4. Remover produto  \n" +
				"5. listar produtos  \n" +
				"0. Sair\n" +
				"Escolha uma opção:"));
		switch (opcao) {
		case 1:
			cadastrarProduto(null);
			break;
		case 2:
			atualizarProduto();
			break;
		case 3:
			ConsultarProduto();
			break;
		case 4:
			removerProduto();
			break;
		case 5:
			listarProdutos();
			break;
		case 0:
			JOptionPane.showMessageDialog(null, "Saindo");
			break;

		default:
			JOptionPane.showMessageDialog(null, "Opção invalida");
		}

		} while (opcao != 0);

	}


	private static void ConsultarProduto() {
		String nome = JOptionPane.showInputDialog("Digite o nome do produto que deseja consultar");
		Produto produto = estoque.consultarProduto(nome);
		if (produto != null) {
			JOptionPane.showMessageDialog(null, produto.toString());
			
		} else {
			JOptionPane.showMessageDialog(null, "Produto não encontrado no estoque");

		}
	}
	private static void atualizarProduto() {
	String nome = JOptionPane.showInputDialog("Digite o nome do produto que deseja atualizar");
	Produto produto = estoque.consultarProduto(nome);
		if (produto != null) {
			int novoId = (Integer.valueOf(JOptionPane.showInputDialog("digite o novo id do produto")));
			String novoNome = (JOptionPane.showInputDialog("Digite o novo nome do produto"));
			String novaDescricao =(JOptionPane.showInputDialog("Digite a nova descrição do produto"));
			int novaQuantidade =(Integer.valueOf(JOptionPane.showInputDialog("Digite a nova quantidade do produto")));
			double novoPreco = (Double.parseDouble(JOptionPane.showInputDialog("Digite o novo preço do produto")));
			estoque.atualizarProduto(novoId, novoNome, novaDescricao, novaQuantidade, novoPreco);
			JOptionPane.showMessageDialog(null, "Produto atualizado com sucesso");
		} else {
			JOptionPane.showMessageDialog(null, "Produto não encontrado no estoque");
		}

	}

	private static void cadastrarProduto(Produto produto1) {
		
		int id = (Integer.valueOf(JOptionPane.showInputDialog("Digite o ID do produto")));
		String nome = (JOptionPane.showInputDialog("Digite o nome do produto"));
		String descricao = (JOptionPane.showInputDialog("Digite a descrição do produto"));
		int quantidade = (Integer.valueOf(JOptionPane.showInputDialog("Digite a quantidade do produto")));
		double preco = (Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto")));
		
		estoque.cadastrarProduto(id, nome, descricao, quantidade, preco);
		JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso");
				
	
	}
	private static void removerProduto() {
		String nome = JOptionPane.showInputDialog("Digite o nome do produto que deseja remover");
		if (estoque.consultarProduto(nome) != null) {
			estoque.removerProduto(nome);
			JOptionPane.showMessageDialog(null, "Produto removido com sucesso");
			
		} else {
			JOptionPane.showMessageDialog(null, "Produto não encontrado no estoque");

		}
		
	}
	private static void listarProdutos() {
		for (Produto produto : estoque.listarProdutos()) {
		JOptionPane.showMessageDialog(null, produto.toString());
		}
	}

}
