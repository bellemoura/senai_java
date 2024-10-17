
/**
 *
 * @author Isabelle Moura da Silva
 */
public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corola", 2021, 4);
        System.out.println("Informações do Carro: ");
        carro.exibirInformacoes();
        System.out.println("|--------------------------------------------------------------|");
        
        Moto moto = new Moto("Honda", "CB-500", 2020, 500);
        System.out.println("Informações da Moto: ");
        moto.exibirInformacoes();
        System.out.println("|--------------------------------------------------------------|");
        
        Caminhao caminhao = new Caminhao("Volvo", "FH16", 2019, 30.0);
        System.out.println("Informações do Caminhão: ");
        caminhao.exibirInformacoes();
        System.out.println("|--------------------------------------------------------------|");
        
    }
}
