package iut.tp2.expression;

import iut.tp2.vector.Visitor;

public abstract class Expression {

	public abstract double visit(Visitor v);

}
