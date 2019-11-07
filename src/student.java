public class student implements School,Books {

    @Override
    public void getName(String n) {
          System.out.println(n);
    }
    @Override
    public int getAge(){
        return age;
    }

    public void schoolName(){
        System.out.println();
    }

    @Override
    public void book() {
        System.out.println("JAVA BOOK");
    }
}
