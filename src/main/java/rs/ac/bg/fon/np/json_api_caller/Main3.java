package rs.ac.bg.fon.np.json_api_caller;

import java.io.FileReader;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main3 {

	public static void main(String[] args) {
		try(FileReader in = new FileReader("niz_objekata.json")){
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			
			List<MessageSentiment> msgs = Arrays.asList(gson.fromJson(in, MessageSentiment[].class));
			
			for(MessageSentiment m: msgs)
				System.out.println(m);
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
