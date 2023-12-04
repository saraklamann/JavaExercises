import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exercicio03 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,###.00");
        DecimalFormat outroDf = new DecimalFormat("#,###");

        int opiniao=0;
        double otimo=0, bom=0, ruim=0, n=0;
        String sair="";

        do{
            opiniao = Integer.parseInt(JOptionPane.showInputDialog("Qual sua opinião sobre o filme 'A fuga das galinhas'?  \n" +
            "1 - Ótimo \n" +
            "2 - Bom \n" +
            "3 - Ruim \n"));

            if(opiniao == 1){
                otimo += 1;
            } else if(opiniao == 2){
                bom += 1;
            } else if (opiniao == 3){
                ruim += 1;
            }

            sair = JOptionPane.showInputDialog("Deseja encerrar a pesquisa? (s/n)");
            sair = sair.toLowerCase();
            
            n++;
        } while (!sair.equals("s"));

        double porcentagemOtimo = otimo / n * 100;
        double porcentagemBom = bom / n * 100;
        double porcentagemRuim = ruim / n * 100;
        double media = otimo + bom + ruim / n;

        JOptionPane.showMessageDialog(null, outroDf.format(n) + " Pessoas responderam a esta pesquisa. \n" + 
        outroDf.format(otimo) + " (" + df.format(porcentagemOtimo) + "%) Pessoas acharam o filme ótimo \n" +
        outroDf.format(bom) + " (" + df.format(porcentagemBom) + "%)  Pessoas acharam o filme bom \n" +
        outroDf.format(ruim) + " (" + df.format(porcentagemRuim) + "%) Pessoas acharam o filme ruim \n" +
        "A média de notas do filme ficou em " + df.format(media));
    }
}