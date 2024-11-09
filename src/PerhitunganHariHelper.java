import java.time.*;
import java.util.Date;

public class PerhitunganHariHelper {
    
    public static long hitungJumlahHari(int bulan, int tahun, Date tanggal) {
        LocalDate startDate = LocalDate.of(tahun, bulan, 1);
        
        LocalDate endDate = tanggal.toInstant()
                                  .atZone(ZoneId.systemDefault())
                                  .toLocalDate();
        
        return java.time.temporal.ChronoUnit.DAYS.between(startDate, endDate);
    }
}
