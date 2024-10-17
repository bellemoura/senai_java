
package com.classeapp.projetoanimal;

/**
 *
 * @author Isabelle Moura da Silva
 */
public class Passaro extends Animal { //extends: herança
    public Passaro(String nome, int idade) {
        super(nome, idade);
    }
    
    @Override
    public void fazerSom() {
        System.out.println("O pássaro está piando! Piu Piu!!");
    }
}
