package com.cpd.hotel_system.hotel_management_service_api.util;

import org.springframework.stereotype.Service;

import javax.sql.rowset.serial.SerialBlob;
import java.nio.charset.StandardCharsets;
import java.sql.SQLException;

@Service
public class ByteCodeHandler {
    public String stringToBlob(String data) throws SQLException {
        byte[] bytes = data.getBytes(StandardCharsets.UTF_8);
        return new SerialBlob(bytes).toString();
    }

    public String blobToString(String data) throws SQLException {
        int blobLength = (int)data.length();
        byte[] bytes = data.getBytes();
        return new String(bytes, StandardCharsets.UTF_8);
    }
}
