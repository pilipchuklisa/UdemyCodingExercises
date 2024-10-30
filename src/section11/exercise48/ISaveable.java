package section11.exercise48;

import java.util.List;

public interface ISaveable {

    List<String> write();

    void read(List<String> list);
}
