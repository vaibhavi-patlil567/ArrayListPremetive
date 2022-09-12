package collectionFramework;
import java.util.ArrayList;
import java.util.List;
public class ArrayListPremetive {
public static void main(String[] args) {
	List a1 = new ArrayList();
	a1.add("Vaibhavi");
	a1.add("1.4");
	a1.add("14");
	a1.add(new Base());
	for (Object b1 : a1) {
		System.out.println(b1);
	}
}
}
