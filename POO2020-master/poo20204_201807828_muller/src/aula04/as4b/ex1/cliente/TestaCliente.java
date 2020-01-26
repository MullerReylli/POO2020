
package aula04.as4b.ex1.cliente;

public class TestaCliente {
    public static void main(String[] args) {
        Endereco e = new Endereco("T-63", 8, "enfrente a praça", "75000-000", "Centro", "Goiania", "Goias");
        
        Cliente c1 = new Cliente("João da Silva", "999.999.999-99", e);
        Cliente c2 = new Cliente("Maria da Silva", "999.999.999-99", e);
        
        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}
