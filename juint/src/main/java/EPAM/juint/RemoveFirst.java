package EPAM.juint;

public class RemoveFirst {

	public Object remove(String g) {
		// TODO Auto-generated method stub
		String result=g;
		char st[]=g.toCharArray();
		if(st[1]=='A' && st[0]=='A')
	        result=( g.substring(2,g.length()));
		else if(st[0]=='A')
        result=g.substring(1,g.length());
        else  if(st[1]=='A')
        result=(""+st[0]+g.substring(2,g.length()));
        
		return result;
	}

}
