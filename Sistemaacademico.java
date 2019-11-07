package sistemaacademico;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.List;

public class Sistemaacademico {

	List<Aluno> alunos = new ArrayList<Aluno>();
	List<Professor> professores = new ArrayList<Professor>();
	List<Turma> turmas = new ArrayList<Turma>();

	public void cadastrarTurma(Turma turma) {
		turma.setNome_turma(JOptionPane.showInputDialog("Insira o nome da turma: "));
		turma.setSala(JOptionPane.showInputDialog("Insira o numero da sala "));
		turma.setBloco(JOptionPane.showInputDialog("Insira o bloco: "));

		turmas.add(turma);

	}

	public void pesquisarTurma() {
		String matricula;

		matricula = JOptionPane.showInputDialog("Insira a matr�cula do aluno relacinado a Turma:  ");

		Turma turma = null;

		for (Turma tu : turmas) {
			if (tu.getMateria().equals(matricula)) {
				turma = tu;
			}
		}

		if (turma != null) {
			JOptionPane.showMessageDialog(null,
					"Turma consta no sistema!\nNome da turma: " + turma.getNome_turma() + "\nSala: "
							+ turma.getEndereco() + "\nCurso: " + turma.getSala() + "\nTelefone: " + turma.getBloco());
		} else {

			JOptionPane.showMessageDialog(null, "Turma n�o encontrada!", "Aviso", JOptionPane.ERROR_MESSAGE);

		}
	}

//*********************************

	public void cadastrarAluno(Aluno aluno) {
		aluno.setNome(JOptionPane.showInputDialog("Insira o nome do aluno: "));
		aluno.setMatricula(JOptionPane.showInputDialog("Insira a matr�cula do aluno: "));
		aluno.setCurso(JOptionPane.showInputDialog("Insira o curso do aluno: "));
		aluno.setEndereco(JOptionPane.showInputDialog("Insira o endere�o do aluno: "));
		aluno.setSexo(JOptionPane.showInputDialog("Insira o sexo do aluno: "));
		aluno.setTelefone(JOptionPane.showInputDialog("Insira o telefone do aluno: "));

		alunos.add(aluno);

	}

	public void pesquisarAluno() {
		String matricula;

		matricula = JOptionPane.showInputDialog("Insira a matr�cula do aluno a ser pesquisado: ");

		Aluno aluno = null;

		for (Aluno al : alunos) {
			if (al.getMatricula().equals(matricula)) {
				aluno = al;
			}
		}

		if (aluno != null) {
			JOptionPane.showMessageDialog(null,
					"Aluno consta no sistema!\nNome: " + aluno.getNome() + "\nEndere�o: " + aluno.getEndereco()
							+ "\nCurso: " + aluno.getCurso() + "\nSexo: " + aluno.getSexo() + "\nTelefone: "
							+ aluno.getTelefone());
		} else {

			JOptionPane.showMessageDialog(null, "Aluno n�o encontrado!", "Aviso", JOptionPane.ERROR_MESSAGE);

		}
	}

	// ***************************************
	public void cadastrarProfessor(Professor professor) {
		professor.setNome(JOptionPane.showInputDialog("Insira o nome do Porfessor: "));
		professor.setRegistro(JOptionPane.showInputDialog("Insira a matr�cula do Professor: "));
		professor.setSexo(JOptionPane.showInputDialog("Insira o curso do Professor: "));
		professor.setEndereco(JOptionPane.showInputDialog("Insira o endere�o do Professor: "));
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
					"Professor consta no sistema!\nNome: " + professor.getNome() + "\nEndere�o: "
							+ professor.getEndereco() + "\nCurso: " + professor.getDisciplinasMinistradas() + "\nSexo: "
							+ professor.getSexo() + "\nTelefone: " + professor.getTelefone());
		} else {
			JOptionPane.showMessageDialog(null, "Professor n�o encontrado!", "Aviso", JOptionPane.ERROR_MESSAGE);
		}

	}

	public void excluirAluno() {
		String matricula;

		matricula = JOptionPane.showInputDialog("Insira a matr�cula do aluno a ser deletado: ");

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

	public void excluirTurma() {
            String materia;
        	
            materia = JOptionPane.showInputDialog("Insira o nome da Turma a ser pesquisado: ");

            Turma turma = null;
            
            for (Turma tu : turmas) {
            	if (tu.getNome_turma().equals(materia)) {
            		turma = tu;
            	}
            
            if (turma != null) {
            this.turmas.remove(turma);
            	
                } 
            }
	}

	public static void main(String[] args) {
		int OpcaoMenu;
		Sistemaacademico SA = new Sistemaacademico();
		
		 int tentativa = 1;
	        while (tentativa < 0){
	           
	       String usuario = JOptionPane.showInputDialog(null,"Digite o Usu�rio: ");
	        int senha = Integer.parseInt(JOptionPane.showInputDialog("Digite a Senha: "));
	       
	        if ("daniel".equals(usuario) && senha == Integer.valueOf(1234)) {
	            JOptionPane.showMessageDialog(null, "Seja Bem vindo !! Voc� est� Conectado !!");
	            
	            break;
	           
	        } else if {
	            JOptionPane.showMessageDialog(null, "Usu�rio ou Senha Incorreto ! Tente Novamente !");
	            
	} else {
	           
		
		do {

			OpcaoMenu = Integer.parseInt(JOptionPane.showInputDialog(null,
					"Digite uma Op��o: \n\n" + "Op��o 1: Cadastrar Aluno \n" + "Op��o 2: Cadastrar Professor \n"
							+ "Op��o 3: Cadastrar Turma \n" + "Op��o 4: Pesquisar Professor \n" + "Op��o 5: Pesquisar Aluno  \n"
							+ "Op��o 6: Pesquisar Turma \n" + "Op��o 7: Excluir Aluno \n" + "Op��o 8: Excluir Professor \n" +"Op��o 9: Excluir Turma \n" + 
							  "Op��o 10:Sair \n\n",
					          "Menu de Op��es", JOptionPane.PLAIN_MESSAGE));

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
				SA.cadastrarTurma(new Turma());
				
				break;
			
			case 6:
				SA.pesquisarTurma();
				
				break;
				
			case 7:
				SA.excluirAluno();
				break;
			case 8:
				SA.excluirProfessor();
				break;
			
			case 9:
				SA.excluirTurma();
				break;	


			default:
				JOptionPane.showMessageDialog(null, "Op��o Inv�lida", "Aviso", JOptionPane.ERROR_MESSAGE);
				break;
			}
		} while (OpcaoMenu != 10);
	}
}