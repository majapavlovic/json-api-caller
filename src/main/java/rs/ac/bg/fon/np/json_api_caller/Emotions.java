package rs.ac.bg.fon.np.json_api_caller;

public class Emotions {

	private String message;
	private double angry;
	private double fear;
	private double happy;
	private double sad;
	private double surprise;

	@Override
	public String toString() {
		return "Emotions [message=" + message + ", angry=" + angry + ", fear=" + fear + ", happy=" + happy + ", sad="
				+ sad + ", surprise=" + surprise + "]";
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public double getAngry() {
		return angry;
	}

	public void setAngry(double angry) {
		this.angry = angry;
	}

	public double getFear() {
		return fear;
	}

	public void setFear(double fear) {
		this.fear = fear;
	}

	public double getHappy() {
		return happy;
	}

	public void setHappy(double happy) {
		this.happy = happy;
	}

	public double getSad() {
		return sad;
	}

	public void setSad(double sad) {
		this.sad = sad;
	}

	public double getSurprise() {
		return surprise;
	}

	public void setSurprise(double surprise) {
		this.surprise = surprise;
	}

}
