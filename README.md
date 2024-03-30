# Nymble_Assignment
Nymble SDE assignment

# Project Overview
This assigment contains : Main classes and test classes with HLD and LLD design above

This repository contains the code for a travel package management system designed as part of the Nymble assignment. It simulates the creation and management of travel packages, including destinations, activities, and passenger handling.

# Structure

Activity.java: Defines activities available at destinations, including details like name, description, cost, and capacity.
Destination.java: Represents a destination within a travel package, listing available activities.
Passenger.java: Abstract class for passengers with specific attributes. Subclasses differentiate passenger types.
PassengerType.java: Enumerates types of passengers (e.g., Standard, Gold, Premium).
TravelPackage.java: Central class representing a travel package, including destinations, passengers, and capacity management.
