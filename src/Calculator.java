import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings({"all"})
public class Calculator extends JFrame implements ActionListener, WindowListener {
    private JTextField displayField;         //计算结果显示区
    private boolean start;           //判断是否为数字的开始

    private JRadioButton hexadecimal;
    private JRadioButton decimal;
    private JRadioButton octal;
    private JRadioButton binary;
    private JButton button_decimal;
    private JButton button_octal;
    private JButton button_binary;
    private JButton button_hexadecimal;
    private JButton button_CE;
    private JButton button_equal;
    private JButton button_0;
    private JButton button_1;
    private JButton button_2;
    private JButton button_3;
    private JButton button_4;
    private JButton button_5;
    private JButton button_6;
    private JButton button_7;
    private JButton button_8;
    private JButton button_9;
    private JButton button_A;
    private JButton button_B;
    private JButton button_C;
    private JButton button_D;
    private JButton button_E;
    private JButton button_F;

    public Calculator() {
        super("计算器");
        this.setLocation(350, 150);
        this.setSize(500, 350);
        this.setResizable(true);
        this.setLayout(new GridLayout(6, 1));
        this.addmyMenu();
        displayField = new JTextField(30);
        this.add(displayField);
        displayField.setEditable(true);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 4, 4, 4));

        JPanel panel0 = new JPanel();
        panel0.setLayout(new GridLayout(1, 3));
        hexadecimal = new JRadioButton("十六进制", true);
        decimal = new JRadioButton("十进制");
        octal = new JRadioButton("八进制");
        binary = new JRadioButton("二进制");
        this.add(panel0);
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(hexadecimal);
        buttonGroup.add(decimal);
        buttonGroup.add(binary);
        buttonGroup.add(octal);

        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayout(1, 6, 4, 4));
        this.add(panel1);
        button_0 = new JButton("0");
        button_1 = new JButton("1");
        button_2 = new JButton("2");
        button_3 = new JButton("3");
        button_4 = new JButton("4");
        button_5 = new JButton("5");

        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayout(1, 6, 4, 4));
        this.add(panel2);
        button_6 = new JButton("6");
        button_7 = new JButton("7");
        button_8 = new JButton("8");
        button_9 = new JButton("9");
        button_A = new JButton("A");
        button_B = new JButton("B");

        JPanel panel3 = new JPanel();
        panel3.setLayout(new GridLayout(1, 6, 4, 4));
        this.add(panel3);
        button_C = new JButton("C");
        button_D = new JButton("D");
        button_E = new JButton("E");
        button_F = new JButton("F");
        button_equal = new JButton("=");
        button_CE = new JButton("CE");


        panel0.add(hexadecimal);
        panel0.add(decimal);
        panel0.add(octal);
        panel0.add(binary);
        panel1.add(button_0);
        panel1.add(button_1);
        panel1.add(button_2);
        panel1.add(button_3);
        panel1.add(button_4);
        panel1.add(button_5);
        panel2.add(button_6);
        panel2.add(button_7);
        panel2.add(button_8);
        panel2.add(button_9);
        panel2.add(button_A);
        panel2.add(button_B);
        panel3.add(button_C);
        panel3.add(button_D);
        panel3.add(button_E);
        panel3.add(button_F);
        panel3.add(button_CE);
        panel3.add(button_equal);

        //注册监听器
        button_0.addActionListener(this);
        button_1.addActionListener(this);
        button_2.addActionListener(this);
        button_3.addActionListener(this);
        button_4.addActionListener(this);
        button_5.addActionListener(this);
        button_6.addActionListener(this);
        button_7.addActionListener(this);
        button_8.addActionListener(this);
        button_9.addActionListener(this);
        button_A.addActionListener(this);
        button_B.addActionListener(this);
        button_C.addActionListener(this);
        button_D.addActionListener(this);
        button_E.addActionListener(this);
        button_F.addActionListener(this);
        button_CE.addActionListener(this);
        button_equal.addActionListener(this);
        decimal.addActionListener(this);
        octal.addActionListener(this);
        binary.addActionListener(this);
        hexadecimal.addActionListener(this);

        // this.addWindowListener(new WinClose());
        this.setVisible(true);
    }

    private void addmyMenu() {
        //定义菜单栏
        JMenuBar menubar = new JMenuBar();
        this.add(menubar);
        JMenu choice = new JMenu("选项");
        menubar.add(choice);
        JMenuItem choice_exit = new JMenuItem("退出");
        choice.add(choice_exit);
        choice_exit.addActionListener(this);

        JMenu help = new JMenu("帮助");
        menubar.add(help);
        JMenuItem help_about = new JMenuItem("关于");
        help.add(help_about);
        help_about.addActionListener(this);

        JMenu convert = new JMenu("进制转换");
        menubar.add(convert);
        JMenuItem binary = new JMenuItem("转二进制");
        convert.add(binary);
        JMenuItem octal = new JMenuItem("转八进制");
        convert.add(octal);
        JMenuItem hexadecimal = new JMenuItem("转十六进制");
        convert.add(hexadecimal);
        convert.addActionListener(this);
        binary.addActionListener(this);
        octal.addActionListener(this);
        hexadecimal.addActionListener(this);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
    }


    @Override
    public void actionPerformed(ActionEvent e) {//对按钮单击事件的处理
        if (e.getSource().equals(button_0) || e.getSource().equals(button_1) || e.getSource().equals(button_2) ||
                e.getSource().equals(button_3) || e.getSource().equals(button_4) || e.getSource().equals(button_5) ||
                e.getSource().equals(button_6) || e.getSource().equals(button_7) || e.getSource().equals(button_8) ||
                e.getSource().equals(button_9) || e.getSource().equals(button_A) || e.getSource().equals(button_B) ||
                e.getSource().equals(button_C) || e.getSource().equals(button_D) || e.getSource().equals(button_D) ||
                e.getSource().equals(button_E) || e.getSource().equals(button_F)) {
            String input = e.getActionCommand();
            displayField.setText(displayField.getText() + input);
            displayField.setHorizontalAlignment((JTextField.RIGHT));

        }
        //进制转换
        try {
            if (e.getActionCommand().equals("转二进制")) {
                //转二进制
                if (hasEnglishLetters(displayField.getText())) {
                    long n = Long.parseLong(displayField.getText(), 16);
                    String binary = Long.toBinaryString(n);
                    displayField.setText(Long.toBinaryString(n));
                } else {
                    long n = Long.parseLong(displayField.getText());
                    displayField.setText(Long.toBinaryString(n));
                }
            } else if (e.getActionCommand().equals("转八进制")) {
                //转八进制
                if (hasEnglishLetters(displayField.getText())) {
                    long n = Long.parseLong(displayField.getText(), 16);
                    String octal = Long.toOctalString(n);
                    displayField.setText(Long.toOctalString(n));
                } else {
                    long n = Long.parseLong(displayField.getText());
                    displayField.setText(Long.toOctalString(n));
                }
            } else if (e.getActionCommand().equals("转十六进制")) {
                //转十六进制
                long n = Long.parseLong(displayField.getText());
                displayField.setText(Long.toHexString(n));
            }
        } catch (NumberFormatException x) {
            String msg = "数值超出范围";
            String title = "警告！";
            int type = JOptionPane.INFORMATION_MESSAGE;
            JOptionPane.showMessageDialog(this, msg, title, type);
        }

        if (e.getActionCommand().equals("退出")) {
            System.exit(0);
        } else if (e.getActionCommand().equals("关于")) {
            int type = JOptionPane.INFORMATION_MESSAGE;
            String title = "关于";
            String msg = "3210421126" + "\n" + "      衷杰";
            JOptionPane.showMessageDialog(this, msg, title, type);
        } else if (e.getActionCommand().equals("CE")) {
            displayField.setText("0");
            start = true;
        }
        if(e.getActionCommand().equals("十六进制")){
            button_0.setEnabled(true);
            button_1.setEnabled(true);
            button_2.setEnabled(true);
            button_3.setEnabled(true);
            button_4.setEnabled(true);
            button_5.setEnabled(true);
            button_6.setEnabled(true);
            button_7.setEnabled(true);
            button_8.setEnabled(true);
            button_9.setEnabled(true);
            button_A.setEnabled(true);
            button_B.setEnabled(true);
            button_C.setEnabled(true);
            button_D.setEnabled(true);
            button_E.setEnabled(true);
            button_F.setEnabled(true);
        }else if(e.getActionCommand().equals("十进制")){
            button_0.setEnabled(true);
            button_1.setEnabled(true);
            button_2.setEnabled(true);
            button_3.setEnabled(true);
            button_4.setEnabled(true);
            button_5.setEnabled(true);
            button_6.setEnabled(true);
            button_7.setEnabled(true);
            button_8.setEnabled(true);
            button_9.setEnabled(true);
            button_A.setEnabled(false);
            button_B.setEnabled(false);
            button_C.setEnabled(false);
            button_D.setEnabled(false);
            button_E.setEnabled(false);
            button_F.setEnabled(false);
        }
        else if(e.getActionCommand().equals("八进制")){
            button_0.setEnabled(true);
            button_1.setEnabled(true);
            button_2.setEnabled(true);
            button_3.setEnabled(true);
            button_4.setEnabled(true);
            button_5.setEnabled(true);
            button_6.setEnabled(true);
            button_7.setEnabled(true);
            button_8.setEnabled(false);
            button_9.setEnabled(false);
            button_A.setEnabled(false);
            button_B.setEnabled(false);
            button_C.setEnabled(false);
            button_D.setEnabled(false);
            button_E.setEnabled(false);
            button_F.setEnabled(false);
        }else if(e.getActionCommand().equals("二进制")){
            button_0.setEnabled(true);
            button_1.setEnabled(true);
            button_2.setEnabled(false);
            button_3.setEnabled(false);
            button_4.setEnabled(false);
            button_5.setEnabled(false);
            button_6.setEnabled(false);
            button_7.setEnabled(false);
            button_8.setEnabled(false);
            button_9.setEnabled(false);
            button_A.setEnabled(false);
            button_B.setEnabled(false);
            button_C.setEnabled(false);
            button_D.setEnabled(false);
            button_E.setEnabled(false);
            button_F.setEnabled(false);
        }
    }

    //判断是否为十六进制的数
    public static boolean hasEnglishLetters(String text) {
        return text.matches(".*[a-zA-Z]+.*");
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}