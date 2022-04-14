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
                            String note) {
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

    public String getMeetingNaam() {
        return MeetingNaam.get();
    }

    public SimpleStringProperty meetingNaamProperty() {
        return MeetingNaam;
    }

    public void setMeetingNaam(String meetingNaam) {
        this.MeetingNaam.set(meetingNaam);
    }

    public String getDatum() {
        return Datum.get();
    }

    public SimpleStringProperty datumProperty() {
        return Datum;
    }

    public void setDatum(String datum) {
        this.Datum.set(datum);
    }

    public String getStarttijd() {
        return Starttijd.get();
    }

    public SimpleStringProperty starttijdProperty() {
        return Starttijd;
    }

    public void setStarttijd(String starttijd) {
        this.Starttijd.set(starttijd);
    }

    public String getEindtijd() {
        return Eindtijd.get();
    }

    public SimpleStringProperty eindtijdProperty() {
        return Eindtijd;
    }

    public void setEindtijd(String eindtijd) {
        this.Eindtijd.set(eindtijd);
    }

    public String getRyan() {
        return Ryan.get();
    }

    public SimpleStringProperty ryanProperty() {
        return Ryan;
    }

    public void setRyan(String ryan) {
        this.Ryan.set(ryan);
    }

    public String getBayan() {
        return Bayan.get();
    }

    public SimpleStringProperty bayanProperty() {
        return Bayan;
    }

    public void setBayan(String bayan) {
        this.Bayan.set(bayan);
    }

    public String getOussama() {
        return Oussama.get();
    }

    public SimpleStringProperty oussamaProperty() {
        return Oussama;
    }

    public void setOussama(String oussama) {
        this.Oussama.set(oussama);
    }

    public String getMees() {
        return Mees.get();
    }

    public SimpleStringProperty meesProperty() {
        return Mees;
    }

    public void setMees(String mees) {
        this.Mees.set(mees);
    }

    public String getMohamed() {
        return Mohamed.get();
    }

    public SimpleStringProperty mohamedProperty() {
        return Mohamed;
    }

    public void setMohamed(String mohamed) {
        this.Mohamed.set(mohamed);
    }

    public String getThijs() {
        return Thijs.get();
    }

    public SimpleStringProperty thijsProperty() {
        return Thijs;
    }

    public void setThijs(String thijs) {
        this.Thijs.set(thijs);
    }

    public String getNote() {
        return Note.get();
    }

    public SimpleStringProperty noteProperty() {
        return Note;
    }

    public void setNote(String note) {
        this.Note.set(note);
    }
}
