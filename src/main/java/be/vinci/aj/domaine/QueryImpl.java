package be.vinci.aj.domaine;

class QueryImpl implements Query {
    private String url;

    @Override
    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String getUrl() {
        return url;
    }
}
