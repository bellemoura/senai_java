
/**
 *
 * @author Isabelle Moura da Silva
 */
public class Funcionario {
    String nome;
    double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + ", Salário: " + salario);
    }
}
