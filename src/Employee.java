public class Employee {
    public Integer getEmpno() {
        return empno;
    }

    public void setEmpno(Integer empno) {
        this.empno = empno;
    }

    public Double getSal() {
        return sal;
    }

    public void setSal(Double sal) {
        this.sal = sal;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    Integer empno;
    String ename;
    Double sal;

    public Employee(Integer a, String b, Double c){
        this.empno=a;
        this.ename =b;
        this.sal=c;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee e = (Employee) obj;
        return empno.equals(e.empno);
    }

    @Override
    public int hashCode() {
        return empno.hashCode();
    }


}
