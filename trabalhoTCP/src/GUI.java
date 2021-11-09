import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import org.jfugue.Player;

public class GUI extends JFrame implements ActionListener {

	JButton botaoTocarEntrada;
	JButton botaoCarregarArquivo;
	JTextArea textArea;
	JScrollPane scrollPane;
	Player player;

	GUI() {
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		this.add(panel);

		JLabel label = new JLabel("Digite uma entrada abaixo:");
		panel.add(label);
		label.setBounds(100, 100, 30, 30);
		label.setFont(new Font("Consolas", Font.PLAIN, 20));

		textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setSize(448, 64);
		textArea.setFont(new Font("Consolas", Font.PLAIN, 32));
		textArea.setForeground(new Color(0x00FF00));
		textArea.setBackground(Color.black);
		textArea.setCaretColor(Color.white);
		textArea.setText("Aaa9EDd Ef!FfGuDEe;BC Ec,ACBbbF");

		scrollPane = new JScrollPane(textArea);
		panel.add(scrollPane);

		botaoTocarEntrada = new JButton("Tocar");
		panel.add(botaoTocarEntrada);
		botaoTocarEntrada.addActionListener(this);

		this.setTitle("songfy");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setSize(512, 400);
		this.setVisible(true);

		player = new Player();
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		if (evento.getSource() == botaoTocarEntrada) {
			String valorEntrada = textArea.getText();
			System.out.println("valor eh: " + valorEntrada);

			caractere objCaractere = new caractere();
			objCaractere.tocarEntrada(valorEntrada, player);
		}
	}
}