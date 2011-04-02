(* 
 * AUTHOR: Dmitry Kichenko
 * UTORID: kichenko
 *
 * Return an intersection of lists, i.e. items common to two given lists.
 *)
fun ismember( n, [] )   = false
|   ismember( n, h::t ) = 
        if n=h then true
        else ismember( n, t );

fun intersect( [], l2 ) = []
|   intersect( h::t, l2 ) =
        let val l = if ismember( h, l2 ) then [h]
                    else []
        in l @ intersect( t, l2 )
        end;

