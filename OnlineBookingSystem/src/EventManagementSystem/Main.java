package EventManagementSystem;
import java.util.Date;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
        EventManagement eventManagement = new EventManagement();
        Scanner scanner = new Scanner(System.in);

		        while (true) {
		            System.out.println("Event Management System");
		            System.out.println("1. Add Event");
		            System.out.println("2. Update Event");
		            System.out.println("3. Delete Event");
		            System.out.println("4. List Events");
		            System.out.println("5. View Event Details");
		            System.out.println("6. Generate Event Report");
		            System.out.println("7. Exit");
		            System.out.print("Choose an option: ");
		            int choice = scanner.nextInt();
		            scanner.nextLine();  // Consume newline

		            switch (choice) {
		                case 1:
		                    System.out.print("Enter Event ID: ");
		                    int id = scanner.nextInt();
		                    scanner.nextLine();  // Consume newline
		                    System.out.print("Enter Event Name: ")
		                    String name = scanner.nextLine();
		                    System.out.print("Enter Event Date (yyyy-mm-dd): ");
		                    String dateStr = scanner.nextLine();
		                    Date date = java.sql.Date.valueOf(dateStr);
		                    System.out.print("Enter Event Venue: ");
		                    String venue = scanner.nextLine();
		                    Event event = new Event(id, name, date, venue);
		                    eventManagement.addEvent(event);
		                    break;
		                case 2:
		                    System.out.print("Enter Event ID to update: ");
		                    int updateId = scanner.nextInt();
		                    scanner.nextLine();  // Consume newline
		                    System.out.print("Enter New Event Name: ");
		                    String newName = scanner.nextLine();
		                    System.out.print("Enter New Event Date (yyyy-mm-dd): ");
		                    String newDateStr = scanner.nextLine();
		                    Date newDate = java.sql.Date.valueOf(newDateStr);
		                    System.out.print("Enter New Event Venue: ");
		                    String newVenue = scanner.nextLine();
		                    eventManagement.updateEvent(updateId, newName, newDate, newVenue);
		                    break;
		                case 3:
		                    System.out.print("Enter Event ID to delete: ");
		                    int deleteId = scanner.nextInt();
		                    eventManagement.deleteEvent(deleteId);
		                    break;
		                case 4:
		                    eventManagement.listEvents();
		                    break;
		                case 5:
		                    System.out.print("Enter Event ID to view details: ");
		                    int viewId = scanner.nextInt();
		                    eventManagement.viewEventDetails(viewId);
		                    break;
		                case 6:
		                    eventManagement.generateEventReport();
		                    break;
		                case 7:
		                    System.out.println("Exiting...");
		                    scanner.close();
		                    return;
		                default:
		                    System.out.println("Invalid choice. Please try again.");
		            }
		        }
		    }
}
