package com.ffm.script;

import java.util.Date;
import java.util.StringJoiner;

public class ScriptContract {

    private Integer scriptid;

    private Integer buyerid;

    private Integer sellerid;

    private Integer minbudget;

    private Integer percentagerevenue;

    private Date expectedinproductiondate;

    private Date createddate;

    public Integer getScriptid() {
        return scriptid;
    }

    public ScriptContract withScriptid(Integer scriptid) {
        this.scriptid = scriptid;
        return this;
    }

    public Integer getBuyerid() {
        return buyerid;
    }

    public ScriptContract withBuyerid(Integer buyerid) {
        this.buyerid = buyerid;
        return this;
    }

    public Integer getSellerid() {
        return sellerid;
    }

    public ScriptContract withSellerid(Integer sellerid) {
        this.sellerid = sellerid;
        return this;
    }

    public Integer getMinbudget() {
        return minbudget;
    }

    public ScriptContract withMinbudget(Integer minbudget) {
        this.minbudget = minbudget;
        return this;
    }

    public Integer getPercentagerevenue() {
        return percentagerevenue;
    }

    public ScriptContract withPercentagerevenue(Integer percentagerevenue) {
        this.percentagerevenue = percentagerevenue;
        return this;
    }

    public Date getExpectedinproductiondate() {
        return expectedinproductiondate;
    }

    public ScriptContract withExpectedinproductiondate(Date expectedinproductiondate) {
        this.expectedinproductiondate = expectedinproductiondate;
        return this;
    }

    public Date getCreateddate() {
        return createddate;
    }

    public ScriptContract setCreateddate(Date createddate) {
        this.createddate = createddate;
        return this;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ScriptContract.class.getSimpleName() + "[", "]")
                .add("scriptid=" + scriptid)
                .add("buyerid=" + buyerid)
                .add("sellerid=" + sellerid)
                .add("minbudget=" + minbudget)
                .add("percentagerevenue=" + percentagerevenue)
                .add("expectedinproductiondate=" + expectedinproductiondate)
                .add("createddate=" + createddate)
                .toString();
    }
}
