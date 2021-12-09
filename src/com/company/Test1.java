package by.epam.lis.mod4;
/*Создайте класс Тез двумя переменными. Добавьте метод вывода на экран и методы изменения этих
        переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
        наибольшее значение из этих двух переменных.*/
public class Test1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        print(a,b);
        System.out.println(changeX(a));
        System.out.println(changeY(b));
        System.out.println(sum(a,b));
        System.out.println(biggest(a,b));

    }

    public static void print(int x, int y){
        System.out.println("Числа : " +x+ " " +y );
    }
    public static int changeX(int x){
        x+=5;
        return x;
    }
    public static int changeY( int y){
        y+=7;
        return y;
    }
    public static int sum(int x, int y){
        int sum = x+y;
       return sum;
    }

    public static int biggest(int x, int y){
        if(x>y)
            return y;
        else
            return x;
    }

}
