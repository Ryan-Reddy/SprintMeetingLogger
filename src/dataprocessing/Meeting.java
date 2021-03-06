package dataprocessing;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Meeting {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
    String nowEndTime = dtf.format(LocalTime.now());
    private final boolean ryan;
    private final boolean bayan;
    private final boolean oussama;
    private final boolean mees;
    private final boolean mohamed;
    private final boolean thijs;
    private final String subject;
    private final LocalDate date;
    private final String time;
    private final String endTime;
    private final String note;


    public Meeting(boolean ryan, boolean bayan, boolean oussama, boolean mees, boolean mohamed, boolean thijs, String subject, LocalDate date, String time, String endTime, String note) {
        this.ryan = ryan;
        this.bayan = bayan;
        this.oussama = oussama;
        this.mees = mees;
        this.mohamed = mohamed;
        this.thijs = thijs;
        this.subject = subject;
        this.date = date;
        this.endTime = endTime;
        this.time = time;
        this.note = note;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Meeting)) {
            return false;
        }
        Meeting m = (Meeting) o;
        System.out.println(date == m.date);
        System.out.println(subject.equals(m.subject));
        return date == m.date && subject.equals(m.subject);
    }

    @Override
    public String toString() {
        String s =
                    "{Meeting subject= '" + subject +
                    "'; date= " + date +
                    "; starttime= " + time +
                    "; endtime= " + nowEndTime +
                    "; ryan= " + ryan +
                    "; bayan= " + bayan +
                    "; oussama= " + oussama +
                    "; mees=" + mees +
                    "; mohamed= " + mohamed +
                    "; thijs= " + thijs +
                    "; note= '";

        if (endTime.equals("<now>")) {
            return s + note.replace("\n","") + "'}";
        } else {
            return s + note + "'}";
        }

    }
}
