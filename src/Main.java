import com.google.gson.*;

public class Main {
        public static void main(String[] args) {
            String json = "{ 'userId':1, 'id':1, 'title':'sunt aut facere repellat provident occaecati excepturi optio reprehenderit', 'body':'quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto'}";
            Gson gson = new Gson();
            UserDetails user = gson.fromJson(json, UserDetails.class);
            System.out.println(user);
    }
}
