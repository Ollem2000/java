import java.text.DecimalFormat;
import java.util.Scanner;

public class Desafio_cofre {/* Código incompleto

  public static void main(String[] args) {
    // Lendo os dados de Entrada:
    Scanner scanner = new Scanner(System.in);
    String titular = scanner.next();
    int numeroConta = scanner.nextInt();
    double saldo = scanner.nextDouble();
    double taxaJuros = scanner.nextDouble();

    ContaPoupanca contaPoupanca = new ContaPoupanca(numeroConta, titular, saldo, taxaJuros);

    System.out.println("Conta Poupanca:");
    contaPoupanca.exibirInformacoes();
  }
}

class ContaBancaria {
  protected int numero;
  protected String titular;
  protected double saldo;

  public ContaBancaria(int numero, String titular, double saldo) {
    this.numero = numero;
    this.titular = titular;
    this.saldo = saldo;
  }

  public void exibirInformacoes() {
    DecimalFormat decimalFormat = new DecimalFormat("#.00"); // Ajuste no formato para duas casas decimais
    System.out.println(titular);
    System.out.println(numero);
    System.out.println("Saldo: R$ " + decimalFormat.format(saldo)); // Usar o decimalFormat para formatar o saldo
  }
}

class ContaPoupanca extends ContaBancaria {
  private double taxaJuros;

  // Sobrecarga de construtores
  public ContaPoupanca(int numero, String titular, double saldo, double taxaJuros) {
    super(numero, titular, saldo); // Chama o construtor da classe pai
    this.taxaJuros = taxaJuros;
  }

  public ContaPoupanca(int numero, String titular, double saldo) {
    super(numero, titular, saldo);
    this.taxaJuros = 0.0; // Define a taxa de juros como 0 por padrão se não for fornecida
  }

  // Método para exibir informações com a taxa de juros
  public void exibirInformacoes() {
    super.exibirInformacoes();
    DecimalFormat decimalFormat = new DecimalFormat("#.00"); // Ajuste no formato para duas casas decimais
    System.out.println("Taxa de Juros: " + decimalFormat.format(taxaJuros) + "%");
  }*/
}