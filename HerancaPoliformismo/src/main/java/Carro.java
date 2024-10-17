
/**
 *
 * @author Isabelle Moura da Silva
 */
public class Carro extends Veiculo {
    int portas;

    public Carro(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
        this.portas = portas;
    }
    
    @Override
    
        public void exibirInformacoes() { //função para saída de infos
        System.out.println("Marca: " + marca + ". Modelo: " + modelo + ". Ano: " + ano + ". Quantidade de Portas: " + portas);
    }
    
    
}
