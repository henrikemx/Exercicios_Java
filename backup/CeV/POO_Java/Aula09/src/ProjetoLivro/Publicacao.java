package ProjetoLivro;

public interface Publicacao {
    // Metodos abstratos
    public abstract void abrir();
    public abstract void fechar();
    public abstract void folhear(int p);
    public abstract void avancarPag();
    public abstract void voltarPag();
}
