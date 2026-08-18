public class Principal {

    public static void main(String[] args) {
        Banco b1 = new Banco ("Lucio", "1234", 15);
        Banco b2 = new Banco ();
        Banco b3exercicio = new Banco ("José","12345", 2000 );

        System.out.println(b2.saldo);
        b2.saldo = 1000;
        System.out.println(b2.saldo);

        System.out.println(b3exercicio.getNome());
        b3exercicio.Setnome = ("Lucas");
        System.out.println(b3exercicio.getNome());
    }
}
