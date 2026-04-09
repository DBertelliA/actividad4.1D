import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MiniCalculadoraEjemplo calc = new MiniCalculadoraEjemplo();
        String menu = """
                        ========================
                        Seleccione lo que quiere hacer:
                        1.Raiz cuadrada (1)
                        2.Valor absoluto (2)
                        3.Acabar el programa (Cualquier numero que no sean esos)                    
                        ========================
                        """;
        int opciones = 0;
        double numero = 0;
        do{
            System.out.println(menu);
            opciones = sc.nextInt();
            switch (opciones){
                case 1 ->{
                    System.out.println("--Raiz cuadrada--");
                    System.out.println("Dame el numero");
                    numero = sc.nextDouble();
                    System.out.println("Raiz cuadrada: " + calc.raizCuadrada(numero));
                    opciones = 0;
                }
                case 2 ->{
                    System.out.println("--Valor absoluto--");
                    System.out.println("Dame el numero");
                    numero = sc.nextDouble();
                    System.out.println("Valor absoluto: " + calc.absoluto(numero));
                    opciones = 0;
                }
                default -> System.exit(0);
            }
        }while(true);




    }
}
