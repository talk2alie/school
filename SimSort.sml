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

