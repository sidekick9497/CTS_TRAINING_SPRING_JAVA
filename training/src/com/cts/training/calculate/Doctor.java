package com.cts.training.calculate;

public class Doctor {
	private String name;
	private String specialization;
	private byte numberOfDaysAssigned;
	private int[][] outdoorPatientCount;
	private int totalPatientCount;
	
	public Doctor(String name, String specialization)
	{
		this.name = name;
		this.specialization = specialization;
	}
	
	public void getInputs()
	{
		System.out.println("En");
	}
}
