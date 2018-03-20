package com.xujiaji.thingking._14;

import typeinfo.pets.Pet;

import java.util.ArrayList;
import java.util.List;

class ForNameCreator extends PetCreator
{

    private static List<Class<? extends Pet>> types = new ArrayList<>();

    private static String[] typesNames =
            {
                    "typeinfo.pets.Mutt",
                    "typeinfo.pets.Pug",
                    "typeinfo.pets.EgyptianMau",
                    "typeinfo.pets.Manx",
                    "typeinfo.pets.Cymric",
                    "typeinfo.pets.Rat",
                    "typeinfo.pets.Mouse",
                    "typeinfo.pets.Hamster"
            };

    @SuppressWarnings("unchecked")
    private static void loader()
    {
        try
        {
            for (String name : typesNames)
            {

                types.add((Class<? extends Pet>) Class.forName(name));

            }
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }

    static
    {
        loader();
    }

    @Override
    public List<Class<? extends Pet>> types()
    {
        return types;
    }
}
