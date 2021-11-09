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
	JTextArea textAreaEntrada;
	JTextArea textArea;
	JScrollPane scrollPane;
	Player player;

	GUI() {
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		this.add(panel);

		JLabel labelEntrada = new JLabel("Digite uma entrada abaixo:");
		labelEntrada.setBounds(100, 100, 30, 30);
		panel.add(labelEntrada);
		labelEntrada.setFont(new Font("Consolas", Font.PLAIN, 20));

		textAreaEntrada = new JTextArea();
		textAreaEntrada.setLineWrap(true);
		textAreaEntrada.setSize(448, 64);
		textAreaEntrada.setFont(new Font("Consolas", Font.PLAIN, 32));
		textAreaEntrada.setForeground(new Color(0x00FF00));
		textAreaEntrada.setBackground(Color.black);
		textAreaEntrada.setCaretColor(Color.white);
		textAreaEntrada.setText("Aaa9EDd Ef!FfGuDEe;BCEc,ACBbbF");

		JScrollPane scrollPane = new JScrollPane(textAreaEntrada);
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
			String valorEntrada = textAreaEntrada.getText();
			System.out.println("entrada eh: " + valorEntrada);

			entrada objCaractere = new entrada();
			objCaractere.tocarEntrada(valorEntrada, player);
		}
	}
}