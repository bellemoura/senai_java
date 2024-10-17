
package com.classeapp.projetoanimal;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedInputStream;
import java.io.FileReader;

/**
 *
 * @author Isabelle Moura da Silva
 */
public class Main {
    public static void main(String[] args) {//psvm *tab*
        Cachorro cachorro = new Cachorro("Snoopy", 18);
        System.out.println("Informações do cachorro: ");
        cachorro.exibirInformações();
        cachorro.fazerSom();
        System.out.println("|--------------------------------------------------------------------|");
        
        Gato gato = new Gato("Garfield", 3);
        System.out.println("Informações do gato: ");
        gato.exibirInformações();
        gato.fazerSom();
        System.out.println("|--------------------------------------------------------------------|");

        Passaro passaro = new Passaro("Pardal", 2);
        System.out.println("Informações do pássaro: ");
        passaro.exibirInformações();
        passaro.fazerSom();
        System.out.println("|--------------------------------------------------------------------|");

  
    
    try  {
        
    FileWriter arquivo = new FileWriter ("informacoesDS1B.txt", true);
    PrintWriter gravarArquivo = new PrintWriter(arquivo);
    
    String iCachorro      = ("|  Nome: Snoopy. Idade: 18                  |");
    String sCachorro     = ("|  O cachorro está latindo. Au au!        |");
    gravarArquivo.println("|-----------------------------------------------------|");
    gravarArquivo.println("|    Informações do cachorro:                |");
    gravarArquivo.println("|-----------------------------------------------------|");
    gravarArquivo.println(iCachorro);
    gravarArquivo.println(sCachorro);
    gravarArquivo.println("|-----------------------------------------------------|");
    gravarArquivo.println();
    

    String iiCachorro       = ("|  Nome: Snoopy. Idade: 18                 |");
    String ssCachorro      = ("|  O cachorro está latindo. Au au!       |");
    gravarArquivo.println  ("|-----------------------------------------------------|");
    gravarArquivo.println  ("|    Informações do cachorro:                |");
    gravarArquivo.println  ("|-----------------------------------------------------|");
    gravarArquivo.println(iiCachorro);
    gravarArquivo.println(ssCachorro);
    gravarArquivo.println  ("|-----------------------------------------------------|");
    gravarArquivo.println();

    gravarArquivo.close();
    
            System.out.println("Gravado com sucesso no arquivo!");
    } catch (IOException e) {
            System.out.println("Ocorreu um erro ao gravar o arquivo!");
            e.printStackTrace();
    }
    }
}
