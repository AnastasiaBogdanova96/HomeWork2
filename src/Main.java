public class Main {
    public static void main(String[] args) {
        System.out.println("Task1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        System.out.println("\nTask2");
        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        System.out.println("\nTask3");
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        System.out.println("\nTask4");
        var friend = 19;
        System.out.println("friend = " + friend);
        friend += 2;
        System.out.println("friend = " + friend);
        friend /= 7;
        System.out.println("friend = " + friend);

        System.out.println("\nTask5");
        var frog = 3.5;
        System.out.println("frog = " + frog);
        frog *= 10;
        System.out.println("frog = " + frog);
        frog /= 3.5;
        System.out.println("frog = " + frog);
        frog += 4;
        System.out.println("frog = " + frog);

        System.out.println("\nTask6");
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;

        var summaryBoxerWeight = firstBoxerWeight + secondBoxerWeight;

        System.out.println("Масса двух бойцов = " + summaryBoxerWeight);

        var boxerWeightDifference = firstBoxerWeight - secondBoxerWeight;
        System.out.println("Разница в весе двух бойцов = " + boxerWeightDifference);

        System.out.println("\nTask7");
        var weightReminder = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Остаток от деления веса двух бойцов = " + weightReminder);

        System.out.println("\nTask8");
        var totalWorkingHours = 640;
        var workingHoursOneEmployee = 8;

        var employeeAmound = totalWorkingHours / workingHoursOneEmployee;
        System.out.println("«Всего работников в компании - " + employeeAmound + " человек»");

        var newEmployeeAmound = employeeAmound + 94;
        var newTotalWorkingHours = newEmployeeAmound * workingHoursOneEmployee;
        System.out.printf("«Если в компании работает %s человек, то всего %s часов работы может быть поделено между сотрудниками»"
                , newEmployeeAmound, newTotalWorkingHours);
    }
}