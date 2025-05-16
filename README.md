# ShowTime – Theater Ticket Booking System

## Project Type
B2B (Business-to-Business)

## Target Audience
- Theater Owners  
- Theater Managers  
- Ticket Collectors  

## Timeline
2 Weeks  

## Budget
₹5,00,000 (5 Lakhs)  

## Team Size
1 Members  


## Key Features


- The theater manager can register using a sign-up page with necessary details.
- The manager can log in using their username and password.
- The manager can update and manage theater information like name, address, and screens available.
- The manager can add new movies with full details like title, genre, duration, language, rating, and description.
- The system allows the manager to schedule movie showtimes and define the seating arrangements (rows, categories, etc.).
- The manager can search and filter movies based on date, time, genre, and language.
- view total bookings.
- Cancel booked tickets
- Modify ticket prices dynamically (increase/decrease)
- View detailed movie information (cast, singer, release date, etc.)

---

## 🔹 Model Classes

### 🔹 Movie

* `String movieId`
* `String title`
* `String genre`
* `int duration` (in minutes)
* `String language`
* `String rating` (e.g., U/A, A)
* `String description`
* `String cast`
* `String singer`
* `String releaseDate`

---

### 🔹 MovieFilter

* `String date`
* `String time`
* `String genre`
* `String language`

---

### 🔹 SeatCategory

* `String categoryName` (e.g., VIP, Standard)
* `int totalSeats`
* `double price`

---

### 🔹 SeatingArrangement

* `int totalRows`
* `List<SeatCategory> seatCategories`

---

### 🔹 Showtime

* `String showtimeId`
* `String theaterId`
* `String screenName`
* `String movieId`
* `String showDate` (Format: yyyy-MM-dd)
* `String showTime` (Format: HH:mm)
* `SeatingArrangement seatingArrangement`

---

### 🔹 TheaterManager

* `int managerId`
* `String name`
* `String username`
* `String password`
* `String email`
* `String phone`

---

### 🔹 Theatre

* `String theaterId`
* `String name`
* `String address`
* `int numberOfScreens`

---

### 🔹 TicketBooking

* `String bookingId`
* `String showtimeId`
* `String categoryName`
* `int numberOfSeats`
* `double totalAmount`
* `String bookingDateTime`

---

### 🔹 TicketCancellation

* `String cancellationId`
* `String bookingId`
* `String cancellationDateTime`
* `double refundAmount`
---
