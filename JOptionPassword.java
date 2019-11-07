package sistemaacademico;

public class ValidLogin {

    public static void main(String[] args) {
       
        int tentativa = 0;
        while (tentativa < 5){
           
       
       
        String usuario = JOptionPane.showInputDialog(null,"Digite o Usuário: ");
        int senha = Integer.parseInt(JOptionPane.showInputDialog("Digite a Senha: "));
       
        if ("daniel".equals(usuario) && senha == Integer.valueOf(1234)){
            JOptionPane.showMessageDialog(null, "Seja Bem vindo !! Você está Conectado !!");
            break;
           
        } else {
            JOptionPane.showMessageDialog(null, "Usuário ou Senha Incorreto ! Tente Novamente !");
            tentativa++;
}
        }      
    }    
}