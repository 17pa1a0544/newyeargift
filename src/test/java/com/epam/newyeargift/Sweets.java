package com.epam.newyeargift;

import java.util.Comparator;

public class Sweets{
	String type;
	String name;
	int weight;
	int cost;
	Sweets(String type,String name,int weight,int cost){
		this.type=type;
		this.name = name;
		this.weight = weight;
		this.cost = cost;
	}
} 
class Sortbytype implements Comparator<Sweets>{
	public int compare(Sweets a,Sweets b)
	{
		return a.type.compareTo(b.type);
	}
}
class Sortbyweight implements Comparator<Sweets>{
	public int compare(Sweets a,Sweets b)
	{
		return a.weight - b.weight;
	}
}
class Sortbycost implements Comparator<Sweets>{
	public int compare(Sweets a,Sweets b)
	{
		return a.cost - b.cost;
	}
}