package sistemaacademico;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Sistemaacademico {

	List<Aluno> alunos = new ArrayList<Aluno>();
	List<Professor> professores = new ArrayList<Professor>();

//*********************************
	public void cadastrarAluno(Aluno aluno) {
		aluno.setNome(JOptionPane.showInputDialog("Insira o nome do aluno: "));
		aluno.setMatricula(JOptionPane.showInputDialog("Insira a matrícula do aluno: "));
		aluno.setCurso(JOptionPane.showInputDialog("Insira o curso do aluno: "));
		aluno.setEndereco(JOptionPane.showInputDialog("Insira o endereço do aluno: "));
		aluno.setSexo(JOptionPane.showInputDialog("Insira o sexo do aluno: "));
		aluno.setTelefone(JOptionPane.showInputDialog("Insira o telefone do aluno: "));

		alunos.add(aluno);

	}

	public void pesquisarAluno() {
		String matricula;

		matricula = JOptionPane.showInputDialog("Insira a matrícula do aluno a ser pesquisado: ");

		Aluno aluno = null;

		for (Aluno al : alunos) {
			if (al.getMatricula().equals(matricula)) {
				aluno = al;
			}
		}

		if (aluno != null) {
			JOptionPane.showMessageDialog(null,
					"Aluno consta no sistema!\nNome: " + aluno.getNome() + "\nEndereço: " + aluno.getEndereco()
							+ "\nCurso: " + aluno.getCurso() + "\nSexo: " + aluno.getSexo() + "\nTelefone: "
							+ aluno.getTelefone());
		} else {

			JOptionPane.showMessageDialog(null, "Aluno não encontrado!", "Aviso", JOptionPane.ERROR_MESSAGE);

		}
	}

	// ***************************************
	public void cadastrarProfessor(Professor professor) {
		professor.setNome(JOptionPane.showInputDialog("Insira o nome do Porfessor: "));
		professor.setRegistro(JOptionPane.showInputDialog("Insira a matrícula do Professor: "));
		professor.setSexo(JOptionPane.showInputDialog("Insira o curso do Professor: "));
		professor.setEndereco(JOptionPane.showInputDialog("Insira o endereço do Professor: "));
		professor.setSexo(JOptionPane.showInputDialog("Insira o sexo do Professor: "));
		professor.setTelefone(JOptionPane.showInputDialog("Insira o telefone do Professor: "));

		professores.add(professor);

	}

	public void pesquisarProfessor() {
		String registro;

		registro = JOptionPane.showInputDialog("Insira o registro do Professor a ser pesquisado: ");

		Professor professor = null;

		for (Professor pr : professores) {
			if (pr.getRegistro().equals(registro)) {
				professor = pr;
			}
		}

		if (professor != null) {
			JOptionPane.showMessageDialog(null,
					"Professor consta no sistema!\nNome: " + professor.getNome() + "\nEndereço: "
							+ professor.getEndereco() + "\nCurso: " + professor.getDisciplinasMinistradas() + "\nSexo: "
							+ professor.getSexo() + "\nTelefone: " + professor.getTelefone());
		} else {
			JOptionPane.showMessageDialog(null, "Professor não encontrado!", "Aviso", JOptionPane.ERROR_MESSAGE);
		}

	}

	public void excluirAluno() {
		String matricula;

		matricula = JOptionPane.showInputDialog("Insira a matrícula do aluno a ser deletado: ");

		Aluno aluno = null;

		for (Aluno al : alunos) {
			if (al.getMatricula().equals(matricula)) {
				aluno = al;
			}
		}

		if (aluno != null) {
			this.alunos.remove(aluno);

		}
	}

	public void excluirProfessor() {
        String registro;
    	
        registro = JOptionPane.showInputDialog("Insira o registro do Professor a ser pesquisado: ");

        Professor professor = null;
        
        for (Professor pr : professores) {
        	if (pr.getRegistro().equals(registro)) {
        		professor = pr;
        	}
        
        if (professor != null) {
        this.professores.remove(professor);
        	
            } 
        }
        }

	public static void main(String[] args) {
		int OpcaoMenu;
		Sistemaacademico SA = new Sistemaacademico();
		do {

			OpcaoMenu = Integer.parseInt(JOptionPane.showInputDialog(null,
					"Digite uma Opção: \n\n" + "Opção 1: Cadastrar Aluno \n" + "Opção 2: Cadastrar Professor \n"
							+ "Opção 3: Pesquisar Aluno \n" + "Opção 4: Pesquisar Professor \n"
							+ "Opção 5: Excluir Aluno \n" + "Opção 6: Excluir Professor \n" + "Opção 7: SAIR \n\n",
					"Menu de Opções", JOptionPane.PLAIN_MESSAGE));

			switch (OpcaoMenu) {
			case 1:

				SA.cadastrarAluno(new Aluno());

				break;
			case 2:
				SA.cadastrarProfessor(new Professor());

				break;
			case 3:
				SA.pesquisarAluno();

				break;
			case 4:
				SA.pesquisarProfessor();

				break;
			case 5:
				SA.excluirAluno();
				break;
			case 6:
				SA.excluirProfessor();
				break;
			case 7:

				break;

			default:
				JOptionPane.showMessageDialog(null, "Opção Inválida", "Aviso", JOptionPane.ERROR_MESSAGE);
				break;
			}
		} while (OpcaoMenu != 7);
	}
}