import iut.tp2.expression.BinaryExpr;
import iut.tp2.expression.ConstExpr;
import iut.tp2.expression.Expression;
import iut.tp2.expression.UnaryExpr;
import iut.tp2.vector.Visitor;
import iut.tp2.vector.EvalVisitor;


public class Test {

	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		
			Visitor evalVisitor = new EvalVisitor();
			
			//Test 1
			ConstExpr e1 = new ConstExpr(10);
			
			System.out.println(evalVisitor.caseConstExpr(e1));
			
			//Test 2
			Expression e2 = new ConstExpr(2);
			BinaryExpr b1 = new BinaryExpr("+", e1, e2);
			BinaryExpr b2 = new BinaryExpr("*", b1, b1);
			
			System.out.println(evalVisitor.caseBinaryExpr(b2));
			
			//Test 3
			UnaryExpr u1 = new UnaryExpr("-", b2);
			
			System.out.println(evalVisitor.caseUnaryExpr(u1));
			
			

	}

}
