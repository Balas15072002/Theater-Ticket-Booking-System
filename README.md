# ShowTime – Theater Ticket Booking System

**Type:** B2B (Business-to-Business)  
**Target Audience:**  
- Theater Owners  
- Theater Seat Managers  
- Ticket Collectors  

**Timeline:** Approximately 2 Weeks  
**Budget:** ₹6,00,000 (6 Lakhs)  
**Team Size:** 3 Members  

---

## Project Overview

**ShowTime** is a theater ticket booking system designed to streamline seat management and ticketing operations for theaters. This system empowers seat managers with real-time control over booking, pricing, and user data. It also supports UPI-based digital payments and provides secure access for theater staff.

---

## Key Features

### User Authentication
- Register and login securely with role-based access control

### Ticket Operations
- Book tickets for users with UPI payment integration (GPay, PhonePe, etc.)
- Cancel booked tickets
- Receive real-time notifications when users book tickets
- Manually close bookings for sold-out or blocked shows

### Seat & Pricing Management
- View real-time seat availability
- Modify ticket prices dynamically (increase/decrease)
- Add and manage discount pricing

### User Management
- View and manage user details

### Movie Management
- Search and filter movies by title, genre, or location
- View detailed movie information (cast, singer, release date, etc.)

---

## Model Classes

### 1. User
```java
1.User{
	
	    int userid;
	    String name;
	    String email;
	    long contact;
	    int age;
	 }
	
	2.Theatre Seat Managers{
	
	    int managerid;
	    String name;
	    String email;
	    long contact;
	    String password;
	    String confirm_password;
	}
	
	3.Movie{
	
	    int movieid;
	    String title;
	    String genre;
	    String actor;
	    String actress;
	    String villain;
	    String singer;
	    String release_date;
	}
	
	4.Seat{
	
	    int seatid;
	    boolean isBooked;
	    boolean isBlocked;
	    double price;  
	}
	
	5.Booking{
	
	    int bookingid;
	    int userid;
	    int seatid;
	    int movieid;
	    LocalDate booking_date_time;
	    int paymentid;
	    boolean isConfirm_ticket;
	}
	
	6.Discount{
	
	    int discountid;
	    double amount;
	    String validTill;
	}
	
	7.Payment{
	
	    int paymentid;
	    String paymentMethod;
	    double amount;
	    boolean status;
	}
