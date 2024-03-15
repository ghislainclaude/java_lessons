public class Arithmetic01 {
	public static void main(String[] args) {
		subs/**
 * Java Operators and Statements
 * 
 * Java operatpor is a special symbol that can be applied to a set of variables, values 
 * or literals--referred to as an operands- and that return as result.
 * 
 * 
 * e = expression
 * =====================================================================================||
 * ||						Order of operator precedence 								||
 * =====================================================================================||
 * ||	Operator        ||    Symbols and examples		|| Associativity				||
 * =====================================================================================||
 * ||	Unary operators || e++, e--, ++e, e--, ~		||	Right to left <=			||
 * ||-----------------------------------------------------------------------------------||
 * || 	Multiplicative	|| *, /, %						||  Left to Right =>			||
 * ||-----------------------------------------------------------------------------------||
 * ||   Additive 		|| +, -							||  Left tp Right =>			||
 * ||-----------------------------------------------------------------------------------||
 * ||   Shift 			|| <<  <<< >>					||  Left to right =>			||
 * ||-----------------------------------------------------------------------------------||
 * ||   Relational		|| <, >, <==, >=, instanceof    ||  Left to Right =>            ||
 * ||-----------------------------------------------------------------------------------||
 * ||  	Equality 		|| ==, != 						|| 	Left to Right =>			||
 * ||-----------------------------------------------------------------------------------||
 * || 	Logical operator|| &, ^, |						|| 	Left to Right => 			||
 * ||-----------------------------------------------------------------------------------||
 * ||   Short-Circuit	|| && 							||	Left to Right 				||
 * ||   Logical operator|| ||							||  	=>						||
 * ||===================||==============================||==============================||
 * ||  Tenary opertaors || boolean expression ? 		||								||
 * ||					|| expression 1 : expression 2  ||  Left to right 				||
 * ||===================||==============================||==============================||
 * || 	Assignment 		|| =, +=, -=, *=, /=, %=, &=, ^=||								||
 * ||  	Operators		|| <<=, >>=, >>>=				||		Left to right			||
 * ======================================================================================
 * ***/
		boolean b = true&&false;
		boolean c = true||false;
		System.out.print(b + " " + c);
	}
}