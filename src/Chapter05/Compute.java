package Chapter05;

public class Compute {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]), 
			b = Integer.parseInt(args[2]),
			rs = 0;
		String operator = args[1];
		switch(operator){
		case "+":
			rs = a+b;
			break;
		case "-":
			rs = a-b;
			break;
		case "@":
			rs = a*b;
			break;
		case "/":
			rs = a/b;
			break;
		default:
			break;
		}		
		//if문으로 실행안됨
//		if(operator == "+"){
//			rs = a+b;
//		}else if(operator == "-"){
//			rs = a-b;
//		}else if(operator == "@"){
//			rs = a*b;
//		}else if(operator == "/"){
//			rs = a/b;
//		}
		System.out.println(a+operator+b+"="+rs);
	}
}
