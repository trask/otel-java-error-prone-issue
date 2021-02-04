package org.example;

import io.opentelemetry.api.GlobalOpenTelemetry;

public class Main {

    public static void main(String[] args) {
        GlobalOpenTelemetry.getTracer("test");
    }
}
