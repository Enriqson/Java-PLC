class Texto{
  private String text;

  public Texto(String text){
    this.text = text;
  }

  public String getText() {
    return text;
  }

  public void setText(String s){
    this.text = s;
  }

  public int totalWordCount(){
    /*
    vou assumir q "," e "." estarao bem formatados logo nao contarao
    como outra palavra pq lambda e filter em java tao me dando pesadelo
    */
    return text.split(" ").length;
  }

  public int countWord(String s){
    return (this.text.length()-this.text.replace(s,"").length())/s.length();
  }

  public void changeWord(String a, String b){
    this.text = this.text.replace(a,b);
  }

}

public class Q2 {
  public static void main(String[] args) {
    Texto t = new Texto("o problema com especialistas é que eles não sabem o que não sabem.");
    System.out.println(t.totalWordCount());
    System.out.println(t.countWord("a"));
    t.changeWord("a", "e");
    t.changeWord("o", "e");
    System.out.println(t.getText());
  }
}
