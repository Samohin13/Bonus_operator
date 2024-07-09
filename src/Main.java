public class Main {
    public static void main(String[] args) {

        int initialBalance = 100;            // Начальный баланс
        int topUpAmount = 1001;              // Сумма пополнения

        int bonus = topUpAmount / initialBalance;

        int finalBalance = initialBalance + topUpAmount + bonus;
        int balance = initialBalance + topUpAmount;

        if (topUpAmount >= 1000) {
            System.out.println("Итоговая сумма на счету:" + finalBalance + " рублей ");
        } else {
            System.out.println("Итоговая сумма на счету:"+ balance +" рублей ");
        }
    }

}
