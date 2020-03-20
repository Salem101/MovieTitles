package Movie;

import java.io.*;
import java.util.*;

public class Tree {
	Node root; 
	
	//Tree Node
	static class Node{
		String data; 
		Node left, right; 
		Node (String data)
		{
			this.data = data; 
			this.right = null; 
			this.left = null; 
			
		}
	}
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
	public static void main(String[]args) throws IOException{
		//Read in file using bufferedReader using file path
		FileReader file = new FileReader("C:\\Users\\rivka\\Downloads\\SpotifyStats.csv"); 

		BufferedReader br = new BufferedReader(file); 
		
		ArrayList<String> movieID = new ArrayList<String>();
		ArrayList<String> title = new ArrayList<String>();
		ArrayList<String> genre = new ArrayList<String>();

		String line;
		
		while ((line = br.readLine()) != null) {	
		String []info = line.split(","); 
			
			String id = info[0]; 
			movieID.add(id); 
			
			String ti = info[1]; 
			title.add(ti); 
			
			String gen = info[2]; 
			genre.add(gen);
		}
        Tree t2 = new Tree(); 
      //  t2.root = t2.insertLevelOrder(String[]ti, t2.root, 0); 
        t2.root; 
        t2.inOrder(t2.root); 
	br.close();  
	}
}

