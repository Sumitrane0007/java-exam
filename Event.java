public class Event{
    private String EventName, EventType, EventDate, EventOrganiser,EventVenue, Song, Gender;

    public Event() {
    }

    public Event(String eventName, String eventType, String eventDate, String eventOrganiser, String eventVenue,
            String song, String gender) {
        EventName = eventName;
        EventType = eventType;
        EventDate = eventDate;
        EventOrganiser = eventOrganiser;
        EventVenue = eventVenue;
        Song = song;
        Gender = gender;
    }

    public Event(String eventName, String song, String gender) {
        EventName = eventName;
        Song = song;
        Gender = gender;
    }

    public String getEventName() {
        return EventName;
    }

    public void setEventName(String eventName) {
        EventName = eventName;
    }

    public String getEventType() {
        return EventType;
    }

    public void setEventType(String eventType) {
        EventType = eventType;
    }

    public String getEventDate() {
        return EventDate;
    }

    public void setEventDate(String eventDate) {
        EventDate = eventDate;
    }

    public String getEventOrganiser() {
        return EventOrganiser;
    }

    public void setEventOrganiser(String eventOrganiser) {
        EventOrganiser = eventOrganiser;
    }

    public String getEventVenue() {
        return EventVenue;
    }

    public void setEventVenue(String eventVenue) {
        EventVenue = eventVenue;
    }

    public String getSong() {
        return Song;
    }

    public void setSong(String song) {
        Song = song;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }
    
}