package com.zhujie.study.mockito;

import org.junit.Test;

import java.util.LinkedList;

import static org.mockito.Mockito.*;

/**
 * Created by zhujie on 15/11/20.
 */
public class ArgumentMatchersTest {

    @Test
    public void test() {
        LinkedList mockedList = mock(LinkedList.class);
        //stubbing using built-in anyInt() argument matcher
        when(mockedList.get(anyInt())).thenReturn("element");
        //stubbing using custom matcher (let's say isValid() returns your own matcher implementation):
//        when(mockedList.contains(argThat(isvalid()))).thenReturn("element");
        //following prints "element"
        System.out.println(mockedList.get(999));
        //you can also verify using an argument matcher
        verify(mockedList).get(anyInt());

        mockedList.add(1, "hello");
        verify(mockedList).add(anyInt(), eq("hello"));
        //above is correct - eq() is also an argument matcher
//        verify(mockedList).add(anyInt(), "hello");
        //above is incorrect - exception will be thrown because third argument is given without an argument matcher.
    }
}
