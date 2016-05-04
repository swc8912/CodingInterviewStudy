public class SP_Stack{
	public static void main(string argc[]){

		Stack stack = new Stack();
		Scanner sc = new Scanner(System.in);
		int inputSize = sc.nextInt();

		for(int i=0;i<inputSize;i++){
			stack.push(sc.nextInt());
		}
		System.out.println(stack.getSize());
		for(int i=0;i<inputSize;i++)
			System.out.print(stack.get(i));
		for(int i=0;i<inputSize;i++){
			if(!stack.isEmpty())
				System.out.print(stack.pop());
		}
		System.out.println(stack.getSize());
	}
}
class Stack{
	ArrayList<Integer> stack;
	int idx;
	public Stack(){
		stack = new ArrayList<Integer>();
		idx = 0;
	}
	void push(int item){
		stack.add(item);
		idx++;
	}
	int pop(){
		int temp = stack.get(--idx);
		stack.remove(idx);
		return temp;
	}
	int get(int i){
		return stack.get(i);
	}
	int getSize(){
		return stack.length();
	}
	boolean isEmpty(){
		if(idx==0)
			return true;
		return false;
	}
}