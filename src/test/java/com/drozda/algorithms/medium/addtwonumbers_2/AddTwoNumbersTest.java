package com.drozda.algorithms.medium.addtwonumbers_2;

import org.junit.Test;

import static org.junit.Assert.*;

public class AddTwoNumbersTest {

    @Test
    public void testSum342and465() {
        AddTwoNumbers.ListNode l1 = new AddTwoNumbers.ListNode(2);
        l1.next = new AddTwoNumbers.ListNode(4);
        l1.next.next=new AddTwoNumbers.ListNode(3);

        AddTwoNumbers.ListNode l2 = new AddTwoNumbers.ListNode(5);
        l2.next = new AddTwoNumbers.ListNode(6);
        l2.next.next=new AddTwoNumbers.ListNode(4);

        assertEquals("7->0->8->",AddTwoNumbers.addTwoNumbers(l1,l2).toString());

    }

    @Test
    public void testSum5and5() {
        AddTwoNumbers.ListNode l1 = new AddTwoNumbers.ListNode(5);

        AddTwoNumbers.ListNode l2 = new AddTwoNumbers.ListNode(5);

        assertEquals("0->1->",AddTwoNumbers.addTwoNumbers(l1,l2).toString());

    }

}