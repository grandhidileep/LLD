package DPPrototype;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Sparrow sp = new Sparrow();
        sp.setLegSize(10);
        sp.setColor("Brow");
        sp.setName("Sparrow");
        sp.setWeight("10");
        BirdRegistry.registerBird("Sparrow",sp);

        Sparrow longLegSparrow = new Sparrow();
        longLegSparrow.setLegSize(100);
        longLegSparrow.setColor("Brow");
        longLegSparrow.setName("Long Leg Sparrow");
        longLegSparrow.setWeight("10");
        BirdRegistry.registerBird(longLegSparrow.getName(), longLegSparrow);

        Crow sweetSoundCrow = new Crow();
        sweetSoundCrow.setColor("Brow");
        sweetSoundCrow.setName("Sweet Sound Crow");
        sweetSoundCrow.setWeight("10");
        BirdRegistry.registerBird(longLegSparrow.getName(), sweetSoundCrow);

        List<String> birdTypeList = new ArrayList<>();
        birdTypeList.add(sp.getName());
        birdTypeList.add(longLegSparrow.getName());
        birdTypeList.add(sweetSoundCrow.getName());
        List<Bird> children = new ArrayList<>();
        for(String str:birdTypeList){
            children.add(BirdRegistry.getBird(str));

        }
    }
}
