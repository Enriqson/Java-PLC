abstract class Livro{
  protected String titulo;
  protected String autor;

  public abstract String getDescricao();

  public String getTitulo(){
    return this.titulo;
  }

  
  public String getAutor(){
    return this.autor;
  }

  public void setAutor(String autor){
    this.autor = autor;
  }

  public void setTitulo(String titulo){
    this.titulo = titulo;
  }

}

class LivroLivraria extends Livro{
  private double preco;
  private int qtd;

  public LivroLivraria(String titulo, String autor,int qtd, double preco){
    this.titulo = titulo;
    this.autor =autor;
    this.qtd = qtd;
    this.preco = preco;
  }

  public void setQtd(int q){
    this.qtd = q;
  }

  public int getQtd(){
    return this.qtd;
  }

  public void setPreco(int p){
    this.preco = p;
  }

  public double getPreco(){
    return this.preco;
  }

  public boolean disponivel(){
    //queria usar !!qtd mas java n deixa :(
    return this.qtd!=0;
  }

  public void vender(){
    if(this.disponivel()) {
      System.out.println("Vendendo "+this.titulo + " de "+this.autor+" por "+String.valueOf(this.preco)+".\n");
      this.qtd--;
    }
    else System.out.println("Não temos mais estoque!\n");
  }

  public String getDescricao(){
    return "Título: "+this.titulo + "\nAutor: "+this.autor+"\nPreco: "+String.valueOf(this.preco)+"\nQuantidade: "+String.valueOf(this.qtd)+"\n";
  }
}

class LivroBiblioteca extends Livro{
  private int qtdTotal;
  private int qtdEmprestada;

  public LivroBiblioteca(String titulo, String autor,int qtdTotal){
    this.titulo = titulo;
    this.autor =autor;
    this.qtdTotal = qtdTotal;
    this.qtdEmprestada=0;
  }

  public void setQtdTotal(int q){
    this.qtdTotal = q;
  }

  public int getQtdTotal(){
    return this.qtdTotal;
  }

  public boolean disponivel(){
    //queria usar !!qtd mas java n deixa :(
    return (this.qtdTotal-this.qtdEmprestada)!=0;
  }

  public void emprestar(){
    if(this.disponivel()) {
      System.out.println("Emprestando "+this.titulo + " de "+this.autor+".\n");
      this.qtdEmprestada++;
    }
    else System.out.println("Não é mais possível emprestar!\n");
    
  }

  public void devolver(){
    this.qtdEmprestada--;
  }

  public String getDescricao(){
    return "Título: "+this.titulo + "\nAutor: "+this.autor+"\nQuantidade total: "+String.valueOf(this.qtdTotal)+"\nQuantidade emprestada: "+String.valueOf(this.qtdEmprestada)+"\n";
  }
}
public class Q1 {
  public static void main(String[] args) {
    LivroBiblioteca scft = new LivroBiblioteca("Statistical Consequences of Fat Tails", "Nassim Nicholas Taleb", 2);
    System.out.println(scft.getDescricao());
    scft.emprestar();
    scft.emprestar();
    scft.emprestar();

    LivroLivraria dao = new LivroLivraria("The Dao of Capital", "Mark Spitznagel", 2, 137.99);
    System.out.println(dao.getDescricao());
    dao.vender();
    dao.vender();
    dao.vender();
  }
}
