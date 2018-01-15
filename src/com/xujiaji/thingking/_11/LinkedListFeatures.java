package com.xujiaji.thingking._11;

import typeinfo.pets.Hamster;
import typeinfo.pets.Pet;
import typeinfo.pets.Pets;
import typeinfo.pets.Rat;

import java.util.LinkedList;

import static net.mindview.util.Print.print;

public class LinkedListFeatures
{
    public static void main(String[] args)
    {
        LinkedList<Pet> pets = new LinkedList<>(Pets.arrayList(5));
        print(pets);
        print("pets.getFirst():" + pets.getFirst());//返回第一个元素，没有则抛出异常NoSuchElementException
        print("pets.element():" + pets.element());//实际上调用的就是getFirst()
        print("pets.peek():" + pets.peek());//返回第一个元素，没有元素时返回null，而不是NoSuchElementException

        print("pets.removeFirst():" + pets.removeFirst());//删除并返回第一个元素，没有元素则抛出异常NoSuchElementException
        print("pets.remove():" + pets.remove());//实际上调用的就是removeFirst()
        print("pets.poll():" + pets.poll());//删除并返回第一个元素，没有则返回null
        print(pets);

        pets.addFirst(new Rat());//将元素添加在首部
        print("addFirst(new Rat()):" + pets);
        pets.add(Pets.randomPet());//将元素添加在末尾
        print("add():" + pets);
        pets.offer(Pets.randomPet());//实际调用的就是add()
        print("offer():" + pets);
        pets.addLast(new Hamster());//将元素添加到末尾
        print("addLast():" + pets);
        print("removeLast():" + pets.removeLast());//移除最后的元素，没有则抛出异常NoSuchElementException

    }
}
