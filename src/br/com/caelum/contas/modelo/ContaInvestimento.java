package br.com.caelum.contas.modelo;

public class ContaInvestimento extends Conta {
	
	@Override
	public void saca(double valor){
		
		
		try {
			
			super.saca(valor);
			
			if(valor < 0 ){
				throw new IllegalArgumentException("Valor negativo não permitido");
			}
			
			if (this.getSaldo() > 10000){
				super.saca(0.05);
			}else if (this.getSaldo() > 1000 && this.getSaldo() <= 9999){
				super.saca(0.10);
			}else{
				super.saca(0.15);
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}

	@Override
	public String getTipo() {
		return "Conta Investimento";
	}

}
