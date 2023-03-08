package ru.netology.services;

public class VacationService {
    public int calculate(int income, int expenses, int threshold) {
        int countMonth = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 1; month < 13; month++) {
            // System.out.println("Счетчик " + countMonth + " Месяц " + month + " Денег " + money + " Заработал " + income + " потратил " + expenses);
            if (money >= threshold) { // можем ли отдыхать?
                countMonth++; // увеличиваем счётчик месяцев отдыха
                money = (money - expenses) / 3; // затраты на отдых
            } else {
                money = money + income - expenses;
            }
        }
        return countMonth;
    }
}
