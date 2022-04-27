import java.util.Scanner;

public class ItemType {
 private String name;
 private Double costPerDay;
 private Double deposit;
 public String getName(){ return name;}

 public void setName(String name) {
  this.name = name;
 }

 public Double getCostPerDay() {
  return costPerDay;
 }

 public void setCostPerDay(Double costPerDay) {
  this.costPerDay = costPerDay;
 }

 public Double getDeposit() {
  return deposit;
 }

 public void setDeposit(Double deposit) {
  this.deposit = deposit;
 }
 public void display() {
  System.out.println("item type details");
  System.out.println("Name :" + getName());
  System.out.println("Deposit :" + String.format("%.2f", getDeposit()));
  System.out.println("Costperday :" + String.format("%.2f", getCostPerDay()));
 }
 public static void main(String[] args) {
  ItemType i = new ItemType();
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the item type name");
  i.setName(sc.nextLine());
  System.out.println("Enter the cost per day");
  i.setCostPerDay(sc.nextDouble());
  System.out.println("Enter the deposit");
  i.setDeposit(sc.nextDouble());
  i.display();
 }
 }


