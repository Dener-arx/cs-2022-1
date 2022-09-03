package Tarefa008;

public class Endereco {
	
	private Integer numero;
	private String complemento;
	private Integer CEP;
	private Bairro bairro;
	private Logradouro logradouro;
	private TipoEndereco tipoEndereco;
	
	public Endereco( Integer numero, String complemento, Integer CEP, Bairro bairro, Logradouro logradouro, TipoEndereco tipoEndereco) {
		this.numero = numero;
		this.complemento = complemento;
		this.CEP = CEP;
		this.bairro = bairro;
		this.logradouro = logradouro;
		this.tipoEndereco = tipoEndereco;
	}
	
	public Endereco(){
	}


	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public Integer getCEP() {
		return CEP;
	}

	public void setCEP(Integer CEP) {
		this.CEP = CEP;
	}

	public Bairro getBairro() {
		return bairro;
	}

	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
	}

	public Logradouro getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(Logradouro logradouro) {
		this.logradouro = logradouro;
	}

	public TipoEndereco getTipoEndereco() {
		return tipoEndereco;
	}

	public void setTipoEndereco(TipoEndereco tipoEndereco) {
		this.tipoEndereco = tipoEndereco;
	}
}
