(* 
 * AUTHOR: Dmitry Kichenko
 * UTORID: kichenko
 *
 * Return a product of all the numbers in a list.
 *)
fun multnum(nil)  = 1
|   multnum(h::t) = h * multnum(t);
