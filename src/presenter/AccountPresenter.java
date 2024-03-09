package presenter;

import logic.Account;
import logic.HandlingAccount;
import logic.SavingAccount;
import java.util.ArrayList;

public class AccountPresenter {
    // Instancia de HandlingAccount para gestionar las cuentas
    private HandlingAccount handlingAccount;

    // Constructor
    public AccountPresenter() {
        handlingAccount = new HandlingAccount();
    }

    // Métodos sin implementación lógica
    public String[] findAccount(String numberAccount) {
        // Lógica para buscar una cuenta por número de cuenta y devolver sus detalles
        return null;
    }

    public boolean saveAccount(String numberAccount, double residue, String dateOpen, double interestRate) {
        // Lógica para crear y agregar una cuenta de ahorro
        return false;
    }

    public boolean saveAccount(String numberAccount, double residue, String dateOpen, boolean excent) {
        // Lógica para crear y agregar una cuenta corriente
        return false;
    }

    public Account deleteAccount(String numberAccount) {
        // Lógica para eliminar una cuenta
        return null;
    }

    public double deposit(String numberAccount, double amount) {
        // Lógica para realizar un depósito y devolver el nuevo saldo
        return -1;
    }

    public double willdraw(String numberAccount, double amount) {
        // Lógica para realizar un retiro y devolver el nuevo saldo
        return -1;
    }

    public boolean transfer(String sourceAccount, String destinationAccount, double amount) {
        // Lógica para realizar una transferencia y devolver true si es exitosa
        return false;
    }

    public double payRate(String numberAccount) {
        // Lógica para calcular y aplicar la tasa de interés y devolver el nuevo saldo
        return -1;
    }

    public double averageAccount() {
        // Lógica para calcular el saldo promedio de todas las cuentas
        return 0;
    }
}
