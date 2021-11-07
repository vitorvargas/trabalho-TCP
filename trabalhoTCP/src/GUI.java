import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import org.jfugue.Player;

public class GUI extends JFrame implements ActionListener {

	JButton button;
	JTextField textField;
	String textoBotao;
	Player player;

	GUI() {
		player = new Player();

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());

		button = new JButton("Enviar");
		button.addActionListener(this);

		textField = new JTextField();
		textField.setPreferredSize(new Dimension(250, 40));
		textField.setFont(new Font("Consolas", Font.PLAIN, 35));
		textField.setForeground(new Color(0x00FF00));
		textField.setBackground(Color.black);
		textField.setCaretColor(Color.white);
		textField.setText("Aaa9EDd Ef!FfGuDEe;BC Ec,ACBbbF");

		this.add(textField);
		this.add(button);

		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			String valorEntrada = textField.getText();
			System.out.println("valor eh: " + valorEntrada);

			caractere objCaractere = new caractere();
			objCaractere.tocarEntrada(valorEntrada, player);
		}
	}
}