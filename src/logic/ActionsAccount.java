package logic;

/**
 * La interfaz ActionsAccount define operaciones que pueden realizarse en una cuenta bancaria.
 */
public interface ActionsAccount {

    /**
     * Realiza una consignación en la cuenta, actualizando el saldo. Este método se implementa de manera
     * uniforme para todas las cuentas en la clase abstracta correspondiente.
     *
     * @param amount La cantidad a consignar en la cuenta.
     */
    void deposit(int amount);

    /**
     * Realiza un retiro de la cuenta, aplicando reglas específicas para cuentas corrientes y de ahorros.
     * - En una cuenta corriente exenta, no se aplica retención 4 x 1000.
     * - En una cuenta corriente no exenta, se aplica retención 4 x 1000 al saldo de la cuenta.
     * - Las cuentas corrientes no tienen límite de retiros, permitiendo saldos negativos (sobregiros).
     * - En una cuenta de ahorros, el retiro no puede dejar el saldo por debajo del mínimo permitido.
     *
     * @param amount La cantidad a retirar de la cuenta.
     */
    void willDraw(double amount);

    /**
     * Transfiere fondos desde la cuenta actual (this) a una cuenta de destino.
     * - La cuenta de destino debe existir.
     * - Para cuentas de ahorros, debe tener saldo suficiente para aceptar la transferencia.
     * - Se aplican precondiciones que permiten realizar la transacción sin problema.
     *
     * @param destinationAccount La cuenta de destino.
     * @param amount             La cantidad a transferir.
     */
    void transfer(Account destinationAccount, double amount);
}
