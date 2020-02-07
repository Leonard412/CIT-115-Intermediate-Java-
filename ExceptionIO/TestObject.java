/*

Dummy object to write to a file.

Note that the object must be Serializable to ensure that 
when read from a file, the object can be identified correctly.

*/

public class TestObject implements java.io.Serializable{
   private int data;
	public TestObject(){
		data = 12349;
	}
	public String toString(){
		return ""+data;
	}
}