package Movie;

import java.io.*;
import java.util.*;

public class Tree {
	Node root; 

	//Insert the nodes on level order
	//using Array of movie titles
    public Node insertLevelOrder(String[] ti, Node root, int i) 
    			{ 
    			// Base case for recursion 
    			if (i < ti.length) { 
    			Node temp = new Node(ti[i]); 
    			root = temp; 

    			// insert left child 
    			root.left = insertLevelOrder(ti, root.left, 2 * i + 1); 

    			// insert right child 
    			root.right = insertLevelOrder(ti, root.right, 2 * i + 2); 
    			} 
    			return root; 
    }
	//Print tree nodes inOrder Fasion
	public void inOrder(Node root) {
		if (root != null) {
			inOrder(root.left);
			System.out.print(root.data + " ");
			inOrder(root.right);
		}
	}
	public static int extractYear(ArrayList<String> title) {
		Scanner sc = new Scanner(System.in);
		 String inputString;
	        //2
	        System.out.println("Enter a string :");
	        inputString = sc.nextLine();
	        //
	        //4
	        for (char ch : inputString.toCharArray()) {
	            //5
	            if (Character.isDigit(ch)) {
	              System.out.print(ch + " ");

		
	}
	public static void main(String[]args) throws IOException{
		//Read in file using bufferedReader using file path
		FileReader file = new FileReader("C:\\Users\\rivka\\Downloads\\SpotifyStats.csv"); 

		BufferedReader br = new BufferedReader(file); 
		
		ArrayList<String> movieID = new ArrayList<String>();
		ArrayList<String> title = new ArrayList<String>();
		ArrayList<String> genre = new ArrayList<String>();
		ArrayList<String> year = new ArrayList<String>();
		System.out.println("GOOD JOB"); 
		String line;
		
		String[] y = extractYear(ArrayList title);
		while ((line = br.readLine()) != null) {	
		}
		String line; 
		String []info = line.split(","); 
			
			String id = info[0]; 
			movieID.add(id); 
			
			String ti = info[1]; 
			title.add(ti); 
			
			String yr = info[2]; 
			year.add(yr);
			
			String gen = info[3]; 
			genre.add(gen);
		}
        Tree t2 = new Tree(); 
        int i;
		insertLevelOrder(String[]ti, Node root, int i); 
        t2.inOrder(t2.root); 
	br.close();  
	}

}

