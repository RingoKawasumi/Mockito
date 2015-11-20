package com.zhujie.study.mockito;

import org.junit.Test;

import java.util.List;

import static org.mockito.Mockito.*;

/**
 * Created by zhujie on 15/11/20.
 */
public class VerifyZeroInteractionsTest {
    @Test
    public void test() {
        List mockOne = mock(List.class);
        List mockTwo = mock(List.class);
        List mockThree = mock(List.class);

        //using mocks - only mockOne is interacted
        mockOne.add("one");

        //ordinary verification
        verify(mockOne).add("one");

        //verify that method was never called on a mock
        verify(mockOne, never()).add("two");

        //verify that other mocks were not interacted
        verifyZeroInteractions(mockTwo, mockThree);
    }
}
