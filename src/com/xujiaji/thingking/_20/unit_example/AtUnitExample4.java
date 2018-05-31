package com.xujiaji.thingking._20.unit_example;

import net.mindview.atunit.Test;
import net.mindview.atunit.TestObjectCreate;
import net.mindview.atunit.TestProperty;
import net.mindview.util.OSExecute;

import java.util.*;

import static net.mindview.util.Print.print;

public class AtUnitExample4
{
    static String theory = "All brontosauruses " +
            "are thin at on end, much MUCH thicker in the " +
            "middle, and then thin again at the far end.";
    @TestProperty static List<String> input = Arrays.asList(theory.split(" "));
    @TestProperty static Iterator<String> words = input.iterator();
    private String word;
    private Random rand = new Random();
    public AtUnitExample4(String word)
    {
        this.word = word;
    }

    @TestObjectCreate static AtUnitExample4 create()
    {
        if (words.hasNext())
        {
            String nex = words.next();
            System.out.println("nex = " + nex);
            return new AtUnitExample4(nex);
        } else
        {
            return null;
        }
    }

    public static void main(String[] args)
    {
        System.out.println("starting");
        OSExecute.command("java -cp E:\\JavaProjects\\ThinkingInJava\\out\\production\\ThinkingInJava net.mindview.atunit.AtUnit out\\production\\ThinkingInJava\\com\\xujiaji\\thingking\\_20\\unit_example\\AtUnitExample4");

    }

    public String getWord()
    {
        return word;
    }

    public String scrambleWord()
    {
        List<Character> chars = new ArrayList<>();
        for (Character c : word.toCharArray())
        {
            chars.add(c);
        }
        Collections.shuffle(chars, rand);
        StringBuilder result = new StringBuilder();
        for (char ch : chars)
        {
            result.append(ch);
        }
        return result.toString();
    }

    @Test boolean scramble1()
    {
        rand = new Random(47);
        print("'" + getWord() + "'");
        String scrambled = scrambleWord();
        print(scrambled);
        return scrambled.equals("rae");
    }

    @Test boolean scramble2()
    {
        rand = new Random(74);
        print("'" + getWord() + "'");
        String scrambled = scrambleWord();
        print(scrambled);
        return scrambled.equals("tsaeborornussu");
    }

    @Test boolean words()
    {
        print("'" + getWord() + "'");
        return getWord().equals("All");
    }
}
