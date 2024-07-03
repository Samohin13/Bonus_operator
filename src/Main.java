public class Main {
    public static void main(String[] args) {

        int initialBalance = 100; // Начальный баланс

        // Сумма пополнения
        int topUpAmount = 1100; // Сумма пополнения

        // Рассчитываем бонусные рубли
        int bonus = calculateBonus(topUpAmount);

        // Итоговая сумма на счету клиента
        int finalBalance = initialBalance + topUpAmount + bonus;

        System.out.println("Начальная сумма на счету: " + initialBalance + " рублей");
        System.out.println("Сумма пополнения: " + topUpAmount + " рублей");
        System.out.println("Бонусные рубли: " + bonus + " рублей");
        System.out.println("Итоговая сумма на счету: " + finalBalance + " рублей");
    }

    // Метод для расчета бонусных рублей
    public static int calculateBonus(int topUpAmount) {
        if (topUpAmount >1000) {
            return (topUpAmount / 100); // 1 рубль за каждые 100 рублей
        } else {
            return 0; // Бонусов нет, если пополнение менее или равно 1000 рублей
        }


    }
}

