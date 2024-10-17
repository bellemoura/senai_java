
/**
 *
 * @author 24153584
 */
public class Veiculo { //declaração de variáveis relativas ao objeto
    String marca;
    String modelo;
    int ano;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    
    public void exibirInformacoes() { //função para saída de infos
        System.out.println("Marca: " + marca + ". Modelo: " + modelo + ". Ano: " + ano);
    }
}
