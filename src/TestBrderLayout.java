import javax.swing.*;
import java.awt.*;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 测试边界布局
 * @author 28250
 *
 */
public class TestBrderLayout {

    public static void main(String[] args) {
        //创建窗口
        JFrame jf = new JFrame("边界布局");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(400,300);

        //创建面板
        JPanel panel = new JPanel(new BorderLayout());

        //创建按钮
        JPanel leftPanel = new JPanel(new GridLayout(1, 3));
        leftPanel.setBorder(BorderFactory.createEtchedBorder());
        JRadioButton decimal = new JRadioButton("十进制", true);
        JRadioButton octal = new JRadioButton("八进制");
        JRadioButton binary = new JRadioButton("二进制");
        leftPanel.add(decimal);
        leftPanel.add(octal);
        leftPanel.add(binary);
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(decimal);
        buttonGroup.add(octal);
        buttonGroup.add(binary);


        JPanel rightPanel = new JPanel(new GridLayout(1, 2));
        rightPanel.setBorder(BorderFactory.createEtchedBorder());
        JCheckBox lnv = new JCheckBox("lnv");
        JCheckBox hyp = new JCheckBox("Hyp");
        rightPanel.add(lnv);
        rightPanel.add(hyp);


        JButton btnNorth = new JButton("Btn_North");
        JButton btnSouth = new JButton("Btn_South");
        JButton btnWest = new JButton("Btn_West");
        JButton btnEast = new JButton("Btn_East");
        JButton btnCenter = new JButton("Btn_Center");

        //添加到指定位置
        panel.add(leftPanel,BorderLayout.WEST);
        panel.add(rightPanel,BorderLayout.CENTER);
        //panel.add(btnNorth, BorderLayout.NORTH);
        //panel.add(btnEast, BorderLayout.EAST);
        //panel.add(btnWest, BorderLayout.WEST);

        //将面板添加到窗口
        jf.setContentPane(panel);
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);

    }
}