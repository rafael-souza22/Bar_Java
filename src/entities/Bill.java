package entities;

public class Bill {

	private Character gender;
	private Integer beer;
	private Integer barbecue;
	private Integer softDrink;

	public void Bill() {

	}

	public Bill(char gender, int beer, int softDrink, int barbecue) {
		this.gender = gender;
		this.beer = beer;
		this.barbecue = barbecue;
		this.softDrink = softDrink;
	}

	public Character getGender() {
		return gender;
	}

	public void setGender(Character gender) {
		this.gender = gender;
	}

	public Integer getBeer() {
		return beer;
	}

	public void setBeer(Integer beer) {
		this.beer = beer;
	}

	public Integer getBarbecue() {
		return barbecue;
	}

	public void setBarbecue(Integer barbecue) {
		this.barbecue = barbecue;
	}

	public Integer getSoftDrink() {
		return softDrink;
	}

	public void setSoftDrink(Integer softDrink) {
		this.softDrink = softDrink;
	}

	public double ticket() {
		if (gender == 'M') {
			return 10.0;
		} else {
			return 8.0;
		}
	}

	public double feeding() {
		return beer * 5 + softDrink * 3 + barbecue * 7;
	}

	public double cover() {
		if (feeding() > 30.0) {
			return 0.0;
		} else {
			return 4.0;
		}
	}

	public double total() {
		return ticket() + feeding() + cover();
	}
}