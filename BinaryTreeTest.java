public class BinaryTreeTest{
	public static void main(String[] args){
			
	}
}

class BinaryTree<E>{
	private Node<E> root = newNode();
	
	BinaryTree(){
	}

	public void insert(Node<E> node, E element){
		if(node != null){
			if(node.element == null){
				node.element = element;
			}
			insert(node.leftChild, element);
			insert(node.rightChild, element);
		}
	}

	public void Create(E[] data){
		for(E element : data){
			insert(root, element);
		}		
	}

	public Node<E> newNode(){
		return new Node<E>(new Node<E>(), null, new Node<E>());
	}

	public Node<E> newNode(E element){
		return new Node<E>(new Node<E>(), element, new Node<E>());
	}

	private static class Node<T>{
		T element; 
		Node<T> leftChild;
		Node<T> rightChild;

		Node(){}

		Node(Node<T> lChild, T element, Node<T> rChild){
			this.element = element;
			this.leftChild = lChild;
			this.rightChild = rChild;
		}
	}	
}



