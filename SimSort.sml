fun listMin(l) = 
    let fun listMin(nil, smallest) = smallest |
            listMin(first::rest, smallest) = 
                if 
                    first < smallest 
                then
                    listMin(rest, first)
                else 
                    listMin(rest, smallest)
    in
        listMin(l, hd(l))
    end;

fun remElem(x, l) =
    let fun remElem(element, viewed, remainder) = 
        if 
            hd(remainder) = element 
        then
            viewed @ tl(remainder)
        else 
            remElem(element, viewed @ [hd(remainder)], tl(remainder))
    in
        remElem(x, nil, l)
    end;

fun simSort(l) = 
    if
        l = nil
    then
        nil
    else 
        let
          val smallest = listMin(l);
          val rest = remElem(smallest, l);
        in
          smallest :: simSort(rest)
        end;


        