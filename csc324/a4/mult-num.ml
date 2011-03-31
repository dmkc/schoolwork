fun mult_num(nil)  = 1
|   mult_num(h::t) = h * mult_num(t);
