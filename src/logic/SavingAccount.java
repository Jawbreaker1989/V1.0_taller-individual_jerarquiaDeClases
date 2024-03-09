package logic;

import java.time.LocalDate;

/**
 * La clase SavingAccount representa una cuenta de ahorros que hereda de la clase base Account
 * e implementa la interfaz ActionsAccount.
 */
public class SavingAccount extends Account implements ActionsAccount {

    /**
     * Tasa de interés asociada a la cuenta de ahorros.
     */
    private double interestRate;

    /**
     * Saldo mínimo permitido en la cuenta de ahorros.
     */
    public static final double RESIDUE_MIN = 100000;

    /**
     * Constructor para la creación de una cuenta de ahorros.
     *
     * @param numberAccount Número de cuenta de ahorros.
     * @param residue       Saldo inicial de la cuenta de ahorros.
     * @param dateOpen      Fecha de apertura de la cuenta de ahorros.
     * @param interestRate  Tasa de interés asociada a la cuenta de ahorros.
     */
    public SavingAccount(String numberAccount, double residue, LocalDate dateOpen, double interestRate) {
        super(numberAccount, residue, dateOpen);
        this.interestRate = interestRate;
    }

    /**
     * Establece la tasa de interés asociada a la cuenta de ahorros.
     *
     * @param interestRate Nueva tasa de interés de la cuenta de ahorros.
     */
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    /**
     * Obtiene la tasa de interés asociada a la cuenta de ahorros.
     *
     * @return Tasa de interés de la cuenta de ahorros.
     */
    public double getInterestRate() {
        return interestRate;
    }

    /**
     * Calcula y aplica la tasa de interés a la cuenta de ahorros.
     * Este método se encarga de realizar el cálculo y actualizar el saldo de acuerdo con la tasa de interés.
     */
    public void payRate() {
        // Lógica de cálculo y aplicación de la tasa de interés para una cuenta de ahorro
    }

    /**
     * Realiza un depósito en la cuenta de ahorros, actualizando el saldo según la lógica específica
     * para este tipo de cuenta.
     *
     * @param amount La cantidad a depositar en la cuenta de ahorros.
     */
    @Override
    public void deposit(int amount) {
        // Lógica del depósito para una cuenta de ahorro
    }

    /**
     * Realiza un retiro de la cuenta de ahorros, aplicando la lógica específica para este tipo de cuenta.
     * - El retiro no puede dejar el saldo por debajo del mínimo permitido.
     *
     * @param amount La cantidad a retirar de la cuenta de ahorros.
     */
    @Override
    public void willDraw(double amount) {
        // Lógica del retiro para una cuenta de ahorro
    }

    /**
     * Realiza una transferencia desde la cuenta de ahorros actual a otra cuenta, aplicando la lógica específica
     * para este tipo de cuenta. Se asegura de que la cuenta de destino exista y, si es una cuenta de ahorros,
     * tenga saldo suficiente.
     *
     * @param destinationAccount La cuenta de destino.
     * @param amount             La cantidad a transferir desde la cuenta de ahorros.
     */
    @Override
    public void transfer(Account destinationAccount, double amount) {
        // Lógica de transferencia para una cuenta de ahorro
    }
}
