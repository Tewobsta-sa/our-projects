package Calculator;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class calculator2 implements ActionListener {
    JFrame frame;
    JPanel panel;
    TextField textField1 ;
    TextField textField2 ;
    TextField textField3 ;
    JLabel label1;
    JLabel label2;
    JLabel label3;
    JLabel label4;
    JComboBox<String> comboBox;
    JButton clrButton;
    JButton calcButton;

    double num1=0, num2=0, res=0;
    String operation;

    calculator2(){
        frame = new JFrame("Calculator");
        frame.setSize(400,600);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);

        Font myfont = new Font("Ink Free",Font.BOLD, 15);

        textField1 = new TextField();
        textField1.setFont(myfont);
        textField1.setBounds(80,50, 250,20);
        label1 = new JLabel("Number 1:");
        label1.setFont(myfont);
        label1.setBounds(10,50,70,20);


        textField2 = new TextField();
        textField2.setFont(myfont);
        textField2.setBounds(80,90, 250,20);
        label2 = new JLabel("Number 2:");
        label2.setFont(myfont);
        label2.setBounds(10,90,70,20);

        textField3 = new TextField();
        textField3.setFont(myfont);
        textField3.setBounds(80,130, 250,20);
        label3 = new JLabel("Result:");
        label3.setFont(myfont);
        label3.setBounds(25,130,50,20);

        label4 = new JLabel("Operation:");
        label4.setFont(myfont);
        label4.setBounds(80, 190, 150,20);
        comboBox = new JComboBox<>();
        comboBox.addItem("+");
        comboBox.addItem("-");
        comboBox.addItem("*");
        comboBox.addItem("/");
        comboBox.setBounds(170, 190,80,20);
        comboBox.setFont(comboBox.getFont().deriveFont(Font.PLAIN, 20f));

        clrButton = new JButton("Clear");
        clrButton.setFont(myfont);
        clrButton.setBounds(70,450,100,40);
        clrButton.addActionListener(this);

        calcButton = new JButton("Calculate");
        calcButton.setFont(myfont);
        calcButton.setBounds(200,450,100,40);
        calcButton.addActionListener(this);



        frame.add(label1);
        frame.add(textField1);
        frame.add(label2);
        frame.add(textField2);
        frame.add(label3);
        frame.add(textField3);
        frame.add(label4);
        frame.add(comboBox);
        frame.add(clrButton);
        frame.add(calcButton);

        frame.setVisible(true);


    }

    public static void main(String[] args){
        calculator2 calc = new calculator2();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==calcButton){
            num1= Double.parseDouble(textField1.getText());
            num2= Double.parseDouble(textField2.getText());

            operation = (String) comboBox.getSelectedItem();
            switch(operation){
                case "+":
                    res= num1 + num2;
                    break;
                case "-":
                    res= num1 - num2;
                    break;
                case "*" :
                    res= num1 * num2;
                    break;
                case "/" :
                    res= num1 / num2;
                    break;
            }
            textField3.setText(String.valueOf(res));

        }
        else if(e.getSource()==clrButton){
            textField1.setText("");
            textField2.setText("");
            textField3.setText("");
        }
    }
}
