package playground;

import java.util.Vector;

public class sandbox {

	public static void main(String[] args) {
		Vector<car> v1= new Vector<>(10);
		v1.add(new car(1));
		v1.add(new car(2));
		v1.add(new car(3));
		for(int i=0;i<v1.size();i++){
			v1.elementAt(i).getId();
		}
	}
}

