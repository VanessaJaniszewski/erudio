package br.com.erudio.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.erudio.converters.NumberConverter;
import br.com.erudio.expections.UnsupportedMathOperationException;
import br.com.erudio.math.SimpleMath;

@RestController
public class MathController {

	@Autowired
	private NumberConverter converter;
	@Autowired
	private SimpleMath simplemath;
	
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping(value = "/sum/{numbOne}/{numbTwo}",
			method = RequestMethod.GET)
	public Double sum(
			@PathVariable(value = "numbOne") String numbOne,
			@PathVariable(value = "numbTwo") String numbTwo
				)throws Exception{

		if(!converter.isNumeric(numbOne) || !converter.isNumeric(numbTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value.");
		} 
		return simplemath.sum(converter.convertToDouble(numbOne), converter.convertToDouble(numbTwo));}
	
	
	@RequestMapping(value = "/subtraction/{numbOne}/{numbTwo}",
			method = RequestMethod.GET)
	public Double subtraction(
			@PathVariable(value = "numbOne") String numbOne,
			@PathVariable(value = "numbTwo") String numbTwo
				)throws Exception{

		if(!converter.isNumeric(numbOne) || !converter.isNumeric(numbTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value.");
		} 
		return simplemath.subtraction(converter.convertToDouble(numbOne), converter.convertToDouble(numbTwo));}
	
	@RequestMapping(value = "/multiply/{numbOne}/{numbTwo}",
			method = RequestMethod.GET)
	public Double multiply(
			@PathVariable(value = "numbOne") String numbOne,
			@PathVariable(value = "numbTwo") String numbTwo
				)throws Exception{

		if(!converter.isNumeric(numbOne) || !converter.isNumeric(numbTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value.");
		} 
		return simplemath.multiply(converter.convertToDouble(numbOne), converter.convertToDouble(numbTwo));}
		
	@RequestMapping(value = "/division/{numbOne}/{numbTwo}",
			method = RequestMethod.GET)
	public Double division(
			@PathVariable(value = "numbOne") String numbOne,
			@PathVariable(value = "numbTwo") String numbTwo
				)throws Exception{

		if(!converter.isNumeric(numbOne) || !converter.isNumeric(numbTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value.");
		} 
		return simplemath.division(converter.convertToDouble(numbOne), converter.convertToDouble(numbTwo));}
	
	@RequestMapping(value = "/squareroot/{numbOne}",
			method = RequestMethod.GET)
	public Double squareroot(
			@PathVariable(value = "numbOne") String numbOne
				)throws Exception{

		if(!converter.isNumeric(numbOne)) {
			throw new UnsupportedMathOperationException("Please set a numeric value.");
		} 
		return simplemath.squareroot(converter.convertToDouble(numbOne));}
	

}
	

