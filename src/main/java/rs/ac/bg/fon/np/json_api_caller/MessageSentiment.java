package rs.ac.bg.fon.np.json_api_caller;

public class MessageSentiment {

	String message;
	String sentiment;
    int score;
    double confidence;
    String language;
    String content_type;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getSentiment() {
		return sentiment;
	}
	public void setSentiment(String sentiment) {
		this.sentiment = sentiment;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public double getConfidence() {
		return confidence;
	}
	public void setConfidence(double confidence) {
		this.confidence = confidence;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getContent_type() {
		return content_type;
	}
	public void setContent_type(String content_type) {
		this.content_type = content_type;
	}
	@Override
	public String toString() {
		return "MessageSentiment \n\t[message=" + message + ", \n\tsentiment=" + sentiment + ", \n\tscore=" + score
				+ ", \n\tconfidence=" + confidence + ", \n\tlanguage=" + language + ", \n\tcontent_type=" + content_type + "]";
	}
    
    
}
