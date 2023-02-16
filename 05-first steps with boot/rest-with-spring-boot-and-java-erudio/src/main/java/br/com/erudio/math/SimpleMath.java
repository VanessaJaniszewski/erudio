package br.com.erudio.math;

import org.springframework.stereotype.Component;

@Component
public class SimpleMath {

	public Double sum( Double numbOne,Double numbTwo) {
		return numbOne+numbTwo;}
	


	public Double subtraction( Double numbOne, Double numbTwo){
		return numbOne-numbTwo;}
	
	public Double multiply(Double numbOne, Double numbTwo){
		return numbOne*numbTwo;}
	

	public Double division( Double numbOne, Double numbTwo){
		return numbOne/numbTwo;}
	
	public Double squareroot( Double numbOne){

		return Math.sqrt(numbOne);}
	
}
