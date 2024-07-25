import java.util.ArrayList;
import java.util.Scanner;

public class TemperatureMonth {
    public static void main(String[] args) {
        ArrayList<MonthDays> months = new ArrayList<>();
        ArrayList<Integer> temperature = new ArrayList<>();
        months.add(new MonthDays("january", 31));
        months.add(new MonthDays("february", 28));
        months.add(new MonthDays("march", 31));
        months.add(new MonthDays("april", 30));
        months.add(new MonthDays("may", 31));
        months.add(new MonthDays("june", 30));
        months.add(new MonthDays("july", 31));
        months.add(new MonthDays("august", 31));
        months.add(new MonthDays("september", 30));
        months.add(new MonthDays("october", 31));
        months.add(new MonthDays("november", 30));
        months.add(new MonthDays("december", 31));

        Scanner sc = new Scanner(System.in);
        String inputNameOfMonth = sc.next().toLowerCase();
        int daysInMonth = 0;
        boolean found = false;
        int sumAverage = 0;
        int Maxt = -1111111;
        int Mint = 11111111;

        int numMaxt = 0;
        int numMiny = 0;

        for (MonthDays monthDays : months) {
            if (monthDays.getNameMonth().equals(inputNameOfMonth)) {
                daysInMonth = monthDays.getDays();
                found = true;
                break; // Завершение цикла после нахождения совпадения
            }
        }

        // Если месяц не найден
        if (!found) {
            System.out.println("Месяц не найден.");
        }
        System.out.println("Enter temperature : ");



        for (int i = 1; i < daysInMonth+1; i++) {
            System.out.print("Day " + i + " : ");
            int temperatureMonth = sc.nextInt();
            temperature.add(temperatureMonth);
            sumAverage += temperatureMonth;
            if (temperatureMonth > Maxt){
                Maxt = temperatureMonth;
                numMaxt = i;
            }
            if (temperatureMonth < Mint){
                Mint = temperatureMonth;
                numMiny = i;
            }

        }


        System.out.println("Average t : " + sumAverage/daysInMonth);
        System.out.println("Max t : " + Maxt + " day " + numMaxt);
        System.out.println("Min t : " + Mint + " day " + numMiny);

    }
}

class MonthDays{
    String nameMonth;
    int days;

    public MonthDays(String nameMonth, int days) {
        this.nameMonth = nameMonth;
        this.days = days;
    }

    public String getNameMonth() {
        return nameMonth;
    }

    public int getDays() {
        return days;
    }
}