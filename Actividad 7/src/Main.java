import java.util.InputMismatchException;
import  java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Double> Array = new ArrayList<>();
        //double[] Array = new double[i + 1];
        boolean R = true;

        while (R) {
            try {
                yapping();
                short e = sc.nextShort();

                switch (e) {
                    case 1:
                        case1(Array);
                        break;
                    case 2:
                        case2(Array);
                        break;
                    case 3:
                        case3(Array);
                        break;
                    case 4:
                        case4(Array);
                        break;
                    case 5:
                        case5(Array);
                        break;
                    case 6:
                        case6();
                        break;
                    default:
                        System.out.println(("Por favor, introduzca una opcion valida"));
                }
            } catch (InputMismatchException x) {
                System.out.println("Por favor, ingresa una opcion valida");
            }
            sc.nextLine();
            System.out.println("Desea realizar otra accion? (y/n): ");
            char a = sc.next().charAt(0);
            if (a == 'n') {
                R = false;
            }
        }
    }

    static int potencia(int a, int n) {
        if (n == 0) {
            return 1;
        }
        int half = potencia(a, n / 2);
        if (n % 2 == 1) {
            return a * half * half;
        } else {
            return half * half;
        }
    }

    static void yapping() {
        System.out.println("Seleccione la figura geométrica:");
        System.out.println("1. Círculo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Triángulo");
        System.out.println("4. Rectángulo");
        System.out.println("5. Pentágono");
        System.out.println("6. Potenciador");
    }

    static void case1(ArrayList<Double> Array) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Seleccione 'p' para calcular el perímetro o 'a' para calcular el área:");
        char a = sc.next().charAt(0);
        if (a == 'p') {
            System.out.println("Introduzca el valor del diametro(cm)");
            double d = sc.nextDouble();
            d = 3.1416 * d;
            Array.add(d);
            System.out.println("El valor del perimetro es: " + d + "cm");
        } else {
            System.out.println("Introduzca el valor del radio(cm)");
            double r = sc.nextDouble();
            r = 3.1416 * (r * r);
            Array.add(r);
            System.out.println("El valor del area es: " + r + "cm2");
        }
    }
    static void case2(ArrayList<Double> Array) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Seleccione 'p' para calcular el perímetro o 'a' para calcular el área:");
        char a = sc.next().charAt(0);
        if (a == 'p') {
            System.out.println("Introduzca el valor del lado del cuadrado(cm)");
            double d = sc.nextDouble();
            d = d + d + d + d;

            Array.add(d);
            System.out.println("El valor del perimetro es: " + d + "cm");
        } else {
            System.out.println("Introduzca el valor del lado del cuadrado(cm)");
            double r = sc.nextDouble();
            r = r * r;
            Array.add(r);
            System.out.println("El valor del area es: " + r + "cm2");
        }
    }
    static void case3(ArrayList<Double> Array) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Seleccione 'p' para calcular el perímetro o 'a' para calcular el área:");
        char a = sc.next().charAt(0);
        if (a == 'p') {
            System.out.println("Introduzca el valor del primer lado(cm)");
            double d = sc.nextDouble();
            System.out.println("Introduzca el valor del segundo lado(cm)");
            double t = sc.nextDouble();
            System.out.println("Introduzca el valor del tercer lado(cm)");
            double f = sc.nextDouble();
            d = d + t + f;
            //Array[i] = d;
            Array.add(d);
            System.out.println("El valor del perimetro es: " + d + "cm");
        } else {
            System.out.println("Introduzca el valor de la base(cm)");
            double r = sc.nextDouble();
            System.out.println("Introduzca el valor de la altura(cm)");
            double h = sc.nextDouble();
            r = (r * h) / 2;
            //Array[i] = r;
            Array.add(r);
            System.out.println("El valor del area es: " + r + "cm2");
        }
    }
    static void case4(ArrayList<Double> Array) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Seleccione 'p' para calcular el perímetro o 'a' para calcular el área:");
        char a = sc.next().charAt(0);
        if (a == 'p') {
            System.out.println("Introduzca el valor del lado horizontal(cm)");
            double d = sc.nextDouble();
            System.out.println("Introduzca el valor del lado vertical(cm)");
            double t = sc.nextDouble();
            d = (d * 2) + (t * 2);
            Array.add(d);
            System.out.println("El valor del perimetro es: " + d + "cm");
        } else {
            System.out.println("Introduzca el valor de la base(cm)");
            double r = sc.nextDouble();
            System.out.println("Introduzca el valor de la altura(cm)");
            double h = sc.nextDouble();
            r = r * h;
            Array.add(r);
            System.out.println("El valor del area es: " + r + "cm2");
        }
    }
    static void case5(ArrayList<Double> Array) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Seleccione 'p' para calcular el perímetro o 'a' para calcular el área:");
        char a = sc.next().charAt(0);
        if (a == 'p') {
            System.out.println("Introduzca el valor de los lados(cm)");
            double d = sc.nextDouble();
            d = d * 5;
            Array.add(d);
            System.out.println("El valor del perimetro es: " + d + "cm");
        } else {
            System.out.println("Introduzca el valor del perimetro(cm)");
            double r = sc.nextDouble();
            System.out.println("Introduzca el valor de la apotema(cm)");
            double h = sc.nextDouble();
            r = (r * h) / 2;
            Array.add(r);
            System.out.println("El valor del area es: " + r + "cm2");
        }
    }
    static void case6() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el factor");
        int d = sc.nextInt();
        System.out.println("Introduzca el exponente");
        int r = sc.nextInt();
        System.out.println("El resultado es: " + potencia(d, r));
    }
}