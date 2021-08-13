package lista2;

public class Produto {
    private int id;
    private String descricao;
    private int qtd;
    private float preco;
    
    Produto() { }
    Produto(int id, String descricao, int qtd, float preco) {
        this.setId(id);
        this.setDescricao(descricao);
        this.setPreco(preco);
        this.setQtd(qtd);
    }
    
    public void comprar(int qtd) {
        this.qtd += qtd;
    }

    public void vender(int qtd) {
        int novaQtd = this.qtd - qtd;
        if (novaQtd < 0) {
            this.qtd = 0;
        } else {
            this.qtd = novaQtd;
        }
    }

    public void subirPreco(float value) {
        this.preco += value;
    }

    public void decerPreco(float value) {
        float novoPreco = preco - value;
        if (novoPreco < 0) {
            this.preco = 0;
        } else {
            this.preco = novoPreco;
        }
    }

    public void mostrar() {
        System.out.printf("Produto(id=%d, descricao='%s', qtd=%d, preco=%.2f)\n", this.id, this.descricao, this.qtd, this.preco);
    }
    public void setId(int value) {
        if (value >= 0) {
            this.id = value;
        } else {
            System.out.println("Id invalido");
        }
    }

    public void setQtd(int value) {
        if (value >= 0) {
            this.qtd = value;
        } else {
            System.out.println("Quantidade invalida");
        }
    }

    public void setPreco(float value) {
        if (value >= 0) {
            this.preco = value;
        } else {
            System.out.println("Preço invalido");
        }
    }

    public void setDescricao(String value) {
        this.descricao = value;
    }

    public int getId() {
        return this.id;
    }

    public int getQtd() {
        return this.qtd;
    }
    
    public float getPreco() {
        return this.preco;
    }

    public String getDescricao() {
        return this.descricao;
    }
}
