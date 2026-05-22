public interface Employable
{
	String getFirstName();
	String getLastName();
	float getPay();
	void setFirstName(String first);
	void setLastName(String second);
	void setPay(float pay);
	boolean equals(Object obj);
	default String toString()
	{
		return this.getFirstName() + " " + this.getLastName() + ", " + this.getPay() + ".";
	}
	default Object clone() throws CloneNotSupportedException
	{
		Object o = super.clone();
		return o;
	}
	default void fire()
	{
		super.fire();
	}
}