package aula04.as4b.ex1.Empregado;

import aula04.as4b.ex1.cliente.Endereco;

public class TestaEmpregado {

    public static void main(String[] args) {
        Endereco e = new Endereco("T-63", 8, "enfrente a praça", "75000-000", "Centro", "Goiania", "Goias");
        Empresa emp = new Empresa("999999999", "Nestle", e);
        Empregado a = new Empregado("joão", "999999", emp);

        System.out.println(a.toString());
    }
}
