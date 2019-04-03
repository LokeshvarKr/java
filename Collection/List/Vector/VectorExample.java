import java.util.Vector;
class VectorExample{
	public static void main(String[] args) {
		Vector v=new Vector();
		v.add("lokkesh");
		v.add("harsh");
		v.add("Rani");
		v.add("Rahul");
		v.add("Rakesh");

		for(Object s:v){
			String x=(String)s;
			System.out.println(x.toString());

		}
	}
}