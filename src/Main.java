public class Main {
    public static void main(String[] args) {
        //задание 1
        int i = 2147483647;
        System.out.println("Значение переменной i с типоv int равно " + i);
        byte b = 127;
        System.out.println("Значение переменной b с типом byte равно "+ b);
        short s = 32767;
        System.out.println("Значение переменной s с типом short равно " +s);
        long l = 9223372036854775807L;
        System.out.println("Значение переменной l с типом long равно "+l);
        float f = 3.14159265F;
        System.out.println("Значение переменной f с типом float равно "+f);
        double d = 3.14159265358979323846264;
        System.out.println("Значение переменной d с типом double равно "+d);

        //задание 2
        float fl = 27.12F;
        System.out.println(fl);
        long lo =987678965549L;
        System.out.println(lo);
        byte by = 2;
        System.out.println(by);
        short sh = 786;
        System.out.println(sh);
        boolean boo = 5>6;
        System.out.println(boo);
        short ssh = 569;
        System.out.println(ssh);
        int in = -159;
        System.out.println(in);
        short sH = 27897;
        System.out.println(sH);
        byte bY = 67;
        System.out.println(bY);

        //задание 3
        byte teacherLyudmilaClassroomStudents = 23;
        byte teacherAnnaClassroomStudents = 27;
        byte teacherEkaterinaClassroomStudents = 30;
        int totalStudents = teacherLyudmilaClassroomStudents+teacherAnnaClassroomStudents+teacherEkaterinaClassroomStudents;
        System.out.println("Общее число учеников у трёх учителей "+ totalStudents);
        short paper = 480;
        int paperForOneStudent = paper / totalStudents;
        System.out.println("На каждого ученика расчитано " +paperForOneStudent+ " листов бумаги!");

        //задание 4
        int pftm = 16;
        //сокарщение от perfomanceForTwoMinute
        int pfom = pftm / 2;
        int time1 = 20;
        int time2 = 1440;
        //сутки
        int time3 = 4320;
        //трое суток
        int time4 = 43200;
        //месяц
        int pfTwentyMinutes = pfom * time1;
        System.out.println("За 20 минут машина произвела бутылок "+pfTwentyMinutes+ " штук");
        int pfDay = pfom * time2;
        System.out.println("За сутки машина произвела бутылок "+pfDay+ " штук");
        int pfThreeDays = pfom * time3;
        System.out.println("За трое суток машина произвела бутылок "+pfThreeDays+ " штук");
        int pfMonth = pfom * time4;
        System.out.println("За месяц машина произвела бутылок "+pfMonth+ " штук");

        //задание 5
        byte totalColorJar = 120;
        byte whiteColorJarForOneClass = 2;
        byte brownColorJarForOneClass = 4;
        int totalClasses = totalColorJar / (whiteColorJarForOneClass+brownColorJarForOneClass);
        System.out.println("В школе "+totalClasses+ " классов");
        int totalWhiteJars = totalClasses * whiteColorJarForOneClass;
        int totalBrownJars = totalClasses * brownColorJarForOneClass;
        System.out.println("В школе, где "+totalClasses+ " классов, нужно "+totalWhiteJars+" банок белой краски и "+totalBrownJars+" банок коричневой краски");

        //задание 6
        byte banana = 5;
        byte milk = 2;
        byte iceCream = 2;
        byte eggs = 4;
        byte bananaWeight = 80;
        byte milkW = 105;
        byte onePackIceCreamWeight = 100;
        byte oneEggWeight = 70;
        int athleticDrinkWeight = banana * bananaWeight + milk * milkW + iceCream * onePackIceCreamWeight + eggs * oneEggWeight;
        float athleticDinkWeightKilo = athleticDrinkWeight / 1000F;
        System.out.println("Вес спорт-завтрака "+athleticDrinkWeight+" грамм, или "+athleticDinkWeightKilo+" килограмм");

        //задание 7
        byte a = 7;
        int c = 250;
        int g = 500;
        int days1= a*1000/c;
        System.out.println(days1+" дней уйдёт на похудение,если спортсмен будет терять каждый день по "+c+" грамм");
        int days2= a*1000/g;
        System.out.println(days2+" дней уйдёт на похудение,если спортсмен будет терять каждый день по "+g+" грамм");
        int k = (days1+days2)/2;
        System.out.println("В среднем спортсмену понадобится "+k+" дней, чтобы похудеть");

        //задание 8
        double salaryMasha = 67760;
        double salaryDenis = 83690;
        double salaryCristina = 76230;
        double newSalaryMasha = salaryMasha * 0.1 + salaryMasha;
        System.out.println("Маша получает после повышения зарплаты" + Math.round(newSalaryMasha));
        double newSalaryDenis = salaryDenis * 0.1 + salaryDenis;
        System.out.println("Денис получает после повышения зарплаты" + Math.round(newSalaryDenis));
        double newSalaryCristina = salaryCristina * 0.1 + salaryCristina;
        System.out.println("Кристина получает после повышения зарплаты " + Math.round(newSalaryCristina));
        double salaryMashaYear = salaryMasha * 12;
        double newSalaryMashaYear = newSalaryMasha * 12;
        double differenceSalaryMasha = newSalaryMashaYear - salaryMashaYear;
        System.out.println("Годовой доход Маши до повышения был "+ Math.round(salaryMashaYear)+" ,а после повышения зарплаты "+Math.round(newSalaryMashaYear)+". Годовой доход вырос на "+Math.round(differenceSalaryMasha));
        double salaryDenisYear = salaryDenis * 12;
        double newSalaryDenisYear = newSalaryDenis *12;
        double differenceSalaryDenis = newSalaryDenisYear - salaryDenisYear;
        System.out.println("Годовой доход Дениса до повышения был "+ Math.round(salaryDenisYear)+" ,а после повышения зарплаты "+Math.round(newSalaryDenisYear)+". Годовой доход вырос на "+Math.round(differenceSalaryDenis));
        double salaryCristinaYear = salaryCristina *12;
        double newSalaryCristinaYear = newSalaryCristina *12;
        double differenceSalaryCristina = newSalaryCristinaYear - salaryCristinaYear;
        System.out.println("Годовой доход Кристины до повышения был "+ Math.round(salaryCristinaYear)+" ,а после повышения зарплаты "+Math.round(newSalaryCristinaYear)+". Годовой доход вырос на "+Math.round(differenceSalaryCristina));


    }
}