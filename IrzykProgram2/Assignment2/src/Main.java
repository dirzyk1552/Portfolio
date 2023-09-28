//Main Method
public class Main {
    public static void main(String[] args) {
        // Create objects for classes
        Person p = new Person("Dylan Irzyk", "California", "(283) 572-1294", "dirzyk@comcast.net");
        Student s = new Student("Jerry", "New York", "(423) 942-3585", "adgawe@gmail.com", Student.SOPHOMORE);
        Employee e = new Employee("Bruce", "Mexico", "(234) 235-6978", "Bruce12345@yahoo.com", "Manager", 91000);
        Faculty f = new Faculty("Marianne", "Oregon", "(876) 023-1195", "Marianne@protonmail.com", "", 609870, "9.00-11.00am", "Chef");
        Staff st = new Staff("Victor", "Arizona", "(925) 586-2350", "ad032@aol.com", "Intel", 68000, "Boss");

        // Display the table header
        System.out.println( "Class Name Person Name Status Salary Hours Role");
        System.out.println("------------------------------------------------------");

        // Display the information of each person
        System.out.println(p.getClass().getSimpleName() + " " + p.toString());
        System.out.println(s.getClass().getSimpleName() + " " + s.toString());
        System.out.println(e.getClass().getSimpleName() + " " + e.toString());
        System.out.println(f.getClass().getSimpleName() + " " + f.toString());
        System.out.println(st.getClass().getSimpleName() + " " + st.toString());
    }
}