package Collection;

import java.util.Comparator;

public class MyComparator implements Comparator<Integer>
{

@Override
public int compare(Integer o1, Integer o2)
{
	//1st type
	//if(o1>o2)
	//return -1;
	//elseif(o1<o2)
	//return +1;
	//else
	//return 0;
	//2nd type
	//return(o1>o2)?-1:(  (o1==o2)?  0:+1);
	//3rd type
	return  o2.compareTo(o1);
}
}
