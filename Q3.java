enum GenerosEnum {
  cg("cisgero"),tg("transgenero"),gf("genero fluido"),nb("nao-binário"); 
  public String gen;
  GenerosEnum(String s){
    this.gen = s;
  }

  public String getValue(){
    return gen;
  }
}


class Pessoa{
  protected int idade;
  protected String nome;
  protected String escolaridade;
  protected GenerosEnum genero;
  protected String orientacao;
  protected String sexo;

  public void setIdade(int i){
    this.idade=i;
  }
  public void setNome(String i){
    this.nome=i;
  }
  public void setEscolaridade(String i){
    this.escolaridade=i;
  }

  public Pessoa(){

  }

  public Pessoa(int i, String nome, String escolaridade,GenerosEnum genero, String orientacao, String sexo){
    this.idade =i;
    this.nome =nome;
    this.escolaridade = escolaridade;
    this.genero =genero;
    this.orientacao =orientacao;
    this.sexo =sexo;
  }

  public int getIdade(){
    return this.idade;
  }
  public String getNome(){
    return this.nome;
  }
  public String getGenero(){
    return this.genero.getValue();
  }
  public String getEscolaridade(){
    return this.escolaridade;
  }
  public String getSexo(){
    return this.sexo;
  }

  public String getOrientacao(){
    return this.orientacao;
  }

  public void dormir(){
    System.out.println("Dormindo");
  }
  public void cagar(){
    System.out.println("cagar");
  }
  public void comer(){
    System.out.println("comer");
  }
  public void estudar(){
    System.out.println("estudar");
  }
  public void viver(){
    System.out.println("Error 404");
  }
  public void sobreviver(){
    System.out.println("sobreviver");
  }
  public void trabalhar(){
    System.out.println("trabalhar");
  }
}

public class Q3 {
  public static void main(String[] args) {
    Pessoa p1 = new Pessoa();
    Pessoa p2 = new Pessoa(12,"Joao","37.8°C",GenerosEnum.tg,"norte","masculino");

    p1.setIdade(3);
    
    System.out.println(p2.getGenero());

    System.out.println(p2.getOrientacao());
    
    System.out.println(p1.getIdade());

    p1.dormir();
    p2.viver();
  }
}
