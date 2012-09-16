package iut.tp2.expression;

import iut.tp2.vector.Visitor;

public class UnaryExpr extends Expression {

	public UnaryExpr() {
		super();
	}

	public UnaryExpr(String op, Expression underlyingExpr) {
		super();
		this.op = op;
		this.underlyingExpr = underlyingExpr;
	}

	private String op;
	private Expression underlyingExpr;

	@Override
	public String toString() {
		return "UnaryExpression [op=" + op + ", underlyingExpr="
				+ underlyingExpr + "]";
	}

	public String getOp() {
		return op;
	}

	public void setOp(String op) {
		this.op = op;
	}

	public Expression getUnderlyingExpr() {
		return underlyingExpr;
	}

	public void setUnderlyingExpr(Expression underlyingExpr) {
		this.underlyingExpr = underlyingExpr;
	}

	@Override
	public double visit(Visitor v) {
		return v.caseUnaryExpr(this);
	}

}
