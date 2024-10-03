package org.autotest.generated;
import org.autotest.MutationAnalysisRunner;

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest17 extends MutationAnalysisRunner {
    @Override
    protected boolean useVerboseMode() { return false; }

    public static boolean debug = false;

    @Test
    public void test851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test851");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 100);
        org.autotest.Stack stackAr3 = createStack((int) (byte) 1);
        boolean boolean4 = stackAr3.isEmpty();
        int int5 = stackAr3.size();
        boolean boolean6 = stackAr3.isFull();
        java.lang.String str7 = stackAr3.toString();
        int int8 = stackAr3.size();
        boolean boolean9 = stackAr3.isFull();
        stackAr1.push((java.lang.Object) boolean9);
        org.autotest.Stack stackAr12 = createStack((int) '#');
        int int13 = stackAr12.size();
        org.autotest.Stack stackAr15 = createStack((int) 'a');
        boolean boolean16 = stackAr15.isFull();
        java.lang.Object obj17 = null;
        boolean boolean18 = stackAr15.equals(obj17);
        stackAr12.push((java.lang.Object) boolean18);
        stackAr1.push((java.lang.Object) stackAr12);
        boolean boolean21 = stackAr1.isEmpty();
        org.autotest.Stack stackAr23 = createStack((int) (byte) 1);
        int int24 = stackAr23.size();
        boolean boolean25 = stackAr23.isEmpty();
        org.autotest.Stack stackAr27 = createStack((int) 'a');
        boolean boolean28 = stackAr27.isFull();
        java.lang.Object obj29 = null;
        boolean boolean30 = stackAr27.equals(obj29);
        boolean boolean31 = stackAr27.isFull();
        org.autotest.Stack stackAr33 = createStack((int) (byte) 1);
        int int34 = stackAr33.size();
        int int35 = stackAr33.size();
        org.autotest.Stack stackAr37 = createStack((int) (byte) 1);
        int int38 = stackAr37.size();
        boolean boolean39 = stackAr37.isEmpty();
        boolean boolean40 = stackAr37.isFull();
        int int41 = stackAr37.size();
        boolean boolean42 = stackAr37.isFull();
        org.autotest.Stack stackAr44 = createStack((int) 'a');
        boolean boolean46 = stackAr44.equals((java.lang.Object) 1.0d);
        java.lang.String str47 = stackAr44.toString();
        stackAr37.push((java.lang.Object) stackAr44);
        stackAr33.push((java.lang.Object) stackAr44);
        boolean boolean50 = stackAr27.equals((java.lang.Object) stackAr44);
        org.autotest.Stack stackAr52 = createStack((int) (byte) 1);
        boolean boolean53 = stackAr52.isEmpty();
        boolean boolean54 = stackAr52.isFull();
        int int55 = stackAr52.size();
        boolean boolean56 = stackAr52.isFull();
        boolean boolean57 = stackAr27.equals((java.lang.Object) stackAr52);
        org.autotest.Stack stackAr59 = createStack(100);
        boolean boolean60 = stackAr59.isFull();
        org.autotest.Stack stackAr62 = createStack(10);
        int int63 = stackAr62.size();
        boolean boolean64 = stackAr62.isEmpty();
        org.autotest.Stack stackAr66 = createStack((int) 'a');
        boolean boolean67 = stackAr66.isFull();
        java.lang.Object obj68 = null;
        boolean boolean69 = stackAr66.equals(obj68);
        boolean boolean70 = stackAr66.isFull();
        boolean boolean71 = stackAr62.equals((java.lang.Object) stackAr66);
        stackAr59.push((java.lang.Object) stackAr66);
        boolean boolean73 = stackAr27.equals((java.lang.Object) stackAr59);
        boolean boolean74 = stackAr23.equals((java.lang.Object) stackAr27);
        boolean boolean75 = stackAr27.isEmpty();
        java.lang.String str76 = stackAr27.toString();
        org.autotest.Stack stackAr78 = createStack((int) (byte) 1);
        boolean boolean79 = stackAr78.isFull();
        java.lang.String str80 = stackAr78.toString();
        org.autotest.Stack stackAr82 = createStack((int) 'a');
        int int83 = stackAr82.size();
        boolean boolean84 = stackAr82.isFull();
        stackAr78.push((java.lang.Object) stackAr82);
        boolean boolean86 = stackAr78.isFull();
        boolean boolean87 = stackAr78.isFull();
        stackAr27.push((java.lang.Object) boolean87);
        boolean boolean89 = stackAr1.equals((java.lang.Object) boolean87);
        int int90 = stackAr1.size();
        boolean boolean91 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "[]" + "'", str47, "[]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "[]" + "'", str76, "[]");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "[]" + "'", str80, "[]");
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 2 + "'", int90 == 2);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test852");
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
        int int12 = stackAr7.size();
        boolean boolean13 = stackAr7.isEmpty();
        boolean boolean14 = stackAr7.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test853");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        int int2 = stackAr1.size();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isEmpty();
        org.autotest.Stack stackAr6 = createStack((int) (byte) 0);
        org.autotest.Stack stackAr8 = createStack((int) (byte) 1);
        boolean boolean9 = stackAr8.isFull();
        java.lang.String str10 = stackAr8.toString();
        boolean boolean11 = stackAr8.isEmpty();
        boolean boolean12 = stackAr6.equals((java.lang.Object) stackAr8);
        boolean boolean13 = stackAr1.equals((java.lang.Object) stackAr6);
        boolean boolean14 = stackAr6.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test854");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        int int2 = stackAr1.size();
        org.autotest.Stack stackAr4 = createStack((int) 'a');
        int int5 = stackAr4.size();
        boolean boolean6 = stackAr4.isFull();
        stackAr1.push((java.lang.Object) stackAr4);
        org.autotest.Stack stackAr9 = createStack((int) 'a');
        int int10 = stackAr9.size();
        boolean boolean11 = stackAr9.isFull();
        boolean boolean12 = stackAr9.isEmpty();
        int int13 = stackAr9.size();
        org.autotest.Stack stackAr15 = createStack((int) (byte) 1);
        boolean boolean16 = stackAr15.isFull();
        java.lang.String str17 = stackAr15.toString();
        int int18 = stackAr15.size();
        stackAr15.push((java.lang.Object) (short) 100);
        int int21 = stackAr15.size();
        stackAr9.push((java.lang.Object) int21);
        boolean boolean23 = stackAr1.equals((java.lang.Object) stackAr9);
        boolean boolean24 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test855");
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
        org.autotest.Stack stackAr17 = createStack((int) (byte) 1);
        boolean boolean18 = stackAr17.isFull();
        boolean boolean19 = stackAr17.isEmpty();
        boolean boolean20 = stackAr7.equals((java.lang.Object) stackAr17);
        org.autotest.Stack stackAr22 = createStack((int) (byte) 1);
        boolean boolean23 = stackAr22.isEmpty();
        int int24 = stackAr22.size();
        boolean boolean25 = stackAr22.isFull();
        java.lang.String str26 = stackAr22.toString();
        boolean boolean27 = stackAr22.isFull();
        int int28 = stackAr22.size();
        boolean boolean29 = stackAr17.equals((java.lang.Object) int28);
        java.lang.Object obj30 = null;
        boolean boolean31 = stackAr17.equals(obj30);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[]" + "'", str26, "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test856");
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
        int int18 = stackAr11.size();
        org.autotest.Stack stackAr20 = createStack((int) (byte) 1);
        int int21 = stackAr20.size();
        boolean boolean22 = stackAr20.isEmpty();
        boolean boolean23 = stackAr20.isFull();
        int int24 = stackAr20.size();
        java.lang.String str25 = stackAr20.toString();
        boolean boolean26 = stackAr20.isEmpty();
        boolean boolean27 = stackAr11.equals((java.lang.Object) stackAr20);
        int int28 = stackAr11.size();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[]" + "'", str25, "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test857");
        org.autotest.Stack stackAr1 = createStack(100);
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isEmpty();
        org.autotest.Stack stackAr6 = createStack((int) (byte) 100);
        org.autotest.Stack stackAr8 = createStack((int) (byte) 1);
        boolean boolean9 = stackAr8.isEmpty();
        int int10 = stackAr8.size();
        boolean boolean11 = stackAr8.isFull();
        java.lang.String str12 = stackAr8.toString();
        int int13 = stackAr8.size();
        boolean boolean14 = stackAr8.isFull();
        stackAr6.push((java.lang.Object) boolean14);
        org.autotest.Stack stackAr17 = createStack((int) '#');
        int int18 = stackAr17.size();
        org.autotest.Stack stackAr20 = createStack((int) 'a');
        boolean boolean21 = stackAr20.isFull();
        java.lang.Object obj22 = null;
        boolean boolean23 = stackAr20.equals(obj22);
        stackAr17.push((java.lang.Object) boolean23);
        stackAr6.push((java.lang.Object) stackAr17);
        java.lang.Object obj26 = stackAr17.top();
        java.lang.Object obj27 = stackAr17.pop();
        java.lang.String str28 = stackAr17.toString();
        org.autotest.Stack stackAr30 = createStack((int) (byte) 10);
        boolean boolean31 = stackAr30.isEmpty();
        java.lang.String str32 = stackAr30.toString();
        boolean boolean33 = stackAr17.equals((java.lang.Object) str32);
        boolean boolean34 = stackAr1.equals((java.lang.Object) str32);
        org.autotest.Stack stackAr36 = createStack((int) (byte) 1);
        boolean boolean37 = stackAr36.isFull();
        java.lang.String str38 = stackAr36.toString();
        org.autotest.Stack stackAr40 = createStack((int) 'a');
        int int41 = stackAr40.size();
        boolean boolean42 = stackAr40.isFull();
        stackAr36.push((java.lang.Object) stackAr40);
        boolean boolean44 = stackAr36.isEmpty();
        java.lang.Object obj45 = stackAr36.top();
        boolean boolean46 = stackAr1.equals(obj45);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + false + "'", obj26, false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + false + "'", obj27, false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[]" + "'", str28, "[]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[]" + "'", str32, "[]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "[]" + "'", str38, "[]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertEquals(obj45.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj45), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj45), "[]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test858");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        int int2 = stackAr1.size();
        java.lang.String str3 = stackAr1.toString();
        java.lang.String str4 = stackAr1.toString();
        boolean boolean5 = stackAr1.isFull();
        org.autotest.Stack stackAr7 = createStack(3);
        boolean boolean8 = stackAr1.equals((java.lang.Object) 3);
        java.lang.String str9 = stackAr1.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
    }

    @Test
    public void test859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test859");
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
        org.autotest.Stack stackAr33 = createStack((int) (byte) 1);
        boolean boolean34 = stackAr33.isFull();
        java.lang.String str35 = stackAr33.toString();
        boolean boolean36 = stackAr33.isEmpty();
        int int37 = stackAr33.size();
        boolean boolean38 = stackAr26.equals((java.lang.Object) stackAr33);
        boolean boolean39 = stackAr33.isEmpty();
        java.lang.String str40 = stackAr33.toString();
        org.autotest.Stack stackAr42 = createStack((int) 'a');
        int int43 = stackAr42.size();
        org.autotest.Stack stackAr45 = createStack((int) 'a');
        int int46 = stackAr45.size();
        boolean boolean47 = stackAr45.isFull();
        stackAr42.push((java.lang.Object) stackAr45);
        java.lang.Object obj49 = stackAr42.pop();
        java.lang.String str50 = stackAr42.toString();
        stackAr33.push((java.lang.Object) str50);
        java.lang.Object obj52 = stackAr33.top();
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "[]" + "'", str35, "[]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "[]" + "'", str40, "[]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertEquals(obj49.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj49), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj49), "[]");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "[]" + "'", str50, "[]");
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + "[]" + "'", obj52, "[]");
    }

    @Test
    public void test860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test860");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        int int2 = stackAr1.size();
        int int3 = stackAr1.size();
        org.autotest.Stack stackAr5 = createStack((int) 'a');
        boolean boolean7 = stackAr5.equals((java.lang.Object) 1.0d);
        java.lang.String str8 = stackAr5.toString();
        stackAr1.push((java.lang.Object) str8);
        java.lang.Object obj10 = stackAr1.top();
        int int11 = stackAr1.size();
        java.lang.Object obj12 = stackAr1.pop();
        int int13 = stackAr1.size();
        int int14 = stackAr1.size();
        boolean boolean15 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "[]" + "'", obj10, "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "[]" + "'", obj12, "[]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test861");
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
        org.autotest.Stack stackAr17 = createStack((int) 'a');
        java.lang.String str18 = stackAr17.toString();
        org.autotest.Stack stackAr20 = createStack((int) (byte) 1);
        boolean boolean21 = stackAr20.isFull();
        java.lang.String str22 = stackAr20.toString();
        int int23 = stackAr20.size();
        stackAr20.push((java.lang.Object) (short) 100);
        int int26 = stackAr20.size();
        stackAr17.push((java.lang.Object) stackAr20);
        int int28 = stackAr17.size();
        boolean boolean29 = stackAr7.equals((java.lang.Object) stackAr17);
        org.autotest.Stack stackAr31 = createStack((int) (byte) 1);
        boolean boolean32 = stackAr31.isEmpty();
        org.autotest.Stack stackAr34 = createStack((int) (byte) 1);
        boolean boolean35 = stackAr34.isEmpty();
        int int36 = stackAr34.size();
        boolean boolean37 = stackAr34.isFull();
        org.autotest.Stack stackAr39 = createStack((int) 'a');
        int int40 = stackAr39.size();
        org.autotest.Stack stackAr42 = createStack((int) 'a');
        int int43 = stackAr42.size();
        boolean boolean44 = stackAr42.isFull();
        stackAr39.push((java.lang.Object) stackAr42);
        boolean boolean46 = stackAr39.isEmpty();
        boolean boolean47 = stackAr34.equals((java.lang.Object) boolean46);
        boolean boolean48 = stackAr31.equals((java.lang.Object) boolean47);
        java.lang.Object obj49 = null;
        boolean boolean50 = stackAr31.equals(obj49);
        org.autotest.Stack stackAr52 = createStack((int) (byte) 1);
        int int53 = stackAr52.size();
        boolean boolean54 = stackAr52.isEmpty();
        boolean boolean55 = stackAr52.isFull();
        int int56 = stackAr52.size();
        int int57 = stackAr52.size();
        int int58 = stackAr52.size();
        stackAr52.push((java.lang.Object) (short) 1);
        int int61 = stackAr52.size();
        boolean boolean62 = stackAr52.isEmpty();
        boolean boolean63 = stackAr31.equals((java.lang.Object) boolean62);
        boolean boolean64 = stackAr31.isFull();
        boolean boolean65 = stackAr7.equals((java.lang.Object) stackAr31);
        org.autotest.Stack stackAr67 = createStack((int) (byte) 1);
        boolean boolean68 = stackAr67.isEmpty();
        java.lang.String str69 = stackAr67.toString();
        int int70 = stackAr67.size();
        org.autotest.Stack stackAr72 = createStack((int) (byte) 1);
        int int73 = stackAr72.size();
        boolean boolean74 = stackAr72.isEmpty();
        boolean boolean75 = stackAr72.isFull();
        int int76 = stackAr72.size();
        int int77 = stackAr72.size();
        int int78 = stackAr72.size();
        boolean boolean79 = stackAr72.isFull();
        stackAr67.push((java.lang.Object) stackAr72);
        stackAr31.push((java.lang.Object) stackAr67);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[]" + "'", str18, "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[]" + "'", str22, "[]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "[]" + "'", str69, "[]");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test862");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        boolean boolean2 = stackAr1.isFull();
        java.lang.String str3 = stackAr1.toString();
        org.autotest.Stack stackAr5 = createStack((int) (byte) 10);
        boolean boolean6 = stackAr5.isEmpty();
        org.autotest.Stack stackAr8 = createStack((int) (byte) 1);
        stackAr5.push((java.lang.Object) (byte) 1);
        boolean boolean10 = stackAr1.equals((java.lang.Object) stackAr5);
        java.lang.Object obj11 = stackAr5.pop();
        boolean boolean12 = stackAr5.isFull();
        boolean boolean13 = stackAr5.isEmpty();
        int int14 = stackAr5.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = stackAr5.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 1 + "'", obj11, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test863");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        int int2 = stackAr1.size();
        java.lang.String str3 = stackAr1.toString();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean6 = stackAr1.equals((java.lang.Object) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test864");
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
        org.autotest.Stack stackAr30 = createStack((int) 'a');
        int int31 = stackAr30.size();
        boolean boolean32 = stackAr30.isFull();
        boolean boolean33 = stackAr30.isEmpty();
        int int34 = stackAr30.size();
        java.lang.String str35 = stackAr30.toString();
        stackAr6.push((java.lang.Object) stackAr30);
        boolean boolean37 = stackAr6.isFull();
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "[]" + "'", str35, "[]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test865");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        int int2 = stackAr1.size();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean5 = stackAr1.isEmpty();
        org.autotest.Stack stackAr7 = createStack((int) 'a');
        boolean boolean9 = stackAr7.equals((java.lang.Object) 1.0d);
        java.lang.String str10 = stackAr7.toString();
        stackAr7.push((java.lang.Object) 1L);
        org.autotest.Stack stackAr14 = createStack((int) (byte) 1);
        boolean boolean15 = stackAr14.isFull();
        java.lang.String str16 = stackAr14.toString();
        org.autotest.Stack stackAr18 = createStack((int) (byte) 10);
        boolean boolean19 = stackAr18.isEmpty();
        org.autotest.Stack stackAr21 = createStack((int) (byte) 1);
        stackAr18.push((java.lang.Object) (byte) 1);
        boolean boolean23 = stackAr14.equals((java.lang.Object) stackAr18);
        org.autotest.Stack stackAr25 = createStack((int) 'a');
        int int26 = stackAr25.size();
        org.autotest.Stack stackAr28 = createStack((int) 'a');
        int int29 = stackAr28.size();
        boolean boolean30 = stackAr28.isFull();
        stackAr25.push((java.lang.Object) stackAr28);
        boolean boolean32 = stackAr18.equals((java.lang.Object) stackAr28);
        stackAr7.push((java.lang.Object) boolean32);
        stackAr7.push((java.lang.Object) "");
        boolean boolean36 = stackAr7.isEmpty();
        boolean boolean37 = stackAr1.equals((java.lang.Object) boolean36);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj38 = stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test866");
        org.autotest.Stack stackAr1 = createStack((int) ' ');
        java.lang.String str2 = stackAr1.toString();
        org.autotest.Stack stackAr4 = createStack((int) (byte) 1);
        int int5 = stackAr4.size();
        boolean boolean6 = stackAr4.isEmpty();
        boolean boolean7 = stackAr4.isFull();
        boolean boolean8 = stackAr4.isFull();
        org.autotest.Stack stackAr10 = createStack((int) 'a');
        int int11 = stackAr10.size();
        stackAr4.push((java.lang.Object) int11);
        boolean boolean13 = stackAr1.equals((java.lang.Object) int11);
        int int14 = stackAr1.size();
        boolean boolean15 = stackAr1.isFull();
        org.autotest.Stack stackAr17 = createStack((int) 'a');
        boolean boolean18 = stackAr17.isFull();
        java.lang.Object obj19 = null;
        boolean boolean20 = stackAr17.equals(obj19);
        boolean boolean21 = stackAr17.isFull();
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
        boolean boolean40 = stackAr17.equals((java.lang.Object) stackAr34);
        java.lang.Object obj41 = new java.lang.Object();
        boolean boolean42 = stackAr34.equals(obj41);
        boolean boolean43 = stackAr34.isEmpty();
        int int44 = stackAr34.size();
        org.autotest.Stack stackAr46 = createStack((int) 'a');
        stackAr34.push((java.lang.Object) 'a');
        java.lang.Object obj48 = stackAr34.top();
        stackAr1.push((java.lang.Object) stackAr34);
        boolean boolean50 = stackAr34.isFull();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "[]" + "'", str37, "[]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 'a' + "'", obj48, 'a');
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test867");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isEmpty();
        org.autotest.Stack stackAr5 = createStack(100);
        int int6 = stackAr5.size();
        boolean boolean7 = stackAr5.isEmpty();
        int int8 = stackAr5.size();
        boolean boolean9 = stackAr1.equals((java.lang.Object) stackAr5);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test868");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        int int2 = stackAr1.size();
        java.lang.String str3 = stackAr1.toString();
        java.lang.String str4 = stackAr1.toString();
        boolean boolean5 = stackAr1.isFull();
        int int6 = stackAr1.size();
        boolean boolean7 = stackAr1.isEmpty();
        boolean boolean8 = stackAr1.isFull();
        int int9 = stackAr1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test869");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        boolean boolean3 = stackAr1.equals((java.lang.Object) 1.0d);
        java.lang.String str4 = stackAr1.toString();
        stackAr1.push((java.lang.Object) 1L);
        org.autotest.Stack stackAr8 = createStack((int) (byte) 1);
        boolean boolean9 = stackAr8.isFull();
        java.lang.String str10 = stackAr8.toString();
        org.autotest.Stack stackAr12 = createStack((int) (byte) 10);
        boolean boolean13 = stackAr12.isEmpty();
        org.autotest.Stack stackAr15 = createStack((int) (byte) 1);
        stackAr12.push((java.lang.Object) (byte) 1);
        boolean boolean17 = stackAr8.equals((java.lang.Object) stackAr12);
        org.autotest.Stack stackAr19 = createStack((int) 'a');
        int int20 = stackAr19.size();
        org.autotest.Stack stackAr22 = createStack((int) 'a');
        int int23 = stackAr22.size();
        boolean boolean24 = stackAr22.isFull();
        stackAr19.push((java.lang.Object) stackAr22);
        boolean boolean26 = stackAr12.equals((java.lang.Object) stackAr22);
        stackAr1.push((java.lang.Object) boolean26);
        stackAr1.push((java.lang.Object) "");
        boolean boolean30 = stackAr1.isEmpty();
        org.autotest.Stack stackAr32 = createStack((int) 'a');
        int int33 = stackAr32.size();
        org.autotest.Stack stackAr35 = createStack((int) 'a');
        int int36 = stackAr35.size();
        boolean boolean37 = stackAr35.isFull();
        stackAr32.push((java.lang.Object) stackAr35);
        boolean boolean39 = stackAr35.isEmpty();
        java.lang.String str40 = stackAr35.toString();
        org.autotest.Stack stackAr42 = createStack((int) 'a');
        boolean boolean43 = stackAr42.isFull();
        java.lang.Object obj44 = null;
        boolean boolean45 = stackAr42.equals(obj44);
        boolean boolean46 = stackAr42.isFull();
        org.autotest.Stack stackAr48 = createStack((int) (byte) 1);
        int int49 = stackAr48.size();
        int int50 = stackAr48.size();
        boolean boolean51 = stackAr42.equals((java.lang.Object) stackAr48);
        int int52 = stackAr48.size();
        org.autotest.Stack stackAr53 = createStack();
        boolean boolean54 = stackAr53.isEmpty();
        stackAr48.push((java.lang.Object) stackAr53);
        boolean boolean56 = stackAr48.isFull();
        org.autotest.Stack stackAr58 = createStack((int) (byte) 1);
        boolean boolean59 = stackAr58.isFull();
        boolean boolean60 = stackAr58.isEmpty();
        boolean boolean61 = stackAr48.equals((java.lang.Object) stackAr58);
        boolean boolean62 = stackAr35.equals((java.lang.Object) stackAr48);
        boolean boolean63 = stackAr1.equals((java.lang.Object) stackAr35);
        boolean boolean64 = stackAr1.isFull();
        int int65 = stackAr1.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "[]" + "'", str40, "[]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 3 + "'", int65 == 3);
    }

    @Test
    public void test870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test870");
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
        java.lang.String str51 = stackAr31.toString();
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
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "[1,null]" + "'", str51, "[1,null]");
    }

    @Test
    public void test871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test871");
        org.autotest.Stack stackAr1 = createStack(100);
        boolean boolean2 = stackAr1.isFull();
        org.autotest.Stack stackAr4 = createStack(10);
        int int5 = stackAr4.size();
        boolean boolean6 = stackAr4.isEmpty();
        org.autotest.Stack stackAr8 = createStack((int) 'a');
        boolean boolean9 = stackAr8.isFull();
        java.lang.Object obj10 = null;
        boolean boolean11 = stackAr8.equals(obj10);
        boolean boolean12 = stackAr8.isFull();
        boolean boolean13 = stackAr4.equals((java.lang.Object) stackAr8);
        stackAr1.push((java.lang.Object) stackAr8);
        int int15 = stackAr8.size();
        org.autotest.Stack stackAr17 = createStack((int) (byte) 1);
        boolean boolean18 = stackAr17.isFull();
        stackAr17.push((java.lang.Object) (short) -1);
        java.lang.Object obj21 = stackAr17.top();
        java.lang.Object obj22 = stackAr17.pop();
        org.autotest.Stack stackAr24 = createStack((int) 'a');
        boolean boolean26 = stackAr24.equals((java.lang.Object) 1.0d);
        java.lang.String str27 = stackAr24.toString();
        boolean boolean28 = stackAr24.isFull();
        int int29 = stackAr24.size();
        int int30 = stackAr24.size();
        boolean boolean31 = stackAr17.equals((java.lang.Object) stackAr24);
        int int32 = stackAr24.size();
        boolean boolean33 = stackAr8.equals((java.lang.Object) int32);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (short) -1 + "'", obj21, (short) -1);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (short) -1 + "'", obj22, (short) -1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[]" + "'", str27, "[]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test872");
        org.autotest.Stack stackAr1 = createStack((int) (short) 100);
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test873");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isFull();
        int int5 = stackAr1.size();
        boolean boolean6 = stackAr1.isFull();
        java.lang.String str7 = stackAr1.toString();
        boolean boolean8 = stackAr1.isFull();
        org.autotest.Stack stackAr10 = createStack((int) (byte) 1);
        int int11 = stackAr10.size();
        java.lang.String str12 = stackAr10.toString();
        java.lang.String str13 = stackAr10.toString();
        java.lang.String str14 = stackAr10.toString();
        java.lang.String str15 = stackAr10.toString();
        org.autotest.Stack stackAr17 = createStack(100);
        boolean boolean18 = stackAr17.isFull();
        org.autotest.Stack stackAr20 = createStack(10);
        int int21 = stackAr20.size();
        boolean boolean22 = stackAr20.isEmpty();
        org.autotest.Stack stackAr24 = createStack((int) 'a');
        boolean boolean25 = stackAr24.isFull();
        java.lang.Object obj26 = null;
        boolean boolean27 = stackAr24.equals(obj26);
        boolean boolean28 = stackAr24.isFull();
        boolean boolean29 = stackAr20.equals((java.lang.Object) stackAr24);
        stackAr17.push((java.lang.Object) stackAr24);
        boolean boolean31 = stackAr10.equals((java.lang.Object) stackAr17);
        boolean boolean32 = stackAr10.isEmpty();
        boolean boolean33 = stackAr1.equals((java.lang.Object) stackAr10);
        java.lang.String str34 = stackAr1.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "[]" + "'", str34, "[]");
    }

    @Test
    public void test874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test874");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 0);
        org.autotest.Stack stackAr3 = createStack((int) (byte) 1);
        boolean boolean4 = stackAr3.isFull();
        java.lang.String str5 = stackAr3.toString();
        boolean boolean6 = stackAr3.isEmpty();
        boolean boolean7 = stackAr1.equals((java.lang.Object) stackAr3);
        org.autotest.Stack stackAr9 = createStack((int) ' ');
        java.lang.String str10 = stackAr9.toString();
        boolean boolean11 = stackAr9.isFull();
        boolean boolean12 = stackAr9.isEmpty();
        org.autotest.Stack stackAr14 = createStack((int) (byte) 1);
        boolean boolean15 = stackAr14.isEmpty();
        java.lang.String str16 = stackAr14.toString();
        stackAr9.push((java.lang.Object) stackAr14);
        stackAr3.push((java.lang.Object) stackAr9);
        java.lang.Object obj19 = stackAr3.top();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "[[]]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "[[]]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "[[]]");
    }

    @Test
    public void test875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test875");
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
        java.lang.Object obj48 = stackAr18.pop();
        int int49 = stackAr18.size();
        org.autotest.Stack stackAr51 = createStack((int) (byte) 1);
        boolean boolean52 = stackAr51.isEmpty();
        int int53 = stackAr51.size();
        boolean boolean54 = stackAr51.isFull();
        org.autotest.Stack stackAr56 = createStack((int) 'a');
        int int57 = stackAr56.size();
        org.autotest.Stack stackAr59 = createStack((int) 'a');
        int int60 = stackAr59.size();
        boolean boolean61 = stackAr59.isFull();
        stackAr56.push((java.lang.Object) stackAr59);
        boolean boolean63 = stackAr56.isEmpty();
        boolean boolean64 = stackAr51.equals((java.lang.Object) boolean63);
        int int65 = stackAr51.size();
        boolean boolean66 = stackAr51.isEmpty();
        boolean boolean67 = stackAr18.equals((java.lang.Object) stackAr51);
        java.lang.String str68 = stackAr51.toString();
        boolean boolean69 = stackAr51.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj70 = stackAr51.top();
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
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertEquals(obj48.toString(), "[1]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj48), "[1]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj48), "[1]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "[]" + "'", str68, "[]");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    }
}

