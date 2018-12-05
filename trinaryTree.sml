datatype trinaryTree = Empty
|   Node of char * trinaryTree * trinaryTree * trinaryTree;

val g = Node(#"G", Empty, Empty, Empty);
val f = Node(#"F", Empty, Empty, Empty);
val e = Node(#"E", Empty, Empty, Empty);
val b = Node(#"B", e, f, g);

val b = Node (#"B", Node(#"E", Empty, Empty, Empty), Node(#"F", Empty, Empty, Empty), Node(#"G", Empty, Empty, Empty));