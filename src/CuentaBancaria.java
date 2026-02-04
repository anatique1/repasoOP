public class CuentaBancaria {
    private final String id;
    private int saldo;

    public CuentaBancaria(String id, int saldoInicial){
        this.id = id;
        this.saldo = saldoInicial;
    }

    public String getId() {
        return id;
    }

    public int getSaldo() {
        return saldo;
    }

    public void consignar(int valorAConsignar) {
        if (valorAConsignar <= 0) {
            throw new IllegalArgumentException("El valor a consignar no es valido");
        }

        this.saldo += valorAConsignar;
    }
    public void retirar(int valorARetirar) {
        if (valorARetirar <= 0) {
            throw new IllegalArgumentException("El valor a Retirar no es valido");
        }
        if (valorARetirar > saldo) {
            throw new IllegalArgumentException("no se puede Retirar de más");
        }

        this.saldo -= valorARetirar;
    }
}
