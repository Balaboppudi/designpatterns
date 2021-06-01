
public class Client {

	public static void main(String[] args) {
		
		Command command=new CreateEmployeeCommand();
		command.execute();
		Command command2=new UpdateEmployeeCommand();
		command2.execute();
	}

}
