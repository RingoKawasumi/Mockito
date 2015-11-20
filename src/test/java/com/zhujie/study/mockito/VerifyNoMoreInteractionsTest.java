package com.zhujie.study.mockito;

import org.junit.Test;

import java.util.LinkedList;

import static org.mockito.Mockito.*;

/**
 * Created by zhujie on 15/11/20.
 */
public class VerifyNoMoreInteractionsTest {
    @Test
    public void test() {
        LinkedList mockedList = mock(LinkedList.class);

        //using mocks
        mockedList.add("one");
        mockedList.add("two");

        verify(mockedList).add("one");

        //following verification will fail
        verifyNoMoreInteractions(mockedList);
    }
}
