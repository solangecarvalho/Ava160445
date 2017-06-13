package br.univel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

public class CadastrarAluno extends AbstractTableModel {

	private List<Aluno> lista;
	
	public CadastrarAluno() {
		this((List<Aluno>)null);
		
		for (int i = 0; i < 10; i++) {
			Aluno a = new Aluno();
			a.setId(i + 1);
			a.setNome("Contato " + (i+1));
			a.setTelefone("(45)9987-290" + i);
			this.lista.add(a);
		}		
	}
	
	public void ContatoModel(List<Aluno> _lista) {
		if (_lista == null) {
			this.lista = new ArrayList<>();
		} else {
			this.lista = _lista;
		}
	}
	
	
	public CadastrarAluno(List<Aluno> list) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getColumnCount() {		
		return 3;
	}

	@Override
	public int getRowCount() {		
		return lista.size();
	}
	
	@Override
	public String getColumnName(int column) {
		switch (column) {
		case 0:
			return "Id";
		case 1:
			return "Nome";
		case 2:
			return "Telefone";
		}
		return super.getColumnName(column);
	}

	

	@Override
	public Object getValueAt(int row, int column) {
		
		Aluno a = this.lista.get(row);
		
		switch (column) {
		case 0:
			return a.getId();
		case 1:
			return a.getNome();
		case 2:
			return a.getTelefone();
		}
		throw new RuntimeException("Coluna " + column +
				" solicitada, não existe.");
	}
	
	public void adicionar(Aluno a) {
		this.lista.add(a);

		// Dispara um evento para a JTable
		// atualizar sua estrutura/tela.
		super.fireTableDataChanged();
	}

	public Aluno getContato(int idx) {
		return lista.get(idx);
	}

	public void remover(Aluno contatoSelecionado) {
		this.lista.remove(contatoSelecionado);
		super.fireTableDataChanged();
	}
	}

