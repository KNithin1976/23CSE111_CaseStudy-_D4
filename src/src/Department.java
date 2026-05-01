package Case_Study;

class Department {

    String departmentName;

    Department(String departmentName) {
        this.departmentName = departmentName;
    }

    void showDepartment() {
        System.out.println("Department: " + departmentName);
    }
}