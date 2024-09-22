package structural.composite.fileSystemSolution;

public class Client {

    public static void main(String[] args){
       structural.composite.fileSystemSolution.Directory d1 = new structural.composite.fileSystemSolution.Directory("d1");
        d1.add(new structural.composite.fileSystemSolution.Directory("d2"));
        d1.add(new structural.composite.fileSystemSolution.File("f1"));
        d1.ls();
        // extra
        // implement cd command and add file or directory to d2
        Directory d2 = (Directory) d1.cd("d2");

        if(d2 != null) {
            d2.add(new File("d2-f1"));
            d2.ls();
        }

    }
}
