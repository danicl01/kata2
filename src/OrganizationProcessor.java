import java.util.List;
import java.util.Map;

public interface OrganizationProcessor {
    Map<String, Integer> process(List<Organization> organizations);
}
