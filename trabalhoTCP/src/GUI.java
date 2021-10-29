import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class GUI extends JFrame implements ActionListener{

	JButton button;
	JTextField textField;
   public String textobotao;
	
	GUI(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button = new JButton("Enviar");
		button.addActionListener(this);
		
		textField = new JTextField();
		textField.setPreferredSize(new Dimension(250,40));
		textField.setFont(new Font("Consolas",Font.PLAIN,35));
		textField.setForeground(new Color(0x00FF00));
		textField.setBackground(Color.black);
		textField.setCaretColor(Color.white);
		textField.setText("insira o texto");
		
		
		this.add(button);
		this.add(textField);
		this.pack();
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			System.out.println("Welcome "+ textField.getText());
            String valorcarac = textField.getText();
            caractere objcaractere= new caractere();
            valorcarac=objcaractere.receberEntrada(valorcarac);
			//button.setEnabled(false);
			//textField.setEditable(false);
            System.out.println("valor eh: " + valorcarac);
        objcaractere.validarCaractere(valorcarac);
		}
		
}
}