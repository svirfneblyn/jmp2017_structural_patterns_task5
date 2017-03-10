package composite;

import java.util.ArrayList;
import java.util.List;

/*composite*/
public class DirectoryEntity implements FileSystemEntity {

    private String directoyName;
    private long dirSize;
    private List<FileEntity> fileEntityList = new ArrayList();

    public DirectoryEntity(String directoyName) {
        this.directoyName = directoyName;
    }

    public void add(FileEntity fe) {
        fileEntityList.add(fe);
    }

    public FileEntity getChild(int i) {
        return fileEntityList.get(i);
    }

    public void remove(FileEntity fe) {
        fileEntityList.remove(fe);
    }

    public String getDirectoyName() {
        return directoyName;
    }

    public List<FileEntity> getFileEntityList() {
        return fileEntityList;
    }

    @Override
    public void fileSystemEntityName(String fn) {
        System.out.println(fn);
    }

    @Override
    public void fileSystemEntitySize(long fs) {
        System.out.println(fs);
    }

    public void print() {
        System.out.println("-------------");
        System.out.println("Directory name = " + getDirectoyName());
        System.out.println("-------------");
        for (FileEntity fileEntity : fileEntityList) {
            fileEntity.print();
        }
    }
}
