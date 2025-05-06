package desafios.contaBancaria;

public class ContaBancariaPrincipal {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.setNumeroDaConta(123);
        conta.setSaldo(1000);
        conta.titular = "João";

        System.out.println("Número da Conta: " + conta.getNumeroDaConta());
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println("Titular: " + conta.titular);

        conta.setSaldo(1500);
        System.out.println("Novo Saldo: " + conta.getSaldo());
    }
}
