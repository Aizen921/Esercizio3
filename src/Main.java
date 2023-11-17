public class Main {
    public static void main(String[] args) {
        Auto auto1= new Auto("530 CV","CV847HB","BMW","X6");
      /*auto1.cilindrata= "530 CV";
      auto1.targa= "CV847HB";
      auto1.marca= "BMW";
      auto1.modello= "X6";
       */
        System.out.println(auto1.getCilindrata());
        System.out.println(auto1.getTarga());
        System.out.println(auto1.getMarca());
        System.out.println(auto1.getModello());
    }
}
