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
public class ClasseA {
        private int a;
    public ClasseA(int a) {
        this.a = a;
    }
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public void metodo() {
        this.setA(this.getA() + 3);
    }
    @Override
    public String toString() {
        return "ClasseA{" + "a=" + a + '}';
    }
}
