import javax.swing.JOptionPane;

public class Principal {
    
    public static void main(String [] args){
        Aluno aluno= new Aluno();
        aluno.nome="João";
        aluno.idade=25;
        aluno.setTel(1140028922);
        aluno.setVlmens(10000.00);
        JOptionPane.showMessageDialog(null, "nome: " +aluno.nome+ "\nIdade: " +aluno.idade+ "\nTelefone" +aluno.getTel()+ "\nValor Mensal: " +aluno.getVlmens());
    };
    
}
