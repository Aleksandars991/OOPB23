package company.controller;

import company.capacitor.Capacitor;

import java.util.HashMap;

/**
 * Created by genchew on 16.10.17.
 */
public class CapacitorConsumerController {

    private HashMap<String, Capacitor> capacitors;
    private Capacitor currentCapacitor;

    public CapacitorConsumerController(HashMap<String, Capacitor> capacitors) {
        this.capacitors = new HashMap<>(capacitors);
    }

    public Capacitor getCurrentCapacitor() {
        return this.currentCapacitor;
    }

    public void setCurrentCapacitor(String name) {
        this.currentCapacitor = this.capacitors.get(name);
    }

    public void addCapacitor(String key, Capacitor capacitor) {
        this.capacitors.put(key, capacitor);
    }
}
