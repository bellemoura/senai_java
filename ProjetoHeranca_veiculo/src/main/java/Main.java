
/**
 *
 * @author Isabelle Moura da Silva
 */
public class Main {
    
        public static void main (String[] args) {
        Caminhao caminhao = new Caminhao ("Volvo", " FH16", 2020);
        caminhao.exibirInformacoes();
        
        Carro carro = new Carro ("Toyota", "Corola", 2021);
        carro.exibirInformacoes();
        
        Moto moto = new Moto ("Honda", "CB-500", 2019);
        moto.exibirInformacoes();
    }
}
