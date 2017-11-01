
public class TestaContaNovo {
	public static void main(String[] args) {
	
		ContaNovo c = new ContaNovo();
		c.setAgencia("7432");
		c.setDataAbertura("01/02/2001");
		c.setTitular("Bruno");
		c.setNumero(3585);
		c.deposita(500.5);
		c.saca(22.30);
		
		System.out.println("Titular = " + c.getTitular());
		
	}
}
