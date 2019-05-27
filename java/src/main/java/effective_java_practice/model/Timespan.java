package effective_java_practice.model;

import java.time.Instant;

public class Timespan {
    //The current time in seconds.
    long beginningTime;
    //The end time range in seconds.
    long endTime;

    private Timespan(long beginningTime, long endTime) {
        this.beginningTime = beginningTime;
        this.endTime = endTime;
    }

    /**
     * Gets a timespan by inputting seconds.
     * @param seconds
     * @return
     */
    public static Timespan fromNowInSeconds(long seconds) {
        long now = Instant.now().getEpochSecond();
        return new Timespan(now, now + seconds);
    }

    /**
     * Gets a timespan by inputting minutes.
     * @param minutes
     * @return
     */
    public static Timespan fromNowInMinutes(long minutes) {
        long now = Instant.now().getEpochSecond();
        return new Timespan(now, now + (minutes * 60));
    }

    public long getBeginningTime() {
        return beginningTime;
    }

    public long getEndTime() {
        return endTime;
    }
}
