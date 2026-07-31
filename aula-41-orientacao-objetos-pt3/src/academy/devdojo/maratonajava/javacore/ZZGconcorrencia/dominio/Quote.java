package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.dominio;

public class Quote {
    private final String store;
    private final double price;
    private final Discount.Code discountCode;

    private Quote(String store, double price, Discount.Code discountCode) {
        this.store = store;
        this.price = price;
        this.discountCode = discountCode;
    }

    public static Quote newQuote(String value) {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("A string fornecida não pode ser nula ou vazia");
        }
        String[] values = value.split(":");
        if (values.length < 3) {
            throw new IllegalArgumentException("Formato inválido. Esperado 'Loja:Preço:CodigoDesconto'");
        }
        String store = values[0];
        double price = Double.parseDouble(values[1].replace(",", "."));
        Discount.Code discountCode = Discount.Code.valueOf(values[2]);
        return new Quote(store, price, discountCode);
    }

    @Override
    public String toString() {
        return "Quote{" +
                "store='" + store + '\'' +
                ", price=" + price +
                ", discountCode=" + discountCode +
                '}';
    }

    public String getStore() {
        return store;
    }

    public double getPrice() {
        return price;
    }

    public Discount.Code getDiscountCode() {
        return discountCode;
    }
}