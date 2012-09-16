package iut.tp2.expression;

import iut.tp2.vector.Visitor;

public class BinaryExpr extends Expression {

	private String op;
	private Expression leftExpr;
	private Expression rightExpr;

	public BinaryExpr() {
		super();
	}

	public BinaryExpr(String op, Expression leftExpr, Expression rightExpr) {
		super();
		this.op = op;
		this.leftExpr = leftExpr;
		this.rightExpr = rightExpr;
	}

	public String getOp() {
		return op;
	}

	public void setOp(String op) {
		this.op = op;
	}

	public Expression getLeftExpr() {
		return leftExpr;
	}

	public void setLeftExpr(Expression leftExpr) {
		this.leftExpr = leftExpr;
	}

	public Expression getRightExpr() {
		return rightExpr;
	}

	public void setRightExpr(Expression rightExpr) {
		this.rightExpr = rightExpr;
	}

	@Override
	public String toString() {
		return "BinaryExpression [op=" + op + ", leftExpr=" + leftExpr
				+ ", rightExpr=" + rightExpr + "]";
	}

	@Override
	public double visit(Visitor v) {
		return v.caseBinaryExpr(this);
	}

}
