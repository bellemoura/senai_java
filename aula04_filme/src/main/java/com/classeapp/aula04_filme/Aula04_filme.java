package com.classeapp.aula04_filme;

public class Aula04_filme {
    public static void main (String[] args){
        Filme filmeObjeto = new Filme();
        
        filmeObjeto.assistir();
        filmeObjeto.finalizar();
        
        filmeObjeto.setTitulo("Enrolados");
        System.out.println("Título: "+filmeObjeto.getTitulo());
        
        filmeObjeto.setGenero("Aventura");
        System.out.println("Gênero: "+filmeObjeto.getGenero());
        
        filmeObjeto.setEstreia(2010);
        System.out.println("Estréia: "+filmeObjeto.getEstreia());
        
        filmeObjeto.setDuracao(100);
        System.out.println("Duração: "+filmeObjeto.getDuracao()+ "minutos");
        
        
    }
}
