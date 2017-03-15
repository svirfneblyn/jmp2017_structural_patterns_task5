package composite;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/*composite*/
public class FSManager {

    public void compositDemo(String volume) {

        File listFile = new File(volume);
        List<DirectoryEntity> dirList = new ArrayList<>();
        File[] allFiles = listFile.listFiles();

        if (allFiles != null) {
            for (File file : allFiles) {
                if (file.isDirectory()) {
                    System.out.println("Directory  " + file.getName() + " scanning ");
                    DirectoryEntity de = new DirectoryEntity(file.getName());
                    if (file.length() > 0 && file.canExecute()) {
                        addFiles(file.listFiles(), de);
                    }
                    dirList.add(de);
                    System.out.println("Directory  " + file.getName() + " added ");
                }
            }
        }
        System.out.println("File System Ierarchy readed ");
        dirList.forEach(DirectoryEntity::print);

    }

    private DirectoryEntity addFiles(File[] filesInDir, DirectoryEntity directoryEntity) {

        if (filesInDir != null) {
            for (File file : filesInDir) {
                if (file.canRead()) {
                    directoryEntity.add(new FileEntity(file.getName(), file.length()));
                }
            }
        }
        return directoryEntity;
    }

}
