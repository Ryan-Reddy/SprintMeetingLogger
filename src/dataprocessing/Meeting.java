package dataprocessing;

import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Meeting {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
    String nowEndTime = dtf.format(LocalTime.now());
    private final boolean ryan;
    private final boolean bayan;
    private final boolean oussama;
    private final boolean mees;
    private final boolean mohamed;
    private final String subject;
    private final LocalDate date;
    private final String time;
    private final String endTime;
    private final String note;


    public Meeting(boolean ryan, boolean bayan, boolean oussama, boolean mees, boolean mohamed, String subject, LocalDate date, String time, String endTime, String note) {
        this.ryan = ryan;
        this.bayan = bayan;
        this.oussama = oussama;
        this.mees = mees;
        this.mohamed = mohamed;
        this.subject = subject;
        this.date = date;
        this.endTime = endTime;
        this.time = time;
        this.note = note;
    }

    @Override
    public String toString() {
        if (endTime.equals("<now>")) {
            System.out.println(endTime.getBytes(StandardCharsets.UTF_8));
            String s =
                    "[Meeting subject= '" + subject +
                    "', date= " + date +
                    ", starttime= " + time +
                    ", endtime= " + nowEndTime +
                    ", ryan= " + ryan +
                    ", bayan= " + bayan +
                    ", oussama= " + oussama +
                    ", mees=" + mees +
                    ", mohamed= " + mohamed +
                    ", note= '" + note + "']";
            return s;
        } else {
            String s =
                    "[Meeting subject= '" + subject +
                    "', date= " + date +
                    ", starttime= " + time +
                    ", endtime= " + endTime +
                    ", ryan= " + ryan +
                    ", bayan= " + bayan +
                    ", oussama= " + oussama +
                    ", mees=" + mees +
                    ", mohamed= " + mohamed +
                    ", note= '" + note + "']";
            return s;
        }

    }
}
