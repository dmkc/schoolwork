(* 
 * AUTHOR: Dmitry Kichenko
 * UTORID: kichenko
 *
 * Return a list of items of l for which the predicate f is true.
 *)
fun select( f, [] ) = []
|   select( f, l  ) =
        let val v = if f(hd l) then [hd l] else [];
        in v @ select( f, tl(l) )
        end;
