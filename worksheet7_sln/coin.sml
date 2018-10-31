(*Worksheet 7, Question 3*)

datatype coin = 
    Penny       of int * string
    | Nickel    of int * string
    | Dime      of int * string
    | Quarter   of int * string;

fun coinValue(Penny(value, color)) = value 
    | coinValue(Nickel(value, color)) = value
    | coinValue(Dime(value, color)) = value
    | coinValue(Quarter(value, color)) = value;

fun coinColor(Penny(value, color)) = color 
    | coinColor(Nickel(value, color)) = color
    | coinColor(Dime(value, color)) = color
    | coinColor(Quarter(value, color)) = color;