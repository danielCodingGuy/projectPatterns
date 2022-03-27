import java.util.ArrayList;
import java.util.List;

public class BasedDepartment implements Department {
    private Integer id;
    private String name;

    private List<Department> childDepartments;

    public BasedDepartment(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.childDepartments = new ArrayList<>();
    }

    public void printDepartmentName() {
        childDepartments.forEach(Department::printDepartmentName);
    }

    public void addDepartment(Department department) {
        childDepartments.add(department);
    }

    public void removeDepartment(Department department) {
        childDepartments.remove(department);
    }
}
