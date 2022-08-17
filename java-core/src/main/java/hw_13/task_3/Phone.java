package hw_13.task_3;

import java.util.Objects;

public class Phone {
    private String company;
    private String model;

    private Integer price;

    public Phone(String company, String model, Integer price) {
        this.company = company;
        this.model = model;
        this.price = price;
    }

    public String getCompany() {
        return company;
    }

    public String getModel() {
        return model;
    }

    public Integer getPrice() {
        return price;
    }


    @Override
    public String toString() {
        return "Phone{" +
                "company='" + company + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return Objects.equals(company, phone.company) && Objects.equals(model, phone.model) && Objects.equals(price, phone.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(company, model, price);
    }

}
