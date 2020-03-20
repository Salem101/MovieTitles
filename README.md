# MovieTitles
Rivka Salem

Objective:
Implement a sorted binary search Tree
Perform traversal operation on binary tree

import java.io.*; & java.util.*; for all tools being used including reading files. 
Created Node Class to instantiate the Binary tree's nodes Node left, Node right..

Using downloaded csv file from movieLens.org contains movie titles, release year, etc. named movies.csv

Movie title and release year were in 1 line so I created a method to parse: 
extractYear method to pass the arraylist of movie titles which then separated the Year and sent them into an array called years. 

I tried several times to send the titles straight to the nodes so instead I sent them to arraylists and then to the tree..
I used each column (id, movie title, etc..) and sent them into arraylists called movieID, title, genre, year. 

Using insertLevelOrder which has Node data type to add the titles through recursion from the arraylist into the tree either to the right child or to the left child. 

I used subset method to to return the existing data within the range of Harry Potter & Hulk..

Used filewriter & printwriter to print results of subset. 





