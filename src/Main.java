import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int ejercicio;
        int salir;

        do{
            System.out.println("ingrese el numero del ejercicio al que quiere ingresar: ");
            ejercicio = scanner.nextInt();

            int irHastaN;
            int multiplo;
            int num;
            int cant = 0;
            Integer m,n, d, numero = 0;
            int numerosMostrados = 0;


            switch (ejercicio){
                case 1:
                    System.out.println("\n#########\nEjercicio 1\n############\n");

                    System.out.println("Ingrese el número hasta donde quieres ir: ");
                    irHastaN = scanner.nextInt();

                    System.out.print("\n");
                    for(int i = 0; i <= irHastaN; i++){
                        if(i % 2 == 0){
                            System.out.print(i + " - ");
                        }
                    }

                    break;

                case 2:
                    System.out.println("\n#########\nEjercicio 2\n############\n");



                    System.out.println("Ingrese el número hasta donde quieres ir: ");
                    irHastaN = scanner.nextInt();

                    System.out.println("Ingrese del numero que quieres ver los multiplos: ");
                    multiplo = scanner.nextInt();

                    System.out.print("\n");
                    for(int i = 0; i <= irHastaN; i++){
                        if(i % multiplo == 0){
                            System.out.print(i + " - ");
                        }
                    }
                    break;
                case 3:

                    System.out.println("Ingrese un numero: ");
                    num = scanner.nextInt();

                    for (int i = 1; i <= num; i++){
                        if(num % i == 0){
                            cant++;

                        }
                    }

                    if(cant == 2) System.out.println(num + " es primo");
                    else System.out.println(num + " no es primo");

                    break;
                case 4:
                    System.out.println("Ingrese el número hasta donde quieres ir: ");
                    irHastaN = scanner.nextInt();

                    for (int i = 0; i <irHastaN ; i++) {
                        cant = 0;
                        for (int j = 1; j <= i; j++){
                            if(i % j == 0){
                                cant++;

                            }
                        }
                        if(cant == 2) System.out.println(i + " es primo");

                    }
                    break;

                case 5:
                    System.out.println("Cuantos números quieres que se muestren?: ");
                    n = scanner.nextInt();
                    System.out.println("Cuantos digitos minimos quieres que tengan?: ");
                    m = scanner.nextInt();
                    System.out.println("Cual es digito que quieres que se repita?: ");
                    d = scanner.nextInt();


                    while(numerosMostrados < n) {
                        if (numero.toString().contains(d.toString())){
                            if (m <= numero.toString().length() - numero.toString().replace(d.toString(), "").length()) {
                                System.out.println(numero);
                                numerosMostrados++;
                            }

                        }else{
                            System.out.println("Error xd");
                            break;
                        }
                        numero++;
                    }

                    break;

                default:
                    System.out.println("Error ese ejercicio no existe");
                    break;
            }

            System.out.println("\n\n Ingrese \n1 si desea salir \n0 si desea continar");
            salir = scanner.nextInt();


        }while(salir == 0 );



    }
}