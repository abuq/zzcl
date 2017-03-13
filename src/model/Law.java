package model;

/**
 * Created by C91CBQ on 2017/3/13.
 */
public class Law {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClause() {
        return clause;
    }

    public void setClause(String clause) {
        this.clause = clause;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    private String name;
    private String clause;
    private String contents;
}
