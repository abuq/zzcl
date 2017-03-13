package model;

import java.util.ArrayList;

/**
 * Created by C91CBQ on 2017/3/13.
 */
public class Examination {

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public ArrayList<Evidence> getEvidences() {
        return evidences;
    }

    public void setEvidences(Evidence evidence) {
        this.evidences.add(evidence);
    }

    public ArrayList<Law> getDependencies() {
        return dependencies;
    }

    public void setDependencies(Law dependencies) {
        this.dependencies.add(dependencies);
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    private Result result;
    private ArrayList<Evidence> evidences = new ArrayList<>();
    private ArrayList<Law> dependencies = new ArrayList<Law>();
    private String reason;
    private String description;
    private String remark;
}
