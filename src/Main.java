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


    }
}