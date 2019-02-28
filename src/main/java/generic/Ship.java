package generic;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Ship<K, D> {

    private Map<K, D> droids = new HashMap<>();

    public D getDroid(K droidKey) {

        return droids.get(droidKey);
    }

    public Map<K, D> getAllDroids(Collection<? extends K> keys) {
        Map<K, D>droidsToGet = new HashMap<>();

        for (K key : keys) {
            droidsToGet.put(key, droids.get(key));
        }

        return droidsToGet;
    }

    public void putDroid(K key, D droid) {

        this.droids.put(key, droid);
    }

    public void putAllDroids(Map<? super K,? super D> droids) {

        for (Map.Entry<? super K, ? super D> droid : droids.entrySet()) {

            this.droids.put((K)droid.getKey(), (D) droid.getValue());
        }
    }
}