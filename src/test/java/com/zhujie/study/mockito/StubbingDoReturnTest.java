package com.zhujie.study.mockito;

import org.junit.Test;

import java.util.LinkedList;

import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;

/**
 * Created by zhujie on 15/11/20.
 */
public class StubbingDoReturnTest {

    @Test
    public void test() {
        LinkedList mockedList = mock(LinkedList.class);

        doThrow(new RuntimeException()).when(mockedList).clear();

        //following throws RuntimeException:
        mockedList.clear();
    }
}
