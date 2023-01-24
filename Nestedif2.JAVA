class Nestedif2 {
public static void main(String[] args) {
String address = "Bihar, India";

if(address.endsWith("India")) {  //true

if(address.contains("Dunlop")) {  //false
System.out.println("Your city is Dunlop");
}

else if (address.contains("Newtown")) {  //false
System.out.println("Your city is Newtowm");
}

else{
System.out.println(address.split(",")[0]);
}
}

else {
System.out.println("You are not living in India");
}
}
}