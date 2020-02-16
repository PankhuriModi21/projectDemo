package Collection;

import java.util.Comparator;

public class MyComaptorEmp  implements Comparator<Emp>
{

	@Override
	public int compare(Emp o1, Emp o2) {
		return (int)(o1.getSalary() -o2.getSalary());
	}

}
