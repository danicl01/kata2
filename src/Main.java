import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        OrganizationLoader loader = new TsvFileOrganizationLoader(new File("dataset.tsv"));
        List<Organization> organizations = loader.load();

    }
}