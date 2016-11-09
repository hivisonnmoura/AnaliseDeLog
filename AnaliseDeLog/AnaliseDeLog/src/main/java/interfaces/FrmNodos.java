package interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
<<<<<<< HEAD:AnaliseDeLog/AnaliseDeLog/src/main/java/interfaces/FrmNodos.java
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.Dimension;

=======
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import java.awt.Color;
>>>>>>> 292c26661d5de45fcd5a6b6e1b1754a76e2d563e:AnaliseDeLog/src/main/java/interfaces/FrmNodos.java
import javax.swing.border.TitledBorder;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;

import objetodevalor.OVNoProcesso;
import servicos.ServicoFachada;

import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
<<<<<<< HEAD:AnaliseDeLog/AnaliseDeLog/src/main/java/interfaces/FrmNodos.java
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
=======
>>>>>>> 292c26661d5de45fcd5a6b6e1b1754a76e2d563e:AnaliseDeLog/src/main/java/interfaces/FrmNodos.java

public class FrmNodos extends JFrame {

	private JPanel contentPane;
	private JTable tableNodosCriticos;
	private JTextField textField;
	private JTextField textField_1;
	private DadoTableModel tableModel;
<<<<<<< HEAD:AnaliseDeLog/AnaliseDeLog/src/main/java/interfaces/FrmNodos.java
	
	ServicoFachada servicoFachada = new ServicoFachada();
=======
>>>>>>> 292c26661d5de45fcd5a6b6e1b1754a76e2d563e:AnaliseDeLog/src/main/java/interfaces/FrmNodos.java

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmNodos frame = new FrmNodos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public FrmNodos() {
<<<<<<< HEAD:AnaliseDeLog/AnaliseDeLog/src/main/java/interfaces/FrmNodos.java
		setResizable(false);
		setTitle("Logz - Resumo de pontos cr\u00EDticos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 605, 439);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		setLocationRelativeTo(null);
=======
		setTitle("Logz - Resumo de pontos cr\u00EDticos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 460, 369);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
>>>>>>> 292c26661d5de45fcd5a6b6e1b1754a76e2d563e:AnaliseDeLog/src/main/java/interfaces/FrmNodos.java

		JPanel panelPlanilha = new JPanel();
		panelPlanilha.setLayout(null);
		panelPlanilha.setBorder(new TitledBorder(null, "Relatório dos pontos críticos", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));
<<<<<<< HEAD:AnaliseDeLog/AnaliseDeLog/src/main/java/interfaces/FrmNodos.java
		panelPlanilha.setBounds(55, 144, 477, 207);
		contentPane.add(panelPlanilha);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 25, 457, 170);
		panelPlanilha.add(scrollPane);




		tableNodosCriticos = new JTable();
		scrollPane.setViewportView(tableNodosCriticos);
		tableNodosCriticos.setModel(new DadoTableModel(OVNoProcesso.criarCom(servicoFachada.inserirDados())));
		tableNodosCriticos.setBorder(new LineBorder(Color.LIGHT_GRAY));
		tableNodosCriticos.setColumnSelectionAllowed(true);
		tableNodosCriticos.setCellSelectionEnabled(true);
		

		JButton btnPrximo = new JButton("Pr\u00F3ximo");
		btnPrximo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnPrximo.setBounds(472, 377, 89, 23);
		contentPane.add(btnPrximo);

		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 11));
		comboBox.setToolTipText("");
		comboBox.setMaximumRowCount(3);
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(302, 24, 112, 18);
		contentPane.add(comboBox);

		JLabel lblSelecioneOHorrio = new JLabel("Seleciona a data:");
		lblSelecioneOHorrio.setBounds(193, 26, 112, 14);
=======
		panelPlanilha.setBounds(60, 129, 394, 181);
		contentPane.add(panelPlanilha);

		tableNodosCriticos = new JTable();
		tableNodosCriticos.setModel(new DadoTableModel(OVNoProcesso.criarCom(ServicoFachada.getNodos())));
		tableNodosCriticos.setBorder(new LineBorder(Color.LIGHT_GRAY));
		tableNodosCriticos.setColumnSelectionAllowed(true);
		tableNodosCriticos.setCellSelectionEnabled(true);
		tableNodosCriticos.setBounds(10, 37, 374, 112);
		panelPlanilha.add(tableNodosCriticos);
		

		JButton btnPrximo = new JButton("Pr\u00F3ximo");
		btnPrximo.setBounds(365, 318, 89, 23);
		contentPane.add(btnPrximo);

		JComboBox comboBox = new JComboBox();
		comboBox.setMaximumRowCount(3);
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(221, 4, 94, 20);
		contentPane.add(comboBox);

		JLabel lblSelecioneOHorrio = new JLabel("Seleciona a data:");
		lblSelecioneOHorrio.setBounds(109, 6, 206, 14);
>>>>>>> 292c26661d5de45fcd5a6b6e1b1754a76e2d563e:AnaliseDeLog/src/main/java/interfaces/FrmNodos.java
		contentPane.add(lblSelecioneOHorrio);

		JPanel panel = new JPanel();
		panel.setBorder(
				new TitledBorder(null, "Filtro de horário", TitledBorder.LEADING, TitledBorder.TOP, null, null));
<<<<<<< HEAD:AnaliseDeLog/AnaliseDeLog/src/main/java/interfaces/FrmNodos.java
		panel.setBounds(183, 51, 231, 82);
=======
		panel.setBounds(142, 34, 231, 82);
>>>>>>> 292c26661d5de45fcd5a6b6e1b1754a76e2d563e:AnaliseDeLog/src/main/java/interfaces/FrmNodos.java
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblHoraInicial = new JLabel("Hora inicial: ");
<<<<<<< HEAD:AnaliseDeLog/AnaliseDeLog/src/main/java/interfaces/FrmNodos.java
		lblHoraInicial.setBounds(10, 23, 89, 16);
		panel.add(lblHoraInicial);

		JLabel lblHoraFinal = new JLabel("Hora final: ");
		lblHoraFinal.setBounds(10, 55, 89, 16);
=======
		lblHoraInicial.setBounds(6, 23, 89, 16);
		panel.add(lblHoraInicial);

		JLabel lblHoraFinal = new JLabel("Hora final: ");
		lblHoraFinal.setBounds(6, 56, 89, 16);
>>>>>>> 292c26661d5de45fcd5a6b6e1b1754a76e2d563e:AnaliseDeLog/src/main/java/interfaces/FrmNodos.java
		panel.add(lblHoraFinal);

		textField = new JTextField();
		textField.setBounds(95, 18, 130, 26);
		panel.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(95, 50, 130, 26);
		panel.add(textField_1);
		textField_1.setColumns(10);
	}
}
