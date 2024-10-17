
package com.classeapp.projetoanimal;

/**
 *
 * @author Isabelle Moura da Silva
 */
public class Cachorro extends Animal {
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }
    
    @Override
    public void fazerSom() {
        System.out.println("O cachorro está latindo! Au Au!!");
    }
}
