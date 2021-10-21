package com.bridgelabz.userregusinglambda;
//Uc13
import java.util.Scanner;
import java.util.regex.Pattern;
@FunctionalInterface
interface Validation {
	boolean validate(String input);
}
public class ValidationWithLambdaExpression {
	public static final String NAME_REGEX="[A-Z][a-z]{2,}";
	public static final String NUMBER_REGEX="91\s{1}[7-9]{1}[0-9]{9}";
	public static final String EMAIL_REGEX="[A-Za-z]+(\\.[A-Za-z]+)?@[a-zA-Z]+\\.co(m)?(\\.in)?";
	public static final String PASSWORD="(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&-+=()]).{8,}";
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Name");
		String firstName=sc.next();
		Validation validateFirstName=(String input)->Pattern.matches(NAME_REGEX,input);
		System.out.println(validateFirstName.validate(firstName));
		System.out.println("Enter Last Name");
		String lastName=sc.next();
		Validation validateLastName=(String input)->Pattern.matches(NAME_REGEX,input);
		System.out.println(validateLastName.validate(lastName));
		sc.nextLine();
		System.out.println("Enter Mobile Number");
		String mobileNumber=sc.nextLine();
		Validation validateNumber=(String input)->Pattern.matches(NUMBER_REGEX,input);
		System.out.println(validateNumber.validate(mobileNumber));
		System.out.println("Enter Email");
		String email=sc.next();
		Validation validateEmail=(String input)->Pattern.matches(EMAIL_REGEX,input);
		System.out.println(validateEmail.validate(email));
		System.out.println("Enter Password");
		String password=sc.next();
		Validation validatePassword=(String input)->Pattern.matches(PASSWORD,input);
		System.out.println(validatePassword.validate(password));
	}
}
