package com.demo.constructors.examples;

public final class Address {
	   private final String streetAddress;
	   private final String city;
	   private final String state;
	 
	   private Address(final String newStreetAddress, final String newCity, final String newState)
	   {
	      this.streetAddress = newStreetAddress;
	      this.city = newCity;
	      this.state = newState;
	   }
	 
	   public String getStreetAddress()
	   {
	      return this.streetAddress;
	   }
	 
	   public String getCity()
	   {
	      return this.city;
	   }
	 
	   public String getState()
	   {
	      return this.state;
	   }
	 
	   public static class AddressBuilder
	   {
	      private String nestedStreetAddress;
	      private final String nestedCity;
	      private final String nestedState;
	 
	      public AddressBuilder(final String newCity, final String newState)
	      {
	         this.nestedCity = newCity;
	         this.nestedState = newState;
	      }
	 
	      public AddressBuilder streetAddress(final String newStreetAddress)
	      {
	         this.nestedStreetAddress = newStreetAddress;
	         return this;
	      }
	 
	      public Address createAddress()
	      {
	         return new Address(nestedStreetAddress, nestedCity, nestedState);
	      }
	   }
	   
	   @Override
	   public String toString()
	   {
	      return this.streetAddress + ", " + this.city + ", " + this.state;
	   }
}
