fun square x =
    x*x;

fun fact n =
    if n=0 then
        1
    else
        n * fact(n-1);

fun reverse(nil)=nil
|   reverse(h::t) = reverse(t) @ [h];
