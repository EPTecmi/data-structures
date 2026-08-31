public class Main{

    static void countdown(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        countdown(n - 1);
    }

    static int sum(int n){
        if(n==0){
            return 0;
        }
        System.out.println("N tiene el valor de: " + n);
        int suma = n + sum(n - 1);
        System.out.println("Suma actual = " + suma);
        return suma;
    }

    static int fact(int n){
        if(n == 0 || n == 1){
            return 1;
        }

        return n * fact(n - 1);
    }

    static int contarDigitos(int n){
        if(n<10){
            return 1;
        }
        return 1 + contarDigitos(n / 10);
    }

    static int power(int base, int exponente){
        if(exponente == 0){
            return 1;
        }
        return base * power(base, exponente - 1);
    }
    public static void main(String[] args) {

        // countdown(5);
        // System.out.println(sum(5));
        // System.out.println(fact(5));
        // System.out.println(contarDigitos(12345));
        System.out.println(power(2,3));

        

    }
}