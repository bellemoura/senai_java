
package com.classeapp.projetoanimal;

/**
 *
 * @author Isabelle Moura da Silva
 */
public class Animal {
    String nome;
    int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    public void exibirInformações() {
        System.out.println("Nome: " +nome+ ". Idade: " +idade);
    }
    
    public void fazerSom() {
        System.out.println("O animal está fazendo um som!");
    }
}
