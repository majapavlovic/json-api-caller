package rs.ac.bg.fon.np.json_api_caller;

import java.net.URL;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class Main1 {

	public static String ACCESS_KEY = "2e4baadf5c5ae6ba436f53ae5558107f";

	public static void main(String[] args) {

		try {
			OkHttpClient client = new OkHttpClient().newBuilder().build();

			MediaType mediaType = MediaType.parse("text/plain");
			@SuppressWarnings("deprecation")
			RequestBody body = RequestBody.create(mediaType,
					"This restaurant has a lovely atmosphere and the staff is great!");

			Request request = new Request.Builder().url("https://api.apilayer.com/sentiment/analysis")
					.addHeader("apikey", "LNWceecJQtFNrfFyuT3HGNNIE5zcRebp").method("POST", body).build();
			Response response = client.newCall(request).execute();
			System.out.println(response.body().string());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
