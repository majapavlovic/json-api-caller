package rs.ac.bg.fon.np.json_api_caller;

import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class Main4 {

	public static void main(String[] args) {
		JsonObject m = new JsonObject();
		
		MessageSentiment ms = new MessageSentiment("This restaurant has a lovely atmosphere and the staff is great!",
				"positive", 4, 85.222561, "en", "text");
		
		m.addProperty("message", ms.getMessage());
		m.addProperty("sentiment", ms.getSentiment());
		m.addProperty("score", ms.getScore());
		m.addProperty("confidence", ms.getConfidence());
		m.addProperty("language", ms.getLanguage());
		m.addProperty("content_type", ms.getContent_type());

		try(FileWriter out = new FileWriter("rucni_upis.json")){
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			
			out.write(gson.toJson(m));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
