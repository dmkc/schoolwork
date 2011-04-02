(* 
 * AUTHOR: Dmitry Kichenko
 * UTORID: kichenko
 *
 * Return a list of all even numbers given a list of numbers.
 *)
fun iseven(n) = 
  if n mod 2 = 0 then true
  else false;

fun selecteven( [] ) = []
  | selecteven( h::t ) = 
    if iseven h then h::selecteven(t)
    else selecteven(t);
