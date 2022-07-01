/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

/**
 *
 * @author Victor Medina
 */
public class MusicoEstudiante implements Musico, Estudiante{

    @Override
    public void tocar() {
        System.out.println("Estoy tocando la guitarra");
    }

    @Override
    public void hablar() {
        System.out.println("Estoy hablando ahora mismo");
    }

    @Override
    public void estudiar() {
        System.out.println("Estoy estudiando programacion");
    }
    
}
