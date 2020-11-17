package z_2;

import java.util.Scanner;

public class TestStudent {
    public static Scanner sc = new Scanner(System.in);

    public static void inputInfo(Student st) {
        System.out.print("Введите ID студента: ");
        st.setIdNumber(sc.nextInt());
        sc.nextLine();
        System.out.print("Введите имя студента: ");
        st.setName(sc.nextLine());
        System.out.print("Введите количество баллов: ");
        st.setGPA(sc.nextFloat());
        System.out.println("");
    }
    public static void main(String[] args) {
        Student[] stu = null;
        int n = 0;
        boolean flag = true;
        do {
            System.out.println("1. Ввести информацию о студенте");
            System.out.println("2. Отсортировать студентов по баллам");
            System.out.println("3. Найти студента в списке");
            System.out.println("4. Вывести список студентов");
            System.out.println("Введите другое число для закрытия");
            System.out.print("Выберите: ");
            switch (sc.nextInt()) {
                case 1:
                    System.out.print("Введите количество студентов: ");
                    n = sc.nextInt();
                    stu = new Student[n];
                    for(int i=0; i<n; i++) {
                        System.out.println("Студент " + (i+1) + ": ");
                        stu[i] = new Student();
                        inputInfo(stu[i]);
                    }
                    break;
                case 2:
                    SortingAndSearchStudent ste = new SortingAndSearchStudent();
                    ste.quickSort(stu, 0, n-1);
                    ste.reverse(stu, 0, n-1);
                    System.out.println("Студенты отсортированы по баллам");
                    System.out.println();
                    break;
                case 3:
                    SortingAndSearchStudent st = new SortingAndSearchStudent();
                    System.out.print("Введите имя студента для поиска: ");
                    String name = sc.next();
                    System.out.println();
                    try {
                        System.out.println(st.search(stu, name).toString());
                    }
                    catch (StudentNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    System.out.println();
                    break;

                case 4:
                    System.out.printf("%-5s %15s %15s %15s \n", "ID", "Name", "GPA", "GPA(A-F)");
                    for (int i=0; i<stu.length; i++) {
                        stu[i].showInfo();
                    }
                    break;
                default:
                    flag = false;
                    break;
            }
        } while (flag);
    }
}