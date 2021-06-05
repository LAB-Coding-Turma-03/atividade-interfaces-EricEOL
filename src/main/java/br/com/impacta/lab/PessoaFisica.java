package br.com.impacta.lab;

public class PessoaFisica implements Pessoa{
  
  private String documento;
  private String tipo;
  
  public PessoaFisica(String documento, String tipo) {
    setDocumento(documento);
    setTipo(tipo);
  }

  public String getDocumento() {
    return this.documento;
  }

  public void setDocumento(String documento) {
    this.documento = documento;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  @Override
  public String falarDocumento() {
    return documento;
  }
}
