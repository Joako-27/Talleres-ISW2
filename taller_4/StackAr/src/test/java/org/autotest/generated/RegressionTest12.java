package org.autotest.generated;
import org.autotest.MutationAnalysisRunner;

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest12 extends MutationAnalysisRunner {
    @Override
    protected boolean useVerboseMode() { return false; }

    public static boolean debug = false;

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test601");
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
        int int34 = stackAr10.size();
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test602");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isFull();
        java.lang.String str5 = stackAr1.toString();
        int int6 = stackAr1.size();
        stackAr1.push((java.lang.Object) 10.0d);
        org.autotest.Stack stackAr10 = createStack((int) (byte) 1);
        boolean boolean11 = stackAr10.isFull();
        stackAr10.push((java.lang.Object) (short) -1);
        java.lang.Object obj14 = stackAr10.top();
        java.lang.Object obj15 = stackAr10.pop();
        boolean boolean16 = stackAr1.equals(obj15);
        boolean boolean17 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) -1 + "'", obj14, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test603");
        org.autotest.Stack stackAr1 = createStack((int) ' ');
        java.lang.String str2 = stackAr1.toString();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isFull();
        int int5 = stackAr1.size();
        boolean boolean6 = stackAr1.isEmpty();
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
        org.autotest.Stack stackAr28 = createStack((int) ' ');
        java.lang.String str29 = stackAr28.toString();
        org.autotest.Stack stackAr31 = createStack((int) (byte) 1);
        int int32 = stackAr31.size();
        boolean boolean33 = stackAr31.isEmpty();
        boolean boolean34 = stackAr31.isFull();
        boolean boolean35 = stackAr31.isFull();
        org.autotest.Stack stackAr37 = createStack((int) 'a');
        int int38 = stackAr37.size();
        stackAr31.push((java.lang.Object) int38);
        boolean boolean40 = stackAr28.equals((java.lang.Object) int38);
        org.autotest.Stack stackAr42 = createStack((int) (byte) 1);
        int int43 = stackAr42.size();
        boolean boolean44 = stackAr42.isEmpty();
        boolean boolean45 = stackAr42.isFull();
        int int46 = stackAr42.size();
        boolean boolean47 = stackAr42.isFull();
        org.autotest.Stack stackAr49 = createStack((int) 'a');
        boolean boolean51 = stackAr49.equals((java.lang.Object) 1.0d);
        java.lang.String str52 = stackAr49.toString();
        stackAr42.push((java.lang.Object) stackAr49);
        org.autotest.Stack stackAr55 = createStack((int) (byte) 1);
        boolean boolean56 = stackAr55.isFull();
        boolean boolean57 = stackAr49.equals((java.lang.Object) boolean56);
        boolean boolean58 = stackAr49.isFull();
        org.autotest.Stack stackAr60 = createStack((int) (byte) 1);
        int int61 = stackAr60.size();
        int int62 = stackAr60.size();
        org.autotest.Stack stackAr64 = createStack((int) (byte) 1);
        int int65 = stackAr64.size();
        boolean boolean66 = stackAr64.isEmpty();
        boolean boolean67 = stackAr64.isFull();
        int int68 = stackAr64.size();
        boolean boolean69 = stackAr64.isFull();
        org.autotest.Stack stackAr71 = createStack((int) 'a');
        boolean boolean73 = stackAr71.equals((java.lang.Object) 1.0d);
        java.lang.String str74 = stackAr71.toString();
        stackAr64.push((java.lang.Object) stackAr71);
        stackAr60.push((java.lang.Object) stackAr71);
        int int77 = stackAr60.size();
        stackAr49.push((java.lang.Object) stackAr60);
        boolean boolean79 = stackAr28.equals((java.lang.Object) stackAr60);
        stackAr12.push((java.lang.Object) stackAr28);
        stackAr1.push((java.lang.Object) stackAr12);
        boolean boolean82 = stackAr12.isFull();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "[]" + "'", str29, "[]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "[]" + "'", str52, "[]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "[]" + "'", str74, "[]");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1 + "'", int77 == 1);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test604");
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
        int int19 = stackAr11.size();
        boolean boolean20 = stackAr11.isEmpty();
        boolean boolean21 = stackAr11.isEmpty();
        boolean boolean22 = stackAr11.isEmpty();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test605");
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
        org.autotest.Stack stackAr29 = createStack((int) (byte) 1);
        int int30 = stackAr29.size();
        java.lang.String str31 = stackAr29.toString();
        java.lang.String str32 = stackAr29.toString();
        stackAr1.push((java.lang.Object) stackAr29);
        boolean boolean34 = stackAr1.isFull();
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "[]" + "'", str31, "[]");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[]" + "'", str32, "[]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test606");
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
        org.autotest.Stack stackAr20 = createStack((int) (byte) 1);
        int int21 = stackAr20.size();
        java.lang.String str22 = stackAr20.toString();
        java.lang.String str23 = stackAr20.toString();
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
        boolean boolean49 = stackAr20.equals((java.lang.Object) stackAr42);
        boolean boolean50 = stackAr42.isEmpty();
        boolean boolean51 = stackAr42.isFull();
        boolean boolean52 = stackAr42.isFull();
        boolean boolean53 = stackAr3.equals((java.lang.Object) boolean52);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[]" + "'", str22, "[]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[]" + "'", str23, "[]");
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
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test607");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        int int2 = stackAr1.size();
        int int3 = stackAr1.size();
        org.autotest.Stack stackAr5 = createStack((int) 'a');
        boolean boolean7 = stackAr5.equals((java.lang.Object) 1.0d);
        java.lang.String str8 = stackAr5.toString();
        stackAr1.push((java.lang.Object) str8);
        java.lang.Object obj10 = stackAr1.top();
        int int11 = stackAr1.size();
        int int12 = stackAr1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "[]" + "'", obj10, "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test608");
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
        java.lang.String str12 = stackAr7.toString();
        boolean boolean13 = stackAr7.isEmpty();
        boolean boolean14 = stackAr7.isFull();
        java.lang.String str15 = stackAr7.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test609");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = stackAr11.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test610");
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
        java.lang.Object obj19 = stackAr1.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "[]");
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test611");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test612");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        boolean boolean2 = stackAr1.isFull();
        java.lang.Object obj3 = null;
        boolean boolean4 = stackAr1.equals(obj3);
        boolean boolean5 = stackAr1.isFull();
        org.autotest.Stack stackAr7 = createStack((int) (byte) 1);
        int int8 = stackAr7.size();
        int int9 = stackAr7.size();
        boolean boolean10 = stackAr1.equals((java.lang.Object) stackAr7);
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
        boolean boolean43 = stackAr7.equals((java.lang.Object) stackAr37);
        boolean boolean44 = stackAr7.isEmpty();
        org.autotest.Stack stackAr46 = createStack((int) (byte) 1);
        int int47 = stackAr46.size();
        int int48 = stackAr46.size();
        org.autotest.Stack stackAr50 = createStack((int) 'a');
        boolean boolean52 = stackAr50.equals((java.lang.Object) 1.0d);
        java.lang.String str53 = stackAr50.toString();
        stackAr46.push((java.lang.Object) str53);
        java.lang.Object obj55 = stackAr46.top();
        boolean boolean56 = stackAr46.isEmpty();
        java.lang.String str57 = stackAr46.toString();
        stackAr7.push((java.lang.Object) stackAr46);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
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
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "[]" + "'", str53, "[]");
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + "[]" + "'", obj55, "[]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "[[]]" + "'", str57, "[[]]");
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test613");
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
        org.autotest.Stack stackAr28 = createStack((int) (byte) 1);
        int int29 = stackAr28.size();
        boolean boolean30 = stackAr18.equals((java.lang.Object) stackAr28);
        java.lang.String str31 = stackAr28.toString();
        java.lang.String str32 = stackAr28.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = stackAr28.pop();
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "[]" + "'", str31, "[]");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[]" + "'", str32, "[]");
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test614");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        int int2 = stackAr1.size();
        org.autotest.Stack stackAr4 = createStack((int) 'a');
        int int5 = stackAr4.size();
        boolean boolean6 = stackAr4.isFull();
        stackAr1.push((java.lang.Object) stackAr4);
        java.lang.Object obj8 = stackAr1.pop();
        java.lang.String str9 = stackAr1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test615");
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
        org.autotest.Stack stackAr22 = createStack(10);
        int int23 = stackAr22.size();
        boolean boolean24 = stackAr22.isEmpty();
        org.autotest.Stack stackAr26 = createStack((int) 'a');
        boolean boolean27 = stackAr26.isFull();
        java.lang.Object obj28 = null;
        boolean boolean29 = stackAr26.equals(obj28);
        boolean boolean30 = stackAr26.isFull();
        boolean boolean31 = stackAr22.equals((java.lang.Object) stackAr26);
        stackAr18.push((java.lang.Object) boolean31);
        org.autotest.Stack stackAr34 = createStack((int) 'a');
        boolean boolean36 = stackAr34.equals((java.lang.Object) 1.0d);
        java.lang.String str37 = stackAr34.toString();
        stackAr34.push((java.lang.Object) 1L);
        int int40 = stackAr34.size();
        boolean boolean41 = stackAr34.isFull();
        stackAr18.push((java.lang.Object) stackAr34);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "[]" + "'", str37, "[]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test616");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        boolean boolean2 = stackAr1.isFull();
        java.lang.Object obj3 = null;
        boolean boolean4 = stackAr1.equals(obj3);
        boolean boolean5 = stackAr1.isFull();
        org.autotest.Stack stackAr7 = createStack((int) (byte) 1);
        int int8 = stackAr7.size();
        int int9 = stackAr7.size();
        boolean boolean10 = stackAr1.equals((java.lang.Object) stackAr7);
        int int11 = stackAr1.size();
        org.autotest.Stack stackAr13 = createStack((int) (byte) 1);
        boolean boolean14 = stackAr13.isFull();
        stackAr13.push((java.lang.Object) (short) -1);
        boolean boolean17 = stackAr13.isEmpty();
        java.lang.Object obj18 = stackAr13.pop();
        boolean boolean19 = stackAr1.equals((java.lang.Object) stackAr13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (short) -1 + "'", obj18, (short) -1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test617");
        org.autotest.Stack stackAr1 = createStack(100);
        boolean boolean2 = stackAr1.isFull();
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
        java.lang.Object obj28 = new java.lang.Object();
        boolean boolean29 = stackAr21.equals(obj28);
        boolean boolean30 = stackAr21.isEmpty();
        int int31 = stackAr21.size();
        org.autotest.Stack stackAr33 = createStack((int) 'a');
        stackAr21.push((java.lang.Object) 'a');
        stackAr1.push((java.lang.Object) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test618");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        boolean boolean2 = stackAr1.isEmpty();
        org.autotest.Stack stackAr4 = createStack((int) (byte) 1);
        boolean boolean5 = stackAr4.isEmpty();
        int int6 = stackAr4.size();
        boolean boolean7 = stackAr4.isFull();
        org.autotest.Stack stackAr9 = createStack((int) 'a');
        int int10 = stackAr9.size();
        org.autotest.Stack stackAr12 = createStack((int) 'a');
        int int13 = stackAr12.size();
        boolean boolean14 = stackAr12.isFull();
        stackAr9.push((java.lang.Object) stackAr12);
        boolean boolean16 = stackAr9.isEmpty();
        boolean boolean17 = stackAr4.equals((java.lang.Object) boolean16);
        boolean boolean18 = stackAr1.equals((java.lang.Object) boolean17);
        java.lang.Object obj19 = null;
        boolean boolean20 = stackAr1.equals(obj19);
        org.autotest.Stack stackAr22 = createStack((int) (byte) 1);
        int int23 = stackAr22.size();
        boolean boolean24 = stackAr22.isEmpty();
        boolean boolean25 = stackAr22.isFull();
        int int26 = stackAr22.size();
        int int27 = stackAr22.size();
        int int28 = stackAr22.size();
        stackAr22.push((java.lang.Object) (short) 1);
        int int31 = stackAr22.size();
        stackAr1.push((java.lang.Object) stackAr22);
        java.lang.String str33 = stackAr1.toString();
        java.lang.Object obj34 = stackAr1.top();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "[[1]]" + "'", str33, "[[1]]");
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertEquals(obj34.toString(), "[1]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj34), "[1]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj34), "[1]");
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test619");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isFull();
        boolean boolean4 = stackAr1.isEmpty();
        int int5 = stackAr1.size();
        boolean boolean6 = stackAr1.isFull();
        org.autotest.Stack stackAr8 = createStack((int) (byte) 1);
        int int9 = stackAr8.size();
        boolean boolean10 = stackAr8.isEmpty();
        boolean boolean11 = stackAr8.isFull();
        int int12 = stackAr8.size();
        boolean boolean13 = stackAr8.isFull();
        org.autotest.Stack stackAr15 = createStack((int) 'a');
        boolean boolean17 = stackAr15.equals((java.lang.Object) 1.0d);
        java.lang.String str18 = stackAr15.toString();
        stackAr8.push((java.lang.Object) stackAr15);
        org.autotest.Stack stackAr21 = createStack((int) (byte) 1);
        boolean boolean22 = stackAr21.isFull();
        boolean boolean23 = stackAr15.equals((java.lang.Object) boolean22);
        boolean boolean24 = stackAr15.isFull();
        boolean boolean25 = stackAr15.isFull();
        stackAr1.push((java.lang.Object) stackAr15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[]" + "'", str18, "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test620");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        boolean boolean3 = stackAr1.equals((java.lang.Object) 1.0d);
        java.lang.String str4 = stackAr1.toString();
        boolean boolean5 = stackAr1.isFull();
        int int6 = stackAr1.size();
        int int7 = stackAr1.size();
        int int8 = stackAr1.size();
        boolean boolean10 = stackAr1.equals((java.lang.Object) "[[]]");
        int int11 = stackAr1.size();
        java.lang.String str12 = stackAr1.toString();
        int int13 = stackAr1.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test621");
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
        int int13 = stackAr1.size();
        boolean boolean14 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test622");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        boolean boolean2 = stackAr1.isEmpty();
        java.lang.String str3 = stackAr1.toString();
        int int4 = stackAr1.size();
        int int5 = stackAr1.size();
        boolean boolean6 = stackAr1.isEmpty();
        java.lang.String str7 = stackAr1.toString();
        boolean boolean8 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test623");
        org.autotest.Stack stackAr1 = createStack((int) ' ');
        java.lang.String str2 = stackAr1.toString();
        boolean boolean3 = stackAr1.isFull();
        java.lang.String str4 = stackAr1.toString();
        org.autotest.Stack stackAr6 = createStack((int) (byte) 1);
        boolean boolean7 = stackAr6.isEmpty();
        int int8 = stackAr6.size();
        boolean boolean9 = stackAr6.isFull();
        java.lang.String str10 = stackAr6.toString();
        int int11 = stackAr6.size();
        stackAr1.push((java.lang.Object) int11);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test624");
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
        java.lang.String str14 = stackAr5.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 1 + "'", obj11, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test625");
        org.autotest.Stack stackAr1 = createStack((int) ' ');
        java.lang.String str2 = stackAr1.toString();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isFull();
        int int5 = stackAr1.size();
        int int6 = stackAr1.size();
        boolean boolean7 = stackAr1.isEmpty();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test626");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        int int2 = stackAr1.size();
        org.autotest.Stack stackAr4 = createStack((int) 'a');
        int int5 = stackAr4.size();
        boolean boolean6 = stackAr4.isFull();
        stackAr1.push((java.lang.Object) stackAr4);
        java.lang.Object obj8 = stackAr1.pop();
        boolean boolean9 = stackAr1.isEmpty();
        org.autotest.Stack stackAr11 = createStack((int) (byte) 1);
        boolean boolean12 = stackAr11.isEmpty();
        java.lang.String str13 = stackAr11.toString();
        int int14 = stackAr11.size();
        java.lang.String str15 = stackAr11.toString();
        boolean boolean16 = stackAr1.equals((java.lang.Object) stackAr11);
        java.lang.Object obj17 = null;
        stackAr1.push(obj17);
        boolean boolean19 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test627");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        boolean boolean2 = stackAr1.isFull();
        java.lang.Object obj3 = null;
        boolean boolean4 = stackAr1.equals(obj3);
        boolean boolean5 = stackAr1.isFull();
        org.autotest.Stack stackAr7 = createStack((int) (byte) 1);
        int int8 = stackAr7.size();
        int int9 = stackAr7.size();
        boolean boolean10 = stackAr1.equals((java.lang.Object) stackAr7);
        java.lang.String str11 = stackAr7.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = stackAr7.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test628");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isFull();
        org.autotest.Stack stackAr6 = createStack((int) 'a');
        int int7 = stackAr6.size();
        org.autotest.Stack stackAr9 = createStack((int) 'a');
        int int10 = stackAr9.size();
        boolean boolean11 = stackAr9.isFull();
        stackAr6.push((java.lang.Object) stackAr9);
        boolean boolean13 = stackAr6.isEmpty();
        boolean boolean14 = stackAr1.equals((java.lang.Object) boolean13);
        int int15 = stackAr1.size();
        int int16 = stackAr1.size();
        org.autotest.Stack stackAr18 = createStack((int) '#');
        int int19 = stackAr18.size();
        int int20 = stackAr18.size();
        java.lang.String str21 = stackAr18.toString();
        boolean boolean22 = stackAr1.equals((java.lang.Object) stackAr18);
        java.lang.String str23 = stackAr18.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[]" + "'", str23, "[]");
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test629");
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
        org.autotest.Stack stackAr23 = createStack((int) 'a');
        int int24 = stackAr23.size();
        boolean boolean25 = stackAr23.isFull();
        boolean boolean26 = stackAr23.isEmpty();
        stackAr18.push((java.lang.Object) stackAr23);
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test630");
        org.autotest.Stack stackAr1 = createStack((int) ' ');
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isFull();
        java.lang.String str4 = stackAr1.toString();
        org.autotest.Stack stackAr6 = createStack((int) (byte) 1);
        boolean boolean7 = stackAr6.isFull();
        stackAr6.push((java.lang.Object) (short) -1);
        boolean boolean10 = stackAr1.equals((java.lang.Object) stackAr6);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test631");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        int int2 = stackAr1.size();
        org.autotest.Stack stackAr4 = createStack((int) 'a');
        int int5 = stackAr4.size();
        boolean boolean6 = stackAr4.isFull();
        stackAr1.push((java.lang.Object) stackAr4);
        boolean boolean8 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test632");
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
        java.lang.Object obj13 = stackAr1.top();
        org.autotest.Stack stackAr15 = createStack((int) 'a');
        boolean boolean17 = stackAr15.equals((java.lang.Object) 1.0d);
        java.lang.String str18 = stackAr15.toString();
        stackAr15.push((java.lang.Object) 1L);
        org.autotest.Stack stackAr22 = createStack((int) (byte) 1);
        boolean boolean23 = stackAr22.isFull();
        java.lang.String str24 = stackAr22.toString();
        org.autotest.Stack stackAr26 = createStack((int) (byte) 10);
        boolean boolean27 = stackAr26.isEmpty();
        org.autotest.Stack stackAr29 = createStack((int) (byte) 1);
        stackAr26.push((java.lang.Object) (byte) 1);
        boolean boolean31 = stackAr22.equals((java.lang.Object) stackAr26);
        org.autotest.Stack stackAr33 = createStack((int) 'a');
        int int34 = stackAr33.size();
        org.autotest.Stack stackAr36 = createStack((int) 'a');
        int int37 = stackAr36.size();
        boolean boolean38 = stackAr36.isFull();
        stackAr33.push((java.lang.Object) stackAr36);
        boolean boolean40 = stackAr26.equals((java.lang.Object) stackAr36);
        stackAr15.push((java.lang.Object) boolean40);
        org.autotest.Stack stackAr43 = createStack((int) (byte) 1);
        int int44 = stackAr43.size();
        java.lang.String str45 = stackAr43.toString();
        java.lang.String str46 = stackAr43.toString();
        stackAr15.push((java.lang.Object) stackAr43);
        java.lang.Object obj48 = null;
        boolean boolean49 = stackAr43.equals(obj48);
        stackAr1.push((java.lang.Object) stackAr43);
        org.autotest.Stack stackAr52 = createStack(10);
        boolean boolean53 = stackAr52.isEmpty();
        java.lang.Object obj54 = null;
        boolean boolean55 = stackAr52.equals(obj54);
        boolean boolean56 = stackAr52.isEmpty();
        boolean boolean57 = stackAr52.isEmpty();
        org.autotest.Stack stackAr59 = createStack((int) (byte) 100);
        org.autotest.Stack stackAr61 = createStack((int) (byte) 1);
        boolean boolean62 = stackAr61.isEmpty();
        int int63 = stackAr61.size();
        boolean boolean64 = stackAr61.isFull();
        java.lang.String str65 = stackAr61.toString();
        int int66 = stackAr61.size();
        boolean boolean67 = stackAr61.isFull();
        stackAr59.push((java.lang.Object) boolean67);
        boolean boolean69 = stackAr59.isEmpty();
        stackAr52.push((java.lang.Object) stackAr59);
        stackAr1.push((java.lang.Object) stackAr59);
        org.autotest.Stack stackAr73 = createStack((int) 'a');
        boolean boolean75 = stackAr73.equals((java.lang.Object) 1.0d);
        java.lang.String str76 = stackAr73.toString();
        stackAr73.push((java.lang.Object) 1L);
        org.autotest.Stack stackAr80 = createStack((int) (byte) 10);
        boolean boolean81 = stackAr80.isEmpty();
        org.autotest.Stack stackAr83 = createStack((int) (byte) 1);
        stackAr80.push((java.lang.Object) (byte) 1);
        stackAr73.push((java.lang.Object) stackAr80);
        java.lang.String str86 = stackAr73.toString();
        java.lang.Object obj87 = stackAr73.top();
        boolean boolean88 = stackAr1.equals((java.lang.Object) stackAr73);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[]" + "'", str18, "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[]" + "'", str24, "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "[]" + "'", str45, "[]");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "[]" + "'", str46, "[]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "[]" + "'", str65, "[]");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "[]" + "'", str76, "[]");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "[1,[1]]" + "'", str86, "[1,[1]]");
        org.junit.Assert.assertNotNull(obj87);
        org.junit.Assert.assertEquals(obj87.toString(), "[1]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj87), "[1]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj87), "[1]");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test633");
        org.autotest.Stack stackAr1 = createStack(3);
        boolean boolean2 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test634");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 10);
        java.lang.String str2 = stackAr1.toString();
        boolean boolean4 = stackAr1.equals((java.lang.Object) 1L);
        boolean boolean5 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.isEmpty();
        boolean boolean7 = stackAr1.isEmpty();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test635");
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
        java.lang.String str12 = stackAr7.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = stackAr7.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test636");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        int int2 = stackAr1.size();
        int int3 = stackAr1.size();
        org.autotest.Stack stackAr5 = createStack((int) 'a');
        boolean boolean7 = stackAr5.equals((java.lang.Object) 1.0d);
        java.lang.String str8 = stackAr5.toString();
        stackAr1.push((java.lang.Object) str8);
        boolean boolean10 = stackAr1.isEmpty();
        org.autotest.Stack stackAr12 = createStack((int) 'a');
        int int13 = stackAr12.size();
        org.autotest.Stack stackAr15 = createStack((int) 'a');
        int int16 = stackAr15.size();
        boolean boolean17 = stackAr15.isFull();
        stackAr12.push((java.lang.Object) stackAr15);
        java.lang.Object obj19 = stackAr12.pop();
        boolean boolean20 = stackAr12.isFull();
        boolean boolean21 = stackAr1.equals((java.lang.Object) stackAr12);
        java.lang.Object obj22 = stackAr1.top();
        java.lang.Object obj23 = stackAr1.pop();
        int int24 = stackAr1.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + "[]" + "'", obj22, "[]");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "[]" + "'", obj23, "[]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test637");
        org.autotest.Stack stackAr1 = createStack((int) (short) 100);
        java.lang.String str2 = stackAr1.toString();
        org.autotest.Stack stackAr4 = createStack((int) (byte) 1);
        boolean boolean5 = stackAr4.isEmpty();
        java.lang.String str6 = stackAr4.toString();
        int int7 = stackAr4.size();
        boolean boolean8 = stackAr4.isEmpty();
        boolean boolean9 = stackAr1.equals((java.lang.Object) stackAr4);
        org.autotest.Stack stackAr11 = createStack((int) (byte) 1);
        boolean boolean12 = stackAr11.isFull();
        java.lang.String str13 = stackAr11.toString();
        stackAr4.push((java.lang.Object) str13);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test638");
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
        java.lang.String str16 = stackAr8.toString();
        boolean boolean17 = stackAr8.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test639");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        boolean boolean3 = stackAr1.equals((java.lang.Object) 1.0d);
        java.lang.String str4 = stackAr1.toString();
        boolean boolean5 = stackAr1.isFull();
        org.autotest.Stack stackAr7 = createStack((int) (byte) 1);
        boolean boolean8 = stackAr7.isFull();
        java.lang.String str9 = stackAr7.toString();
        org.autotest.Stack stackAr11 = createStack((int) (byte) 10);
        boolean boolean12 = stackAr11.isEmpty();
        org.autotest.Stack stackAr14 = createStack((int) (byte) 1);
        stackAr11.push((java.lang.Object) (byte) 1);
        boolean boolean16 = stackAr7.equals((java.lang.Object) stackAr11);
        org.autotest.Stack stackAr18 = createStack((int) 'a');
        int int19 = stackAr18.size();
        org.autotest.Stack stackAr21 = createStack((int) 'a');
        int int22 = stackAr21.size();
        boolean boolean23 = stackAr21.isFull();
        stackAr18.push((java.lang.Object) stackAr21);
        boolean boolean25 = stackAr11.equals((java.lang.Object) stackAr21);
        org.autotest.Stack stackAr27 = createStack((int) 'a');
        boolean boolean28 = stackAr27.isFull();
        org.autotest.Stack stackAr30 = createStack((int) (byte) 1);
        int int31 = stackAr30.size();
        boolean boolean32 = stackAr30.isEmpty();
        boolean boolean33 = stackAr30.isFull();
        boolean boolean34 = stackAr30.isFull();
        int int35 = stackAr30.size();
        stackAr27.push((java.lang.Object) stackAr30);
        boolean boolean37 = stackAr21.equals((java.lang.Object) stackAr27);
        org.autotest.Stack stackAr39 = createStack((int) 'a');
        boolean boolean40 = stackAr39.isFull();
        java.lang.Object obj41 = null;
        boolean boolean42 = stackAr39.equals(obj41);
        boolean boolean43 = stackAr39.isFull();
        org.autotest.Stack stackAr45 = createStack((int) (byte) 1);
        int int46 = stackAr45.size();
        int int47 = stackAr45.size();
        org.autotest.Stack stackAr49 = createStack((int) (byte) 1);
        int int50 = stackAr49.size();
        boolean boolean51 = stackAr49.isEmpty();
        boolean boolean52 = stackAr49.isFull();
        int int53 = stackAr49.size();
        boolean boolean54 = stackAr49.isFull();
        org.autotest.Stack stackAr56 = createStack((int) 'a');
        boolean boolean58 = stackAr56.equals((java.lang.Object) 1.0d);
        java.lang.String str59 = stackAr56.toString();
        stackAr49.push((java.lang.Object) stackAr56);
        stackAr45.push((java.lang.Object) stackAr56);
        boolean boolean62 = stackAr39.equals((java.lang.Object) stackAr56);
        java.lang.Object obj63 = new java.lang.Object();
        boolean boolean64 = stackAr56.equals(obj63);
        org.autotest.Stack stackAr66 = createStack((int) (byte) 1);
        int int67 = stackAr66.size();
        boolean boolean68 = stackAr56.equals((java.lang.Object) stackAr66);
        org.autotest.Stack stackAr70 = createStack((int) 'a');
        boolean boolean71 = stackAr70.isFull();
        org.autotest.Stack stackAr73 = createStack((int) (byte) 1);
        int int74 = stackAr73.size();
        boolean boolean75 = stackAr73.isEmpty();
        boolean boolean76 = stackAr73.isFull();
        boolean boolean77 = stackAr73.isFull();
        int int78 = stackAr73.size();
        stackAr70.push((java.lang.Object) stackAr73);
        stackAr56.push((java.lang.Object) stackAr70);
        stackAr27.push((java.lang.Object) stackAr70);
        boolean boolean82 = stackAr70.isFull();
        boolean boolean83 = stackAr1.equals((java.lang.Object) boolean82);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "[]" + "'", str59, "[]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test640");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        boolean boolean3 = stackAr1.equals((java.lang.Object) 1.0d);
        java.lang.String str4 = stackAr1.toString();
        boolean boolean5 = stackAr1.isFull();
        int int6 = stackAr1.size();
        int int7 = stackAr1.size();
        boolean boolean8 = stackAr1.isEmpty();
        boolean boolean9 = stackAr1.isEmpty();
        boolean boolean10 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test641");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isFull();
        org.autotest.Stack stackAr6 = createStack((int) 'a');
        int int7 = stackAr6.size();
        org.autotest.Stack stackAr9 = createStack((int) 'a');
        int int10 = stackAr9.size();
        boolean boolean11 = stackAr9.isFull();
        stackAr6.push((java.lang.Object) stackAr9);
        boolean boolean13 = stackAr6.isEmpty();
        boolean boolean14 = stackAr1.equals((java.lang.Object) boolean13);
        boolean boolean15 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test642");
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
        int int68 = stackAr18.size();
        boolean boolean69 = stackAr18.isFull();
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
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test643");
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
        org.autotest.Stack stackAr49 = createStack((int) 'a');
        int int50 = stackAr49.size();
        org.autotest.Stack stackAr52 = createStack((int) 'a');
        int int53 = stackAr52.size();
        boolean boolean54 = stackAr52.isFull();
        stackAr49.push((java.lang.Object) stackAr52);
        boolean boolean56 = stackAr52.isFull();
        stackAr31.push((java.lang.Object) stackAr52);
        java.lang.String str58 = stackAr52.toString();
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
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "[]" + "'", str58, "[]");
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test644");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isFull();
        java.lang.String str5 = stackAr1.toString();
        boolean boolean6 = stackAr1.isFull();
        int int7 = stackAr1.size();
        int int8 = stackAr1.size();
        java.lang.String str9 = stackAr1.toString();
        int int10 = stackAr1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test645");
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
        java.lang.Object obj23 = stackAr8.pop();
        org.autotest.Stack stackAr25 = createStack((int) (byte) 1);
        boolean boolean26 = stackAr25.isFull();
        stackAr25.push((java.lang.Object) (short) -1);
        java.lang.Object obj29 = stackAr25.top();
        java.lang.Object obj30 = stackAr25.pop();
        org.autotest.Stack stackAr32 = createStack((int) 'a');
        boolean boolean34 = stackAr32.equals((java.lang.Object) 1.0d);
        java.lang.String str35 = stackAr32.toString();
        boolean boolean36 = stackAr32.isFull();
        int int37 = stackAr32.size();
        int int38 = stackAr32.size();
        boolean boolean39 = stackAr25.equals((java.lang.Object) stackAr32);
        stackAr8.push((java.lang.Object) stackAr25);
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
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (short) -1 + "'", obj29, (short) -1);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (short) -1 + "'", obj30, (short) -1);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "[]" + "'", str35, "[]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test646");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        boolean boolean3 = stackAr1.equals((java.lang.Object) 1.0d);
        java.lang.String str4 = stackAr1.toString();
        boolean boolean5 = stackAr1.isFull();
        int int6 = stackAr1.size();
        int int7 = stackAr1.size();
        boolean boolean8 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test647");
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
        boolean boolean21 = stackAr7.isEmpty();
        boolean boolean22 = stackAr7.isFull();
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test648");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        int int2 = stackAr1.size();
        org.autotest.Stack stackAr4 = createStack((int) 'a');
        int int5 = stackAr4.size();
        boolean boolean6 = stackAr4.isFull();
        stackAr1.push((java.lang.Object) stackAr4);
        boolean boolean8 = stackAr4.isEmpty();
        int int9 = stackAr4.size();
        java.lang.String str10 = stackAr4.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test649");
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
        java.lang.Object obj20 = stackAr5.top();
        java.lang.String str21 = stackAr5.toString();
        java.lang.Object obj22 = stackAr5.pop();
        org.autotest.Stack stackAr24 = createStack((int) 'a');
        boolean boolean25 = stackAr24.isFull();
        java.lang.Object obj26 = null;
        boolean boolean27 = stackAr24.equals(obj26);
        boolean boolean28 = stackAr24.isFull();
        org.autotest.Stack stackAr30 = createStack((int) (byte) 1);
        int int31 = stackAr30.size();
        int int32 = stackAr30.size();
        org.autotest.Stack stackAr34 = createStack((int) (byte) 1);
        int int35 = stackAr34.size();
        boolean boolean36 = stackAr34.isEmpty();
        boolean boolean37 = stackAr34.isFull();
        int int38 = stackAr34.size();
        boolean boolean39 = stackAr34.isFull();
        org.autotest.Stack stackAr41 = createStack((int) 'a');
        boolean boolean43 = stackAr41.equals((java.lang.Object) 1.0d);
        java.lang.String str44 = stackAr41.toString();
        stackAr34.push((java.lang.Object) stackAr41);
        stackAr30.push((java.lang.Object) stackAr41);
        boolean boolean47 = stackAr24.equals((java.lang.Object) stackAr41);
        org.autotest.Stack stackAr49 = createStack((int) (byte) 1);
        boolean boolean50 = stackAr49.isEmpty();
        boolean boolean51 = stackAr49.isFull();
        int int52 = stackAr49.size();
        boolean boolean53 = stackAr49.isFull();
        boolean boolean54 = stackAr24.equals((java.lang.Object) stackAr49);
        int int55 = stackAr24.size();
        boolean boolean56 = stackAr5.equals((java.lang.Object) stackAr24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj57 = stackAr5.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) 1 + "'", obj20, (byte) 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[1]" + "'", str21, "[1]");
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (byte) 1 + "'", obj22, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "[]" + "'", str44, "[]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test650");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        int int2 = stackAr1.size();
        java.lang.String str3 = stackAr1.toString();
        java.lang.String str4 = stackAr1.toString();
        boolean boolean5 = stackAr1.isFull();
        int int6 = stackAr1.size();
        boolean boolean7 = stackAr1.isEmpty();
        boolean boolean8 = stackAr1.isFull();
        boolean boolean9 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }
}

