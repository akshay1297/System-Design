package structural.composite.fileSystemSolution;

import structural.composite.fileSystemProblem.File;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{
    String directoryName;
    // one directory can contains multiple files and directories
    List<FileSystem> fileList;

    public Directory(String directoryName) {
        this.directoryName = directoryName;
        this.fileList = new ArrayList<>();
    }

    public FileSystem cd(String fileName){
        for(FileSystem obj : this.fileList){
            if(obj instanceof Directory && ((Directory) obj).directoryName.equalsIgnoreCase(fileName)){
                return obj;
            }
        }
        return null;
    }

    public void add(FileSystem newFile){
        this.fileList.add(newFile);
    }


    public void ls(){
        System.out.println("Directory name is : " + this.directoryName);
        for(FileSystem obj : fileList){
           obj.ls();
        }
    }
}
