package academy.devdojo.maratonajava.introducao;

public class EstruturasCondicionaisP1 {
    public static void main(String[] args) {
        int idade = 12;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if(isAutorizadoComprarBebida){
            System.out.println("Autorizado a comprar bebida alcólica");
        }else if(!isAutorizadoComprarBebida){
            System.out.println("Não é autorizado a comprar bebida alcólica");
        }

        System.out.println("Fora do if");
    }
}
