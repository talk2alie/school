fun listMin(l) = 
    let fun listMin(nil, small) = small |
            listMin(x::xs, small) = 
                if 
                    x < small 
                then
                    listMin(xs, x)
                else 
                    listMin(xs, small)
    in
        listMin(l, hd(l))
    end;
        