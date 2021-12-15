package task._04_programming_with_classes.aggregation_and_composition.task5.bean;

public class TravelVoucher {
    private int price;
    private Voucher voucher;
    private AgencyService service;

    public TravelVoucher(int price, Voucher voucher, AgencyService service) {
        this.price = price;
        this.voucher = voucher;
        this.service = service;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Voucher getVoucher() {
        return voucher;
    }

    public void setVoucher(Voucher voucher) {
        this.voucher = voucher;
    }

    public AgencyService getService() {
        return service;
    }

    public void setService(AgencyService service) {
        this.service = service;
    }
}
