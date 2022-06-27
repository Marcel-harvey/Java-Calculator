import javax.swing.*;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class GUI implements ActionListener, KeyListener, MouseListener {

    boolean flag = false;
    String add;

    // Basic GUI
    JFrame frame;
    JLabel screenLabel;
    JPanel panel;
    JMenuBar menuBar;
    JMenu menu;
    JMenuItem converterMenu;
    JMenuItem calculatorMenu;
    JTextField inputText;
    JTextPane outputText;

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

    // For methods in event listener
    String calculation;
    ArrayList<String> toCalculateList;
    String answer;

    GUI() {

        // Buttons for numbers and operands
        button0 = new JButton("0");
        button0.setBounds(100, 390, 90, 65);
        button0.setBackground(new Color(227, 227, 227));
        button0.setBorder(BorderFactory.createLineBorder(new Color(120, 120, 120), 2));
        button0.addActionListener(this);
        button0.addKeyListener(this);

        button1 = new JButton("1");
        button1.setBounds(5, 320, 90, 65);
        button1.setBackground(new Color(227, 227, 227));
        button1.setBorder(BorderFactory.createLineBorder(new Color(120, 120, 120), 2));
        button1.addActionListener(this);

        button2 = new JButton("2");
        button2.setBounds(100, 320, 90, 65);
        button2.setBackground(new Color(227, 227, 227));
        button2.setBorder(BorderFactory.createLineBorder(new Color(120, 120, 120), 2));
        button2.addActionListener(this);

        button3 = new JButton("3");
        button3.setBounds(195, 320, 90, 65);
        button3.setBackground(new Color(227, 227, 227));
        button3.setBorder(BorderFactory.createLineBorder(new Color(120, 120, 120), 2));
        button3.addActionListener(this);

        button4 = new JButton("4");
        button4.setBounds(5, 250, 90, 65);
        button4.setBackground(new Color(227, 227, 227));
        button4.setBorder(BorderFactory.createLineBorder(new Color(120, 120, 120), 2));
        button4.addActionListener(this);

        button5 = new JButton("5");
        button5.setBounds(100, 250, 90, 65);
        button5.setBackground(new Color(227, 227, 227));
        button5.setBorder(BorderFactory.createLineBorder(new Color(120, 120, 120), 2));
        button5.addActionListener(this);

        button6 = new JButton("6");
        button6.setBounds(195, 250, 90, 65);
        button6.setBackground(new Color(227, 227, 227));
        button6.setBorder(BorderFactory.createLineBorder(new Color(120, 120, 120), 2));
        button6.addActionListener(this);

        button7 = new JButton("7");
        button7.setBounds(5, 180, 90, 65);
        button7.setBackground(new Color(227, 227, 227));
        button7.setBorder(BorderFactory.createLineBorder(new Color(120, 120, 120), 2));
        button7.addActionListener(this);

        button8 = new JButton("8");
        button8.setBounds(100, 180, 90, 65);
        button8.setBackground(new Color(227, 227, 227));
        button8.setBorder(BorderFactory.createLineBorder(new Color(120, 120, 120), 2));
        button8.addActionListener(this);

        button9 = new JButton("9");
        button9.setBounds(195, 180, 90, 65);
        button9.setBackground(new Color(227, 227, 227));
        button9.setBorder(BorderFactory.createLineBorder(new Color(120, 120, 120), 2));
        button9.addActionListener(this);

        buttonClear = new JButton("CE");
        buttonClear.setBounds(290, 110, 90, 65);
        buttonClear.setBackground(new Color(227, 227, 227));
        buttonClear.setBorder(BorderFactory.createLineBorder(new Color(120, 120, 120), 2));
        buttonClear.addActionListener(this);

        openBracket = new JButton("(");
        openBracket.setBounds(100, 110, 90, 65);
        openBracket.setBackground(new Color(227, 227, 227));
        openBracket.setBorder(BorderFactory.createLineBorder(new Color(120, 120, 120), 2));
        openBracket.addActionListener(this);

        closeBracket = new JButton(")");
        closeBracket.setBounds(195, 110, 90, 65);
        closeBracket.setBackground(new Color(227, 227, 227));
        closeBracket.setBorder(BorderFactory.createLineBorder(new Color(120, 120, 120), 2));
        closeBracket.addActionListener(this);

        powerX2 = new JButton("x2");
        powerX2.setBounds(5, 110, 90, 65);
        powerX2.setBackground(new Color(227, 227, 227));
        powerX2.setBorder(BorderFactory.createLineBorder(new Color(120, 120, 120), 2));
        powerX2.addActionListener(this);

        buttonAdd = new JButton("+");
        buttonAdd.setBounds(290, 390, 90, 65);
        buttonAdd.setBackground(new Color(227, 227, 227));
        buttonAdd.setBorder(BorderFactory.createLineBorder(new Color(120, 120, 120), 2));
        buttonAdd.addActionListener(this);

        buttonSubtract = new JButton("-");
        buttonSubtract.setBounds(290, 320, 90, 65);
        buttonSubtract.setBackground(new Color(227, 227, 227));
        buttonSubtract.setBorder(BorderFactory.createLineBorder(new Color(120, 120, 120), 2));
        buttonSubtract.addActionListener(this);

        buttonMultiply = new JButton("x");
        buttonMultiply.setBounds(290, 250, 90, 65);
        buttonMultiply.setBackground(new Color(227, 227, 227));
        buttonMultiply.setBorder(BorderFactory.createLineBorder(new Color(120, 120, 120), 2));
        buttonMultiply.addActionListener(this);

        buttonDivision = new JButton("/");
        buttonDivision.setBounds(290, 180, 90, 65);
        buttonDivision.setBackground(new Color(227, 227, 227));
        buttonDivision.setBorder(BorderFactory.createLineBorder(new Color(120, 120, 120), 2));
        buttonDivision.addActionListener(this);

        buttonEquals = new JButton("=");
        buttonEquals.setBounds(195, 390, 90, 65);
        buttonEquals.setBackground(new Color(227, 227, 227));
        buttonEquals.setBorder(BorderFactory.createLineBorder(new Color(120, 120, 120), 2));
        buttonEquals.addActionListener(this);

        buttonComma = new JButton(",");
        buttonComma.setBounds(5, 390, 90, 65);
        buttonComma.setBackground(new Color(227, 227, 227));
        buttonComma.setBorder(BorderFactory.createLineBorder(new Color(120, 120, 120), 2));
        buttonComma.addActionListener(this);


        // Entire menu bar section
        menuBar = new JMenuBar();
        menu = new JMenu("Menu");
        converterMenu = new JMenuItem("Converter");
        calculatorMenu = new JMenuItem("Calculator");

        menu.add(calculatorMenu);
        menu.add(converterMenu);
        menuBar.add(menu);


        // Text area for output text
        outputText = new JTextPane();
        outputText.setText("");       // Answer will be placed in this in event listener
        outputText.setEnabled(false);
        outputText.setDisabledTextColor(Color.BLACK);
        outputText.setFont(new Font(null, Font.PLAIN, 28));
        outputText.setBounds(0, 40, 380, 40);
        outputText.setBackground(Color.lightGray);
        outputText.addKeyListener(this);
        // Used to align the text in JTextpane
        StyledDocument doc = outputText.getStyledDocument();
        SimpleAttributeSet right = new SimpleAttributeSet();
        StyleConstants.setAlignment(right, StyleConstants.ALIGN_RIGHT);
        doc.setParagraphAttributes(0, doc.getLength(), right, false);


        // Text field for the label
        inputText = new JTextField();
        inputText.setBounds(0, 0 ,380, 40);
        inputText.setFont(new Font(null, Font.PLAIN, 18));
        inputText.setHorizontalAlignment(JTextField.RIGHT);
        inputText.setOpaque(true);
        inputText.addActionListener(this);
        inputText.addKeyListener(this);
        inputText.addMouseListener(this);

        // Screen label where text is inputted
        screenLabel = new JLabel();
        screenLabel.setLayout(null);
        screenLabel.setBounds(0, 0, 380, 100);
        screenLabel.setBackground(Color.lightGray);
        screenLabel.add(inputText);
        screenLabel.add(outputText);
        screenLabel.addKeyListener(this);

        // Panel for buttons
        panel = new JPanel();
        panel.setVisible(true);
        panel.setLayout(null);
        panel.setBounds(0, 0, 400, 520);
        panel.addMouseListener(this);
        panel.addKeyListener(this);

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



        // The entire frame for the GUI
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setBackground(Color.BLACK);
        frame.setJMenuBar(menuBar);
        frame.add(screenLabel);
        frame.add(panel);

        frame.setFocusable(true);
        frame.addKeyListener(this);

        frame.setSize(400, 520);
        frame.setVisible(true);
    }


    // Action events
    @Override
    public void actionPerformed(ActionEvent e) {

        add = String.valueOf(e.getSource());

        if (e.getSource() == buttonEquals) {

            calculation = inputText.getText();
            toCalculateList = new ArrayList<>(ConvertToArraylist.asList(calculation));
            answer = OrderOfCalculation.calculate(toCalculateList);

            outputText.setText(answer);

        }

        else if (e.getSource() == buttonClear) {

            inputText.setText("");
            outputText.setText("");
            flag = false;

        }

        else if (flag & e.getSource() == buttonAdd || e.getSource() ==buttonSubtract ||
                e.getSource() == buttonMultiply || e.getSource() == buttonDivision) {
            inputText.setText(answer);
        }

    }


    // Keyboard events
    @Override
    public void keyTyped(KeyEvent e) {

        switch (e.getKeyChar()) {
            case '1' -> button1.doClick();
            case '2' -> button2.doClick();
            case '3' -> button3.doClick();
            case '4' -> button4.doClick();
            case '5' -> button5.doClick();
            case '6' -> button6.doClick();
            case '7' -> button7.doClick();
            case '8' -> button8.doClick();
            case '9' -> button9.doClick();
            case '0' -> button0.doClick();
            case '/' -> buttonDivision.doClick();
            case '*' -> buttonMultiply.doClick();
            case '-' -> buttonSubtract.doClick();
            case '+' -> buttonAdd.doClick();
            case '=' -> buttonEquals.doClick();
            case '(' -> openBracket.doClick();
            case ')' -> closeBracket.doClick();
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == 127) {
            buttonClear.doClick();
            flag = false;
        }

        else if (e.getKeyCode() == 10) {
            buttonEquals.doClick();
            flag = true;
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {}

    @Override
    public void mouseClicked(MouseEvent e) {

        if (e.getSource() == panel) {
            panel.setFocusable(true);
            inputText.setFocusable(false);
        }

        else if (e.getSource() == inputText) {
            panel.setFocusable(false);
            inputText.setFocusable(true);
        }
    }


    // Mouse events
    @Override
    public void mousePressed(MouseEvent e) {

        if (e.getSource() == panel) {
            panel.setFocusable(true);
            inputText.setFocusable(false);
        }

        else if (e.getSource() == inputText) {
            panel.setFocusable(false);
            inputText.setFocusable(true);
        }

    }

    @Override
    public void mouseReleased(MouseEvent e) {

        if (e.getSource() == panel) {
            panel.setFocusable(true);
            inputText.setFocusable(false);
        }

        else if (e.getSource() == inputText) {
            panel.setFocusable(false);
            inputText.setFocusable(true);
        }

    }

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

}
