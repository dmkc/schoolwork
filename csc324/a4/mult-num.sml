fun multnum(nil)  = 1
|   multnum(h::t) = h * multnum(t);
