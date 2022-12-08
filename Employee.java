class myEmployee
{
    String ename;
    int id;
    int esalary;
    myEmployee()
    {
        id=0;
        ename="Gul Mohammad Jin Ustad";
        esalary = 1000;
    }
    myEmployee(int i,String nm , int salary)
    {
        id=i;
        ename=nm;
        esalary = salary;
    }

    public void display()
    {
        System.out.println("employee name " + ename);
        System.out.println("employee id " + id);
        System.out.println("employee salary " + esalary);
    }
}
 class EmployeeData
{
    public static void main(String args[])
    {
        System.out.println("the employee details are:");
        myEmployee e1=new myEmployee(1,"sunmathi",2000);
        myEmployee e2=new myEmployee(2,"jessy",3000);
        myEmployee e3=new myEmployee();
        e1.display();
        e2.display();
        e3.display();
    }
}