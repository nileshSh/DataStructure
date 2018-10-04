package linkedList;
 class Node {
 int data = 0;
 Node mNode = null;

}
public class LinkedListImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node mNodeA = new Node();
		mNodeA.data= 11;
		
		Node mNodeB = new Node();
		mNodeB.data=12;
		
		Node mNodeC = new Node();
		mNodeC.data =14;
		
		Node mNodeD = new Node();
		mNodeD.data = 18;
		
		mNodeA.mNode = mNodeB;
		mNodeB.mNode= mNodeC;
		mNodeC.mNode= mNodeD;
		
		System.out.println(calculateLength(mNodeA));
		

	}
     public static int calculateLength(Node mNode)
     {
    	 Node tNode =mNode;
    	 int length = 0;
    	 
    	 while (tNode.mNode!=null)
    	 {
    		 length ++ ;
    		 tNode =tNode.mNode;
    		
    	 }
		return length;
    	 
     }
}
