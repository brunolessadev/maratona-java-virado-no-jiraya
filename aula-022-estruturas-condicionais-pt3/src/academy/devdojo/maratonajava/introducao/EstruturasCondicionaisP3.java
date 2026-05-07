package academy.devdojo.maratonajava.introducao;

public class EstruturasCondicionaisP3 {
    public static void main(String[] args) {
        double salario = 5000;

       // String mensagemDoar = "Eu vou doar 500 pro Bruno";
       // String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter!";
       // String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

        String resultado = salario > 5000 ? "Eu vou doar 500 pro Bruno" : "Ainda não tenho condições, mas vou ter!";
/*

        if (salario > 5000) {
            resultado = mensagemDoar;
        } else {
            resultado = mensagemNaoDoar;
        }*/


        System.out.println(resultado);
    }

}

