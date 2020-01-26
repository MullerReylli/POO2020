
package aula04.as4b.ex1.Empregado;

import aula04.as4b.ex1.cliente.Endereco;

public class Empresa {
    private String CNPJ;
    private String razaoSocial;
    private Endereco endereco;

    public Empresa(String CNPJ, String razaoSocial, Endereco endereco) {
        this.CNPJ = CNPJ;
        this.razaoSocial = razaoSocial;
        this.endereco = endereco;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("\nCNPJ da Empresa: " + getCNPJ());
        sb.append("\nRazão social da Empresa: " + getRazaoSocial());
        sb.append("\nEndereço da Empresa: " + getEndereco().toString());
        
        return sb.toString();
    }
}
