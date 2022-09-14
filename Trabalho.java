package celula12;

import javax.swing.*;

public class Trabalho {
    public static void main(String[] args) {
        //PRIMEIRA QUESTÃO

        String recebe = JOptionPane.showInputDialog("Ecolha um numero maior que 10");

        if (recebe.equals(">10")) {
            JOptionPane.showMessageDialog(null, "VOCÊ ESCOLHEU UM NUMERO MAIOR QUE 10");
        }
        else if (recebe.equals("10")) {
            JOptionPane.showMessageDialog
                    (null, "VOCÊ ESCOLHEU 10");
        } else { JOptionPane.showMessageDialog(null,"O SENHOR/A ESCOLHEU UM NUMERO MENOR QUE 10");


        }
    }
        }

