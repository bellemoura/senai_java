
/**
 *
 * @author Isabelle Moura da Silva
 */
public class Moto extends Veiculo{
    int velocidade_max;

    public Moto(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
        this.velocidade_max = velocidade_max;
        
        
    }
    
@Override

    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Velocidade Máxima: " + velocidade_max);
    }    
}
