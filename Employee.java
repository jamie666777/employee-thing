public class Employee implements Cloneable
{
    public String first;
    public String second;
    public float pay;
    
    public Employee()
    {
        this.first = "";
        this.second = "";
        this.pay = (float) 0.0;
    }
    
    public Employee(String first, String second)
    {
        this.first = first;
        this.second = second;
        this.pay = (float) 0.0;
    }
    
    public Employee(String first, String second, float pay)
    {
        this.first = first;
        this.second = second;
        this.pay = pay;
    }
    
    public String getFirstName()
    {
        return this.first;
    }
    
    public void setFirstName(String first)
    {
        this.first = first;
    }
    
    public String getLastName()
    {
        return this.second;
    }
    
    public void setLastName(String second)
    {
        this.second = second;
    }
    
    public float getPay()
    {
        return this.pay;
    }
    
    public void setPay(float pay)
    {
        this.pay = pay;
    }
    
    public String toString()
    {
        String msg;
        msg = "Name: " + this.getFirstName() + " " + this.getLastName() + ".\n";
        msg += "Pay: $" + this.getPay() + ".\n";
        return msg;
    }
    
    public Employee clone()
    {
        Employee emp;
        try
        {
            emp = (Employee) super.clone();
        }
        catch (CloneNotSupportedException e)
        {
            return null;
        }
        return emp;
    }
    
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if ((this == null) | (obj == null))
        {
            return false;
        }
        if (this.getClass() != obj.getClass())
        {
            return false;
        }
        
        Employee emp = (Employee) obj;
        if ((this.getFirstName().equals(emp.getFirstName())) & (this.getLastName().equals(emp.getLastName())))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
