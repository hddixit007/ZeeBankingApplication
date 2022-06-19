package com.zee.bank3.beans;

public class Address {
int streetno ;
String StreetName ;
String City ;
String State ;
String Country ;
int pincode ;

public Address(){
System.out.println("address const called");
// streetno=100;
// StreetName="testStreet";
// City="testCity";
// State="testState";
// Country="testCountry";
// pincode=10000;
}

@Override
public String toString() {
return "Address [streetno=" + streetno + ", StreetName=" + StreetName + ", City=" + City + ", State=" + State
+ ", Country=" + Country + ", pincode=" + pincode + "]";
}



public String getAddress() {
return Integer.toString(streetno)+" , "+StreetName+" , "+City+" , "+State+" , "+Country+" , "+Integer.toString(pincode);
}
public int getStreetno() {
return streetno;
}
public void setStreetno(int streetno) {
this.streetno = streetno;
}
public String getStreetName() {
return StreetName;
}
public void setStreetName(String streetName) {
StreetName = streetName;
}
public String getCity() {
return City;
}
public void setCity(String city) {
City = city;
}
public String getState() {
return State;
}
public void setState(String state) {
State = state;
}
public String getCountry() {
return Country;
}
public void setCountry(String country) {
Country = country;
}
public int getPincode() {
return pincode;
}
public void setPincode(int pincode) {
this.pincode = pincode;
}



}

