package Heranca;

public class Main {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        Funcionario gerente = new Gerente(); //Gerente faz Upcast para Funcionario.
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();


       // Vendedor vendedor_ = (Vendedor) new Funcionario (); //Downcast deve ser evitado.
    }
}
