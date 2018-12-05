datatype chr_tree = Empty
|   Node of char * chr_tree * chr_tree;

val w = Node(#"W", Empty, Empty);
val z = Node(#"Z", Empty, Empty);
val y = Node(#"Y", z, w);
val x = Node(#"X", Empty, Empty);
val r = Node(#"R", x, y);

Node (#"R", Node(#"X", Empty, Empty), Node(#"Y", Node(#"Z", Empty, Empty), Node(#"W", Empty, Empty)));

fun findNode(value, Empty) = Empty
|   findNode(value, Node(nodeValue, leftNode, rightNode)) = 
        if 
            value = nodeValue
        then
            Node(nodeValue, leftNode, rightNode)
        else 
            let
              val node = findNode(value, leftNode);
            in
              if node = Empty then findNode(value, rightNode) else node
            end;
