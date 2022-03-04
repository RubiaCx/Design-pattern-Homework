package Factory.Utils;

import javax.swing.*;
import java.awt.*;

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
        this.setSize(600,600);                  //大小
        this.setLocationRelativeTo(null);                   //居中
        this.setVisible(true);                              //显示界面
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭界面就退出程序
        g=this.getGraphics();                   //获得画布
        g.setColor(Color.BLUE);
    }

}
