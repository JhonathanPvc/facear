package br.edu.unifacear.busines;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.edu.unifacear.Dao.DaoImplemets;
import br.edu.unifacear.Dao.MontadoraDao;
import br.edu.unifacear.model.Montadora;

public class MontadoraBusines implements DaoImplemets<Montadora> {
	MontadoraDao dao = new MontadoraDao();
	
	@Override
	public void inserir(Montadora m) {
		if(m.getDescricao().trim().equals("")) {
			JOptionPane.showMessageDialog(null, "A DESCRIÇÃO está vazia!");
		}else {
			dao.inserir(m);
		}
	}

	@Override
	public void excluir(Montadora m) {
		if((dao.obterPorId(m.getId())!=null)) {
			dao.excluir(m);
		}else {
			JOptionPane.showMessageDialog(null, "Não existe registros com o codigo: " + m.getId() + "!");
		}
	}

	@Override
	public void update(Montadora m) {
		if(m.getDescricao().trim().equals("")) {
			JOptionPane.showMessageDialog(null, "A DESCRIÇÃO está vazia!");
		}else {
			if((dao.obterPorId(m.getId())!=null)) {
				dao.update(m);
			}else {
				JOptionPane.showMessageDialog(null, "Não existe registros com o codigo: " + m.getId() + "!");
			}
		}
	}

	@Override
	public List<Montadora> listarTodos() {
		List<Montadora> listMontadora = new ArrayList<Montadora>();
		Montadora m = null;
		
		if(dao.listarTodos().size() > 0) {
			for (int i = 0; i < dao.listarTodos().size(); i++) {
				m = new Montadora(dao.listarTodos().get(i).getId(), 
								  dao.listarTodos().get(i).getStatus(), 
								  dao.listarTodos().get(i).getDescricao());
				
				listMontadora.add(m);
				
				int status = listMontadora.get(i).getStatus();
				System.out.println("Id: " + listMontadora.get(i).getId());
				System.out.println("Descrição: " + listMontadora.get(i).getDescricao());
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
		
		return listMontadora;
	}

	@Override
	public Montadora obterPorId(int id) {
		if(Integer.toString(id) != null) {
			if(dao.obterPorId(id).getId() > 0) {
				int status = dao.obterPorId(id).getStatus(); 
				
				System.out.println("Id: " + dao.obterPorId(id).getId());
				System.out.println("Descricao: " + dao.obterPorId(id).getDescricao());
				
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
