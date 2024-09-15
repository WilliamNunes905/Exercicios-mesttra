package Exercicios.Fundamentos.expressoesLogicas;

public class Exercicio01 {
  public static void main(String[] args) {
    int aa = 30;
    int bb = 10;

    float meuDinheiro = 450.20f;

    boolean estaChovendo = true;
    boolean temPassagem = true;


    //a soma de aa e bb é maior que quarenta
    boolean ehMenor = (aa + bb) < 40; // False

    //quarenta é maior que a soma de aa e bb
    boolean ehMaior = 40 > (aa + bb); // False

    //a soma de aa e bb é menor ou igual a quarenta
    boolean ehMenorOuIgual = (aa + bb) <= 40; // True

    //aa menos cinco é igual a vinte e cinco
    boolean ehIgual = (aa - 5) == 25; // True

    //bb é diferente de desseseis
    boolean ehDiferente = bb != 16; // True

    //bb é diferente de quinze
    boolean ehDifereteDeQuinze = bb != 15; // True

    //aa é maior que quarenta e também aa é menor que oitenta
    boolean ehMaiorQueQuarentaEmenorQueOitenta = (aa > 40) && (aa < 80); // False

    //a subtração de aa menos bb multiplicado por dois é menor que sessenta ou a soma de bb mais 2 é diferente de quinze
    boolean logicaMatematica = (((aa - bb) * 2) > 60) || ((bb + 2) != 17); // True

    //viajo para a praia se não estiver chovendo e se existir passagem para vender e meu dinheiro seja suficiente para pagar a passagem que é 380
    boolean viajem = !estaChovendo && temPassagem && (meuDinheiro >= 380); // False

    // Agora a partir da frase dada escreva as expressões lógicas que as representam ainda utilizando o conteúdo das variáveis anteriores:
    // 10% de aa é menor do que 0.8% de bb
    boolean ehMenorQue = (0.10 * aa) < (0.8 * bb); // False


    //Viajo se estiver de sol ou nublado e tenha no mínimo mil reais
    boolean viajoSe = !estaChovendo && (meuDinheiro >= 1000); // False
  }
}
