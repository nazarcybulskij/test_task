import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * User: NAZAR
 * Date: 07/10/13
 * Time: 20:56
 * To change this template use File | Settings | File Templates.
 */
public class FindFile {

    private static List<File> summaryList = new LinkedList<File>();


    public static List<File> SearchByMask(String mask, File rootFolder) throws IOException, InvalidMaskException {
        if (mask == null)
            throw new IOException("mask == null");
        if (rootFolder == null)
            throw new IOException("rootfolder == null");


        if (!rootFolder.exists()) {
            throw  new IOException("file is not created");
        }

        if (!rootFolder.isDirectory()) {
              throw  new IOException("file is folder");
        }
        boolean temp = new Validator().isValidMask(mask);
        if (!temp)
            throw new InvalidMaskException("mask incorect ");


        String[] listDirectory = rootFolder.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return new File(dir, name).isDirectory();
            }
        });

        File[] listFiles = rootFolder.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return new File(dir, name).isFile();
            }
        });

        Pattern pattern = Pattern.compile(new Converter().MasktoMatcherString(mask));
        Matcher matcher;
        if (listFiles != null)
            for (File iterator_file : listFiles) {
                matcher = pattern.matcher(iterator_file.getName());
                if (iterator_file.isDirectory())
                    break;
                if (matcher.matches()) {
                    FindFile.summaryList.add(iterator_file);
                }
            }
        if (listDirectory != null)
            for (String iterator : listDirectory) {
                FindFile.SearchByMask(mask, new File(rootFolder + "/" + iterator));

            }


        return summaryList;
    }


}
