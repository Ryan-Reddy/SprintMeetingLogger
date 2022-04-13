package dataprocessing;

import javafx.beans.property.SimpleStringProperty;

public class MeetingDataModel {
    private final SimpleStringProperty MeetingNaam;
    private final SimpleStringProperty Datum;
    private final SimpleStringProperty Starttijd;
    private final SimpleStringProperty Eindtijd;
    private final SimpleStringProperty Ryan;
    private final SimpleStringProperty Bayan;
    private final SimpleStringProperty Oussama;
    private final SimpleStringProperty Mees;
    private final SimpleStringProperty Mohamed;
    private final SimpleStringProperty Thijs;
    private final SimpleStringProperty Note;

    public MeetingDataModel(String meetingNaam,
                            String datum,
                            String starttijd,
                            String eindtijd,
                            String ryan,
                            String bayan,
                            String oussama,
                            String mees,
                            String mohamed,
                            String thijs,
                            String note
    ) {
        MeetingNaam = new SimpleStringProperty(meetingNaam);
        Datum = new SimpleStringProperty(datum);
        Starttijd = new SimpleStringProperty(starttijd);
        Eindtijd = new SimpleStringProperty(eindtijd);
        Ryan = new SimpleStringProperty(ryan);
        Bayan = new SimpleStringProperty(bayan);
        Oussama = new SimpleStringProperty(oussama);
        Mees = new SimpleStringProperty(mees);
        Mohamed = new SimpleStringProperty(mohamed);
        Thijs = new SimpleStringProperty(thijs);
        Note = new SimpleStringProperty(note);
    }


}
