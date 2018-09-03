package br.edu.unifacear.Dao;

import java.util.List;

public interface DaoImplemets<T> {
	
	public void inserir(T t);
	
	public void excluir(T t);

	public void update(T t);
	
	public List<T> listarTodos();

	public T obterPorId(int id);
}
