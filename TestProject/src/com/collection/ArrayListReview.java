package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * @Auther:PEX
 * @Date:2020/6/22-20:24
 * @Description: com.collection
 * @version:1.8
 */

/**
 *构造方法：
 *ArrayList()
 *            构造一个初始容量为 10 的空列表（每次递增容量的一半）
 *ArrayList(Collection<? extends E> c)
 *            构造一个包含指定 collection 的元素的列表，这些元素是按照该 collection 的迭代器返回它们的顺序排列的
 *ArrayList(int initialCapacity)
 *            构造一个具有指定初始容量的空列表
 *
 * 特有方法：
 * void ensureCapacity(int minCapacity)
 *           如有必要，增加此 ArrayList 实例的容量，以确保它至少能够容纳最小容量参数所指定的元素数。
 *           返回此列表中最后一次出现的指定元素的索引，或如果此列表不包含索引，则返回 -1。
 *  protected  void removeRange(int fromIndex, int toIndex)
 *           移除列表中索引在 fromIndex（包括）和 toIndex（不包括）之间的所有元素。
 *
 */

public class ArrayListReview {
    public static void main(String[] args){
        ArrayList<String> infosList = new ArrayList<>();
        ArrayList<String> infosList1 = new ArrayList<>();
        infosList.add("aaa");
        infosList.add("bbb");
        infosList.add("ccc");
        infosList.add("ddd");
        infosList.add(4,"ddd");//此条语句把"ddd"字符串放到infosList的第4个位置

        //显示数组链表的内容
        System.out.println("The arraylist contains the following elements:" + infosList);

        //检查元素的位置
        int pos  = infosList.indexOf("ddd");
        System.out.println("The index of ddd is:" + pos);

        //检查链表是否为空
        boolean kong = infosList.isEmpty();
        System.out.println("The arrayList is empty:" + kong);

        //检查链表的大小
        int size = infosList.size();
        System.out.println("The arraylist's size:" + size);

        //检查链表是否包含某元素
        boolean contains = infosList.contains("aaa");
        System.out.println("The arraylist contains of aaa is " + contains);

        //遍历arraylist中的元素

        //1.循环使用元素索引和链表的大小
        System.out.println("----------------------------------");
        for (int i = 0; i < infosList.size(); i++) {
            System.out.println("index" + i + "-Item is " + infosList.get(i));
        }

        //2.使用foreach循环
        System.out.println("----------------------------------");
        for(String str :infosList) {
            System.out.println("Item is " + str);
        }

        //3.使用迭代器
        //hasNext();返回true表示链表中还有元素
        //next();返回下一个元素
        System.out.println("----------------------------------");
        Iterator<String> iterator =infosList.iterator();
        for(;iterator.hasNext();) {
            System.out.println("Item of infosList is " + iterator.next());
        }

        //转换ArrayList为Array
        String[] simpleArray = infosList.toArray(new String[infosList.size()]);
        System.out.println("The array created after the conversion of our arraylise is:" + Arrays.toString(simpleArray));
    }
}
