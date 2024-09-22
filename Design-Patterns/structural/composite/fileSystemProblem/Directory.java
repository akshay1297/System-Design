package structural.composite.fileSystemProblem;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Directory {
    String directoryName;
    // one directory can contains multiple files and directories
    List<Object> fileList;

    public Directory(String directoryName) {
        this.directoryName = directoryName;
        this.fileList = new ArrayList<>();
    }

    public Directory cd(String fileName){
        for(Object obj : this.fileList){
            if(obj instanceof Directory && ((Directory) obj).directoryName.equalsIgnoreCase(fileName)){
                return (Directory)obj;
            }
        }
        return null;
    }

    public void add(Object newFile){
        this.fileList.add(newFile);
    }


    public void ls(){
        System.out.println("Directory name is : " + this.directoryName);
        for(Object obj : fileList){
            if(obj instanceof File){
               ((File) obj).ls();
            }
            else if(obj instanceof Directory){
                ((Directory) obj).ls();
            }
        }
    }
}
