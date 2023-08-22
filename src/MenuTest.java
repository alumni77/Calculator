import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuTest extends JFrame implements ActionListener{
    JMenuItem cutItem,copyItem,pasteItem,indexItem,aboutItem;
    JLabel label;
    public MenuTest(){
        //定义菜单栏
        JMenuBar menuBar = new JMenuBar();
        //菜单栏添加到JFrame
        this.setJMenuBar(menuBar);

        //定义Edit菜单
        JMenu editMenu = new JMenu("Edit");
        //菜单添加到菜单栏
        menuBar.add(editMenu);
        //定义菜单项
        cutItem = new JMenuItem("Cut");
        copyItem = new JMenuItem("Copy");
        pasteItem = new JMenuItem("Paste");
        //菜单项注册监听器
        cutItem.addActionListener(this);
        copyItem.addActionListener(this);
        pasteItem.addActionListener(this);
        //菜单项添加到菜单
        editMenu.add(cutItem);
        editMenu.add(copyItem);
        editMenu.add(pasteItem);
        editMenu.addSeparator();

        //定义子菜单
        JMenu optionMenu = new JMenu("Option");

        //定义JCheckBoxMenuItem
        JCheckBoxMenuItem readonlyItem = new JCheckBoxMenuItem("Read-only");
        //JCheckBoxMenuItem添加到子菜单
        optionMenu.add(readonlyItem);
        optionMenu.addSeparator();

        //定义按钮组
        ButtonGroup group = new ButtonGroup();
        //定义JRadioButtonMenuItem
        JRadioButtonMenuItem insertItem	= new JRadioButtonMenuItem("Insert");
        //设置选中
        insertItem.setSelected(true);
        JRadioButtonMenuItem overtypeItem = new JRadioButtonMenuItem("Overtype");
        //JRadioButtonMenuItem添加到按钮组
        group.add(insertItem);
        group.add(overtypeItem);
        //JRadioButtonMenuItem添加到子菜单
        optionMenu.add(insertItem);
        optionMenu.add(overtypeItem);
        //子菜单添加到菜单
        editMenu.add(optionMenu);

        //定义Help菜单
        JMenu helpMenu = new JMenu("Help");
        //设置快捷键
        helpMenu.setMnemonic('H');
        menuBar.add(helpMenu);
        indexItem = new JMenuItem("Index", 'I');
        aboutItem = new JMenuItem("About", 'A');
        indexItem.addActionListener(this);
        aboutItem.addActionListener(this);
        helpMenu.add(indexItem);
        helpMenu.add(aboutItem);

        //定义标签，添加到内容窗格
        label = new JLabel("",JLabel.CENTER);
        this.getContentPane().add(label);

        this.setTitle("Menu");
        this.setSize(300,200);
        this.setLocation(300,300);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent event){
        label.setText(event.getActionCommand() + "  selected");

		String msg = "xxxxxyyyyyzzzzz版权所有！";
		String title = "Message Dlg";
		int type = JOptionPane.INFORMATION_MESSAGE;
		if (event.getActionCommand().equals("About"))
			JOptionPane.showMessageDialog(this,msg,title,type);

    }

    public static void main(String[] args){
        new MenuTest();
    }
}