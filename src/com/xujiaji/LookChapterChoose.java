package com.xujiaji;

import java.util.Random;

public class LookChapterChoose
{
    public static void main(String[] args)
    {
        final int[] readChapters = {1, 2, 5, 6, 10, 11};
        int read = new Random().nextInt(22);
        for (int i : readChapters)
        {
            if (i == read)
            {
                main(null);
                return;
            }
        }
        System.out.println(read);
    }
}
