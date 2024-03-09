package logic;

import java.time.LocalDate;

/**
 * La clase abstracta Account representa una cuenta bancaria genérica.
 */
public abstract class Account {

    /**
     * Número de cuenta bancaria.
     */
    protected String numberAccount;

    /**
     * Saldo actual de la cuenta bancaria.
     */
    protected double residue;

    /**
     * Fecha de apertura de la cuenta bancaria.
     */
    protected LocalDate dateOpen;

    /**
     * Constructor para la creación de una cuenta bancaria.
     *
     * @param numberAccount Número de cuenta bancaria.
     * @param residue       Saldo inicial de la cuenta bancaria.
     * @param dateOpen      Fecha de apertura de la cuenta bancaria.
     */
    public Account(String numberAccount, double residue, LocalDate dateOpen) {
        this.numberAccount = numberAccount;
        this.residue = residue;
        this.dateOpen = dateOpen;
    }

    /**
     * Establece el número de cuenta bancaria.
     *
     * @param numberAccount Nuevo número de cuenta bancaria.
     */
    public void setNumberAccount(String numberAccount) {
        this.numberAccount = numberAccount;
    }

    /**
     * Establece la fecha de apertura de la cuenta bancaria.
     *
     * @param dateOpen Nueva fecha de apertura de la cuenta bancaria.
     */
    public void setDateOpen(LocalDate dateOpen) {
        this.dateOpen = dateOpen;
    }

    /**
     * Obtiene el número de cuenta bancaria.
     *
     * @return Número de cuenta bancaria.
     */
    public String getNumberAccount() {
        return numberAccount;
    }

    /**
     * Obtiene la fecha de apertura de la cuenta bancaria.
     *
     * @return Fecha de apertura de la cuenta bancaria.
     */
    public LocalDate getDateOpen() {
        return dateOpen;
    }

    /**
     * Obtiene el saldo actual de la cuenta bancaria.
     *
     * @return Saldo actual de la cuenta bancaria.
     */
    public double getResidue() {
        return residue;
    }
}
