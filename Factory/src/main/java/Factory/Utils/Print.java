package Factory.Utils;

import java.awt.Graphics;
import javax.swing.JFrame;

public class Print extends JFrame{
    // 继承JFrame类，使用GUI方法
    @Override
    public void paint(Graphics g){
        super.repaint();
    }
    private Graphics g;
    public Graphics getGraph(){
        return this.g;
    }
    public Print(){
        this.setTitle("画布");
        this.setSize(300,300);              //大小
        this.setLocationRelativeTo(null);               //居中
        this.setVisible(true);                              //显示界面
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭界面就退出程序
        g=this.getGraphics();                   //获得画布
    }

}
