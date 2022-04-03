package rs.ac.bg.fon.np.json_api_caller;

import java.io.FileWriter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main2 {
	/*
	 * Napraviti klasu Main2 sa main metodom u kojoj se pravi niz objekata već
	 * napravljene domenske klase i u taj niz unosi više objekata napunjenih
	 * željenim podacima. Sačuvati ovaj niz objekata u JSON formatu u fajl
	 * „niz_objekata.json
	 */

	public static void main(String[] args) {
		MessageSentiment ms1 = new MessageSentiment("This restaurant has a lovely atmosphere and the staff is great!",
				"positive", 4, 85.222561, "en", "text");

		MessageSentiment ms2 = new MessageSentiment("Had an awful time at this cafe. Never seen such rude chefs.!",
				"negative", 1, 91.646361, "en", "text");

		MessageSentiment ms3 = new MessageSentiment(
				"The place was O.K. I really liked the food but the decoration was outdated", "neutral", 3, 74.56574,
				"en", "text");

		MessageSentiment[] msgs = { ms1, ms2, ms3 };
		for(MessageSentiment m : msgs) {
			System.out.println(m);
		}

		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		try (FileWriter fw = new FileWriter("niz_objekata.json")) {
			gson.toJson(msgs, fw);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
