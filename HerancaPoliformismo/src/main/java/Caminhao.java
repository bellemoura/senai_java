
/**
 *
 * @author Isabelle Moura da Silva
 */
public class Caminhao extends Veiculo{
    double capacidadeDeCarga;

    public Caminhao(String marca, String modelo, int ano, double capacidadeDeCarga) {
        super(marca, modelo, ano);
        this.capacidadeDeCarga = capacidadeDeCarga;
    }
    
    @Override
    
        public void exibirInformacoes() { //função para saída de infos
        System.out.println("Marca: " + marca + ". Modelo: " + modelo + ". Ano: " + ano + ". Capacidade de Carga: " + capacidadeDeCarga + "t.");
    }
}
