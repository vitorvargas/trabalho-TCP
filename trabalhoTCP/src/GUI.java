import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
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
    JFrame frame;

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
		textAreaEntrada.setText("Aaa9EDd Ef!FfGuDEe;BC\nEcDBE,AEAa");

		JScrollPane scrollPane = new JScrollPane(textAreaEntrada);
		panel.add(scrollPane);

		botaoTocarEntrada = new JButton("Tocar");
		panel.add(botaoTocarEntrada);
		botaoTocarEntrada.addActionListener(this);

        botaoCarregarArquivo = new JButton("Carregar Arquivo");
		panel.add(botaoCarregarArquivo);
        botaoCarregarArquivo.addActionListener(this);

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
        else if (evento.getSource() == botaoCarregarArquivo){
            try {
                JFileChooser fileChooser = new JFileChooser();
                int result = fileChooser.showOpenDialog(frame);
                if (result == JFileChooser.APPROVE_OPTION) {
                    showJanela02(fileChooser.getSelectedFile(), frame);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }
	}

    public void showJanela02(File file, JFrame pai) throws FileNotFoundException, IOException {
        JDialog janela02 = new JDialog(pai, "Titulo 2");
        JTextArea jtxtA = new JTextArea();

        BufferedReader input = new BufferedReader(new InputStreamReader(
                new FileInputStream(file)));
        jtxtA.read(input, "READING FILE :-)");

        janela02.add(jtxtA);
        janela02.pack();
        janela02.setModal(true);
        janela02.setVisible(true);
    }


}