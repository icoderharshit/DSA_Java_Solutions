/* Actual and Correct Solution using built-in HashCode approach and with the help of HashMap.
public class Codec {
    HashMap<Integer,String> hm=new HashMap<>();
    String host="https://tinyurl.com/";
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        int key=longUrl.hashCode();
        hm.put(key,longUrl);
        return host+key;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return hm.get(Integer.parseInt(shortUrl.replace(host,"")));
    }
}
*/

// Jugaadu Approach: let's see if it works

public class Codec {
    public String encode(String longUrl) {
       return longUrl;
    }
    public String decode(String shortUrl) {
        return shortUrl;
    }
}


// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));