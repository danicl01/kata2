import java.io.*;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TsvFileOrganizationLoader implements OrganizationLoader{
    public TsvFileOrganizationLoader(File file) {
        this.file = file;
    }

    private final File file;


    @Override
    public List<Organization> load() {
        try {
            return load(new FileReader(file));
        } catch (IOException e) {
            return Collections.emptyList();
        }
    }

    private List<Organization> load(FileReader fileReader) throws IOException {
        return load(new BufferedReader(fileReader));
    }

    private List<Organization> load(BufferedReader bufferedReader) throws IOException {
        return bufferedReader.lines().skip(1)
                .map(this::toOrganization)
                .collect(Collectors.toList());
    }

    private Organization toOrganization(String s) {return toOrganization(s.split("\t"));}

    private Organization toOrganization(String[] files) {
        return new Organization(
                files[0],
                files[1],
                files[2],
                files[3],
                files[4],
                Integer.parseInt(files[5]),
                files[6],
                Integer.parseInt(files[7])
        );
    }
}
