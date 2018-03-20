package com.xujiaji.thingking._14;

import net.mindview.util.MapData;
import typeinfo.pets.Pet;

import java.util.LinkedHashMap;
import java.util.Map;

import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printnb;

public class PetCount3
{
    public static void main(String[] args)
    {
        PetCounter petCounter = new PetCounter();
        for (Pet pet : Pets.createArray(20))
        {
            printnb(pet.getClass().getSimpleName() + " ");
            petCounter.count(pet);
        }
        print();
        print(petCounter);
    }

    static class PetCounter extends LinkedHashMap<Class<? extends Pet>, Integer>
    {
        public PetCounter()
        {
            super(MapData.map(LiteralPetCreator.allTypes, 0));
        }

        public void count(Pet pet)
        {
            for (Map.Entry<Class<? extends Pet>, Integer> pair : entrySet())
            {
                if (pair.getKey().isInstance(pet))
                {
                    put(pair.getKey(), pair.getValue() + 1);
                }
            }
        }

        @Override
        public String toString()
        {
            StringBuilder result = new StringBuilder("{");
            for (Map.Entry<Class<? extends Pet>, Integer> pair
                    : entrySet())
            {
                result.append(pair.getKey().getSimpleName());
                result.append("=");
                result.append(pair.getValue());
                result.append(", ");
            }
            result.delete(result.length() - 2, result.length());
            result.append("}");
            return result.toString();
        }
    }
}
