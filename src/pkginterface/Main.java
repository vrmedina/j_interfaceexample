/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;
//Forma de simular herencia multiple
//Los metodos de una interface son abstractos, y sus atributos son final
/**
 *
 * @author Victor Medina
 */
public class Main {
    public static void main(String[] args) {
        MusicoEstudiante musicstud = new MusicoEstudiante();
        
        musicstud.hablar();
        musicstud.tocar();
        musicstud.estudiar(); 
    }
}
