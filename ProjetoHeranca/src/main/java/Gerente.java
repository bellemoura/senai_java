/**
 *
 * @author Isabelle Moura da Silva
 */
public class Gerente extends Funcionario {
    int numeroFuncionariosGerenciados;
    
    public Gerente(String nome, double salario) {
        super(nome, salario);
        this.numeroFuncionariosGerenciados = numeroFuncionariosGerenciados;
    }
    
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Funcionários Gerenciados: " + numeroFuncionariosGerenciados);
    }
    
}
