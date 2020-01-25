/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeobj5;

/**
 *
 * @author henrique
 */
public class ClasseB extends ClasseA {
    
    public ClasseB(int a) {
        super(a);
    }
    @Override
    public void metodo() {
        this.setA(this.getA() + 1);
    }
}
