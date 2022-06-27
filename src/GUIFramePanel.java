import javax.swing.*;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.awt.*;

class GUIFramePanel extends GUIButtons {

    public JPanel framePanel;
    public JTextField inputText;
    public JTextPane outputText;
    public JLabel screenLabel;

    GUIFramePanel() {

        // Text area for output text
        outputText = new JTextPane();
        outputText.setEnabled(false);
        outputText.setDisabledTextColor(Color.BLACK);
        outputText.setFont(new Font(null, Font.PLAIN, 28));
        outputText.setBounds(0, 40, 380, 40);
        outputText.setBackground(Color.lightGray);

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

        // Screen label where text is inputted
        screenLabel = new JLabel();
        screenLabel.setLayout(null);
        screenLabel.setBounds(0, 0, 380, 100);
        screenLabel.setBackground(Color.lightGray);
        screenLabel.add(inputText);
        screenLabel.add(outputText);


        framePanel = new JPanel();
        framePanel.setVisible(true);
        framePanel.setBackground(Color.BLACK);
        framePanel.setLayout(null);
        framePanel.setBounds(0, 0, 400, 520);
        framePanel.add(screenLabel);
        framePanel.add(panel);

    }
}
