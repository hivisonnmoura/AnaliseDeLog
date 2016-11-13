package interfaces;

import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.border.TitledBorder;

import entidades.EntidadeThread;
import repositorios.RepositorioThread;
import servicos.ServicoFachada;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.TextArea;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.KeyAdapter;

public class FrmStack extends JFrame {

	RepositorioThread repositorioThread = new RepositorioThread();
	String stringStack;
	TextArea textArea = new TextArea();

	private JPanel contentPane;
	ServicoFachada servicoFachada = new ServicoFachada();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmStack frame = new FrmStack();

					frame.setVisible(true);
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public FrmStack() {
		setTitle("Logz - An\u00E1lise de stacks");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 946, 730);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblSelecioneAThread = new JLabel("Selecione a Thread desejada: ");
		lblSelecioneAThread.setBounds(375, 26, 256, 14);
		contentPane.add(lblSelecioneAThread);

		setLocationRelativeTo(null);

		JComboBox<Object> comboBox = new JComboBox<Object>(
				new DefaultComboBoxModel<Object>(servicoFachada.buscarTodosObjetosRepositorioThread().toArray()));
		comboBox.setRenderer(new DefaultListCellRenderer() {
			private static final long serialVersionUID = 1L;

			@Override
			public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected,
					boolean cellHasFocus) {
				super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
				if (value instanceof EntidadeThread) {
					EntidadeThread entidadeThread = (EntidadeThread) value;
					setText(entidadeThread.getCpu() + " - " + entidadeThread.getLwpid());
				}
				return this;
			}

		});

		comboBox.setSelectedIndex(-1);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				textArea.setText(
						String.join("\n", servicoFachada.direcionaStack((EntidadeThread) comboBox.getSelectedItem())));

			}
		});
		comboBox.setBounds(375, 41, 170, 20);
		contentPane.add(comboBox);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Descricao da Stack da Thread escolhida", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));
		panel.setBounds(4, 93, 916, 551);

		contentPane.add(panel);
		textArea.setBounds(10, 21, 896, 520);

		textArea.addKeyListener(new KeyAdapter() {

		});
		panel.setLayout(null);
		textArea.setText("Descri\u00E7\u00E3o da Stack");

		panel.add(textArea);

		JButton btnRetornar = new JButton("Retornar");
		btnRetornar.setBounds(10, 658, 89, 23);
		btnRetornar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				repositorioThread.delete();
				FrmNodos telaDois = new FrmNodos();
				telaDois.setVisible(true);
				setVisible(false);

			}
		});

		contentPane.add(btnRetornar);

		JButton btnNewButton = new JButton("Copiar");

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String descricaoStack = textArea.getText();

				Clipboard board = Toolkit.getDefaultToolkit().getSystemClipboard();
				ClipboardOwner selection = new StringSelection(textArea.getText());
				board.setContents((Transferable) selection, selection);

			}
		});
		btnNewButton.setBounds(428, 658, 89, 23);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Fechar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton_1.setBounds(831, 658, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}