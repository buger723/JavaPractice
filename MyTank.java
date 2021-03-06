import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyTank {
	public static void main(String[]args) {
		MyFrame dd = new MyFrame();
	}
}

@SuppressWarnings("serial")
class MyFrame extends JFrame{
	
	MyPanel panel = null ;
	public MyFrame(){
		panel = new MyPanel();
		this.setTitle("Tank War!");
		this.setSize(300, 400);
		this.add(panel);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
class Tanks{
	
	//横坐标
	public int x = 100 ;
	public int dir =0;
	public int speed=1;
	//坦克的纵坐标
	public int y =100;
	public Tanks(int x,int y){
		this.x =x ;
		this.y =y ;
	}
	public void setDir(int dir) {
		this.dir = dir ;
	}
	
	public int getDir() {
		return this.dir;
	}
	public int getX() {
		return this.x ;
	}
	public void setX(int x) {
		this.x = x ;
	}
	public int getY() {
		return this.y ;
	}
	public void setY(int y) {
		this.y = y ;
	}
	public void moveUp() {
		y-=speed;
	}
	public void moveDown() {
		y+=speed;
	}
	public void moveRight() {
		x+=speed;
	}
	public void moveLeft() {
		x-=speed;
	}
	
}
class Hero extends Tanks{
	
	//继承父类
	public Hero(int x, int y) {
		super(x,y);
	}
}

@SuppressWarnings("serial")
class MyPanel extends JPanel implements KeyListener{
	
	//重写paint 函数
	Hero hero = null;

	public MyPanel() {
		hero= new Hero(10,10);
	}
	
	public void paint(Graphics g) {
		//初始化坦克
		super.paint(g);
		g.fillRect(0,0,400,300);
//		画出我的坦克
		this.drawTank(hero.getX(),hero.getY(),this.hero.getDir(), g, 0);
	}
	
	//画出坦克的函数
	public void drawTank(int x,int y,int dir,Graphics g,int type) {
		//判断坦克类型
		switch(type){
			case 0:
				g.setColor(Color.cyan);
				break;
			case 1:
				g.setColor(Color.yellow);
				break;
		}
		//判断坦克方向
			switch(dir) {
			case 0:
				g.setColor(Color.cyan);
				g.fill3DRect(hero.getX(),hero.getY(), 5,30, false);
				g.fill3DRect(hero.getX()+15,hero.getY(),5,30,false);
				g.fill3DRect(hero.getX()+5,hero.getY()+5,10,20,false);
				g.setColor(Color.BLACK);
				g.fillOval(hero.getX()+4, hero.getY()+7, 10, 10);
				g.setColor(Color.RED);
				g.fill3DRect(hero.getX()+9,hero.getY(),2, 12, false);
			case 1:
				g.setColor(Color.cyan);
				g.fill3DRect(hero.getX(),hero.getY(), 5,30, false);
				g.fill3DRect(hero.getX()+15,hero.getY(),5,30,false);
				g.fill3DRect(hero.getX()+5,hero.getY()+5,10,20,false);
				g.setColor(Color.BLACK);
				g.fillOval(hero.getX()+4, hero.getY()+7, 10, 10);
				g.setColor(Color.RED);
				g.fill3DRect(hero.getX()+9,hero.getY(),2, 12, false);
				break;
			case 2:

				g.setColor(Color.cyan);
				g.fill3DRect(hero.getX(),hero.getY(), 5,30, false);
				g.fill3DRect(hero.getX()+15,hero.getY(),5,30,false);
				g.fill3DRect(hero.getX()+5,hero.getY()+5,10,20,false);
				g.setColor(Color.BLACK);
				g.fillOval(hero.getX()+4, hero.getY()+7, 10, 10);
				g.setColor(Color.RED);
				g.fill3DRect(hero.getX()+9,hero.getY(),2, 12, false);
				break;
			case 3:
				g.setColor(Color.cyan);
				g.fill3DRect(hero.getX(),hero.getY(), 5,30, false);
				g.fill3DRect(hero.getX()+15,hero.getY(),5,30,false);
				g.fill3DRect(hero.getX()+5,hero.getY()+5,10,20,false);
				g.setColor(Color.BLACK);
				g.fillOval(hero.getX()+4, hero.getY()+7, 10, 10);
				g.setColor(Color.RED);
				g.fill3DRect(hero.getX()+9,hero.getY(),2, 12, false);
				break;
			}
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub


	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		//0 向上  1 向右  2向下 3向左
		if(e.getKeyCode()==KeyEvent.VK_W) {
			this.hero.setDir(0);
			this.hero.moveUp();
	}
	if(e.getKeyCode()==KeyEvent.VK_D) {
		this.hero.setDir(1);
		this.hero.moveRight();
	}
	if(e.getKeyCode()==KeyEvent.VK_S) {
		this.hero.setDir(2);
		this.hero.moveDown();
	}
	if(e.getKeyCode()==KeyEvent.VK_A) {
		this.hero.setDir(3);
		this.hero.moveLeft();
	
	}
	repaint();
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}