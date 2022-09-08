package auladiaseis;
import javax.swing.*;

public class Gustaffx {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "VOCÊ GANHOU UMA PREMIO");
        JOptionPane.showMessageDialog(null,
                "1- MATAR O BOLSONARO\n"
                        + "2- VOTAR NO LULA"
                        + "\n3- NAMORAR COM O WENDIL"
        );


        String recebe = JOptionPane.showInputDialog("QUAL SUA ESCOLHA?");

         if (recebe.equals("1")) {
            JOptionPane.showMessageDialog(null, "FEZ UMA BELA ESCOLHA!");
         }
         else if (recebe.equals("2")) {
            JOptionPane.showMessageDialog
                    (null, "VOCÊ VOTOU NO MELHOR PRESIDA");
        } else if (recebe.equals("3")) {
            JOptionPane.showMessageDialog(null, "AGORA VOCÊ TA CASADO COM O DAORA");
        } else { JOptionPane.showMessageDialog(null,"O SENHOR/A PODERIA ESCOLHER UM DOS TRÊS POR FAVOR");


        }
    }
}


















