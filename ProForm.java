import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
import javax.swing.JButton; 
import javax.swing.JFrame; 
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class ProForm extends JFrame { 
	/**
	 * @author rodomod 27.09.2019
	 */
	
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bSum,bSub,bDiv,bMul,bSe,bEqals,bPtn,bBack,bOps,bSqrt,bPow;
	JTextField display;
	int i=0,k=10,SUM=0,SUB=0,MUL=0,DIV=0;
	String j,h;
	double a,b;
	Pro han=new Pro();
    public ProForm() {
    	super("java'26'");
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	getContentPane().setLayout(new FlowLayout());
    	
    	display=new JTextField(17);
    	display.setFont(new Font("Times New Roman", Font.PLAIN, 15));
    	display.setToolTipText("");
    	display.setHorizontalAlignment(SwingConstants.RIGHT);
    	b1=new JButton("1");
    	b2=new JButton("2");
    	b3=new JButton("3");
    	b4=new JButton("4");
    	b5=new JButton("5");
    	b6=new JButton("6");
    	b7=new JButton("7");
    	b8=new JButton("8");
    	b9=new JButton("9");
    	b0=new JButton("0");
    	bPtn=new JButton(".");
    	bSum=new JButton("+");
    	bSub=new JButton("-");
    	bMul=new JButton("*");
    	bDiv=new JButton("/");
    	bSe=new JButton("     CE     ");
    	bEqals=new JButton("                      =                      ");
    	bPtn=new JButton(".");
        bBack=new JButton("     C     ");bOps=new JButton("-/+");bSqrt=new JButton("sqrt");bPow=new JButton("pow^3");
    	display.setEditable(false);
    	getContentPane().add(display);
    	getContentPane().add(bSe);
    	getContentPane().add(bBack);
    	getContentPane().add(b1);
    	getContentPane().add(b2);
    	getContentPane().add(b3);
    	getContentPane().add(b4);
    	getContentPane().add(b5);
    	getContentPane().add(b6);
    	getContentPane().add(b7);
    	getContentPane().add(b8);
    	getContentPane().add(b9);
    	getContentPane().add(b0);
    	getContentPane().add(bPtn);
    	getContentPane().add(bEqals);
    	getContentPane().add(bSum);
    	getContentPane().add(bSub);
    	getContentPane().add(bDiv);
    	getContentPane().add(bMul);getContentPane().add(bOps);getContentPane().add(bSqrt);getContentPane().add(bPow);
    	bSe.addActionListener(han);
    	b1.addActionListener(han);
    	b2.addActionListener(han);
    	b3.addActionListener(han);
    	b4.addActionListener(han);
    	b5.addActionListener(han);
    	b6.addActionListener(han);
    	b7.addActionListener(han);
    	b8.addActionListener(han);
    	b9.addActionListener(han);
    	b0.addActionListener(han);
    	bPtn.addActionListener(han);
    	bBack.addActionListener(han);
    	bSum.addActionListener(han);
    	bEqals.addActionListener(han);
    	bSub.addActionListener(han);
    	bDiv.addActionListener(han);
    	bMul.addActionListener(han);bOps.addActionListener(han);bSqrt.addActionListener(han);bPow.addActionListener(han);
                       }

public class Pro implements ActionListener {
        @Override
	public void actionPerformed(ActionEvent e) {
			if(e.getSource()==bSe)  {    // CE ->" "
				display.setText("");i=0;}
			if(e.getSource()==bBack)  {  // back -1
			    String tmp=display.getText();
			    display.setText(tmp.substring(0,tmp.length()-1));i--;}
			if(e.getSource()==b1)  {
				display.setText(display.getText()+1);i++;}
			if(e.getSource()==b2)  {
				display.setText(display.getText()+2);i++;}
			if(e.getSource()==b3)  {
				display.setText(display.getText()+3);i++;}
			if(e.getSource()==b4)  {
				display.setText(display.getText()+4);i++;}
			if(e.getSource()==b5)  {
				display.setText(display.getText()+5);i++;}
			if(e.getSource()==b6)  {
				display.setText(display.getText()+6);i++;}
			if(e.getSource()==b7)  {
				display.setText(display.getText()+7);i++;}
			if(e.getSource()==b8)  {
				display.setText(display.getText()+8);i++;}
			if(e.getSource()==b9)  {
				display.setText(display.getText()+9);i++;}
			if(e.getSource()==b0)  {
				display.setText(display.getText()+0);i++;}
			if(e.getSource()==bPtn)  {  // " . "
				String ptn=display.getText();
			if(!ptn.contains("."))display.setText(display.getText()+".");}
			
			if(e.getSource()==bEqals)  { // "="
				h=display.getText();
				b=Double.parseDouble(h);
				a=Double.parseDouble(j);
				if(SUM==1)  {
					display.setText(a+b+"");SUM=0;a=0;b=0;h="";j="";}
				if(SUB==1)  {
					display.setText(a-b+"");SUB=0;a=0;b=0;h="";j="";}
				if(MUL==1)  {
					display.setText(a*b+"");MUL=0;a=0;b=0;h="";j="";}
				if(DIV==1)  {
					display.setText(a/b+"");DIV=0;a=0;b=0;h="";j="";}
			}
			if(e.getSource()==bSum)  {  // "+"
				j=display.getText();display.setText("");SUM++;}
			if(e.getSource()==bSub)  {  // "-"
				j=display.getText();display.setText("");SUB++;}
			if(e.getSource()==bMul)  {  // "*"
				j=display.getText();display.setText("");MUL++;}
			if(e.getSource()==bDiv)  {  // "/"
				j=display.getText();display.setText("");DIV++;}
		if(e.getSource()==bOps)  {     // "ops"
			double ops=Double.parseDouble(String.valueOf(display.getText()));
		ops*=(-1.0D);display.setText(String.valueOf(ops));}
		if(e.getSource()==bSqrt)   {     // "sqrt"
		double sm=Double.parseDouble(display.getText());
		double fm=Double.parseDouble(display.getText());
		String sq=display.getText();
		if(sq.indexOf("")==0)display.setText(Math.sqrt(sm*fm/sm)+"");}
		if(e.getSource()==bPow)  {       // "pow^3"
		double fy=Double.parseDouble(display.getText());
		String Pow=display.getText();
		if(Pow.indexOf("")==0){display.setText(Math.pow(fy,3)+"");}}
			
			}
    } 

public static void main(String[] args)  {  
        ProForm r=new ProForm();
		r.setVisible(true);
		r.setSize(207,277);
		r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		r.setResizable(false);
		r.setLocationRelativeTo(null);
	 } 
} 