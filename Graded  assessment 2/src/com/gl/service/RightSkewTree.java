package com.gl.service;

import com.gl.model.*;

public class RightSkewTree {

	public Node root;
	public Node headNode;
	public Node prevNode;
	
	public void BST() {
		root = null;
		headNode = null;
		prevNode = null;
	}
	
	//For insertion 
	public void insertNode(Node root,int data) {
		Node newNode = new Node(data);
		Node x = root;
		Node current_parent = null;
		
		while(x != null) {
			current_parent = x;
			if(data < x.data)
				x = x.left;
			else if(data > x.data)
				x = x.right;
			else {
				return;
			}
		}
		
		if(current_parent == null) {
			current_parent = newNode;
			this.root = current_parent;
		}
		else if(current_parent.data < data)
			current_parent.right = newNode;
		else {
			current_parent.left = newNode;
		}
		
	}
	
	//For Inorder Traversal
	public void inOrder(Node root) {
		if(root == null) {
			return;
		}
		else {
			inOrder(root.left);
			System.out.print(root.data + " ");
			inOrder(root.right);
		}
	}
	
	//For converting the BST to RightSkewTree
	public void converstion(Node root) {
		if(root == null)
			return;
		
		converstion(root.left);
		
		Node rightNode = root.right;
		
		if(headNode == null) {
			headNode = root;
			headNode.left = null;
			prevNode = root;
		}
		else {
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}
		converstion(rightNode);
	}

}

