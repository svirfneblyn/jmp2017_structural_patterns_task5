package composite;

/*composite*/
public class FileEntity implements FileSystemEntity {

    private String fileName;
    private long fileSize;

    private String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    private long getFileSize() {
        return fileSize;
    }

    public FileEntity(String fileName, long fileSize) {
        this.fileName = fileName;
        this.fileSize = fileSize;
    }

    public void fileSystemEntityName(String fn) {
        this.fileName=fn ;
    }

    public void fileSystemEntitySize(long fs) {
        this.fileSize=fs;
    }

    @Override
    public void print() {
            System.out.println("-------------");
            System.out.println("Name = "+getFileName());
            System.out.println("Size = "+getFileSize());
            System.out.println("-------------");
    }
}
