package aula06;

public class ControleRemoto implements Controlador {

    // Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    // Metodos Especiais
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = true;
        this.tocando = false;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    // Metodos Abstratos
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("======== Menu ========");
        System.out.println("Está ligado ? " + getLigado());
        System.out.println("Está tocando ? " + getTocando());
        System.out.print("Volume: " + getVolume() + " ");
        for (int i = 0; i <= getVolume(); i += 10) {
            System.out.print("|");
        }
        System.out.println("");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume() {
        if (getLigado()) {
            this.setVolume(this.getVolume() + 5);
        } else {
            System.out.println("Volume no máximo !!");
        }
    }

    @Override
    public void menosVolume() {
        if (getLigado()) {
            this.setVolume(getVolume() - 5);
        } else {
            System.out.println("Impossível reduzir volume !!");
        }
    }

    @Override
    public void ligarMundo() {
        if (this.getLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        } else {
            System.out.println("Não é possível tocar !!");
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()){
            this.setTocando(false);
        } else {
            System.out.println("Não foi possível pausar !!");
        }
    }

}
