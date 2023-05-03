public class Soda {

  private String dobavka;

  public Soda(String dobavka) {
    this.dobavka = dobavka;
  }

  public String getDobavka() {
    return dobavka;
  }

  public void setDobavka(String dobavka) {
    this.dobavka = dobavka;
  }

  public String toString() {
    return "Газвода со вкусом " + dobavka;
  }

}
