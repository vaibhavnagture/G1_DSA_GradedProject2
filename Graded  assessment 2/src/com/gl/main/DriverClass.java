package com.gl.main;

import com.gl.model.*;
import com.gl.service.*;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RightSkewTree tree = new RightSkewTree();
		
		tree.root = new Node(50);
		tree.root.left = new Node(30);
		tree.root.right = new Node(60);
		tree.root.left.left = new Node(10);
		tree.root.right.left =new Node(55);
		
		
		
		tree.converstion(tree.root);
		tree.inOrder(tree.headNode);

	}

}
