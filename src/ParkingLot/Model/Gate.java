package ParkingLot.Model;

public class Gate {
    private String gateNumber;
    private GateType gateType;
    private GateStatus gateStatus;
    private Opeartor opeartor;

    public String getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(String gateNumber) {
        this.gateNumber = gateNumber;
    }

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }

    public GateStatus getGateStatus() {
        return gateStatus;
    }

    public void setGateStatus(GateStatus gateStatus) {
        this.gateStatus = gateStatus;
    }

    public Opeartor getOpeartor() {
        return opeartor;
    }

    public void setOpeartor(Opeartor opeartor) {
        this.opeartor = opeartor;
    }
}
