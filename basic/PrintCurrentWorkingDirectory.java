import java.io.File;
 
class PrintCurrentWorkingDirectory {
    public static void main(String[] args) {
        String absolutePath = new File(".").getAbsolutePath();
        System.out.println(absolutePath);
    }
}
 