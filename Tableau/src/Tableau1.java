
public class Tableau1 {

	public static void main(String[] args) 
	{
		int[]monTab= {120,567,8,22,5};
		
int temp;
for(int i=0;i<monTab.length;i++)
{
	for(int j=0;j<monTab.length-1;j++)
	{
		if(monTab[j]>monTab[j+1])
		{
			temp=monTab[j];
			monTab[j]=monTab[j+1];
			monTab[j+1]=temp;
		}
	}
}

for(int e:monTab)
{
	System.out.println(e);
}
	}

}
