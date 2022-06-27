import javax.swing.*;
import java.awt.*;

public class GUIButtons {

    public JButton testButton;

    JPanel panel;

    // Numbers
    JButton button0;
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;

    // Operands
    JButton buttonAdd;
    JButton buttonSubtract;
    JButton buttonMultiply;
    JButton buttonDivision;
    JButton buttonEquals;

    // Other buttons
    JButton buttonComma;
    JButton buttonClear;
    JButton openBracket;
    JButton closeBracket;
    JButton powerX2;

    GUIButtons() {

        testButton = new JButton("Test");
        testButton.setBounds(0, 0, 100, 50);

        // Buttons for numbers and operands
        button0 = new JButton("0");
        button0.setBounds(100, 390, 90, 65);
        button0.setBackground(new Color(227, 227, 227));
        button0.setBorder(BorderFactory.createLineBorder(new Color(120, 120, 120), 2));

        button1 = new JButton("1");
        button1.setBounds(5, 320, 90, 65);
        button1.setBackground(new Color(227, 227, 227));
        button1.setBorder(BorderFactory.createLineBorder(new Color(120, 120, 120), 2));

        button2 = new JButton("2");
        button2.setBounds(100, 320, 90, 65);
        button2.setBackground(new Color(227, 227, 227));
        button2.setBorder(BorderFactory.createLineBorder(new Color(120, 120, 120), 2));

        button3 = new JButton("3");
        button3.setBounds(195, 320, 90, 65);
        button3.setBackground(new Color(227, 227, 227));
        button3.setBorder(BorderFactory.createLineBorder(new Color(120, 120, 120), 2));

        button4 = new JButton("4");
        button4.setBounds(5, 250, 90, 65);
        button4.setBackground(new Color(227, 227, 227));
        button4.setBorder(BorderFactory.createLineBorder(new Color(120, 120, 120), 2));

        button5 = new JButton("5");
        button5.setBounds(100, 250, 90, 65);
        button5.setBackground(new Color(227, 227, 227));
        button5.setBorder(BorderFactory.createLineBorder(new Color(120, 120, 120), 2));

        button6 = new JButton("6");
        button6.setBounds(195, 250, 90, 65);
        button6.setBackground(new Color(227, 227, 227));
        button6.setBorder(BorderFactory.createLineBorder(new Color(120, 120, 120), 2));

        button7 = new JButton("7");
        button7.setBounds(5, 180, 90, 65);
        button7.setBackground(new Color(227, 227, 227));
        button7.setBorder(BorderFactory.createLineBorder(new Color(120, 120, 120), 2));

        button8 = new JButton("8");
        button8.setBounds(100, 180, 90, 65);
        button8.setBackground(new Color(227, 227, 227));
        button8.setBorder(BorderFactory.createLineBorder(new Color(120, 120, 120), 2));

        button9 = new JButton("9");
        button9.setBounds(195, 180, 90, 65);
        button9.setBackground(new Color(227, 227, 227));
        button9.setBorder(BorderFactory.createLineBorder(new Color(120, 120, 120), 2));

        buttonClear = new JButton("CE");
        buttonClear.setBounds(290, 110, 90, 65);
        buttonClear.setBackground(new Color(227, 227, 227));
        buttonClear.setBorder(BorderFactory.createLineBorder(new Color(120, 120, 120), 2));

        openBracket = new JButton("(");
        openBracket.setBounds(100, 110, 90, 65);
        openBracket.setBackground(new Color(227, 227, 227));
        openBracket.setBorder(BorderFactory.createLineBorder(new Color(120, 120, 120), 2));

        closeBracket = new JButton(")");
        closeBracket.setBounds(195, 110, 90, 65);
        closeBracket.setBackground(new Color(227, 227, 227));
        closeBracket.setBorder(BorderFactory.createLineBorder(new Color(120, 120, 120), 2));

        powerX2 = new JButton("x2");
        powerX2.setBounds(5, 110, 90, 65);
        powerX2.setBackground(new Color(227, 227, 227));
        powerX2.setBorder(BorderFactory.createLineBorder(new Color(120, 120, 120), 2));

        buttonAdd = new JButton("+");
        buttonAdd.setBounds(290, 390, 90, 65);
        buttonAdd.setBackground(new Color(227, 227, 227));
        buttonAdd.setBorder(BorderFactory.createLineBorder(new Color(120, 120, 120), 2));

        buttonSubtract = new JButton("-");
        buttonSubtract.setBounds(290, 320, 90, 65);
        buttonSubtract.setBackground(new Color(227, 227, 227));
        buttonSubtract.setBorder(BorderFactory.createLineBorder(new Color(120, 120, 120), 2));

        buttonMultiply = new JButton("x");
        buttonMultiply.setBounds(290, 250, 90, 65);
        buttonMultiply.setBackground(new Color(227, 227, 227));
        buttonMultiply.setBorder(BorderFactory.createLineBorder(new Color(120, 120, 120), 2));

        buttonDivision = new JButton("/");
        buttonDivision.setBounds(290, 180, 90, 65);
        buttonDivision.setBackground(new Color(227, 227, 227));
        buttonDivision.setBorder(BorderFactory.createLineBorder(new Color(120, 120, 120), 2));

        buttonEquals = new JButton("=");
        buttonEquals.setBounds(195, 390, 90, 65);
        buttonEquals.setBackground(new Color(227, 227, 227));
        buttonEquals.setBorder(BorderFactory.createLineBorder(new Color(120, 120, 120), 2));

        buttonComma = new JButton(",");
        buttonComma.setBounds(5, 390, 90, 65);
        buttonComma.setBackground(new Color(227, 227, 227));
        buttonComma.setBorder(BorderFactory.createLineBorder(new Color(120, 120, 120), 2));

        // Panel for buttons
        panel = new JPanel();
        panel.setVisible(true);
        panel.setLayout(null);
        panel.setBounds(0, 0, 400, 520);

        panel.add(powerX2);
        panel.add(openBracket);
        panel.add(closeBracket);
        panel.add(buttonClear);

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(buttonSubtract);

        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(buttonMultiply);

        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(buttonDivision);

        panel.add(buttonComma);
        panel.add(button0);
        panel.add(buttonEquals);
        panel.add(buttonAdd);

    }

}
