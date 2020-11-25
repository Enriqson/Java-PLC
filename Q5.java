interface Colecao{
  public void inserir(Pessoa p);

  public int tamanhoColecaoNaoNull();
}

abstract class Pessoa{
  protected String nome;
  protected String cpf;

  public String getNome(){
    return this.nome;
  }

  public void SetNome(String nome){
    this.nome=nome;
  }
}

class Professor extends Pessoa{
  protected String area;
  protected String formacao;

  public Professor(String nome, String area, String formacao){
    this.formacao = formacao;
    this.area = area;
    this.nome = nome;
  }

  public String getArea(){
    return this.area;
  }
  public String getFormacao(){
    return this.formacao;
  }
  public void setArea(String area){
    this.area = area;
  }
  public void setFormacao(String formacao){
    this.formacao = formacao;
  }
}

class Aluno extends Pessoa{

  protected String matricula;
  protected String curso;

  public Aluno(String nome, String mat, String curso){
    this.matricula = mat;
    this.curso = curso;
    this.nome = nome;
  }
  public String getMatricula(){
    return this.matricula;
  }
  public String getCurso(){
    return this.curso;
  }
  public void setMatricula(String matricula){
    this.matricula = matricula;
  }
  public void setCurso(String curso){
    this.curso = curso;
  }
}

class ColecaoVetor{
  protected Pessoa[] dados;
  protected int tam;
  public ColecaoVetor(){
    this.dados = new Pessoa[5];
    this.tam=0;
  }

  int tamanhoColecaoNaoNull(){
    return 5-tam;
  }
  public void printarPessoas(){
    int i;
    for(i=0;i<this.tam;i++){
      System.out.println(this.dados[i].getNome());
    }
    System.out.println("");
  }
  public void inserir(Pessoa p){
    this.dados[this.tam] = p;
    this.tam++;
  }
}

class Principal{
  public static void main(){
    ColecaoVetor vetor = new ColecaoVetor();
    vetor.inserir(new Aluno("Joao","1234","Engenharia"));
    System.out.println(vetor.tamanhoColecaoNaoNull());
    vetor.printarPessoas();
    vetor.inserir(new Aluno("Jorge","12345","Trader Elite"));
    System.out.println(vetor.tamanhoColecaoNaoNull());
    vetor.printarPessoas();
    vetor.inserir(new Professor("Ports Trader","Enrolação","Nenhuma"));
    System.out.println(vetor.tamanhoColecaoNaoNull());
    vetor.printarPessoas();
  }
}

public class Q5 {
  public static void main(String[] args) {
    Principal.main();
  }
}
