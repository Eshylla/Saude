package EM.service;

import java.io.Serializable;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import EM.Pessoa;
import EM.PessoaDAO;
import br.edu.ifpb.esperanca.daw2.util.TransacionalCdi;

@ApplicationScoped
public class PessoaService implements Serializable, Service<Pessoa> {

	@Inject
	private PessoaDAO pessoaDAO;

	@Override
	@TransacionalCdi
	public void save(Pessoa pessoa) {
		pessoa.setPassword(hash(pessoa.getPassword()));
		pessoaDAO.save(pessoa);
	}

	private String hash(String password) {
		try {
			MessageDigest md;
			md = MessageDigest.getInstance("SHA-256");
			md.update(password.getBytes("UTF-8"));
			byte[] digest = md.digest();
			String output = Base64.getEncoder().encodeToString(digest);
			return output;
		} catch (Exception e) {
			return password;
		}
	}

	@Override
	@TransacionalCdi
	public void update(Pessoa pessoa) {
		pessoaDAO.update(pessoa);
	}

	@Override
	@TransacionalCdi
	public void remove(Pessoa pessoa) {
		pessoaDAO.remove(pessoa);
	}


	@Override
	public Pessoa getByID(long pessoaId) {
		return pessoaDAO.getByID(pessoaId);
	}

	
	@Override
	public List<Pessoa> getAll() {
		return pessoaDAO.getAll();
	}

}