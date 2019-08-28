
public class ATMMachine {

	ATMCard card;

	public void setCard(ATMCard card) {
		this.card = card;
	}
	
	public void withdraw(){
		if(card!=null){
			card.withdraw();
		}else{
			System.out.println("Please Insert Card");
		}
	}
	public void deposit(){
		if(card!=null){
			card.deposit();
		}else{
			System.out.println("Please Insert Card");
		}
	}
	
	public void balanceEnquiry(){
		if(card!=null){
			card.balanceEnquiry();
		}else{
			System.out.println("Please Insert Card");
		}
	}
	
	
	public static void main(String[] args) {
		
		ATMMachine atmMachine=new ATMMachine();
		SBICard s=new SBICard();
		atmMachine.setCard(s);
		atmMachine.deposit();
		atmMachine.withdraw();
		atmMachine.balanceEnquiry();
		System.out.println();
		
		HDFCCard h=new HDFCCard();
		atmMachine.setCard(h);
		atmMachine.deposit();
		atmMachine.withdraw();
		atmMachine.balanceEnquiry();
		System.out.println();
		
		ICICICard i=new ICICICard();
		atmMachine.setCard(i);
		atmMachine.deposit();
		atmMachine.withdraw();
		atmMachine.balanceEnquiry();
		System.out.println();
	}
	
}
