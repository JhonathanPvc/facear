package br.edu.unifacear.busines;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.edu.unifacear.Dao.DaoImplemets;
import br.edu.unifacear.Dao.FormaPagamentoDao;
import br.edu.unifacear.model.FormaPagamento;

public class FormaPagamentoBusines implements DaoImplemets<FormaPagamento> {
	FormaPagamentoDao dao = new FormaPagamentoDao();
	
	@Override
	public void inserir(FormaPagamento f) {
		
		if(f.getDescricao().trim().equals("")) {
			JOptionPane.showMessageDialog(null, "A DESCRIÇÃO esta vazia!\n Insira uma DESCRIÇÃO para proseguir");
		}else if(!(f.getTaxa() != 0.00)) {
			JOptionPane.showMessageDialog(null, "A TAXA esta vazia!\n Insira uma TAXA para proseguir");
		}else {
			dao.inserir(f);
		}
	}

	@Override
	public void excluir(FormaPagamento f) {
		if(f.getId() == 0) {
			JOptionPane.showMessageDialog(null, "insira um Id válido para continuar!");
		}else{
			if((dao.obterPorId(f.getId())!=null)) {
				dao.excluir(f);
			}else {
				JOptionPane.showMessageDialog(null, "Não existe registros com o codigo: " + f.getId() + "!");
			}
		}
		
	}

	@Override
	public void update(FormaPagamento f) {
		if(f.getDescricao().trim().equals("")) {
			JOptionPane.showMessageDialog(null, "A DESCRIÇÃO esta vazia!\n Insira uma DESCRIÇÃO para proseguir");
		}else if(!(f.getTaxa() != 0.00)) {
			JOptionPane.showMessageDialog(null, "A TAXA esta vazia!\n Insira uma TAXA para proseguir");
		}else {
			if((dao.obterPorId(f.getId())!=null)) {
				dao.update(f);
			}else {
				JOptionPane.showMessageDialog(null, "Não existe registros com o codigo: " + f.getId() + "!");
			}
		}
	}

	@Override
	public List<FormaPagamento> listarTodos() {
		List<FormaPagamento> listFormaPagamento = new ArrayList<FormaPagamento>();
		FormaPagamento f = null;
		
		if(dao.listarTodos().size() > 0) {
			for (int i = 0; i < dao.listarTodos().size(); i++) {
				f = new FormaPagamento(dao.listarTodos().get(i).getId(), 
								       dao.listarTodos().get(i).getStatus(), 
								       dao.listarTodos().get(i).getTaxa(), 
								       dao.listarTodos().get(i).getDescricao());
				
				listFormaPagamento.add(f);
				
				int status = listFormaPagamento.get(i).getStatus();
				
				System.out.println("Id: " + listFormaPagamento.get(i).getId());
				System.out.println("Descricao: " + listFormaPagamento.get(i).getDescricao());
				System.out.println("Taxa: " + listFormaPagamento.get(i).getTaxa() + "%");
				if(status == 1) {
					System.out.println("Status: ATIVO");
				}else {
					System.out.println("Status: INATIVO");
				}
				System.out.println("====================================================================================================");
				
			}
			
		}else {
			JOptionPane.showMessageDialog(null, "Nenhum registro encontrado!");
		}
		
		return listFormaPagamento;
	}

	@Override
	public FormaPagamento obterPorId(int id) {
		if(Integer.toString(id) != null) {
			if(dao.obterPorId(id) != null) {
				int status = dao.obterPorId(id).getStatus(); 
				
				System.out.println("Id: " + dao.obterPorId(id).getId());
				System.out.println("Descricao: " + dao.obterPorId(id).getDescricao());
				System.out.println("Taxa: " + dao.obterPorId(id).getTaxa() + "%");
				
				if(status == 1) {
					System.out.println("Status: ATIVO");
				}else {
					System.out.println("Status: INATIVO");
				}
				System.out.println("====================================================================================================");
			}else{
				JOptionPane.showMessageDialog(null, "Nenhum registro encontrado!");
			}
		}else {
			JOptionPane.showMessageDialog(null, "Insira um codigo válido para pesquisar!");
		}
		return null;
	}

}
