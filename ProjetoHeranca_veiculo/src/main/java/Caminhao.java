
/**
 *
 * @author Isabelle Moura da Silva
 */
public class Caminhao extends Veiculo{
    int carga_max;

    public Caminhao(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
        this.carga_max = carga_max;
        
        
    }
    
@Override

    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Carga Máxima: " + carga_max);
    }    
}
