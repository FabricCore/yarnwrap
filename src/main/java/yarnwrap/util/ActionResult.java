package yarnwrap.util;
public class ActionResult { public net.minecraft.util.ActionResult wrapperContained; public ActionResult(net.minecraft.util.ActionResult wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object PASS() { return wrapperContained.PASS; }
// // public void PASS(Object value) { wrapperContained.PASS = value; }
// public static Object PASS() { return net.minecraft.util.ActionResult.PASS; }
// // public static void PASS(Object value, ) { net.minecraft.util.ActionResult.PASS = value; }

// public Object SUCCESS() { return wrapperContained.SUCCESS; }
// // public void SUCCESS(Object value) { wrapperContained.SUCCESS = value; }
// public static Object SUCCESS() { return net.minecraft.util.ActionResult.SUCCESS; }
// // public static void SUCCESS(Object value, ) { net.minecraft.util.ActionResult.SUCCESS = value; }

// public Object FAIL() { return wrapperContained.FAIL; }
// // public void FAIL(Object value) { wrapperContained.FAIL = value; }
// public static Object FAIL() { return net.minecraft.util.ActionResult.FAIL; }
// // public static void FAIL(Object value, ) { net.minecraft.util.ActionResult.FAIL = value; }

// public Object CONSUME() { return wrapperContained.CONSUME; }
// // public void CONSUME(Object value) { wrapperContained.CONSUME = value; }
// public static Object CONSUME() { return net.minecraft.util.ActionResult.CONSUME; }
// // public static void CONSUME(Object value, ) { net.minecraft.util.ActionResult.CONSUME = value; }

// public Object SUCCESS_SERVER() { return wrapperContained.SUCCESS_SERVER; }
// // public void SUCCESS_SERVER(Object value) { wrapperContained.SUCCESS_SERVER = value; }
// public static Object SUCCESS_SERVER() { return net.minecraft.util.ActionResult.SUCCESS_SERVER; }
// // public static void SUCCESS_SERVER(Object value, ) { net.minecraft.util.ActionResult.SUCCESS_SERVER = value; }

// public Object PASS_TO_DEFAULT_BLOCK_ACTION() { return wrapperContained.PASS_TO_DEFAULT_BLOCK_ACTION; }
// // public void PASS_TO_DEFAULT_BLOCK_ACTION(Object value) { wrapperContained.PASS_TO_DEFAULT_BLOCK_ACTION = value; }
// public static Object PASS_TO_DEFAULT_BLOCK_ACTION() { return net.minecraft.util.ActionResult.PASS_TO_DEFAULT_BLOCK_ACTION; }
// // public static void PASS_TO_DEFAULT_BLOCK_ACTION(Object value, ) { net.minecraft.util.ActionResult.PASS_TO_DEFAULT_BLOCK_ACTION = value; }

public boolean isAccepted() { return wrapperContained.isAccepted(); }
// public static boolean isAccepted() { return net.minecraft.util.ActionResult.isAccepted(); }

}