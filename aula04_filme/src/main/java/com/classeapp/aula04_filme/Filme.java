package com.classeapp.aula04_filme;

public class Filme {
    private String titulo, genero;
    private float estreia, duracao;
    
//setter
public void setTitulo(String titulo){
this.titulo = titulo;
}
public void setGenero(String genero){
this.genero = genero;
}
public void setEstreia(float estreia){
this.estreia = estreia;
}
public void setDuracao(float duracao){
this.duracao = duracao;
}

//getter
public String getTitulo(){
return titulo;
}
public String getGenero(){
return genero;
}
public float getEstreia(){
return estreia;
}
public float getDuracao(){
return duracao;
}

//métodos
public void assistir(){
    System.out.println("Assistindo...");
}
public void finalizar(){
    System.out.println("Finalizado :)");
}


/*public Filme (String titulo, String genero, float estreia, float duracao){
    this.titulo = titulo;
    this.genero = genero;
    this.estreia = estreia;
    this.duracao = duracao;
}*/

}

