package sistemaacademico;

public class ValidLogin {

    public static void main(String[] args) {
       
        int tentativa = 0;
        while (tentativa < 5){
           
       
       
        String usuario = JOptionPane.showInputDialog(null,"Digite o Usu�rio: ");
        int senha = Integer.parseInt(JOptionPane.showInputDialog("Digite a Senha: "));
       
        if ("daniel".equals(usuario) && senha == Integer.valueOf(1234)){
            JOptionPane.showMessageDialog(null, "Seja Bem vindo !! Voc� est� Conectado !!");
            break;
           
        } else {
            JOptionPane.showMessageDialog(null, "Usu�rio ou Senha Incorreto ! Tente Novamente !");
            tentativa++;
}
        }      
    }    
}