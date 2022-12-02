package be.vinci.aj.domaine;

class QueryImpl implements Query {
    private String url;
    private QueryMethod method;

    @Override
    public void setUrl(String url) {
        this.url = url;
        this.method = QueryMethod.GET;
    }

    @Override
    public String getUrl() {
        return url;
    }
}
