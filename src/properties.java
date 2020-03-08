
public class properties {
	private String name;
	private String color;
	private int payment;
	private int paymentwithhouse;
	private int paymentwithhotel;
	private int priceofhouse;
	private int price;
	private int ownership;
	private int balancechange;
	properties(){
		name="";
		color="";
		payment=0;
		paymentwithhouse=0;
		paymentwithhotel=0;
		priceofhouse=0;
		price=0;
		ownership=0;
	}
	properties(String name1,String color1,int cost1,int house,int hotel, int price1,int housecost, int ownership1, int balancechanger){
		name=name1;
		color=color1;
		payment=cost1;
		paymentwithhouse=house;
		paymentwithhotel=hotel;
		priceofhouse=housecost;
		price=price1;
		ownership=ownership1;
		balancechange = balancechanger;
	}
	properties(String name1, int balancechanger){
		name=name1;
		balancechange=balancechanger;
	}
	public int lookatbalancechanger() {
		return balancechange;
	}
	public int getrent() {
		return payment;
	}
	public int gethouserent() {
		return paymentwithhouse;
	}
	public int gethotelrent() {
		return paymentwithhotel;
	}
	public int getprice() {
		return price;
	}
	public int gethouseprice() {
		return priceofhouse;
	}
	public int getownership() {
		return ownership;
	}
	public void setownership(int own) {
		ownership=own;
	}
	public String getname() {
		return name;
	}
	public void setrent(int newrent) {
		payment=newrent;
	}
	public String getcolor() {
		return color;
	}

}



