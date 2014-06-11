package j8.app.dao;

public class Exampler {

	private final long id;
    private final String content;
    
    public Exampler(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
