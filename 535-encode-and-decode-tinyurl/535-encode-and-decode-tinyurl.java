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

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));