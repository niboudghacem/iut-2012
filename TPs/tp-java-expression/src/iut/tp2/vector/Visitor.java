package iut.tp2.vector;

import iut.tp2.expression.BinaryExpr;
import iut.tp2.expression.ConstExpr;
import iut.tp2.expression.UnaryExpr;

public interface Visitor {

	public double caseConstExpr(ConstExpr ce);

	public double caseBinaryExpr(BinaryExpr be);

	public double caseUnaryExpr(UnaryExpr ue);

}
