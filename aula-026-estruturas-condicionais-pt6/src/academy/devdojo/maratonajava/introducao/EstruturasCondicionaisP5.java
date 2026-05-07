package academy.devdojo.maratonajava.introducao;

public class EstruturasCondicionaisP5 {
    public static void main(String[] args) {

        byte dia = 10;

        switch (dia) {
            case 1:
                System.out.println("Domingo, é final de semana!");
                break;
            case 2:
                System.out.println("Segunda, é dia util");
                break;
            case 3:
                System.out.println("Terça, é dia util");
                break;
            case 4:
                System.out.println("Quarta, é dia util");
                break;
            case 5:
                System.out.println("Quinta, é dia util");
                break;
            case 6:
                System.out.println("Sexta, é dia util");
                break;
            case 7:
                System.out.println("Sabado, é final de semana! ");
                break;
            default:
                System.out.println("Opção Inválida");
                break;

        }

        switch(dia) {
            case 1:
            case 7:
                System.out.println("FDS");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Opção Inválida");
        }
    }
}

