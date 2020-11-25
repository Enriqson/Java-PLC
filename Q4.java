class Senha{
  protected String senhaStr;
  protected int senhaNum;

  public Senha(String str,int num){
    this.senhaStr = str;
    this.senhaNum = num;
  }

  public void setSenhaStr(String s){
    this.senhaStr = s;
  }

  public void setSenhaNum(int s){
    this.senhaNum = s;
  }

  public String getSenhaStr(){
    return this.senhaStr;
  }
  public int getSenhaNum(){
    return this.senhaNum;
  }
}

class Conta{
  protected int id;
  protected int ag;
  protected Senha s;

  public Conta(int id,int ag, String str, int num){
    this.id = id;
    this.ag = ag;
    this.s = new Senha(str,num);
  }

  public void setId(int id){
    this.id=id;
  }
  public void setAg(int ag){
    this.ag=ag;
  }
  public void setSenhaStr(String senha){
    this.s.setSenhaStr(senha);
  }
  public void setSenhaNum(int senha){
    this.s.setSenhaNum(senha);
  }

  public int setId(){
     return this.id;
  }
  public int setAg(){
     return this.ag;
  }
  public String getSenhaStr(){
    return this.s.getSenhaStr();
  }
  public int getSenhaNum(){
     return this.s.getSenhaNum();
  }

}



public class Q4 {
  public static void main(String[] args) {
    Conta c = new Conta(1,123,"abc123",42);
    System.out.println(c.getSenhaStr());
    c.setSenhaStr("cde456");
    System.out.println(c.getSenhaStr());
  }
}
