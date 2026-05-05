package sources;

class Department {
    
    private String departmentName;

    Department(String departmentName) {
        this.departmentName = departmentName;
    }

   
    public String getDepartmentName() { return departmentName; }
    public void setDepartmentName(String departmentName) { this.departmentName = departmentName; }

    void showDepartment() {
        System.out.println("Department: " + departmentName);
    }
}
