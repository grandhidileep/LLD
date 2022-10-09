package DPPrototype;

import java.util.HashMap;
import java.util.Map;

public class BirdRegistry {
    private static Map<String,Bird> birds = new HashMap<>();

    public static void registerBird(String name,Bird bird){
        birds.put(name,bird);
    }

    public static Bird getBird(String name){
        return birds.get(name).clone();
    }

}
