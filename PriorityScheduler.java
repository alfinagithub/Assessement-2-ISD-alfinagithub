import java.util.PriorityQueue;
import java.util.ArrayList;


public class PriorityScheduler {
    private PriorityQueue<PaketSchedule> scheduleQueue;

    public PriorityScheduler() {
        this.scheduleQueue = new PriorityQueue<>();
    }

    public void terimaPaket(int id, String name, int date, String type, String alamat) {
        this.scheduleQueue.add(new PaketSchedule(id, type, name, date, alamat));
    }

    public PaketSchedule getNextSchedule() {
        return this.scheduleQueue.poll();
    }
    
    public void listJadwal() {
        ArrayList<PaketSchedule> schedules = new ArrayList<>();

        while (!this.scheduleQueue.isEmpty()) {
            schedules.add(this.scheduleQueue.poll());
        }

        for (PaketSchedule schedule : schedules) {
            System.out.println(schedule);
        }
    }


}

