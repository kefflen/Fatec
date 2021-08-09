package lista2;

public class TestaProduto {
    public static void main(String[] args) {
        Produto pdt = new Produto();
        pdt.setId(1);
        pdt.setDescricao("Produto domestico");
        pdt.setQtd(100);
        pdt.setPreco(35.5F);

        Produto pdt2 = new Produto(2, "Smartphone", 20, 1499.99F);

        pdt.comprar(15);
        pdt2.vender(19);

        pdt.subirPreco(5F);
        pdt2.decerPreco(99.99F);
        pdt.mostrar();
        pdt2.mostrar();
        System.out.println("Quantidade: " + pdt.getQtd());
    }
}
