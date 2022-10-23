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
        byte milk100MlWeignt = 105;
        byte onePackIceCreamWeight = 100;
        byte oneEggWeight = 70;
        int athleticDrinkWeight = banana * bananaWeight + milk * milk100MlWeignt + iceCream * onePackIceCreamWeight + eggs * oneEggWeight;
        float athleticDinkWeightKilo = athleticDrinkWeight / 1000F;
        System.out.println("Вес спорт-завтрака "+athleticDrinkWeight+" грамм, или "+athleticDinkWeightKilo+" килограмм");

        //задание 7



    }
}