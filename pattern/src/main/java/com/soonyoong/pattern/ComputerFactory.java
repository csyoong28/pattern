package com.soonyoong.pattern;

import com.soonyoong.pattern.model.Computer;
import com.soonyoong.pattern.model.PC;
import com.soonyoong.pattern.model.Server;

public class ComputerFactory {
    public static Computer getComputer(String type, String ram, String hdd, String cpu) {
        if ("PC".equalsIgnoreCase(type))
            return new PC(ram, hdd, cpu);
        else if ("Server".equalsIgnoreCase(type))
            return new Server(ram, hdd, cpu);
        return null;
    }
}
