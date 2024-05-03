import java.util.zip.CRC32;

public class MyCRC32 {
    public long calculateCRC32(String data) {
        CRC32 crc32 = new CRC32();
        crc32.update(data.getBytes());
        return crc32.getValue();
    }
}
