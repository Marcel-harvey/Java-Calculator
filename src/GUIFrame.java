import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

class GUIFrame extends GUIFramePanel{

    // The main frame of the GUI
    JFrame frame;
    JMenu menu;
    JMenuBar menuBar;
    JMenuItem calculatorMenu;
    JMenuItem converterMenu;


    // Used to calculate the answer
    String calculation;
    ArrayList<String> toCalculateList;
    String answer;

    public GUIFrame() {

        frame = new JFrame("Calculator");

        // Entire menu bar section
        menuBar = new JMenuBar();
        menu = new JMenu("Menu");
        converterMenu = new JMenuItem("Converter");
        calculatorMenu = new JMenuItem("Calculator");

        menu.add(calculatorMenu);
        menu.add(converterMenu);
        menuBar.add(menu);

        // The entire frame for the GUI
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setBackground(Color.BLACK);
        frame.setJMenuBar(menuBar);
        frame.add(this.framePanel);


        frame.setSize(400, 520);
        frame.setResizable(false);
        frame.setVisible(true);



        // Event handlers for numbered buttons
        this.button0.addActionListener(e -> inputText.setText(inputText.getText() + "0"));
        this.button1.addActionListener(e -> inputText.setText(inputText.getText() + "1"));
        this.button2.addActionListener(e -> inputText.setText(inputText.getText() + "2"));
        this.button3.addActionListener(e -> inputText.setText(inputText.getText() + "3"));
        this.button4.addActionListener(e -> inputText.setText(inputText.getText() + "4"));
        this.button5.addActionListener(e -> inputText.setText(inputText.getText() + "5"));
        this.button6.addActionListener(e -> inputText.setText(inputText.getText() + "6"));
        this.button7.addActionListener(e -> inputText.setText(inputText.getText() + "7"));
        this.button8.addActionListener(e -> inputText.setText(inputText.getText() + "8"));
        this.button9.addActionListener(e -> inputText.setText(inputText.getText() + "9"));


        // Event handlers for operator buttons
        this.buttonAdd.addActionListener(e -> inputText.setText(inputText.getText() + "+"));
        this.buttonSubtract.addActionListener(e -> inputText.setText(inputText.getText() + "-"));
        this.buttonMultiply.addActionListener(e -> inputText.setText(inputText.getText() + "*"));
        this.buttonDivision.addActionListener(e -> inputText.setText(inputText.getText() + "/"));


        // Equals to calculate the answer
        this.buttonEquals.addActionListener(e -> {

            calculation = inputText.getText();
            toCalculateList = new ArrayList<>(ConvertToArraylist.asList(calculation));
            answer = OrderOfCalculation.calculate(toCalculateList);

            outputText.setText(answer);
        });     // End of buttonEquals action listener


        // Event handler for other buttons
        this.buttonClear.addActionListener(e -> {
            inputText.setText("");
            outputText.setText("");
        });     // End of buttonClear action listener

        this.buttonComma.addActionListener(e -> inputText.setText(inputText.getText() + ","));
        this.openBracket.addActionListener(e -> inputText.setText(inputText.getText() + "("));
        this.closeBracket.addActionListener(e -> inputText.setText(inputText.getText() + ")"));

        // Input field event handler
        this.inputText.addActionListener(e -> buttonEquals.doClick());

        this.inputText.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {}

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == 127) {
                    buttonClear.doClick();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {}
        });

    }

}
