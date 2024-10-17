
/**
 *
 * @author Isabelle Moura da Silva
 */
public class Carro extends Veiculo{
    int portas;

    public Carro(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
        this.portas = portas;
        
        
    }
    
@Override

    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Quantidade de portas: " + portas);
    }    
}

