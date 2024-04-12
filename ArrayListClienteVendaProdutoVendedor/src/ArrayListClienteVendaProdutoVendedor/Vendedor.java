package ArrayListClienteVendaProdutoVendedor;

public class Vendedor {
	private int idVendedor;
	private String nomeVendedor;
	private String emailVendedor;
	private String cpfVendedor;
	private String telefoneVendedor;
	
	public Vendedor() {
		
	}
	public Vendedor(int id, String nome, String email, String cpf, String telefone) {
		this.idVendedor = id;
		this.nomeVendedor = nome;
		this.emailVendedor = email;
		this.cpfVendedor = cpf;
		this.telefoneVendedor = telefone;
	}
	
	@Override
	public String toString() {
		return "Vendedor [idVendedor=" + idVendedor + ", nomeVendedor=" + nomeVendedor + ", emailVendedor="
				+ emailVendedor + ", cpfVendedor=" + cpfVendedor + ", telefoneVendedor=" + telefoneVendedor + "]";
	}
	public int getIdVendedor() {
		return idVendedor;
	}
	public void setIdVendedor(int id) {
		this.idVendedor = id;
	}
	public String getNomeVendedor() {
		return nomeVendedor;
	}
	public void setNomeVendedor(String nome) {
		this.nomeVendedor = nome;
	}
	public String getEmailVendedor() {
		return emailVendedor;
	}
	public void setEmailVendedor(String email) {
		this.emailVendedor = email;
	}
	public String getCpfVendedor() {
		return cpfVendedor;
	}
	public void setCpfVendedor(String cpf) {
		this.cpfVendedor = cpf;
	}
	public String getTelefoneVendedor() {
		return telefoneVendedor;
	}
	public void setTelefoneVendedor(String telefone) {
		this.telefoneVendedor = telefone;
	}
	
}
