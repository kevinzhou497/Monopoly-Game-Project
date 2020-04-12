
import java.util.ArrayList;
public class Player {
	private int balance;
	private int place;
	private String name;
	private ArrayList<properties> personalcards;
	Player(){
		balance=1500;
		personalcards= new ArrayList<properties>();
		place=0;
		name="";
	}
	public void playerCopier(Player player1){
		this.name=player1.getname();
		this.place=player1.getplace();
		this.balance=player1.getbalance();
		this.personalcards=player1.getcards();
	}
	public void setname(String newname) {
		name=newname;
	}
	public ArrayList<properties> cardgetter(){
		return personalcards;
	}
	public String getname() {
		return name;
	}
	public int getbalance() {
		return balance;
	}
	public void setbalance(int newbalance) {
		balance=newbalance;
	}
	public void cardadder(properties card) {
		personalcards.add(card);
	}
	public void setplace (int newplace) {
		place=newplace;
	}
	public int getplace () {
		return place;
	}
	public ArrayList<properties> getcards(){
		return personalcards;
	}
	public boolean containscard( properties thiscard) {
		for(properties a: personalcards) {
			if(a.getname().compareTo(thiscard.getname())==0)
				return true;
		}
		return false;
	}
	public boolean monopolychecker(String color) {
		int number=0;
		if (color.compareTo("Blue")==0||color.compareTo("Brown")==0)
			number=2;
		else
			number=3;
		int sum=0;
		for(properties a:personalcards) {
			if(a.getcolor().compareTo(color)==0)
				sum++;
		}
		if (sum==number)
			return true;
		else
			return false;
	}
}





