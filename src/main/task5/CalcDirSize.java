package main.task5;
import java.io.File;
import java.util.List;


public class CalcDirSize {

    // Given functions: listFiles, listDirectories, fileSize
    public static List<String> listFiles(String dir) {
        return null;
    }

    public static List<String> listDirectories(String dir) {
        return null;
    }

    public static long fileSize(String file) {
        return 0;
    }
    // ----------------------------------------------------

    /**
     * Calculates the size of the specified directory, including all subdirectories and files.
     *
     * @param directory - The path to the directory to calculate the size of
     * @return The total size of specified directory
     */
    public static long directorySize(String directory) {
        long size = 0;
        File dir = new File(directory);

        if (dir.isDirectory()) {
            // Adds the size of all files in the directory
            List<String> files = listFiles(directory);
            if (files != null) {
                for (String file : files) {
                    size += fileSize(file);
                }
            }

            // Recursively adds the size of all subdirectories
            List<String> subDirs = listDirectories(directory);
            if (subDirs != null) {
                for (String subDir : subDirs) {
                    size += directorySize(subDir);
                }
            }
        }
        else if (dir.isFile()) {
            // Size of a single file
            size = fileSize(directory);
        }

        // Returns size of the specific directory
        return size;
    }
}

