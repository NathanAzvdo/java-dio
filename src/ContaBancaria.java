public class ContaBancaria {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private float saldo;

    public ContaBancaria(String agencia, int numero, String nomeCliente, float saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public String returnInfo(){
        return ("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+"," +
                " conta Nº"+numero+" e seu saldo é "+saldo+" já está disponível para saque");
    }
}
