
public class Main {
	public static void main(String[] args) {
		SaveBond mySaveBond = new SaveBond(); 
		mySaveBond.setSaldo(25000);
		mySaveBond.setTempoWaktu(5);
		System.out.println("Total Pendapatan Kenaikan Bunga: " + mySaveBond.hitungTotalPendapatan());
	}
}
