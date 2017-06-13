package br.univel;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;

public class PainelAluno extends JFrame {

	private JPanel contentPane;
	protected JTextField txfId;
	protected JTextField txfNome;
	protected JTextField txfTelefone;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	protected JButton btnNovo;
	protected JButton btnSalvar;
	protected JButton btnExcluir;
	public Object table;
	public Object labelAlerta;

	/**
	 * Launch the application.


	/**
	 * Create the frame.
	 */
	public PainelAluno() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel TxfId = new JLabel("Id");
		GridBagConstraints gbc_TxfId = new GridBagConstraints();
		gbc_TxfId.anchor = GridBagConstraints.EAST;
		gbc_TxfId.insets = new Insets(0, 0, 5, 5);
		gbc_TxfId.gridx = 0;
		gbc_TxfId.gridy = 0;
		contentPane.add(TxfId, gbc_TxfId);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 2;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 0;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel TxfNome = new JLabel("Nome");
		GridBagConstraints gbc_TxfNome = new GridBagConstraints();
		gbc_TxfNome.anchor = GridBagConstraints.EAST;
		gbc_TxfNome.insets = new Insets(0, 0, 5, 5);
		gbc_TxfNome.gridx = 0;
		gbc_TxfNome.gridy = 1;
		contentPane.add(TxfNome, gbc_TxfNome);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.gridwidth = 7;
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 1;
		contentPane.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JLabel TxfTelefone = new JLabel("Telefone");
		GridBagConstraints gbc_TxfTelefone = new GridBagConstraints();
		gbc_TxfTelefone.anchor = GridBagConstraints.EAST;
		gbc_TxfTelefone.insets = new Insets(0, 0, 5, 5);
		gbc_TxfTelefone.gridx = 0;
		gbc_TxfTelefone.gridy = 2;
		contentPane.add(TxfTelefone, gbc_TxfTelefone);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.gridwidth = 4;
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 2;
		contentPane.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		btnNovo = new JButton("Novo");
		GridBagConstraints gbc_btnNovo = new GridBagConstraints();
		gbc_btnNovo.insets = new Insets(0, 0, 0, 5);
		gbc_btnNovo.gridx = 6;
		gbc_btnNovo.gridy = 4;
		contentPane.add(btnNovo, gbc_btnNovo);
		
		btnSalvar = new JButton("Salvar");
		GridBagConstraints gbc_btnSalvar = new GridBagConstraints();
		gbc_btnSalvar.insets = new Insets(0, 0, 0, 5);
		gbc_btnSalvar.gridx = 7;
		gbc_btnSalvar.gridy = 4;
		contentPane.add(btnSalvar, gbc_btnSalvar);
		
		btnExcluir = new JButton("Excluir");
		GridBagConstraints gbc_btnExcluir = new GridBagConstraints();
		gbc_btnExcluir.gridx = 8;
		gbc_btnExcluir.gridy = 4;
		contentPane.add(btnExcluir, gbc_btnExcluir);
	}

}
