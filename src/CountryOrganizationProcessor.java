import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountryOrganizationProcessor implements OrganizationProcessor {


    @Override
    public Map<String, Integer> process(List<Organization> organizations) {
        return organizations.stream()
                .collect(Collectors.toMap(o -> o.getCountry(), v -> 1, Integer::sum));
    }
}
