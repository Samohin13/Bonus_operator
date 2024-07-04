public class Main {
    public static void main(String[] args) {

        int initialBalance = 100;            // Начальный баланс
        int topUpAmount = 700;              // Сумма пополнения

        int bonus = topUpAmount / initialBalance;

        int finalBalance = initialBalance + topUpAmount + bonus;
        int Balance = initialBalance + topUpAmount;

        if (topUpAmount >= 1100) {
            System.out.println("Итоговая сумма на счету:" + finalBalance + " рублей ");
        } else {
            System.out.println("Итоговая сумма на счету:"+ Balance +" рублей ");
        }

        //int finalBalance = initialBalance + topUpAmount + bonus;
        //System.out.println("Начальная сумма на счету: " + initialBalance + " рублей");
        //System.out.println("Сумма пополнения: " + topUpAmount + " рублей");
        //System.out.println("Бонусные рубли: " + bonus + " рублей");
        //System.out.println("Итоговая сумма на счету: " + finalBalance + " рублей");
    }

}

