package org.santosh.scribble.corejava;

public class CloneExample {

    public static void main(String[] args) throws CloneNotSupportedException {
        Department hr = new Department(1, "Human Resource");

        Employee original = new Employee(1, "Admin", hr);
        Employee cloned = (Employee) original.clone();

        //Let's change the department name in cloned object and we will verify in original object
        cloned.getDepartment().setName("Finance");

        System.out.println(original.getDepartment().getName());
        System.out.println(cloned.getDepartment().getName());
    }

    static class Employee implements Cloneable{

        private int employeeId;
        private String employeeName;
        private Department department;

        public Employee(int id, String name, Department dept) {
            this.employeeId = id;
            this.employeeName = name;
            this.department = dept;
        }
        @Override
        protected Object clone() throws CloneNotSupportedException {
            Employee cloned = (Employee)super.clone();
            cloned.setDepartment((Department) cloned.getDepartment().clone()); // deep copy
            return cloned;
        }

        public int getEmployeeId() {
            return employeeId;
        }

        public void setEmployeeId(int employeeId) {
            this.employeeId = employeeId;
        }

        public String getEmployeeName() {
            return employeeName;
        }

        public void setEmployeeName(String employeeName) {
            this.employeeName = employeeName;
        }

        public Department getDepartment() {
            return department;
        }

        public void setDepartment(Department department) {
            this.department = department;
        }
    }

    static class Department implements Cloneable
    {
        private int id;

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        private String name;

        public Department(int id, String name)
        {
            this.id = id;
            this.name = name;
        }

        //Getters and Setters
    }
}
