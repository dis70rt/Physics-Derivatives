package Recreate.SushantSinghRajput.Javascript;

import java.util.function.DoubleFunction;

import java.util.*;
import Derivative.Basic.Derivatives;

/*                                           

   This Program is The Recreation Of Sushant Singh Rajput's JavaScript Program [Uploaded in His Instagram ID]
   
   @saikat._ Recreate That JavaScript Program into This JAVA Program
   
   This Oviously Not Even Close To The Actual JavaScript Program... Just a Basic Program Of What I ( @saikat._ ) UnderStood...
   Viewing Just A Part Of The Program... 
   ** Few Functions Like   TODO  PVector()  are Missing In This Program...Cause I Didn't Knew Their Function
                           TODO  random()
                           
                           TODO this.update Cause I Didn't Knew The Function Of This Variable...
                           
    He Was A Gentle , Talented , Smart Human... And I Wished He Could Have Done More Contribution In This Beautiful World... 
    Where Few Monsters like @karanjohar Are Disguised As A Human Being... 
    
    R.I.P @sushantsinghrajput May Your Soul Gets Reborn As A Human Being Again,, In This Beautiful World
    
*/



public class Physics extends Derivatives {
	
	final static String PARTICLE = "Point Particle";
	final static String ANGLE_MODE = "radiane";
	final static String MOTION = "1D - Motion";

	
	static float acceleration;
	static float velocity;
	static float position;
	static float timeInLive;
	
	public static void  main(String args[]) {
		
		dataInput();
		
		//Position Of The Particle At a Given Time "t"
		position = get(function(), timeInLive);
		
		//(Instateneous) Velocity At a Given Time "t"
		velocity = get(getDerivative(function()), timeInLive);
		
		//(Instateneous) Accleration At a Given Time "t"
		acceleration = get(getDerivative(getDerivative(function())), timeInLive);
		
		display();
				
	}
	
	
	// f(t) = t^2 + t^3 + 5     w.r.t TIME      <----------- Change The Position Function In This Method
	public static DoubleFunction<Double> function() {
		DoubleFunction<Double> fx = (t) -> t * t + t * t * t + 5;
		
		return fx;
	}               
	
	
	// Get The Value Of Function f(t) at t = TIME (Given By The User)
	public static long get(DoubleFunction<Double> FUNCTION ,float TIME) {
		
		return Math.round(FUNCTION.apply(TIME));
	}
	
	
	// Find The f'(t) [Derivative of Func. f(t)]
	public static DoubleFunction<Double> getDerivative(DoubleFunction<Double> FUNCTION) {
		
		return derive(FUNCTION);
		
	}
	
	
	// Display The Value Of The Functions
	public static void display() {
		
		System.err.println("Assumption Taken Are :");
		System.err.println();
		System.err.println("The Particle is : "+PARTICLE);
		System.err.println("The Motion is : "+MOTION);
		System.err.println("The Mode Of Angle is : "+ANGLE_MODE);
		
		System.out.println("At The Given Time "+timeInLive+" : ");
		System.out.println();
		System.out.println("The Position Of The Particle is : "+position+" m");
		System.out.println("The Velocity Of The Particle is : "+velocity+" m/s");
		System.out.println("The Accleration Of The Particle is : "+acceleration+" m/s^2");
		
	}
	
	// To Enter The Time
	public static void dataInput() {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Please Enter The TIME \"t\" in (sec) : ");
		timeInLive = in.nextFloat();
				
	}
	

}
