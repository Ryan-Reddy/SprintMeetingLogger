package dataprocessing;

import javafx.beans.property.SimpleStringProperty;

public class MeetingDataModel {
    private final SimpleStringProperty meetingNaam;
    private final SimpleStringProperty datum;
    private final SimpleStringProperty startTijd;
    private final SimpleStringProperty eindTijd;
    private final SimpleStringProperty ryan;
    private final SimpleStringProperty bayan;
    private final SimpleStringProperty oussama;
    private final SimpleStringProperty mees;
    private final SimpleStringProperty mohamed;
    private final SimpleStringProperty thijs;
    private final SimpleStringProperty note;


    public MeetingDataModel(String meetingNaam,
                            String datum,
                            String startTijd,
                            String eindTijd,
                            String ryan,
                            String bayan,
                            String oussama,
                            String mees,
                            String mohamed,
                            String thijs,
                            String note) {
        this.meetingNaam = new SimpleStringProperty(meetingNaam);
        this.datum = new SimpleStringProperty(datum);
        this.startTijd = new SimpleStringProperty(startTijd);
        this.eindTijd = new SimpleStringProperty(eindTijd);
        this.ryan = new SimpleStringProperty(ryan);
        this.bayan = new SimpleStringProperty(bayan);
        this.oussama = new SimpleStringProperty(oussama);
        this.mees = new SimpleStringProperty(mees);
        this.mohamed = new SimpleStringProperty(mohamed);
        this.thijs = new SimpleStringProperty(thijs);
        this.note = new SimpleStringProperty(note);
    }

    public String getMeetingNaam() {
        return meetingNaam.get().substring(meetingNaam.get().indexOf("= ")+2);
    }

    public SimpleStringProperty meetingNaamProperty() {
        return meetingNaam;
    }

    public void setMeetingNaam(String meetingNaam) {
        this.meetingNaam.set(meetingNaam);
    }

    public String getDatum() {
        return datum.get().substring(datum.get().indexOf("= ")+2);
    }

    public SimpleStringProperty datumProperty() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum.set(datum);
    }

    public String getStartTijd() {
        return startTijd.get().substring(startTijd.get().indexOf("= ")+2);
    }

    public SimpleStringProperty startTijdProperty() {
        return startTijd;
    }

    public void setStartTijd(String startTijd) {
        this.startTijd.set(startTijd);
    }

    public String getEindTijd() {
        return eindTijd.get().substring(eindTijd.get().indexOf("= ")+2);
    }

    public SimpleStringProperty eindTijdProperty() {
        return eindTijd;
    }

    public void setEindTijd(String eindTijd) {
        this.eindTijd.set(eindTijd);
    }

    public String getRyan() {
        return ryan.get().substring(ryan.get().indexOf("= ")+2);
    }

    public SimpleStringProperty ryanProperty() {
        return ryan;
    }

    public void setRyan(String ryan) {
        this.ryan.set(ryan);
    }

    public String getBayan() {
        return bayan.get().substring(bayan.get().indexOf("= ")+2);
    }

    public SimpleStringProperty bayanProperty() {
        return bayan;
    }

    public void setBayan(String bayan) {
        this.bayan.set(bayan);
    }

    public String getOussama() {
        return oussama.get().substring(oussama.get().indexOf("= ")+2);
    }

    public SimpleStringProperty oussamaProperty() {
        return oussama;
    }

    public void setOussama(String oussama) {
        this.oussama.set(oussama);
    }

    public String getMees() {
        return mees.get().substring(mees.get().indexOf("=")+1);
    }

    public SimpleStringProperty meesProperty() {
        return mees;
    }

    public void setMees(String mees) {
        this.mees.set(mees);
    }

    public String getMohamed() {
        return mohamed.get().substring(mohamed.get().indexOf("= ")+2);
    }

    public SimpleStringProperty mohamedProperty() {
        return mohamed;
    }

    public void setMohamed(String mohamed) {
        this.mohamed.set(mohamed);
    }

    public String getThijs() {
        return thijs.get().substring(thijs.get().indexOf("= ")+2);
    }

    public SimpleStringProperty thijsProperty() {
        return thijs;
    }

    public void setThijs(String thijs) {
        this.thijs.set(thijs);
    }

    public String getNote() {
        return note.get().substring(note.get().indexOf("= ")+2);
    }

    public SimpleStringProperty noteProperty() { return note; }

    public void setNote(String note) {
        this.note.set(note);
    }
}
