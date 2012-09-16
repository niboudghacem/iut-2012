package iut.tp2.expression;

import iut.tp2.vector.Visitor;

public class ConstExpr extends Expression {

	private double value;

	public ConstExpr() {
		super();
	}

	@Override
	public String toString() {
		return "ConstExpr [value=" + value + "]";
	}

	public ConstExpr(double value) {
		super();
		this.value = value;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	@Override
	public double visit(Visitor v) {
		return v.caseConstExpr(this);
	}

}
