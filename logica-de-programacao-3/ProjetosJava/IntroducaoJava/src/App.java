import java.util.Scanner;

/**
 * @author Lucas Ferreira
 */
public class App {

    public static void main(String[] args) {

        try (Scanner leitor = new Scanner(System.in)) {

            
            Pessoa objetoPessoa = new Pessoa(80f, 1.75f);

            System.out.println("Digite o peso");
            objetoPessoa.setPeso(leitor.nextFloat());

            System.out.println("Digite a altura");
            objetoPessoa.setAltura(leitor.nextFloat());
            

            //System.out.println("Digite o peso");
            //objetoPessoa.setPeso(leitor.nextFloat());

            //System.out.println("Digite a altura");
            //objetoPessoa.setAltura(leitor.nextFloat());

            System.out.println("IMC : " + objetoPessoa.calcularIMC());

        }
    }
}