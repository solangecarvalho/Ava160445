package br.univel;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

import javax.swing.AbstractButton;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

public class TelaPrincipal extends PainelAluno {
	
	
	private Aluno alunoSelecionado;
	
	
	public TelaPrincipal() {
		super();
					
		configurarBotoes1();		
		
	}

	private void configurarBotoes1() {
		super.btnNovo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Novo");
				novo();
			}
		});
		super.btnSalvar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Salvar");
				salvar();
			}
		});
		super.btnExcluir.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Excluir");
				excluir();
			}
		});
	}


	protected void excluir() {
		this.alunoSelecionado.remover(this.alunoSelecionado);
		
	}


	protected void salvar() {
		if (alunoSelecionado == null) {
			Aluno a = new Aluno();
			
			String strId = txfId.getText().trim();
			String strNome = txfNome.getText().trim();
			String strTelefone = txfTelefone.getText().trim();
			
			int intId = Integer.parseInt(strId);
			
			a.setId(intId);
			a.setNome(strNome);
			a.setTelefone(strTelefone);
			
			this.alunoSelecionado.adicionar(a);
			
		
			
		} else {
			
			String strId = txfId.getText().trim();
			String strNome = txfNome.getText().trim();
			String strTelefone = txfTelefone.getText().trim();
			
			int intId = Integer.parseInt(strId);
			
			this.alunoSelecionado.setId(intId);
			this.alunoSelecionado.setNome(strNome);
			this.alunoSelecionado.setTelefone(strTelefone);
				
			
		}
		
	}


	protected void novo() {
		this.alunoSelecionado = null;
		
		
	}





	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		try {
//			UIManager.setLookAndFeel(
//			        UIManager.getSystemLookAndFeelClassName());
			
		    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
		        if ("Nimbus".equals(info.getName())) {
		            UIManager.setLookAndFeel(info.getClassName());
		            break;
		        }
		    }
			
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e1) {
			e1.printStackTrace();
		}
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
