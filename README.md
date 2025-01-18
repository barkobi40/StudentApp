# Assignment 2 - Students App

This project is a simple student repository application designed as part of Assignment 2. The app allows users to manage a list of students with functionalities for adding, editing, and viewing student details. The data is stored in memory (no real database), and all screens are implemented using separate activities.

---

## Features

### **1. Students List**
- Displays a complete list of students.
- Each row contains:
  - Student picture (static for all students).
  - Student name.
  - Student ID.
  - Checkbox to mark the "check status" of the student.
- Functionalities:
  - Pressing the checkbox toggles the "check status."
  - Pressing on a row opens the **Student Details** screen.

---

### **2. Add New Student**
- Allows adding a new student to the repository.
- Inputs include:
  - Name.
  - ID.
  - Phone number.
  - Check status (optional, default unchecked).
- The student picture is static (same for all students).
- The new student is immediately added to the list.

---

### **3. Student Details**
- Displays the details of a selected student.
- Includes:
  - Name.
  - ID.
  - Phone number.
  - Check status.
- Functionalities:
  - "Edit" button to open the **Edit Student** screen.
  - "Delete" button to remove the student from the repository.

---

### **4. Edit Student**
- Allows editing or deleting a student's details.
- Editable fields:
  - Name.
  - ID.
  - Phone number.
  - Check status.
- Functionalities:
  - Save changes (updates the repository and the list).
  - Delete student (removes the student from the repository).

---

## Technical Details

- **Data Storage**: All data is stored in memory using a shared model. There is no real database, and data is cleared when the app is closed.
- **Screens Implementation**: 
  - Each screen is implemented as a separate Activity.
- **List Implementation**: 
  - The student list is implemented using a RecyclerView.

---

## How to Run

1. Clone this repository to your local machine:
   ```bash
   gh repo clone barkobi40/StudentApp
