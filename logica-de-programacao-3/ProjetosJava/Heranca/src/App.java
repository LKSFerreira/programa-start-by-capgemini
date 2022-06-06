import java.util.Date;

/**
 * App
 */
public class App {

    public static void main(String[] args) {
        
        Vendedor vendedorObj = new Vendedor();
        //Motorista motoristaObj = new Motorista();

        vendedorObj.setNome("Lucas");
        vendedorObj.setCpf("39005517824");
        vendedorObj.setDataNascimento(new Date());
        vendedorObj.setSalario(1000.0f);
        vendedorObj.setComissaoPorItens(10f);
        vendedorObj.setTotalItensVendido(10);

        

        System.out.println("O salário do vendedor é : " + vendedorObj.calcularSalario());
        

        //vendedorObj.getNome(leitor.nextFloat());

    }
}
