package logic;

import java.time.LocalDate;

/**
 * La clase CurrentAccount representa una cuenta corriente que hereda de la clase base Account
 * e implementa la interfaz ActionsAccount.
 */
public class CurrentAccount extends Account implements ActionsAccount {

    /**
     * Atributo adicional que indica si la cuenta corriente es exenta o no.
     */
    private boolean excent;

    /**
     * Constructor para la creación de una cuenta corriente.
     *
     * @param numberAccount Número de la cuenta corriente.
     * @param residue       Saldo inicial de la cuenta corriente.
     * @param dateOpen      Fecha de apertura de la cuenta corriente.
     * @param excent        Indica si la cuenta corriente es exenta o no.
     */
    public CurrentAccount(String numberAccount, double residue, LocalDate dateOpen, boolean excent) {
        super(numberAccount, residue, dateOpen);
        this.excent = excent;
    }

    /**
     * Establece si la cuenta corriente es exenta o no.
     *
     * @param excent true si la cuenta es exenta, false si no lo es.
     */
    public void setExcent(boolean excent) {
        this.excent = excent;
    }

    /**
     * Verifica si la cuenta corriente es exenta o no.
     *
     * @return true si la cuenta es exenta, false si no lo es.
     */
    public boolean isExcent() {
        return excent;
    }

    /**
     * Realiza un depósito en la cuenta corriente, actualizando el saldo según la lógica específica
     * para este tipo de cuenta.
     *
     * @param amount La cantidad a depositar en la cuenta corriente.
     */
    @Override
    public void deposit(int amount) {
        // Lógica del depósito para una cuenta corriente
    }

    /**
     * Realiza un retiro de la cuenta corriente, aplicando la lógica específica para este tipo de cuenta.
     * - Si la cuenta corriente es exenta, no se aplica retención 4 x 1000.
     * - Si la cuenta corriente no es exenta, se aplica retención 4 x 1000 al saldo de la cuenta.
     * - No hay límite de retiros, permitiendo saldos negativos (sobregiros).
     *
     * @param amount La cantidad a retirar de la cuenta corriente.
     */
    @Override
    public void willDraw(double amount) {
        // Lógica del retiro para una cuenta corriente
    }

    /**
     * Realiza una transferencia desde la cuenta corriente actual a otra cuenta, aplicando la lógica específica
     * para este tipo de cuenta. Se asegura de que la cuenta de destino exista y, si es una cuenta de ahorros,
     * tenga saldo suficiente.
     *
     * @param destinationAccount La cuenta de destino.
     * @param amount             La cantidad a transferir desde la cuenta corriente.
     */
    @Override
    public void transfer(Account destinationAccount, double amount) {
        // Lógica de transferencia para una cuenta corriente
    }
}
