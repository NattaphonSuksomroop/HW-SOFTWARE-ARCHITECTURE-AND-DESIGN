package creational;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONBookMetadataFormatter implements BookMetadataFormatter {
    private JSONArray arr;

    public JSONBookMetadataFormatter(){
        reset();
    }
    @Override
    public BookMetadataFormatter reset() {
        arr = new JSONArray();
        return this;
    }

    @Override
    public BookMetadataFormatter append(Book b) {
        JSONObject obj = new JSONObject();
        obj.put("ISBN",b.getISBN());
        obj.put("Title",b.getTitle());
        obj.put("Publisher",b.getPublisher());
        String[] author = b.getAuthors();
        String AllAuthor = "";
        for (int i = 0;i<author.length;i++){
            if (i != (author.length-1)){
                AllAuthor+=author[i] + " | ";
            }else{
                AllAuthor+=author[i];
            }
        }
        obj.put("Author",AllAuthor);
        arr.add(obj);
        return this;
    }

    @Override
    public String getMetadataString() {
        return arr.toString();
    }

    public JSONArray getJsonArray(){
        return arr;
    }
}
