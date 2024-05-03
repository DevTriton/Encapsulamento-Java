public class Funcionario {
    public String nome;
    public int registro;
    private String setor;
    private String cargo;
    private double salario;
    private int telefone;
    private String filial;
    private int numfilhos;
    private String cidade;
    
    public void setSetor(String setorzin){
        this.setor = setorzin;
    }
    
    public void setCargo(String carginho){
        this.cargo = carginho;
    }
    
    public void setSalario(double salarinho){
        this.salario = salarinho;
    }
    
    public void setTelefone(int telefinho){
        this.telefone = telefinho;
    }
    
    public void setFilial(String filialzinha){
        this.filial = filialzinha;
    }
    
    public void setNFilhos(int filhinhos){
        this.numfilhos = filhinhos;
    }
    
    public void setCidade(String cidadezinha){
        this.cidade = cidadezinha;
    }
    
    public String getSetor(){
        return this.setor;
    }
    
    public String getCargo(){
        return this.cargo;
    }
    
    public double getSalario(){
        return this.salario;
    }
    
    public int getTelefone(){
        return this.telefone;
    }
    
    public String getFilial(){
        return this.filial;
    }
    
    public int getNumFilhos(){
        return this.numfilhos;
    }
    
    public String getCidade(){
        return this.cidade;
    }
}
