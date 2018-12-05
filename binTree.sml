datatype binTree = Leaf | Node of (binTree * int * binTree);

fun sumTree(Leaf) = 0
|   sumTree(Node(leftNode, nodeValue, rightNode)) = 
        nodeValue + sumTree(leftNode) + sumTree(rightNode);

