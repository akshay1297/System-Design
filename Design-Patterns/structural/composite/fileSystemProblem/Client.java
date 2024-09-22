package structural.composite.fileSystemProblem;

/*
- File System
- print all the files and directory present inside a directory.
- Directory can contain both child and directory itself.
- ls() - to print


Issue :
- Every time we have to check instance of object
- we are using generic Object.
 */
public class Client {
    public static void main(String[] args){
        Directory d1 = new Directory("d1");
        d1.add(new Directory("d2"));
        d1.add(new File("f1"));
        d1.ls();
         // extra
        // implement cd command and add file or directory to d2
        Directory d2 = d1.cd("d2");
        if(d2 != null) {
            d2.add(new File("d2-f1"));
            d2.ls();
        }

    }
}
