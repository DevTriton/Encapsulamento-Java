import javax.swing.JOptionPane;

public class Principal {
    public static void main(String [] args){
        Funcionario funcionario= new Funcionario();
        funcionario.nome="xesperito";
        funcionario.registro=2323;
        funcionario.setSetor("Recursos humanos");
        funcionario.setCargo("documentador");
        funcionario.setSalario(5600.00);
        funcionario.setTelefone(40028922);
        funcionario.setFilial("belo horizonte");
        funcionario.setNFilhos(13);
        funcionario.setCidade("roma");
        
        JOptionPane.showMessageDialog(null, "nome: " +funcionario.nome+ "\nRegistro: " +funcionario.registro+ "\nsetor: " +funcionario.getSetor()+ "\nCargo: " +funcionario.getCargo()+ "\nSalario: " +funcionario.getSalario()+ "\nTelefone: " +funcionario.getTelefone()+ "\nFilial: " +funcionario.getFilial()+ "\nNumero de filho: " +funcionario.getNumFilhos()+ "\nCidade: " +funcionario.getCidade());
    }
}
