package org.autotest.generated;
import org.autotest.MutationAnalysisRunner;

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest16 extends MutationAnalysisRunner {
    @Override
    protected boolean useVerboseMode() { return false; }

    public static boolean debug = false;

    @Test
    public void test801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test801");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isFull();
        int int5 = stackAr1.size();
        boolean boolean6 = stackAr1.isFull();
        java.lang.String str7 = stackAr1.toString();
        boolean boolean8 = stackAr1.isFull();
        java.lang.String str9 = stackAr1.toString();
        org.autotest.Stack stackAr11 = createStack((int) (byte) 1);
        int int12 = stackAr11.size();
        boolean boolean13 = stackAr11.isEmpty();
        java.lang.String str14 = stackAr11.toString();
        org.autotest.Stack stackAr16 = createStack(10);
        int int17 = stackAr16.size();
        boolean boolean18 = stackAr16.isEmpty();
        org.autotest.Stack stackAr20 = createStack((int) 'a');
        boolean boolean21 = stackAr20.isFull();
        java.lang.Object obj22 = null;
        boolean boolean23 = stackAr20.equals(obj22);
        boolean boolean24 = stackAr20.isFull();
        boolean boolean25 = stackAr16.equals((java.lang.Object) stackAr20);
        stackAr11.push((java.lang.Object) stackAr16);
        org.autotest.Stack stackAr28 = createStack((int) (byte) 1);
        boolean boolean29 = stackAr28.isFull();
        java.lang.String str30 = stackAr28.toString();
        org.autotest.Stack stackAr32 = createStack((int) 'a');
        int int33 = stackAr32.size();
        boolean boolean34 = stackAr32.isFull();
        stackAr28.push((java.lang.Object) stackAr32);
        boolean boolean36 = stackAr28.isFull();
        org.autotest.Stack stackAr38 = createStack((int) (byte) 1);
        int int39 = stackAr38.size();
        boolean boolean40 = stackAr38.isEmpty();
        boolean boolean41 = stackAr38.isFull();
        int int42 = stackAr38.size();
        int int43 = stackAr38.size();
        boolean boolean44 = stackAr28.equals((java.lang.Object) stackAr38);
        boolean boolean45 = stackAr16.equals((java.lang.Object) stackAr38);
        boolean boolean46 = stackAr1.equals((java.lang.Object) stackAr38);
        org.autotest.Stack stackAr48 = createStack((int) 'a');
        java.lang.String str49 = stackAr48.toString();
        int int50 = stackAr48.size();
        boolean boolean51 = stackAr48.isFull();
        stackAr38.push((java.lang.Object) stackAr48);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj53 = stackAr48.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "[]" + "'", str30, "[]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "[]" + "'", str49, "[]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test802");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        boolean boolean2 = stackAr1.isFull();
        java.lang.String str3 = stackAr1.toString();
        org.autotest.Stack stackAr5 = createStack((int) (byte) 10);
        boolean boolean6 = stackAr5.isEmpty();
        org.autotest.Stack stackAr8 = createStack((int) (byte) 1);
        stackAr5.push((java.lang.Object) (byte) 1);
        boolean boolean10 = stackAr1.equals((java.lang.Object) stackAr5);
        org.autotest.Stack stackAr12 = createStack((int) 'a');
        int int13 = stackAr12.size();
        org.autotest.Stack stackAr15 = createStack((int) 'a');
        int int16 = stackAr15.size();
        boolean boolean17 = stackAr15.isFull();
        stackAr12.push((java.lang.Object) stackAr15);
        boolean boolean19 = stackAr5.equals((java.lang.Object) stackAr15);
        org.autotest.Stack stackAr21 = createStack((int) 'a');
        boolean boolean22 = stackAr21.isFull();
        org.autotest.Stack stackAr24 = createStack((int) (byte) 1);
        int int25 = stackAr24.size();
        boolean boolean26 = stackAr24.isEmpty();
        boolean boolean27 = stackAr24.isFull();
        boolean boolean28 = stackAr24.isFull();
        int int29 = stackAr24.size();
        stackAr21.push((java.lang.Object) stackAr24);
        boolean boolean31 = stackAr15.equals((java.lang.Object) stackAr21);
        int int32 = stackAr15.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test803");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        boolean boolean2 = stackAr1.isFull();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test804");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        int int2 = stackAr1.size();
        int int3 = stackAr1.size();
        org.autotest.Stack stackAr5 = createStack((int) 'a');
        boolean boolean7 = stackAr5.equals((java.lang.Object) 1.0d);
        java.lang.String str8 = stackAr5.toString();
        stackAr1.push((java.lang.Object) str8);
        java.lang.Object obj10 = stackAr1.top();
        int int11 = stackAr1.size();
        java.lang.String str12 = stackAr1.toString();
        java.lang.String str13 = stackAr1.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "[]" + "'", obj10, "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[[]]" + "'", str12, "[[]]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[[]]" + "'", str13, "[[]]");
    }

    @Test
    public void test805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test805");
        org.autotest.Stack stackAr1 = createStack((int) '#');
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isFull();
        boolean boolean4 = stackAr1.isEmpty();
        int int5 = stackAr1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test806");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isFull();
        int int5 = stackAr1.size();
        boolean boolean6 = stackAr1.isFull();
        java.lang.String str7 = stackAr1.toString();
        boolean boolean8 = stackAr1.isEmpty();
        java.lang.String str9 = stackAr1.toString();
        int int10 = stackAr1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test807");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        boolean boolean2 = stackAr1.isFull();
        int int3 = stackAr1.size();
        java.lang.String str4 = stackAr1.toString();
        org.autotest.Stack stackAr6 = createStack((int) ' ');
        java.lang.String str7 = stackAr6.toString();
        boolean boolean8 = stackAr6.isFull();
        java.lang.String str9 = stackAr6.toString();
        stackAr1.push((java.lang.Object) str9);
        org.autotest.Stack stackAr12 = createStack((int) (byte) 100);
        stackAr1.push((java.lang.Object) stackAr12);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
    }

    @Test
    public void test808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test808");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        boolean boolean2 = stackAr1.isFull();
        int int3 = stackAr1.size();
        org.autotest.Stack stackAr5 = createStack((int) (byte) 1);
        int int6 = stackAr5.size();
        boolean boolean7 = stackAr5.isEmpty();
        boolean boolean8 = stackAr5.isFull();
        int int9 = stackAr5.size();
        boolean boolean10 = stackAr5.isFull();
        java.lang.String str11 = stackAr5.toString();
        boolean boolean12 = stackAr5.isFull();
        stackAr1.push((java.lang.Object) boolean12);
        stackAr1.push((java.lang.Object) 100.0f);
        boolean boolean16 = stackAr1.isEmpty();
        java.lang.String str17 = stackAr1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[false,100.0]" + "'", str17, "[false,100.0]");
    }

    @Test
    public void test809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test809");
        org.autotest.Stack stackAr1 = createStack(10);
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test810");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isFull();
        org.autotest.Stack stackAr7 = createStack((int) 'a');
        boolean boolean8 = stackAr7.isFull();
        int int9 = stackAr7.size();
        org.autotest.Stack stackAr11 = createStack((int) (byte) 1);
        int int12 = stackAr11.size();
        boolean boolean13 = stackAr11.isEmpty();
        boolean boolean14 = stackAr11.isFull();
        int int15 = stackAr11.size();
        boolean boolean16 = stackAr11.isFull();
        java.lang.String str17 = stackAr11.toString();
        boolean boolean18 = stackAr11.isFull();
        stackAr7.push((java.lang.Object) boolean18);
        stackAr7.push((java.lang.Object) 100.0f);
        boolean boolean22 = stackAr7.isEmpty();
        boolean boolean23 = stackAr1.equals((java.lang.Object) stackAr7);
        boolean boolean24 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test811");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isFull();
        int int5 = stackAr1.size();
        boolean boolean6 = stackAr1.isFull();
        org.autotest.Stack stackAr8 = createStack((int) 'a');
        boolean boolean10 = stackAr8.equals((java.lang.Object) 1.0d);
        java.lang.String str11 = stackAr8.toString();
        stackAr1.push((java.lang.Object) stackAr8);
        stackAr8.push((java.lang.Object) 1);
        org.autotest.Stack stackAr16 = createStack((int) 'a');
        boolean boolean17 = stackAr16.isFull();
        java.lang.Object obj18 = null;
        boolean boolean19 = stackAr16.equals(obj18);
        boolean boolean20 = stackAr16.isFull();
        org.autotest.Stack stackAr22 = createStack((int) (byte) 1);
        int int23 = stackAr22.size();
        int int24 = stackAr22.size();
        org.autotest.Stack stackAr26 = createStack((int) (byte) 1);
        int int27 = stackAr26.size();
        boolean boolean28 = stackAr26.isEmpty();
        boolean boolean29 = stackAr26.isFull();
        int int30 = stackAr26.size();
        boolean boolean31 = stackAr26.isFull();
        org.autotest.Stack stackAr33 = createStack((int) 'a');
        boolean boolean35 = stackAr33.equals((java.lang.Object) 1.0d);
        java.lang.String str36 = stackAr33.toString();
        stackAr26.push((java.lang.Object) stackAr33);
        stackAr22.push((java.lang.Object) stackAr33);
        boolean boolean39 = stackAr16.equals((java.lang.Object) stackAr33);
        java.lang.Object obj40 = new java.lang.Object();
        boolean boolean41 = stackAr33.equals(obj40);
        boolean boolean42 = stackAr33.isEmpty();
        stackAr8.push((java.lang.Object) boolean42);
        org.autotest.Stack stackAr45 = createStack((int) 'a');
        int int46 = stackAr45.size();
        java.lang.String str47 = stackAr45.toString();
        org.autotest.Stack stackAr49 = createStack((int) 'a');
        boolean boolean50 = stackAr49.isFull();
        int int51 = stackAr49.size();
        boolean boolean52 = stackAr45.equals((java.lang.Object) int51);
        boolean boolean53 = stackAr8.equals((java.lang.Object) boolean52);
        org.autotest.Stack stackAr55 = createStack((int) 'a');
        boolean boolean57 = stackAr55.equals((java.lang.Object) 1.0d);
        java.lang.String str58 = stackAr55.toString();
        boolean boolean59 = stackAr55.isFull();
        int int60 = stackAr55.size();
        int int61 = stackAr55.size();
        int int62 = stackAr55.size();
        boolean boolean64 = stackAr55.equals((java.lang.Object) "[[]]");
        boolean boolean65 = stackAr55.isEmpty();
        org.autotest.Stack stackAr67 = createStack((int) 'a');
        boolean boolean68 = stackAr67.isFull();
        java.lang.Object obj69 = null;
        boolean boolean70 = stackAr67.equals(obj69);
        boolean boolean71 = stackAr67.isFull();
        org.autotest.Stack stackAr73 = createStack((int) (byte) 1);
        int int74 = stackAr73.size();
        int int75 = stackAr73.size();
        org.autotest.Stack stackAr77 = createStack((int) (byte) 1);
        int int78 = stackAr77.size();
        boolean boolean79 = stackAr77.isEmpty();
        boolean boolean80 = stackAr77.isFull();
        int int81 = stackAr77.size();
        boolean boolean82 = stackAr77.isFull();
        org.autotest.Stack stackAr84 = createStack((int) 'a');
        boolean boolean86 = stackAr84.equals((java.lang.Object) 1.0d);
        java.lang.String str87 = stackAr84.toString();
        stackAr77.push((java.lang.Object) stackAr84);
        stackAr73.push((java.lang.Object) stackAr84);
        boolean boolean90 = stackAr67.equals((java.lang.Object) stackAr84);
        stackAr55.push((java.lang.Object) stackAr67);
        org.autotest.Stack stackAr93 = createStack((int) ' ');
        boolean boolean94 = stackAr93.isEmpty();
        boolean boolean95 = stackAr93.isFull();
        boolean boolean96 = stackAr67.equals((java.lang.Object) stackAr93);
        stackAr8.push((java.lang.Object) stackAr93);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "[]" + "'", str36, "[]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "[]" + "'", str47, "[]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "[]" + "'", str58, "[]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "[]" + "'", str87, "[]");
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test812");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isFull();
        java.lang.String str5 = stackAr1.toString();
        int int6 = stackAr1.size();
        stackAr1.push((java.lang.Object) 10.0d);
        int int9 = stackAr1.size();
        java.lang.Object obj10 = stackAr1.top();
        java.lang.Object obj11 = stackAr1.pop();
        java.lang.String str12 = stackAr1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 10.0d + "'", obj10, 10.0d);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 10.0d + "'", obj11, 10.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
    }

    @Test
    public void test813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test813");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        boolean boolean2 = stackAr1.isFull();
        java.lang.Object obj3 = null;
        boolean boolean4 = stackAr1.equals(obj3);
        boolean boolean5 = stackAr1.isFull();
        org.autotest.Stack stackAr7 = createStack((int) (byte) 1);
        int int8 = stackAr7.size();
        int int9 = stackAr7.size();
        org.autotest.Stack stackAr11 = createStack((int) (byte) 1);
        int int12 = stackAr11.size();
        boolean boolean13 = stackAr11.isEmpty();
        boolean boolean14 = stackAr11.isFull();
        int int15 = stackAr11.size();
        boolean boolean16 = stackAr11.isFull();
        org.autotest.Stack stackAr18 = createStack((int) 'a');
        boolean boolean20 = stackAr18.equals((java.lang.Object) 1.0d);
        java.lang.String str21 = stackAr18.toString();
        stackAr11.push((java.lang.Object) stackAr18);
        stackAr7.push((java.lang.Object) stackAr18);
        boolean boolean24 = stackAr1.equals((java.lang.Object) stackAr18);
        java.lang.String str25 = stackAr18.toString();
        org.autotest.Stack stackAr27 = createStack((int) (byte) 1);
        boolean boolean28 = stackAr27.isFull();
        java.lang.String str29 = stackAr27.toString();
        org.autotest.Stack stackAr31 = createStack((int) (byte) 10);
        boolean boolean32 = stackAr31.isEmpty();
        org.autotest.Stack stackAr34 = createStack((int) (byte) 1);
        stackAr31.push((java.lang.Object) (byte) 1);
        boolean boolean36 = stackAr27.equals((java.lang.Object) stackAr31);
        org.autotest.Stack stackAr38 = createStack((int) 'a');
        int int39 = stackAr38.size();
        org.autotest.Stack stackAr41 = createStack((int) 'a');
        int int42 = stackAr41.size();
        boolean boolean43 = stackAr41.isFull();
        stackAr38.push((java.lang.Object) stackAr41);
        boolean boolean45 = stackAr31.equals((java.lang.Object) stackAr41);
        java.lang.Object obj46 = stackAr31.top();
        stackAr18.push((java.lang.Object) stackAr31);
        java.lang.String str48 = stackAr31.toString();
        java.lang.Object obj49 = null;
        stackAr31.push(obj49);
        org.autotest.Stack stackAr52 = createStack((int) 'a');
        boolean boolean53 = stackAr52.isFull();
        java.lang.Object obj54 = null;
        boolean boolean55 = stackAr52.equals(obj54);
        boolean boolean56 = stackAr52.isFull();
        org.autotest.Stack stackAr58 = createStack((int) (byte) 1);
        int int59 = stackAr58.size();
        int int60 = stackAr58.size();
        boolean boolean61 = stackAr52.equals((java.lang.Object) stackAr58);
        int int62 = stackAr58.size();
        java.lang.String str63 = stackAr58.toString();
        stackAr31.push((java.lang.Object) str63);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[]" + "'", str25, "[]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "[]" + "'", str29, "[]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + (byte) 1 + "'", obj46, (byte) 1);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "[1]" + "'", str48, "[1]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "[]" + "'", str63, "[]");
    }

    @Test
    public void test814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test814");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        boolean boolean3 = stackAr1.equals((java.lang.Object) 1.0d);
        java.lang.String str4 = stackAr1.toString();
        stackAr1.push((java.lang.Object) 1L);
        org.autotest.Stack stackAr8 = createStack((int) (byte) 10);
        boolean boolean9 = stackAr8.isEmpty();
        org.autotest.Stack stackAr11 = createStack((int) (byte) 1);
        stackAr8.push((java.lang.Object) (byte) 1);
        stackAr1.push((java.lang.Object) stackAr8);
        java.lang.String str14 = stackAr1.toString();
        int int15 = stackAr1.size();
        org.autotest.Stack stackAr17 = createStack((int) 'a');
        int int18 = stackAr17.size();
        org.autotest.Stack stackAr20 = createStack((int) 'a');
        int int21 = stackAr20.size();
        boolean boolean22 = stackAr20.isFull();
        stackAr17.push((java.lang.Object) stackAr20);
        java.lang.Object obj24 = stackAr17.pop();
        java.lang.String str25 = stackAr17.toString();
        org.autotest.Stack stackAr27 = createStack((int) (byte) 1);
        boolean boolean28 = stackAr27.isEmpty();
        org.autotest.Stack stackAr30 = createStack((int) (byte) 1);
        boolean boolean31 = stackAr30.isEmpty();
        int int32 = stackAr30.size();
        boolean boolean33 = stackAr30.isFull();
        org.autotest.Stack stackAr35 = createStack((int) 'a');
        int int36 = stackAr35.size();
        org.autotest.Stack stackAr38 = createStack((int) 'a');
        int int39 = stackAr38.size();
        boolean boolean40 = stackAr38.isFull();
        stackAr35.push((java.lang.Object) stackAr38);
        boolean boolean42 = stackAr35.isEmpty();
        boolean boolean43 = stackAr30.equals((java.lang.Object) boolean42);
        boolean boolean44 = stackAr27.equals((java.lang.Object) boolean43);
        java.lang.Object obj45 = null;
        boolean boolean46 = stackAr27.equals(obj45);
        org.autotest.Stack stackAr48 = createStack((int) (byte) 1);
        int int49 = stackAr48.size();
        boolean boolean50 = stackAr48.isEmpty();
        boolean boolean51 = stackAr48.isFull();
        int int52 = stackAr48.size();
        int int53 = stackAr48.size();
        int int54 = stackAr48.size();
        stackAr48.push((java.lang.Object) (short) 1);
        int int57 = stackAr48.size();
        boolean boolean58 = stackAr48.isEmpty();
        boolean boolean59 = stackAr27.equals((java.lang.Object) boolean58);
        boolean boolean60 = stackAr17.equals((java.lang.Object) stackAr27);
        java.lang.String str61 = stackAr27.toString();
        int int62 = stackAr27.size();
        int int63 = stackAr27.size();
        boolean boolean64 = stackAr1.equals((java.lang.Object) int63);
        java.lang.String str65 = stackAr1.toString();
        org.autotest.Stack stackAr67 = createStack((int) (byte) 1);
        boolean boolean68 = stackAr67.isEmpty();
        int int69 = stackAr67.size();
        boolean boolean70 = stackAr67.isFull();
        java.lang.String str71 = stackAr67.toString();
        int int72 = stackAr67.size();
        stackAr67.push((java.lang.Object) 10.0d);
        java.lang.Object obj75 = stackAr67.top();
        java.lang.Object obj76 = stackAr67.pop();
        boolean boolean77 = stackAr67.isFull();
        stackAr1.push((java.lang.Object) boolean77);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[1,[1]]" + "'", str14, "[1,[1]]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "[]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[]" + "'", str25, "[]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "[]" + "'", str61, "[]");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "[1,[1]]" + "'", str65, "[1,[1]]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "[]" + "'", str71, "[]");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertEquals("'" + obj75 + "' != '" + 10.0d + "'", obj75, 10.0d);
        org.junit.Assert.assertEquals("'" + obj76 + "' != '" + 10.0d + "'", obj76, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test815");
        org.autotest.Stack stackAr1 = createStack((int) ' ');
        java.lang.String str2 = stackAr1.toString();
        boolean boolean3 = stackAr1.isFull();
        java.lang.String str4 = stackAr1.toString();
        org.autotest.Stack stackAr6 = createStack((int) (byte) 1);
        int int7 = stackAr6.size();
        java.lang.String str8 = stackAr6.toString();
        java.lang.String str9 = stackAr6.toString();
        java.lang.String str10 = stackAr6.toString();
        java.lang.String str11 = stackAr6.toString();
        org.autotest.Stack stackAr13 = createStack(100);
        boolean boolean14 = stackAr13.isFull();
        org.autotest.Stack stackAr16 = createStack(10);
        int int17 = stackAr16.size();
        boolean boolean18 = stackAr16.isEmpty();
        org.autotest.Stack stackAr20 = createStack((int) 'a');
        boolean boolean21 = stackAr20.isFull();
        java.lang.Object obj22 = null;
        boolean boolean23 = stackAr20.equals(obj22);
        boolean boolean24 = stackAr20.isFull();
        boolean boolean25 = stackAr16.equals((java.lang.Object) stackAr20);
        stackAr13.push((java.lang.Object) stackAr20);
        boolean boolean27 = stackAr6.equals((java.lang.Object) stackAr13);
        boolean boolean28 = stackAr1.equals((java.lang.Object) stackAr6);
        java.lang.String str29 = stackAr6.toString();
        org.autotest.Stack stackAr31 = createStack((int) (byte) 1);
        boolean boolean32 = stackAr31.isFull();
        boolean boolean33 = stackAr31.isEmpty();
        boolean boolean34 = stackAr31.isEmpty();
        boolean boolean35 = stackAr6.equals((java.lang.Object) stackAr31);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "[]" + "'", str29, "[]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test816");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isFull();
        java.lang.String str5 = stackAr1.toString();
        boolean boolean6 = stackAr1.isFull();
        java.lang.String str7 = stackAr1.toString();
        org.autotest.Stack stackAr9 = createStack((int) 'a');
        int int10 = stackAr9.size();
        org.autotest.Stack stackAr12 = createStack((int) 'a');
        int int13 = stackAr12.size();
        boolean boolean14 = stackAr12.isFull();
        stackAr9.push((java.lang.Object) stackAr12);
        boolean boolean16 = stackAr9.isEmpty();
        boolean boolean17 = stackAr9.isEmpty();
        java.lang.Object obj18 = stackAr9.top();
        stackAr1.push((java.lang.Object) stackAr9);
        java.lang.Object obj20 = stackAr1.pop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "[]");
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "[[]]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "[[]]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "[[]]");
    }

    @Test
    public void test817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test817");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        boolean boolean2 = stackAr1.isFull();
        java.lang.Object obj3 = null;
        boolean boolean4 = stackAr1.equals(obj3);
        boolean boolean5 = stackAr1.isFull();
        org.autotest.Stack stackAr7 = createStack((int) (byte) 1);
        int int8 = stackAr7.size();
        int int9 = stackAr7.size();
        boolean boolean10 = stackAr1.equals((java.lang.Object) stackAr7);
        int int11 = stackAr7.size();
        org.autotest.Stack stackAr12 = createStack();
        boolean boolean13 = stackAr12.isEmpty();
        stackAr7.push((java.lang.Object) stackAr12);
        boolean boolean15 = stackAr7.isFull();
        java.lang.String str16 = stackAr7.toString();
        java.lang.Object obj17 = stackAr7.top();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[[]]" + "'", str16, "[[]]");
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "[]");
    }

    @Test
    public void test818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test818");
        org.autotest.Stack stackAr1 = createStack(10);
        int int2 = stackAr1.size();
        org.autotest.Stack stackAr4 = createStack((int) 'a');
        boolean boolean5 = stackAr4.isFull();
        org.autotest.Stack stackAr7 = createStack((int) (byte) 1);
        int int8 = stackAr7.size();
        boolean boolean9 = stackAr7.isEmpty();
        boolean boolean10 = stackAr7.isFull();
        boolean boolean11 = stackAr7.isFull();
        int int12 = stackAr7.size();
        stackAr4.push((java.lang.Object) stackAr7);
        boolean boolean14 = stackAr1.equals((java.lang.Object) stackAr7);
        int int15 = stackAr7.size();
        boolean boolean16 = stackAr7.isEmpty();
        boolean boolean17 = stackAr7.isFull();
        boolean boolean18 = stackAr7.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test819");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        boolean boolean2 = stackAr1.isFull();
        java.lang.Object obj3 = null;
        boolean boolean4 = stackAr1.equals(obj3);
        boolean boolean5 = stackAr1.isFull();
        org.autotest.Stack stackAr7 = createStack((int) (byte) 1);
        int int8 = stackAr7.size();
        int int9 = stackAr7.size();
        org.autotest.Stack stackAr11 = createStack((int) (byte) 1);
        int int12 = stackAr11.size();
        boolean boolean13 = stackAr11.isEmpty();
        boolean boolean14 = stackAr11.isFull();
        int int15 = stackAr11.size();
        boolean boolean16 = stackAr11.isFull();
        org.autotest.Stack stackAr18 = createStack((int) 'a');
        boolean boolean20 = stackAr18.equals((java.lang.Object) 1.0d);
        java.lang.String str21 = stackAr18.toString();
        stackAr11.push((java.lang.Object) stackAr18);
        stackAr7.push((java.lang.Object) stackAr18);
        boolean boolean24 = stackAr1.equals((java.lang.Object) stackAr18);
        org.autotest.Stack stackAr26 = createStack((int) (byte) 1);
        boolean boolean27 = stackAr26.isEmpty();
        boolean boolean28 = stackAr26.isFull();
        int int29 = stackAr26.size();
        boolean boolean30 = stackAr26.isFull();
        boolean boolean31 = stackAr1.equals((java.lang.Object) stackAr26);
        org.autotest.Stack stackAr33 = createStack(100);
        boolean boolean34 = stackAr33.isFull();
        org.autotest.Stack stackAr36 = createStack(10);
        int int37 = stackAr36.size();
        boolean boolean38 = stackAr36.isEmpty();
        org.autotest.Stack stackAr40 = createStack((int) 'a');
        boolean boolean41 = stackAr40.isFull();
        java.lang.Object obj42 = null;
        boolean boolean43 = stackAr40.equals(obj42);
        boolean boolean44 = stackAr40.isFull();
        boolean boolean45 = stackAr36.equals((java.lang.Object) stackAr40);
        stackAr33.push((java.lang.Object) stackAr40);
        boolean boolean47 = stackAr1.equals((java.lang.Object) stackAr33);
        org.autotest.Stack stackAr49 = createStack((int) 'a');
        boolean boolean50 = stackAr49.isFull();
        java.lang.Object obj51 = null;
        boolean boolean52 = stackAr49.equals(obj51);
        org.autotest.Stack stackAr54 = createStack((int) (byte) 1);
        int int55 = stackAr54.size();
        int int56 = stackAr54.size();
        org.autotest.Stack stackAr58 = createStack((int) (byte) 1);
        int int59 = stackAr58.size();
        boolean boolean60 = stackAr58.isEmpty();
        boolean boolean61 = stackAr58.isFull();
        int int62 = stackAr58.size();
        boolean boolean63 = stackAr58.isFull();
        org.autotest.Stack stackAr65 = createStack((int) 'a');
        boolean boolean67 = stackAr65.equals((java.lang.Object) 1.0d);
        java.lang.String str68 = stackAr65.toString();
        stackAr58.push((java.lang.Object) stackAr65);
        stackAr54.push((java.lang.Object) stackAr65);
        java.lang.Object obj71 = stackAr54.pop();
        boolean boolean72 = stackAr49.equals(obj71);
        stackAr1.push((java.lang.Object) stackAr49);
        boolean boolean74 = stackAr49.isFull();
        boolean boolean75 = stackAr49.isFull();
        java.lang.String str76 = stackAr49.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "[]" + "'", str68, "[]");
        org.junit.Assert.assertNotNull(obj71);
        org.junit.Assert.assertEquals(obj71.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj71), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj71), "[]");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "[]" + "'", str76, "[]");
    }

    @Test
    public void test820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test820");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        int int2 = stackAr1.size();
        int int3 = stackAr1.size();
        java.lang.String str4 = stackAr1.toString();
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test821");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 10);
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isFull();
        java.lang.Object obj4 = null;
        boolean boolean5 = stackAr1.equals(obj4);
        java.lang.String str6 = stackAr1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
    }

    @Test
    public void test822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test822");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        java.lang.String str2 = stackAr1.toString();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isFull();
        org.autotest.Stack stackAr6 = createStack(10);
        boolean boolean7 = stackAr6.isEmpty();
        stackAr1.push((java.lang.Object) stackAr6);
        boolean boolean9 = stackAr1.isEmpty();
        java.lang.Object obj10 = stackAr1.pop();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "[]");
    }

    @Test
    public void test823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test823");
        org.autotest.Stack stackAr1 = createStack((int) (short) 0);
        java.lang.String str2 = stackAr1.toString();
        org.autotest.Stack stackAr4 = createStack((int) 'a');
        boolean boolean5 = stackAr4.isFull();
        java.lang.Object obj6 = null;
        boolean boolean7 = stackAr4.equals(obj6);
        boolean boolean8 = stackAr4.isFull();
        org.autotest.Stack stackAr10 = createStack((int) (byte) 1);
        int int11 = stackAr10.size();
        int int12 = stackAr10.size();
        org.autotest.Stack stackAr14 = createStack((int) (byte) 1);
        int int15 = stackAr14.size();
        boolean boolean16 = stackAr14.isEmpty();
        boolean boolean17 = stackAr14.isFull();
        int int18 = stackAr14.size();
        boolean boolean19 = stackAr14.isFull();
        org.autotest.Stack stackAr21 = createStack((int) 'a');
        boolean boolean23 = stackAr21.equals((java.lang.Object) 1.0d);
        java.lang.String str24 = stackAr21.toString();
        stackAr14.push((java.lang.Object) stackAr21);
        stackAr10.push((java.lang.Object) stackAr21);
        boolean boolean27 = stackAr4.equals((java.lang.Object) stackAr21);
        boolean boolean28 = stackAr4.isFull();
        boolean boolean29 = stackAr1.equals((java.lang.Object) boolean28);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[]" + "'", str24, "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test824");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isFull();
        java.lang.String str5 = stackAr1.toString();
        boolean boolean6 = stackAr1.isFull();
        int int7 = stackAr1.size();
        boolean boolean8 = stackAr1.isFull();
        org.autotest.Stack stackAr9 = createStack();
        boolean boolean10 = stackAr9.isEmpty();
        boolean boolean11 = stackAr9.isEmpty();
        boolean boolean12 = stackAr1.equals((java.lang.Object) stackAr9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test825");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        boolean boolean2 = stackAr1.isFull();
        java.lang.String str3 = stackAr1.toString();
        org.autotest.Stack stackAr5 = createStack((int) 'a');
        int int6 = stackAr5.size();
        boolean boolean7 = stackAr5.isFull();
        stackAr1.push((java.lang.Object) stackAr5);
        boolean boolean9 = stackAr1.isFull();
        org.autotest.Stack stackAr11 = createStack((int) (byte) 1);
        int int12 = stackAr11.size();
        boolean boolean13 = stackAr11.isEmpty();
        boolean boolean14 = stackAr11.isFull();
        int int15 = stackAr11.size();
        int int16 = stackAr11.size();
        boolean boolean17 = stackAr1.equals((java.lang.Object) stackAr11);
        java.lang.Object obj18 = stackAr1.top();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "[]");
    }

    @Test
    public void test826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test826");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        boolean boolean2 = stackAr1.isFull();
        java.lang.Object obj3 = null;
        boolean boolean4 = stackAr1.equals(obj3);
        boolean boolean5 = stackAr1.isFull();
        java.lang.String str6 = stackAr1.toString();
        org.autotest.Stack stackAr8 = createStack((int) (byte) 1);
        int int9 = stackAr8.size();
        boolean boolean10 = stackAr8.isEmpty();
        boolean boolean11 = stackAr8.isFull();
        int int12 = stackAr8.size();
        boolean boolean13 = stackAr8.isFull();
        java.lang.String str14 = stackAr8.toString();
        boolean boolean15 = stackAr8.isFull();
        org.autotest.Stack stackAr17 = createStack((int) (byte) 1);
        int int18 = stackAr17.size();
        java.lang.String str19 = stackAr17.toString();
        java.lang.String str20 = stackAr17.toString();
        java.lang.String str21 = stackAr17.toString();
        java.lang.String str22 = stackAr17.toString();
        org.autotest.Stack stackAr24 = createStack(100);
        boolean boolean25 = stackAr24.isFull();
        org.autotest.Stack stackAr27 = createStack(10);
        int int28 = stackAr27.size();
        boolean boolean29 = stackAr27.isEmpty();
        org.autotest.Stack stackAr31 = createStack((int) 'a');
        boolean boolean32 = stackAr31.isFull();
        java.lang.Object obj33 = null;
        boolean boolean34 = stackAr31.equals(obj33);
        boolean boolean35 = stackAr31.isFull();
        boolean boolean36 = stackAr27.equals((java.lang.Object) stackAr31);
        stackAr24.push((java.lang.Object) stackAr31);
        boolean boolean38 = stackAr17.equals((java.lang.Object) stackAr24);
        boolean boolean39 = stackAr17.isEmpty();
        boolean boolean40 = stackAr8.equals((java.lang.Object) stackAr17);
        int int41 = stackAr8.size();
        int int42 = stackAr8.size();
        boolean boolean43 = stackAr1.equals((java.lang.Object) int42);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[]" + "'", str19, "[]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[]" + "'", str20, "[]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[]" + "'", str22, "[]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test827");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        boolean boolean3 = stackAr1.equals((java.lang.Object) 1.0d);
        java.lang.String str4 = stackAr1.toString();
        org.autotest.Stack stackAr6 = createStack((int) '#');
        int int7 = stackAr6.size();
        int int8 = stackAr6.size();
        org.autotest.Stack stackAr10 = createStack((int) (byte) 1);
        int int11 = stackAr10.size();
        boolean boolean12 = stackAr10.isEmpty();
        boolean boolean13 = stackAr10.isFull();
        int int14 = stackAr10.size();
        int int15 = stackAr10.size();
        int int16 = stackAr10.size();
        boolean boolean17 = stackAr10.isFull();
        boolean boolean18 = stackAr6.equals((java.lang.Object) stackAr10);
        stackAr1.push((java.lang.Object) stackAr10);
        boolean boolean20 = stackAr1.isFull();
        boolean boolean21 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test828");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 0);
        org.autotest.Stack stackAr3 = createStack((int) (byte) 1);
        boolean boolean4 = stackAr3.isFull();
        java.lang.String str5 = stackAr3.toString();
        boolean boolean6 = stackAr3.isEmpty();
        boolean boolean7 = stackAr1.equals((java.lang.Object) stackAr3);
        java.lang.String str8 = stackAr3.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
    }

    @Test
    public void test829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test829");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        org.autotest.Stack stackAr5 = createStack((int) 'a');
        boolean boolean6 = stackAr5.isFull();
        java.lang.Object obj7 = null;
        boolean boolean8 = stackAr5.equals(obj7);
        boolean boolean9 = stackAr5.isFull();
        org.autotest.Stack stackAr11 = createStack((int) (byte) 1);
        int int12 = stackAr11.size();
        int int13 = stackAr11.size();
        org.autotest.Stack stackAr15 = createStack((int) (byte) 1);
        int int16 = stackAr15.size();
        boolean boolean17 = stackAr15.isEmpty();
        boolean boolean18 = stackAr15.isFull();
        int int19 = stackAr15.size();
        boolean boolean20 = stackAr15.isFull();
        org.autotest.Stack stackAr22 = createStack((int) 'a');
        boolean boolean24 = stackAr22.equals((java.lang.Object) 1.0d);
        java.lang.String str25 = stackAr22.toString();
        stackAr15.push((java.lang.Object) stackAr22);
        stackAr11.push((java.lang.Object) stackAr22);
        boolean boolean28 = stackAr5.equals((java.lang.Object) stackAr22);
        org.autotest.Stack stackAr30 = createStack((int) (byte) 1);
        boolean boolean31 = stackAr30.isEmpty();
        boolean boolean32 = stackAr30.isFull();
        int int33 = stackAr30.size();
        boolean boolean34 = stackAr30.isFull();
        boolean boolean35 = stackAr5.equals((java.lang.Object) stackAr30);
        org.autotest.Stack stackAr37 = createStack(100);
        boolean boolean38 = stackAr37.isFull();
        org.autotest.Stack stackAr40 = createStack(10);
        int int41 = stackAr40.size();
        boolean boolean42 = stackAr40.isEmpty();
        org.autotest.Stack stackAr44 = createStack((int) 'a');
        boolean boolean45 = stackAr44.isFull();
        java.lang.Object obj46 = null;
        boolean boolean47 = stackAr44.equals(obj46);
        boolean boolean48 = stackAr44.isFull();
        boolean boolean49 = stackAr40.equals((java.lang.Object) stackAr44);
        stackAr37.push((java.lang.Object) stackAr44);
        boolean boolean51 = stackAr5.equals((java.lang.Object) stackAr37);
        boolean boolean52 = stackAr1.equals((java.lang.Object) stackAr5);
        boolean boolean53 = stackAr5.isEmpty();
        boolean boolean54 = stackAr5.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[]" + "'", str25, "[]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test830");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        int int2 = stackAr1.size();
        java.lang.String str3 = stackAr1.toString();
        java.lang.String str4 = stackAr1.toString();
        java.lang.String str5 = stackAr1.toString();
        java.lang.String str6 = stackAr1.toString();
        org.autotest.Stack stackAr8 = createStack(100);
        boolean boolean9 = stackAr8.isFull();
        org.autotest.Stack stackAr11 = createStack(10);
        int int12 = stackAr11.size();
        boolean boolean13 = stackAr11.isEmpty();
        org.autotest.Stack stackAr15 = createStack((int) 'a');
        boolean boolean16 = stackAr15.isFull();
        java.lang.Object obj17 = null;
        boolean boolean18 = stackAr15.equals(obj17);
        boolean boolean19 = stackAr15.isFull();
        boolean boolean20 = stackAr11.equals((java.lang.Object) stackAr15);
        stackAr8.push((java.lang.Object) stackAr15);
        boolean boolean22 = stackAr1.equals((java.lang.Object) stackAr8);
        boolean boolean23 = stackAr1.isEmpty();
        org.autotest.Stack stackAr25 = createStack((int) 'a');
        boolean boolean26 = stackAr25.isFull();
        java.lang.Object obj27 = null;
        boolean boolean28 = stackAr25.equals(obj27);
        boolean boolean29 = stackAr25.isFull();
        org.autotest.Stack stackAr31 = createStack((int) (byte) 1);
        int int32 = stackAr31.size();
        int int33 = stackAr31.size();
        org.autotest.Stack stackAr35 = createStack((int) (byte) 1);
        int int36 = stackAr35.size();
        boolean boolean37 = stackAr35.isEmpty();
        boolean boolean38 = stackAr35.isFull();
        int int39 = stackAr35.size();
        boolean boolean40 = stackAr35.isFull();
        org.autotest.Stack stackAr42 = createStack((int) 'a');
        boolean boolean44 = stackAr42.equals((java.lang.Object) 1.0d);
        java.lang.String str45 = stackAr42.toString();
        stackAr35.push((java.lang.Object) stackAr42);
        stackAr31.push((java.lang.Object) stackAr42);
        boolean boolean48 = stackAr25.equals((java.lang.Object) stackAr42);
        java.lang.String str49 = stackAr42.toString();
        org.autotest.Stack stackAr51 = createStack((int) (byte) 1);
        boolean boolean52 = stackAr51.isFull();
        java.lang.String str53 = stackAr51.toString();
        org.autotest.Stack stackAr55 = createStack((int) (byte) 10);
        boolean boolean56 = stackAr55.isEmpty();
        org.autotest.Stack stackAr58 = createStack((int) (byte) 1);
        stackAr55.push((java.lang.Object) (byte) 1);
        boolean boolean60 = stackAr51.equals((java.lang.Object) stackAr55);
        org.autotest.Stack stackAr62 = createStack((int) 'a');
        int int63 = stackAr62.size();
        org.autotest.Stack stackAr65 = createStack((int) 'a');
        int int66 = stackAr65.size();
        boolean boolean67 = stackAr65.isFull();
        stackAr62.push((java.lang.Object) stackAr65);
        boolean boolean69 = stackAr55.equals((java.lang.Object) stackAr65);
        java.lang.Object obj70 = stackAr55.top();
        stackAr42.push((java.lang.Object) stackAr55);
        java.lang.Object obj72 = stackAr55.top();
        boolean boolean73 = stackAr1.equals((java.lang.Object) stackAr55);
        int int74 = stackAr1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "[]" + "'", str45, "[]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "[]" + "'", str49, "[]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "[]" + "'", str53, "[]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + obj70 + "' != '" + (byte) 1 + "'", obj70, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj72 + "' != '" + (byte) 1 + "'", obj72, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
    }

    @Test
    public void test831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test831");
        org.autotest.Stack stackAr1 = createStack(100);
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        org.autotest.Stack stackAr5 = createStack((int) 'a');
        boolean boolean6 = stackAr5.isFull();
        int int7 = stackAr5.size();
        java.lang.String str8 = stackAr5.toString();
        org.autotest.Stack stackAr10 = createStack((int) ' ');
        java.lang.String str11 = stackAr10.toString();
        boolean boolean12 = stackAr10.isFull();
        java.lang.String str13 = stackAr10.toString();
        stackAr5.push((java.lang.Object) str13);
        java.lang.Object obj15 = stackAr5.top();
        org.autotest.Stack stackAr17 = createStack((int) 'a');
        boolean boolean19 = stackAr17.equals((java.lang.Object) 1.0d);
        java.lang.String str20 = stackAr17.toString();
        boolean boolean21 = stackAr17.isFull();
        int int22 = stackAr17.size();
        boolean boolean23 = stackAr5.equals((java.lang.Object) stackAr17);
        boolean boolean24 = stackAr1.equals((java.lang.Object) boolean23);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "[]" + "'", obj15, "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[]" + "'", str20, "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test832");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        boolean boolean2 = stackAr1.isEmpty();
        java.lang.String str3 = stackAr1.toString();
        int int4 = stackAr1.size();
        java.lang.String str5 = stackAr1.toString();
        boolean boolean6 = stackAr1.isEmpty();
        java.lang.String str7 = stackAr1.toString();
        java.lang.String str8 = stackAr1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
    }

    @Test
    public void test833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test833");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        boolean boolean2 = stackAr1.isFull();
        java.lang.String str3 = stackAr1.toString();
        int int4 = stackAr1.size();
        org.autotest.Stack stackAr6 = createStack((int) (byte) 10);
        boolean boolean7 = stackAr6.isEmpty();
        org.autotest.Stack stackAr9 = createStack((int) (byte) 1);
        stackAr6.push((java.lang.Object) (byte) 1);
        org.autotest.Stack stackAr12 = createStack((int) 'a');
        boolean boolean13 = stackAr12.isFull();
        java.lang.Object obj14 = null;
        boolean boolean15 = stackAr12.equals(obj14);
        boolean boolean16 = stackAr12.isFull();
        org.autotest.Stack stackAr18 = createStack((int) (byte) 1);
        int int19 = stackAr18.size();
        int int20 = stackAr18.size();
        org.autotest.Stack stackAr22 = createStack((int) (byte) 1);
        int int23 = stackAr22.size();
        boolean boolean24 = stackAr22.isEmpty();
        boolean boolean25 = stackAr22.isFull();
        int int26 = stackAr22.size();
        boolean boolean27 = stackAr22.isFull();
        org.autotest.Stack stackAr29 = createStack((int) 'a');
        boolean boolean31 = stackAr29.equals((java.lang.Object) 1.0d);
        java.lang.String str32 = stackAr29.toString();
        stackAr22.push((java.lang.Object) stackAr29);
        stackAr18.push((java.lang.Object) stackAr29);
        boolean boolean35 = stackAr12.equals((java.lang.Object) stackAr29);
        org.autotest.Stack stackAr37 = createStack((int) (byte) 1);
        boolean boolean38 = stackAr37.isEmpty();
        boolean boolean39 = stackAr37.isFull();
        int int40 = stackAr37.size();
        boolean boolean41 = stackAr37.isFull();
        boolean boolean42 = stackAr12.equals((java.lang.Object) stackAr37);
        boolean boolean43 = stackAr6.equals((java.lang.Object) stackAr12);
        boolean boolean44 = stackAr1.equals((java.lang.Object) stackAr6);
        org.autotest.Stack stackAr46 = createStack((int) 'a');
        boolean boolean47 = stackAr46.isFull();
        java.lang.Object obj48 = null;
        boolean boolean49 = stackAr46.equals(obj48);
        boolean boolean50 = stackAr46.isFull();
        org.autotest.Stack stackAr52 = createStack((int) (byte) 1);
        int int53 = stackAr52.size();
        int int54 = stackAr52.size();
        org.autotest.Stack stackAr56 = createStack((int) (byte) 1);
        int int57 = stackAr56.size();
        boolean boolean58 = stackAr56.isEmpty();
        boolean boolean59 = stackAr56.isFull();
        int int60 = stackAr56.size();
        boolean boolean61 = stackAr56.isFull();
        org.autotest.Stack stackAr63 = createStack((int) 'a');
        boolean boolean65 = stackAr63.equals((java.lang.Object) 1.0d);
        java.lang.String str66 = stackAr63.toString();
        stackAr56.push((java.lang.Object) stackAr63);
        stackAr52.push((java.lang.Object) stackAr63);
        boolean boolean69 = stackAr46.equals((java.lang.Object) stackAr63);
        java.lang.Object obj70 = new java.lang.Object();
        boolean boolean71 = stackAr63.equals(obj70);
        boolean boolean72 = stackAr6.equals((java.lang.Object) stackAr63);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[]" + "'", str32, "[]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "[]" + "'", str66, "[]");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test834");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        int int2 = stackAr1.size();
        org.autotest.Stack stackAr4 = createStack((int) 'a');
        int int5 = stackAr4.size();
        boolean boolean6 = stackAr4.isFull();
        stackAr1.push((java.lang.Object) stackAr4);
        org.autotest.Stack stackAr9 = createStack(10);
        int int10 = stackAr9.size();
        boolean boolean11 = stackAr9.isEmpty();
        boolean boolean12 = stackAr1.equals((java.lang.Object) boolean11);
        boolean boolean13 = stackAr1.isFull();
        java.lang.Object obj14 = stackAr1.pop();
        boolean boolean15 = stackAr1.isEmpty();
        org.autotest.Stack stackAr17 = createStack((int) (byte) 1);
        int int18 = stackAr17.size();
        java.lang.String str19 = stackAr17.toString();
        java.lang.String str20 = stackAr17.toString();
        java.lang.String str21 = stackAr17.toString();
        boolean boolean22 = stackAr17.isFull();
        stackAr1.push((java.lang.Object) boolean22);
        boolean boolean24 = stackAr1.isFull();
        org.autotest.Stack stackAr26 = createStack((int) 'a');
        boolean boolean28 = stackAr26.equals((java.lang.Object) 1.0d);
        java.lang.String str29 = stackAr26.toString();
        stackAr26.push((java.lang.Object) 1L);
        org.autotest.Stack stackAr33 = createStack((int) (byte) 1);
        boolean boolean34 = stackAr33.isFull();
        java.lang.String str35 = stackAr33.toString();
        org.autotest.Stack stackAr37 = createStack((int) (byte) 10);
        boolean boolean38 = stackAr37.isEmpty();
        org.autotest.Stack stackAr40 = createStack((int) (byte) 1);
        stackAr37.push((java.lang.Object) (byte) 1);
        boolean boolean42 = stackAr33.equals((java.lang.Object) stackAr37);
        org.autotest.Stack stackAr44 = createStack((int) 'a');
        int int45 = stackAr44.size();
        org.autotest.Stack stackAr47 = createStack((int) 'a');
        int int48 = stackAr47.size();
        boolean boolean49 = stackAr47.isFull();
        stackAr44.push((java.lang.Object) stackAr47);
        boolean boolean51 = stackAr37.equals((java.lang.Object) stackAr47);
        stackAr26.push((java.lang.Object) boolean51);
        org.autotest.Stack stackAr54 = createStack((int) (byte) 1);
        int int55 = stackAr54.size();
        java.lang.String str56 = stackAr54.toString();
        java.lang.String str57 = stackAr54.toString();
        stackAr26.push((java.lang.Object) stackAr54);
        stackAr1.push((java.lang.Object) stackAr26);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[]" + "'", str19, "[]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[]" + "'", str20, "[]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "[]" + "'", str29, "[]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "[]" + "'", str35, "[]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "[]" + "'", str56, "[]");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "[]" + "'", str57, "[]");
    }

    @Test
    public void test835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test835");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        org.autotest.Stack stackAr3 = createStack((int) 'a');
        boolean boolean4 = stackAr3.isFull();
        java.lang.Object obj5 = null;
        boolean boolean6 = stackAr3.equals(obj5);
        boolean boolean7 = stackAr3.isFull();
        org.autotest.Stack stackAr9 = createStack((int) (byte) 1);
        int int10 = stackAr9.size();
        int int11 = stackAr9.size();
        boolean boolean12 = stackAr3.equals((java.lang.Object) stackAr9);
        int int13 = stackAr9.size();
        int int14 = stackAr9.size();
        boolean boolean15 = stackAr1.equals((java.lang.Object) stackAr9);
        org.autotest.Stack stackAr17 = createStack((int) 'a');
        boolean boolean19 = stackAr17.equals((java.lang.Object) 1.0d);
        java.lang.String str20 = stackAr17.toString();
        boolean boolean21 = stackAr17.isFull();
        int int22 = stackAr17.size();
        int int23 = stackAr17.size();
        int int24 = stackAr17.size();
        boolean boolean26 = stackAr17.equals((java.lang.Object) "[[]]");
        int int27 = stackAr17.size();
        boolean boolean28 = stackAr9.equals((java.lang.Object) stackAr17);
        org.autotest.Stack stackAr30 = createStack((int) (byte) 1);
        boolean boolean31 = stackAr30.isFull();
        java.lang.String str32 = stackAr30.toString();
        org.autotest.Stack stackAr34 = createStack((int) 'a');
        int int35 = stackAr34.size();
        boolean boolean36 = stackAr34.isFull();
        stackAr30.push((java.lang.Object) stackAr34);
        boolean boolean38 = stackAr30.isFull();
        org.autotest.Stack stackAr40 = createStack((int) (byte) 1);
        int int41 = stackAr40.size();
        boolean boolean42 = stackAr40.isEmpty();
        boolean boolean43 = stackAr40.isFull();
        int int44 = stackAr40.size();
        int int45 = stackAr40.size();
        boolean boolean46 = stackAr30.equals((java.lang.Object) stackAr40);
        int int47 = stackAr40.size();
        int int48 = stackAr40.size();
        boolean boolean49 = stackAr40.isEmpty();
        org.autotest.Stack stackAr51 = createStack((int) (byte) 1);
        boolean boolean52 = stackAr51.isFull();
        java.lang.String str53 = stackAr51.toString();
        int int54 = stackAr51.size();
        org.autotest.Stack stackAr56 = createStack((int) (byte) 1);
        int int57 = stackAr56.size();
        int int58 = stackAr56.size();
        org.autotest.Stack stackAr60 = createStack((int) (byte) 1);
        int int61 = stackAr60.size();
        boolean boolean62 = stackAr60.isEmpty();
        boolean boolean63 = stackAr60.isFull();
        int int64 = stackAr60.size();
        boolean boolean65 = stackAr60.isFull();
        org.autotest.Stack stackAr67 = createStack((int) 'a');
        boolean boolean69 = stackAr67.equals((java.lang.Object) 1.0d);
        java.lang.String str70 = stackAr67.toString();
        stackAr60.push((java.lang.Object) stackAr67);
        stackAr56.push((java.lang.Object) stackAr67);
        int int73 = stackAr56.size();
        stackAr51.push((java.lang.Object) stackAr56);
        org.autotest.Stack stackAr76 = createStack((int) (byte) 1);
        boolean boolean77 = stackAr76.isFull();
        java.lang.String str78 = stackAr76.toString();
        org.autotest.Stack stackAr80 = createStack((int) 'a');
        int int81 = stackAr80.size();
        boolean boolean82 = stackAr80.isFull();
        stackAr76.push((java.lang.Object) stackAr80);
        boolean boolean84 = stackAr76.isFull();
        org.autotest.Stack stackAr86 = createStack((int) (byte) 1);
        int int87 = stackAr86.size();
        boolean boolean88 = stackAr86.isEmpty();
        boolean boolean89 = stackAr86.isFull();
        int int90 = stackAr86.size();
        int int91 = stackAr86.size();
        boolean boolean92 = stackAr76.equals((java.lang.Object) stackAr86);
        boolean boolean93 = stackAr51.equals((java.lang.Object) stackAr76);
        int int94 = stackAr51.size();
        java.lang.Object obj95 = stackAr51.top();
        boolean boolean96 = stackAr40.equals((java.lang.Object) stackAr51);
        boolean boolean97 = stackAr9.equals((java.lang.Object) stackAr51);
        int int98 = stackAr9.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[]" + "'", str20, "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[]" + "'", str32, "[]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "[]" + "'", str53, "[]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "[]" + "'", str70, "[]");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "[]" + "'", str78, "[]");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 1 + "'", int94 == 1);
        org.junit.Assert.assertNotNull(obj95);
        org.junit.Assert.assertEquals(obj95.toString(), "[[]]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj95), "[[]]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj95), "[[]]");
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 0 + "'", int98 == 0);
    }

    @Test
    public void test836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test836");
        org.autotest.Stack stackAr1 = createStack(3);
        stackAr1.push((java.lang.Object) 0.0d);
        int int4 = stackAr1.size();
        org.autotest.Stack stackAr6 = createStack((int) 'a');
        boolean boolean7 = stackAr6.isFull();
        java.lang.Object obj8 = null;
        boolean boolean9 = stackAr6.equals(obj8);
        boolean boolean10 = stackAr6.isFull();
        org.autotest.Stack stackAr12 = createStack((int) (byte) 1);
        int int13 = stackAr12.size();
        int int14 = stackAr12.size();
        org.autotest.Stack stackAr16 = createStack((int) (byte) 1);
        int int17 = stackAr16.size();
        boolean boolean18 = stackAr16.isEmpty();
        boolean boolean19 = stackAr16.isFull();
        int int20 = stackAr16.size();
        boolean boolean21 = stackAr16.isFull();
        org.autotest.Stack stackAr23 = createStack((int) 'a');
        boolean boolean25 = stackAr23.equals((java.lang.Object) 1.0d);
        java.lang.String str26 = stackAr23.toString();
        stackAr16.push((java.lang.Object) stackAr23);
        stackAr12.push((java.lang.Object) stackAr23);
        boolean boolean29 = stackAr6.equals((java.lang.Object) stackAr23);
        org.autotest.Stack stackAr31 = createStack((int) (byte) 1);
        boolean boolean32 = stackAr31.isEmpty();
        boolean boolean33 = stackAr31.isFull();
        int int34 = stackAr31.size();
        boolean boolean35 = stackAr31.isFull();
        boolean boolean36 = stackAr6.equals((java.lang.Object) stackAr31);
        int int37 = stackAr6.size();
        boolean boolean38 = stackAr6.isEmpty();
        java.lang.String str39 = stackAr6.toString();
        java.lang.String str40 = stackAr6.toString();
        stackAr1.push((java.lang.Object) stackAr6);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[]" + "'", str26, "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "[]" + "'", str39, "[]");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "[]" + "'", str40, "[]");
    }

    @Test
    public void test837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test837");
        org.autotest.Stack stackAr1 = createStack((int) (short) 1);
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test838");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        int int2 = stackAr1.size();
        org.autotest.Stack stackAr4 = createStack((int) 'a');
        int int5 = stackAr4.size();
        boolean boolean6 = stackAr4.isFull();
        stackAr1.push((java.lang.Object) stackAr4);
        org.autotest.Stack stackAr9 = createStack(10);
        int int10 = stackAr9.size();
        boolean boolean11 = stackAr9.isEmpty();
        boolean boolean12 = stackAr1.equals((java.lang.Object) boolean11);
        boolean boolean13 = stackAr1.isFull();
        int int14 = stackAr1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test839");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        java.lang.String str2 = stackAr1.toString();
        boolean boolean3 = stackAr1.isEmpty();
        int int4 = stackAr1.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test840");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        boolean boolean2 = stackAr1.isFull();
        java.lang.Object obj3 = null;
        boolean boolean4 = stackAr1.equals(obj3);
        boolean boolean5 = stackAr1.isFull();
        org.autotest.Stack stackAr7 = createStack((int) (byte) 1);
        int int8 = stackAr7.size();
        int int9 = stackAr7.size();
        org.autotest.Stack stackAr11 = createStack((int) (byte) 1);
        int int12 = stackAr11.size();
        boolean boolean13 = stackAr11.isEmpty();
        boolean boolean14 = stackAr11.isFull();
        int int15 = stackAr11.size();
        boolean boolean16 = stackAr11.isFull();
        org.autotest.Stack stackAr18 = createStack((int) 'a');
        boolean boolean20 = stackAr18.equals((java.lang.Object) 1.0d);
        java.lang.String str21 = stackAr18.toString();
        stackAr11.push((java.lang.Object) stackAr18);
        stackAr7.push((java.lang.Object) stackAr18);
        boolean boolean24 = stackAr1.equals((java.lang.Object) stackAr18);
        org.autotest.Stack stackAr26 = createStack((int) (byte) 1);
        boolean boolean27 = stackAr26.isEmpty();
        boolean boolean28 = stackAr26.isFull();
        int int29 = stackAr26.size();
        boolean boolean30 = stackAr26.isFull();
        boolean boolean31 = stackAr1.equals((java.lang.Object) stackAr26);
        org.autotest.Stack stackAr33 = createStack(100);
        boolean boolean34 = stackAr33.isFull();
        org.autotest.Stack stackAr36 = createStack(10);
        int int37 = stackAr36.size();
        boolean boolean38 = stackAr36.isEmpty();
        org.autotest.Stack stackAr40 = createStack((int) 'a');
        boolean boolean41 = stackAr40.isFull();
        java.lang.Object obj42 = null;
        boolean boolean43 = stackAr40.equals(obj42);
        boolean boolean44 = stackAr40.isFull();
        boolean boolean45 = stackAr36.equals((java.lang.Object) stackAr40);
        stackAr33.push((java.lang.Object) stackAr40);
        boolean boolean47 = stackAr1.equals((java.lang.Object) stackAr33);
        org.autotest.Stack stackAr49 = createStack((int) 'a');
        boolean boolean50 = stackAr49.isFull();
        java.lang.Object obj51 = null;
        boolean boolean52 = stackAr49.equals(obj51);
        org.autotest.Stack stackAr54 = createStack((int) (byte) 1);
        int int55 = stackAr54.size();
        int int56 = stackAr54.size();
        org.autotest.Stack stackAr58 = createStack((int) (byte) 1);
        int int59 = stackAr58.size();
        boolean boolean60 = stackAr58.isEmpty();
        boolean boolean61 = stackAr58.isFull();
        int int62 = stackAr58.size();
        boolean boolean63 = stackAr58.isFull();
        org.autotest.Stack stackAr65 = createStack((int) 'a');
        boolean boolean67 = stackAr65.equals((java.lang.Object) 1.0d);
        java.lang.String str68 = stackAr65.toString();
        stackAr58.push((java.lang.Object) stackAr65);
        stackAr54.push((java.lang.Object) stackAr65);
        java.lang.Object obj71 = stackAr54.pop();
        boolean boolean72 = stackAr49.equals(obj71);
        stackAr1.push((java.lang.Object) stackAr49);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj74 = stackAr49.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "[]" + "'", str68, "[]");
        org.junit.Assert.assertNotNull(obj71);
        org.junit.Assert.assertEquals(obj71.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj71), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj71), "[]");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
    }

    @Test
    public void test841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test841");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        int int2 = stackAr1.size();
        int int3 = stackAr1.size();
        org.autotest.Stack stackAr5 = createStack((int) (byte) 1);
        int int6 = stackAr5.size();
        boolean boolean7 = stackAr5.isEmpty();
        boolean boolean8 = stackAr5.isFull();
        int int9 = stackAr5.size();
        boolean boolean10 = stackAr5.isFull();
        org.autotest.Stack stackAr12 = createStack((int) 'a');
        boolean boolean14 = stackAr12.equals((java.lang.Object) 1.0d);
        java.lang.String str15 = stackAr12.toString();
        stackAr5.push((java.lang.Object) stackAr12);
        stackAr1.push((java.lang.Object) stackAr12);
        int int18 = stackAr1.size();
        int int19 = stackAr1.size();
        boolean boolean20 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test842");
        org.autotest.Stack stackAr1 = createStack((int) ' ');
        java.lang.String str2 = stackAr1.toString();
        boolean boolean3 = stackAr1.isFull();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean5 = stackAr1.isFull();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test843");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isFull();
        int int5 = stackAr1.size();
        int int6 = stackAr1.size();
        boolean boolean7 = stackAr1.isFull();
        org.autotest.Stack stackAr9 = createStack((int) 'a');
        boolean boolean11 = stackAr9.equals((java.lang.Object) 1.0d);
        java.lang.String str12 = stackAr9.toString();
        stackAr9.push((java.lang.Object) 1L);
        org.autotest.Stack stackAr16 = createStack((int) (byte) 10);
        boolean boolean17 = stackAr16.isEmpty();
        org.autotest.Stack stackAr19 = createStack((int) (byte) 1);
        stackAr16.push((java.lang.Object) (byte) 1);
        stackAr9.push((java.lang.Object) stackAr16);
        java.lang.String str22 = stackAr9.toString();
        java.lang.Object obj23 = stackAr9.top();
        org.autotest.Stack stackAr25 = createStack(100);
        int int26 = stackAr25.size();
        boolean boolean27 = stackAr9.equals((java.lang.Object) stackAr25);
        stackAr1.push((java.lang.Object) stackAr9);
        boolean boolean29 = stackAr9.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[1,[1]]" + "'", str22, "[1,[1]]");
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "[1]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "[1]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "[1]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test844");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isFull();
        java.lang.String str5 = stackAr1.toString();
        int int6 = stackAr1.size();
        stackAr1.push((java.lang.Object) 10.0d);
        int int9 = stackAr1.size();
        java.lang.Object obj10 = stackAr1.top();
        java.lang.Object obj11 = stackAr1.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 10.0d + "'", obj10, 10.0d);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 10.0d + "'", obj11, 10.0d);
    }

    @Test
    public void test845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test845");
        org.autotest.Stack stackAr1 = createStack((int) ' ');
        java.lang.String str2 = stackAr1.toString();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isFull();
        int int5 = stackAr1.size();
        java.lang.String str6 = stackAr1.toString();
        org.autotest.Stack stackAr8 = createStack((int) 'a');
        boolean boolean9 = stackAr8.isFull();
        int int10 = stackAr8.size();
        org.autotest.Stack stackAr12 = createStack((int) (byte) 1);
        int int13 = stackAr12.size();
        boolean boolean14 = stackAr12.isEmpty();
        boolean boolean15 = stackAr12.isFull();
        int int16 = stackAr12.size();
        boolean boolean17 = stackAr12.isFull();
        java.lang.String str18 = stackAr12.toString();
        boolean boolean19 = stackAr12.isFull();
        stackAr8.push((java.lang.Object) boolean19);
        stackAr8.push((java.lang.Object) 100.0f);
        boolean boolean23 = stackAr8.isEmpty();
        stackAr1.push((java.lang.Object) boolean23);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[]" + "'", str18, "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test846");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        boolean boolean2 = stackAr1.isFull();
        java.lang.Object obj3 = null;
        boolean boolean4 = stackAr1.equals(obj3);
        boolean boolean5 = stackAr1.isFull();
        org.autotest.Stack stackAr7 = createStack((int) (byte) 1);
        int int8 = stackAr7.size();
        int int9 = stackAr7.size();
        org.autotest.Stack stackAr11 = createStack((int) (byte) 1);
        int int12 = stackAr11.size();
        boolean boolean13 = stackAr11.isEmpty();
        boolean boolean14 = stackAr11.isFull();
        int int15 = stackAr11.size();
        boolean boolean16 = stackAr11.isFull();
        org.autotest.Stack stackAr18 = createStack((int) 'a');
        boolean boolean20 = stackAr18.equals((java.lang.Object) 1.0d);
        java.lang.String str21 = stackAr18.toString();
        stackAr11.push((java.lang.Object) stackAr18);
        stackAr7.push((java.lang.Object) stackAr18);
        boolean boolean24 = stackAr1.equals((java.lang.Object) stackAr18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test847");
        org.autotest.Stack stackAr1 = createStack((int) ' ');
        java.lang.String str2 = stackAr1.toString();
        boolean boolean3 = stackAr1.isFull();
        boolean boolean4 = stackAr1.isEmpty();
        org.autotest.Stack stackAr6 = createStack((int) (byte) 1);
        boolean boolean7 = stackAr6.isEmpty();
        java.lang.String str8 = stackAr6.toString();
        stackAr1.push((java.lang.Object) stackAr6);
        org.autotest.Stack stackAr11 = createStack((int) '#');
        int int12 = stackAr11.size();
        int int13 = stackAr11.size();
        int int14 = stackAr11.size();
        stackAr1.push((java.lang.Object) stackAr11);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test848");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isFull();
        int int5 = stackAr1.size();
        boolean boolean6 = stackAr1.isFull();
        org.autotest.Stack stackAr8 = createStack((int) 'a');
        boolean boolean10 = stackAr8.equals((java.lang.Object) 1.0d);
        java.lang.String str11 = stackAr8.toString();
        stackAr1.push((java.lang.Object) stackAr8);
        org.autotest.Stack stackAr14 = createStack((int) (byte) 1);
        boolean boolean15 = stackAr14.isFull();
        boolean boolean16 = stackAr8.equals((java.lang.Object) boolean15);
        org.autotest.Stack stackAr18 = createStack((int) '#');
        int int19 = stackAr18.size();
        boolean boolean20 = stackAr8.equals((java.lang.Object) stackAr18);
        boolean boolean21 = stackAr18.isEmpty();
        org.autotest.Stack stackAr23 = createStack((int) (byte) 1);
        int int24 = stackAr23.size();
        int int25 = stackAr23.size();
        org.autotest.Stack stackAr27 = createStack((int) (byte) 1);
        int int28 = stackAr27.size();
        boolean boolean29 = stackAr27.isEmpty();
        boolean boolean30 = stackAr27.isFull();
        int int31 = stackAr27.size();
        boolean boolean32 = stackAr27.isFull();
        org.autotest.Stack stackAr34 = createStack((int) 'a');
        boolean boolean36 = stackAr34.equals((java.lang.Object) 1.0d);
        java.lang.String str37 = stackAr34.toString();
        stackAr27.push((java.lang.Object) stackAr34);
        stackAr23.push((java.lang.Object) stackAr34);
        int int40 = stackAr23.size();
        org.autotest.Stack stackAr42 = createStack((int) (byte) 1);
        int int43 = stackAr42.size();
        boolean boolean44 = stackAr42.isEmpty();
        boolean boolean45 = stackAr42.isFull();
        int int46 = stackAr42.size();
        boolean boolean47 = stackAr42.isFull();
        java.lang.String str48 = stackAr42.toString();
        boolean boolean49 = stackAr42.isEmpty();
        boolean boolean50 = stackAr23.equals((java.lang.Object) boolean49);
        boolean boolean51 = stackAr18.equals((java.lang.Object) stackAr23);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "[]" + "'", str37, "[]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "[]" + "'", str48, "[]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test849");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        boolean boolean2 = stackAr1.isFull();
        java.lang.Object obj3 = null;
        boolean boolean4 = stackAr1.equals(obj3);
        boolean boolean5 = stackAr1.isFull();
        org.autotest.Stack stackAr7 = createStack((int) (byte) 1);
        int int8 = stackAr7.size();
        int int9 = stackAr7.size();
        org.autotest.Stack stackAr11 = createStack((int) (byte) 1);
        int int12 = stackAr11.size();
        boolean boolean13 = stackAr11.isEmpty();
        boolean boolean14 = stackAr11.isFull();
        int int15 = stackAr11.size();
        boolean boolean16 = stackAr11.isFull();
        org.autotest.Stack stackAr18 = createStack((int) 'a');
        boolean boolean20 = stackAr18.equals((java.lang.Object) 1.0d);
        java.lang.String str21 = stackAr18.toString();
        stackAr11.push((java.lang.Object) stackAr18);
        stackAr7.push((java.lang.Object) stackAr18);
        boolean boolean24 = stackAr1.equals((java.lang.Object) stackAr18);
        java.lang.Object obj25 = new java.lang.Object();
        boolean boolean26 = stackAr18.equals(obj25);
        boolean boolean27 = stackAr18.isEmpty();
        java.lang.Object obj28 = null;
        boolean boolean29 = stackAr18.equals(obj28);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test850");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        boolean boolean2 = stackAr1.isFull();
        int int3 = stackAr1.size();
        java.lang.String str4 = stackAr1.toString();
        org.autotest.Stack stackAr6 = createStack((int) ' ');
        java.lang.String str7 = stackAr6.toString();
        boolean boolean8 = stackAr6.isFull();
        java.lang.String str9 = stackAr6.toString();
        stackAr1.push((java.lang.Object) str9);
        boolean boolean11 = stackAr1.isFull();
        org.autotest.Stack stackAr13 = createStack((int) (byte) 10);
        java.lang.String str14 = stackAr13.toString();
        java.lang.String str15 = stackAr13.toString();
        org.autotest.Stack stackAr17 = createStack((int) (byte) 1);
        boolean boolean18 = stackAr17.isEmpty();
        int int19 = stackAr17.size();
        boolean boolean20 = stackAr17.isFull();
        java.lang.String str21 = stackAr17.toString();
        boolean boolean22 = stackAr17.isFull();
        stackAr17.push((java.lang.Object) 0.0f);
        stackAr13.push((java.lang.Object) stackAr17);
        stackAr1.push((java.lang.Object) stackAr17);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }
}

