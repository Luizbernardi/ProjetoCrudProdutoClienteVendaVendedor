package ArrayListClienteVendaProdutoVendedor;

public class Cliente {
	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", cpfCliente=" + cpfCliente + ", nomeCliente=" + nomeCliente
				+ ", telefoneCliente=" + telefoneCliente + ", emailCliente=" + emailCliente + "]";
	}
	private int idCliente;
	private String cpfCliente;
	private String nomeCliente;
	private String telefoneCliente;
	private String emailCliente;
	
	public Cliente() {
		
	}
	public Cliente(int id, String cpf , String nome, String telefone, String email) {
		this.idCliente = id;
		this.cpfCliente = cpf;
		this.nomeCliente = nome;
		this.telefoneCliente = telefone;
		this.emailCliente = email;
		
	}
	
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int id) {
		this.idCliente = id;
	}
	public String getCpfCliente() {
		return cpfCliente;
	}
	public void setCpfCliente(String cpf) {
		this.cpfCliente = cpf;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nome) {
		this.nomeCliente = nome;
	}
	public String getTelefoneCliente() {
		return telefoneCliente;
	}
	public void setTelefoneCliente(String telefone) {
		this.telefoneCliente = telefone;
	}
	public String getEmailCliente() {
		return emailCliente;
	}
	public void setEmailCliente(String email) {
		this.emailCliente = email;
	}
	
}
