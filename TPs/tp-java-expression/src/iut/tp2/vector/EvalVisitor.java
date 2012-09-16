package iut.tp2.vector;

import iut.tp2.expression.BinaryExpr;
import iut.tp2.expression.ConstExpr;
import iut.tp2.expression.UnaryExpr;

public class EvalVisitor implements Visitor {

	@Override
	public double caseConstExpr(ConstExpr ce) {
		return ce.getValue();
	}

	@Override
	public double caseBinaryExpr(BinaryExpr be) {

		double left = be.getLeftExpr().visit(this);
		double right = be.getRightExpr().visit(this);

		if (be.getOp().equals("+"))
			return left + right;
		else if (be.getOp().equals("-"))
			return left - right;
		else if (be.getOp().equals("*"))
			return left * right;
		else if (be.getOp().equals("/")) {
			if (right != 0)
				return left / right;
			else
				System.out.println("Division par 0 impossible");
		}

		return 0;
	}

	@Override
	public double caseUnaryExpr(UnaryExpr ue) {
		double underlyingValues = ue.getUnderlyingExpr().visit(this);
		return -(underlyingValues);
	}

}
