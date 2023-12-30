package com.expensetracker.expensetrack;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;

    
@Entity
@Table(name="Expense Tracker")
public class expensetracker {
    @Id
    private String exname;
    private double exammount;
    private Date exdate;
    private String extype;
    
    public expensetracker(){
        
    }

    public expensetracker(String exname, double exammount, Date exdate, String extype) {
        this.exname = exname;
        this.exammount = exammount;
        this.exdate = exdate;
        this.extype = extype;
    }
    public String getExname() {
        return exname;
    }
    public void setExname(String exname) {
        this.exname = exname;
    }
    public double getExammount() {
        return exammount;
    }
    public void setExammount(double exammount) {
        this.exammount = exammount;
    }
    public Date getExdate() {
        return exdate;
    }
    public void setExdate(Date exdate) {
        this.exdate = exdate;
    }
    public String getExtype() {
        return extype;
    }
    public void setExtype(String extype) {
        this.extype = extype;
    }


}
