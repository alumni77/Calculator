import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class TestComp{
    TestComp(){
        JFrame frame = new JFrame("常用组件");
        //获取内容窗口
        Container ctpn = frame.getContentPane();
        //设置布局管理器为边框布局管理器
        ctpn.setLayout(new BorderLayout());

        JPanel panel1 = new JPanel();
        //标签
        JLabel label1 = new JLabel("姓名：");
        //文本域
        JTextField tfield = new JTextField("",10);
        panel1.add(label1);
        panel1.add(tfield);

        //单选按钮
        JPanel panel2 = new JPanel(new GridLayout(1,2));
        //加边框
        panel2.setBorder(BorderFactory.createEtchedBorder());
        JRadioButton r1 = new JRadioButton("男");
        JRadioButton r2 = new JRadioButton("女",true);
        //r2.setSelected(true);
        panel2.add(r1);
        panel2.add(r2);
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        //复选框
        JPanel panel3 = new JPanel(new GridLayout(1,3));
        //带标题边框
        panel3.setBorder(BorderFactory.createTitledBorder("你喜欢的语言？喜欢的打勾"));
        JCheckBox c1 = new JCheckBox("JAVA");
        JCheckBox c2 = new JCheckBox("C++");
        JCheckBox c3 = new JCheckBox("Delphi");
        panel3.add(c1);
        panel3.add(c2);
        panel3.add(c3);

        JPanel panel4 = new JPanel(new GridLayout(2,1));
        panel4.add(panel2);
        panel4.add(panel3);

        //按钮
        JPanel panel5 = new JPanel();
        JButton bt = new JButton("提交信息");
        bt.setBackground(Color.pink);
        bt.setForeground(Color.blue);
        panel5.add(bt);

        ctpn.add(panel1,BorderLayout.NORTH);
        ctpn.add(panel4,BorderLayout.CENTER);
        ctpn.add(panel5,BorderLayout.SOUTH);
        //关闭窗口
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        frame.setSize(300,200);
        frame.setLocation(100,100);
        frame.setVisible(true);
    }

    public static void main(String[] args){
        TestComp testcomp = new TestComp();
    }
}