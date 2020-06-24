package dreambike.Controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class LoginRest {
	@GetMapping("/connect")
	public boolean connect() throws IOException {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		System.out.println(dtf.format(now) + " Connection tested");
		return true;
	}
	
	@GetMapping("/login")
	public Map<String,Object> login(@RequestParam String username, @RequestParam String password) throws IOException {
		final String uri = "http://85.146.20.136:8080/auth/realms/DreamBikeKeycloak/protocol/openid-connect/token/";
		String clientSecret = "e729b79d-4280-4ce4-bcf3-4fd6321bc491";
		String body = "grant_type=password&username="+username+"&password="+password+"&client_id=loginapp&client_secret="+clientSecret+"&scope=openid";
		URL url = new URL(uri);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		System.out.println(dtf.format(now) + " login received. User: " + username);
		HttpURLConnection con = (HttpURLConnection)url.openConnection();
		con.setRequestMethod("POST");
		con.setDoOutput(true);
		con.getOutputStream().write(body.getBytes("UTF-8"));
		BufferedReader reader = new BufferedReader(new InputStreamReader((con.getInputStream()), StandardCharsets.UTF_8));
        String json = reader.readLine();
        reader.close();
        JSONObject jsonObject = new JSONObject(json);	
        Iterator<String> test = jsonObject.keys();
        Map<String,Object> testJson = new HashMap<String,Object>();
        while (test.hasNext()) {
        	String temp = test.next();
	        	testJson.put(temp, jsonObject.get(temp).toString());;
        }
        con.disconnect();
        System.out.println(testJson.toString());
		return testJson;			
	}
}
