import java.util.Scanner;
public class ConductadeEntrada {

    public static void main(String[] args) {
        System.out.println("¡Bienvenido al programa de evaluación de candidatos!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, ingresa tu Edad: ");
        int edad = scanner.nextInt();
        System.out.print("Por favor, ingresa tu Experiencia (en años): ");
        int experiencia = scanner.nextInt();
        System.out.print("Por favor, ingresa tu Nivel de Estudio (1: Técnico, 2: Profesional, 3: Maestría): ");
        int nivelEstudio = scanner.nextInt();
        System.out.print("Por favor, ingresa tu Puntaje de Prueba (0-100): ");
        int puntajePrueba = scanner.nextInt();
        
        if (puntajePrueba < 60) {
            System.out.println("Rechazado");
        } else if (nivelEstudio == 3) {
            if (experiencia < 2) {
                System.out.println("En lista de espera");
            } else {
                System.out.println("Contratado");
            }
        } else if (nivelEstudio == 2) {
            if (experiencia < 1) {
                System.out.println("Rechazado");
            } else if (experiencia >= 1) {
                if (edad < 35) {
                    System.out.println("Contratado");
                } else {
                    System.out.println("En lista de espera");
                }
            }
        } else if (nivelEstudio == 1) {
            if (experiencia >= 2) {
                if (edad < 30) {
                    System.out.println("En lista de espera");
                } else {
                    System.out.println("Rechazado");
                }
            }
        }
    }
}