package me.bo0tzz.remindmebot.reminder;

/**
 * Created by boet on 30-3-2016.
 */
public class Reminder implements Comparable<Reminder> {
    private final String chatID;
    private final String reminder;
    private final Long unixTime;
    private final String userName;
    private String UUID;


    public Reminder(Long unixTime, String chatID, String reminder, String userName, String UUID) {
        this(unixTime,chatID,reminder,userName);
        this.UUID = UUID;
    }

    public Reminder(Long unixTime, String chatID, String reminder, String userName) {
        this.unixTime = unixTime;
        this.chatID = chatID;
        this.reminder = reminder;
        this.userName = userName;
    }

    public String getChatID() {
        return chatID;
    }

    public String getReminder() {
        return reminder;
    }

    public Long getUnixTime() {
        return unixTime;
    }

    public String getUserName() {
        return userName;
    }

    public String getUUID() {
        return UUID;
    }

    @Override
    public int compareTo(Reminder o) {
        return unixTime.compareTo(o.getUnixTime());
    }
}
