package sistemaacademico;

public class Professor extends Pessoa {

    private String registro;   
    private String disciplinas;
    

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getRegistro() {
        return (registro);
    }

    public void setDisciplinas1(String disciplinas) {
        this.disciplinas = disciplinas;
    }

    public String getDisciplinas() {
        return (disciplinas);
    }

	
}