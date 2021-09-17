package lista4.rh;

public class Teste {
    public static void exemploPolimorfismo(Funcionario funcionario) {
    	funcionario.receberSalario();
    }
    public static void main(String args[]){

        Assistente as1 = new Assistente("Fulano", "123", 1000, 4);
        System.out.println(as1.toString());
        exemploPolimorfismo(as1);
        Gerente ge1 = new Gerente("Beltrano", "456", 2000, 10);
        System.out.println(ge1.toString());
        exemploPolimorfismo(ge1);
        Diretor di1 = new Diretor("Ciclano", "789", 3000, "Compass");
        System.out.println(di1.toString());
        exemploPolimorfismo(di1);
        
        
    }
}