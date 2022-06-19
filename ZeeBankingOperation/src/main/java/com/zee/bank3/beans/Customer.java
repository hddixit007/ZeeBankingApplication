package com.zee.bank3.beans;

import java.util.ArrayList;
import java.util.List;
public class Customer {
String name ;
// private Address adr ;
private List<Address> list ;
public List<Address> getList() {
return list;
} public void setList(List<Address> list) {
this.list = list;
} public Customer(){
System.out.println("customer constructor called");
} public String getName() {
return name;
}// public void setadr(Address adr) {
// this.adr=adr;
// } @Override
public String toString() {
return "Customer [name=" + name + ", list=" + list + "]";
} public void setName(String name) {
this.name = name;
}
}

