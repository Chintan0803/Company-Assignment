public class Main {
    public static void main(String[] args) {
        // Creating files..
        File file1 = new File("File1.txt");
        File file2 = new File("File2.txt");
        File file3 = new File("File3.txt");

        // Creating directories..
        Directory dir1 = new Directory("Folder1");
        Directory dir2 = new Directory("Folder2");

        // Adding files to directories..
        dir1.add(file1);
        dir1.add(file2);
        dir2.add(file3);

        // Creating root directory..
        Directory root = new Directory("Root");
        root.add(dir1);
        root.add(dir2);

        // Displaying the structure
        root.display();
    }
}
