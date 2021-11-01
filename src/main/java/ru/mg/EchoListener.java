package ru.mg;

import java.nio.charset.StandardCharsets;

public class EchoListener {
    public String handleMessage(byte[] in) {
        return new String(in, StandardCharsets.UTF_8);
    }
}
