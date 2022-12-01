public class EventClient {

    public static void main(String[] args) {
        Event weddingEvent=
        new Event("sherwin weds nels","wedding","25-12-2022","4SR","lord's place","you look so beautiful in white","male");
        System.out.println();
        System.out.println();
        System.out.println("wedding date : "+weddingEvent.getEventDate());
        System.out.println("name : "+weddingEvent.getEventName());
        System.out.println("organiser name : "+weddingEvent.getEventOrganiser());
        System.out.println("Venue : "+weddingEvent.getEventVenue());
    }

}
