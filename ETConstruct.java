import java.util.ArrayList;

public class ETConstruct {
	ArrayList<ParseTree> parsetree;
	
	public ETConstruct(ArrayList<ParseTree> s){
		this.parsetree = s;
	}
	public ExpressionTree construct(){
		//if(statement.get(0).toLowerCase().equals("select")){
			ExpressionTree t;
			t = select();
			return t;
		//}
	}
	
	//zy: add the order_index
	public ExpressionTree select()
}
