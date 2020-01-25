package aula05;

public class ContaBanco {

    // Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    // Metodos Personalizados
    public void estadoAtual(){
        System.out.println("=============================");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Correntista: " + this.getDono());
        System.out.println("Tipo de conta: " + this.getTipo());
        System.out.println("Saldo atual: " + this.getSaldo());
        System.out.println("Estado atual desta conta: " + this.getStatus());
        System.out.println("=============================");
    }

    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if ("CC".equals(t)) {
            this.setSaldo(50);
        } else if ("CP".equals(t)) {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!!");
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("A conta não pode ser encerrada. Ainda há saldo !!");
        } else if (this.getSaldo() < 0) {
            System.out.println("Não é possível encerar pois a conta está negativa !!");
        } else {
            this.setStatus(false);
            System.out.println("Conta encerrada com sucesso !!");
        }
    }

    public void depositar(float v) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito de R$ " + v + " concluido na conta de " + this.getDono() + " !!");
        } else {
            System.out.println("Impossível deposito em conta encerrada !!");
        }
    }

    public void sacar(float v) {
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque de R$ " + v + " realizado na conta de " + getDono() + " !!");
            } else {
                System.out.println("Saldo insuficiente !!");
            }
        } else {
            System.out.println("Impossível saque em conta encerrada !!");
        }
    }

    public void pagarMensal() {
        int v = 0;
        if (this.getTipo() == "CC") {
            v = 12;
        } else if (this.getTipo() == "CP") {
            v = 20;
        }
        if (this.getStatus()){
            this.setSaldo(getSaldo() - v);
            System.out.println("Mensalidade debitada com sucesso por " + getDono() + " !!");
        } else {
            System.out.println("Saldo insuficiente para debitar o valor da mensalidade !!");
        }
    }

    // Metodos Especiais
    // Criando o Metodo Construtor
    public void ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
