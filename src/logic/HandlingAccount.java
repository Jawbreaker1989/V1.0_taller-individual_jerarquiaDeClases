package logic;

import java.util.ArrayList;

/**
 * La clase HandlingAccount gestiona un conjunto de cuentas bancarias.
 */
public class HandlingAccount {

    /**
     * Lista para almacenar las cuentas bancarias.
     */
    private ArrayList<Account> accounts;

    /**
     * Constructor que inicializa la lista de cuentas bancarias.
     */
    public HandlingAccount() {
        accounts = new ArrayList<>();
    }

    /**
     * Permite buscar una cuenta por número.
     *
     * @param numberAccount Número de cuenta a buscar.
     * @return La instancia de la cuenta encontrada o null si no se encuentra ninguna cuenta con ese número.
     */
    public Account findAccount(String numberAccount) {
        // Lógica de búsqueda de cuenta
        return null;
    }

    /**
     * Permite agregar una nueva cuenta al arreglo de cuentas.
     *
     * @param account La cuenta bancaria a agregar.
     * @throws IllegalArgumentException Si el número de cuenta ya ha sido registrado.
     */
    public void saveAccount(Account account) {
        // Lógica para agregar una cuenta a la lista
    }

    /**
     * Permite borrar una cuenta del arreglo de cuentas.
     *
     * @param account La cuenta bancaria a borrar.
     * @throws IllegalArgumentException Si la cuenta no existe.
     */
    public void deleteAccount(Account account) {
        // Lógica para eliminar una cuenta de la lista
    }

    /**
     * Permite consignar a una cuenta, actualizando el saldo.
     *
     * @param account La cuenta bancaria en la que se realizará el depósito.
     * @param amount  La cantidad a depositar.
     * @return El nuevo saldo de la cuenta después del depósito.
     * @throws IllegalArgumentException Si la cuenta no existe.
     */
    public double deposit(Account account, double amount) {
        // Lógica para realizar un depósito
        return -1;
    }

    /**
     * Permite retirar de una cuenta, actualizando el saldo.
     *
     * @param account La cuenta bancaria de la que se realizará el retiro.
     * @param amount  La cantidad a retirar.
     * @return El nuevo saldo de la cuenta después del retiro.
     * @throws IllegalArgumentException Si la cuenta no existe.
     * @throws InsufficientFundsException Si la cuenta es de ahorros y no hay suficiente saldo.
     */
    public double willdraw(Account account, double amount) throws InsufficientFundsException {
        // Lógica para realizar un retiro
        return -1;
    }

    /**
     * Permite transferir fondos entre dos cuentas bancarias.
     *
     * @param sourceAccount      La cuenta de origen.
     * @param destinationAccount La cuenta de destino.
     * @param amount             La cantidad a transferir.
     * @return true si la transferencia fue exitosa, false si no.
     * @throws IllegalArgumentException Si las cuentas de origen y destino no existen.
     * @throws InsufficientFundsException Si la cuenta de origen es de ahorros y no hay suficiente saldo.
     */
    public boolean transfer(Account sourceAccount, Account destinationAccount, double amount)
            throws InsufficientFundsException {
        // Lógica para realizar una transferencia
        return false;
    }

    /**
     * Calcula y abona los intereses a una cuenta de ahorros.
     *
     * @param account La cuenta de ahorros a la que se aplicará la tasa de interés.
     * @return El nuevo saldo de la cuenta después de aplicar la tasa de interés.
     * @throws IllegalArgumentException Si la cuenta no existe o no es de ahorros.
     */
    public double payRate(Account account) {
        // Lógica para calcular y aplicar la tasa de interés
        return -1;
    }

    /**
     * Retorna un clon de la colección de cuentas.
     *
     * @return Una copia de la lista de cuentas bancarias.
     */
    public ArrayList<Account> getAccounts() {
        return new ArrayList<>(accounts);
    }
}
