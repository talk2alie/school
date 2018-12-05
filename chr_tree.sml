datatype chr_tree = Empty
|   Node of char * chr_tree * chr_tree;

val w = Node(#"W", Empty, Empty);
val z = Node(#"Z", Empty, Empty);
val y = Node(#"Y", z, w);
val x = Node(#"X", Empty, Empty);
val r = Node(#"R", x, y);

Node (#"R", Node(#"X", Empty, Empty), Node(#"Y", Node(#"Z", Empty, Empty), Node(#"W", Empty, Empty)));