class Name {

	private int age; // Private is using to hide the data

	public int getAge() 
    {
        return age;
    } // getter

	public void setAge(int age)
	{
		this.age = age;
	} // setter
}

class HideAge {
	public static void main(String[] args)
	{
		Name n1 = new Name();
        Name n2 = new Name();

		n1.setAge(19);
        n2.setAge(23);

		System.out.println("The age of the person is: "+ n1.getAge());
        System.out.println(n2.getAge());

	}
}
