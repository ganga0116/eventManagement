package EventManagementSystem;

public interface EventOperations {
	void addEvent(Event event);
    void updateEvent(int eventId, String newName, java.util.Date newDate, String newVenue);
    void deleteEvent(int eventId);
    void viewEventDetails(int eventId);
    void generateEventReport();
}
