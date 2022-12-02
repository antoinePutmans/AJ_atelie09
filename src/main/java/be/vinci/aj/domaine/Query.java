package be.vinci.aj.domaine;

public interface Query {
    void setUrl(String url);

    String getUrl();

    public enum QueryMethod {
        GET , POST;
    }
}
