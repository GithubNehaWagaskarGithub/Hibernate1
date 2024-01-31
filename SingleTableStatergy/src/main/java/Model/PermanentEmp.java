package Model;

import javax.persistence.*;

@Entity
@DiscriminatorValue(value = "PermanentEmp")
@Table(name = "employee2")
public class PermanentEmp extends Employee1{
    @Column(name = "Per_Desi")
    private String perDesi;
    @Column(name = "Pf_No")
    private int pfNo;

    public PermanentEmp() {
    }

    public PermanentEmp(String eName, double eSal, String perDesi, int pfNo) {
        super(eName, eSal);
        this.perDesi = perDesi;
        this.pfNo = pfNo;
    }

    public String getPerDesi() {
        return perDesi;
    }

    public void setPerDesi(String perDesi) {
        this.perDesi = perDesi;
    }

    public int getPfNo() {
        return pfNo;
    }

    public void setPfNo(int pfNo) {
        this.pfNo = pfNo;
    }
}
