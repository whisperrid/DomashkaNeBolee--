import java.util.Scanner;


public class Main {
    private  static  Scanner read;
    public static void main(String[] args){

        read = new Scanner(System.in);

        double num1, num2;
        double num3 ;
        int res;
        int operator, d;
        int stop;

        System.out.print("Начнем?\n");
        System.out.print("1 - Да, 2 - Нет \n");
        stop = read.nextInt();

        while (stop==1){
        System.out.print("Выберите действие\n");
        System.out.print("1 - сложение, 2 - вычитание, 3 - умножение, 4 - деление, 5 - квадратный корень\n");
        operator = read.nextInt();
        System.out.print("");

        if(operator==1){
            System.out.print("Введите 2 переменные\n");
            System.out.print("");
            num1 = read.nextDouble();
            num2 = read.nextDouble();
            System.out.print("Сумма: " + summa(num1, num2));}
        if(operator==2){
            System.out.print("Введите 2 переменные\n");
        System.out.print("");
            num1 = read.nextDouble();
            num2 = read.nextDouble();
            System.out.print("Разность: " + vichitanie(num1, num2));}
        if(operator==3){
            System.out.print("Введите 2 переменные\n");
            System.out.print("");
             num1 = read.nextDouble();
            num2 = read.nextDouble();
            System.out.print("Произведение: " + umnozhenie(num1, num2));}
        if(operator==4){
            System.out.print("Введите 2 переменные\n");
            System.out.print("");
            num1 = read.nextDouble();
            num2 = read.nextDouble();
            System.out.print("Частное: " + delenie(num1, num2));}
        if(operator==5) {
            System.out.print("Введите 3 переменные\n");
            System.out.print("");
            num1 = read.nextDouble();
            num2 = read.nextDouble();
            num3 = read.nextDouble();
            d = (int) (num2 * num2 - 4 * num1 * num3);
            kvadratkoren(num1,num2,num3,d);
        }
        System.out.print("\n");
        System.out.print("Продолжаем? \n");
        System.out.print("1 - Да, 2 - Нет \n");
        stop = read.nextInt();
    }
    }
    public static double summa(double a, double b){
        double result;
                result = a + b;
        return result;
    }
    public static double vichitanie(double a, double b){
    double result;
        result = a - b;
    return result;
    }
    public static double delenie(double a, double b){
        double result;
        result = a / b;
        return result;
    }
    public static double umnozhenie(double a, double b){
        double result;
        result = a * b;
        return result;
    }
    public static int kvadratkoren(double num1, double num2, double num3, int d) {
        if (d > 0) {
            double x1;
            double x2;
            x1 = (-num2 - Math.sqrt(d)) / (2 * num1);
            x2 = (-num2 + Math.sqrt(d)) / (2 * num1);
            System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
        } else if (d == 0) {
            double x;
            x = -num2 / (2 * num1);
            System.out.println("Уравнение имеет единственный корень: x = " + x);
        } else {
            System.out.println("Уравнение не имеет действительных корней!");
        }
        return 0;
    }
}


