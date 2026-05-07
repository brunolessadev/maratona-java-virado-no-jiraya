package academy.devdojo.maratonajava.introducao;

public class OperadoresP4 {
    public static void main(String[] args) {
        double valorTotalContaCorrent = 200;
        double valorTotalContaPoupança = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrent > valorPlaystation || valorTotalContaPoupança >valorPlaystation;
        System.out.println("isPlaystationCincoCompravel "+isPlaystationCincoCompravel);
    }
}
