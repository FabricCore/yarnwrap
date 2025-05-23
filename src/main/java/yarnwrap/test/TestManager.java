package yarnwrap.test;
public class TestManager { public net.minecraft.test.TestManager wrapperContained; public TestManager(net.minecraft.test.TestManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.test.TestManager INSTANCE() { return new yarnwrap.test.TestManager(wrapperContained.INSTANCE); }
// public void INSTANCE(yarnwrap.test.TestManager value) { wrapperContained.INSTANCE = value.wrapperContained; }
public static yarnwrap.test.TestManager INSTANCE() { return new yarnwrap.test.TestManager(net.minecraft.test.TestManager.INSTANCE); }
// public static void INSTANCE(yarnwrap.test.TestManager value, ) { net.minecraft.test.TestManager.INSTANCE = value.wrapperContained; }

// public java.util.Collection tests() { return wrapperContained.tests; }
// public void tests(java.util.Collection value) { wrapperContained.tests = value; }
// public static java.util.Collection tests() { return net.minecraft.test.TestManager.tests; }
// public static void tests(java.util.Collection value, ) { net.minecraft.test.TestManager.tests = value; }

// public yarnwrap.test.TestRunContext runContext() { return new yarnwrap.test.TestRunContext(wrapperContained.runContext); }
// public void runContext(yarnwrap.test.TestRunContext value) { wrapperContained.runContext = value.wrapperContained; }
// public static yarnwrap.test.TestRunContext runContext() { return new yarnwrap.test.TestRunContext(net.minecraft.test.TestManager.runContext); }
// public static void runContext(yarnwrap.test.TestRunContext value, ) { net.minecraft.test.TestManager.runContext = value.wrapperContained; }

// public Object state() { return wrapperContained.state; }
// // public void state(Object value) { wrapperContained.state = value; }
// // public static Object state() { return net.minecraft.test.TestManager.state; }
// // public static void state(Object value, ) { net.minecraft.test.TestManager.state = value; }

// public boolean shouldTick() { return wrapperContained.shouldTick; }
// public void shouldTick(boolean value) { wrapperContained.shouldTick = value; }
// public static boolean shouldTick() { return net.minecraft.test.TestManager.shouldTick; }
// public static void shouldTick(boolean value, ) { net.minecraft.test.TestManager.shouldTick = value; }

public void clear() { wrapperContained.clear(); }
// public static void clear() { net.minecraft.test.TestManager.clear(); }
public void start(yarnwrap.test.GameTestState test) { wrapperContained.start(test.wrapperContained); }
// public static void start(yarnwrap.test.GameTestState test, ) { net.minecraft.test.TestManager.start(test.wrapperContained); }
public void tick() { wrapperContained.tick(); }
// public static void tick() { net.minecraft.test.TestManager.tick(); }
public void setRunContext(yarnwrap.test.TestRunContext runContext) { wrapperContained.setRunContext(runContext.wrapperContained); }
// public static void setRunContext(yarnwrap.test.TestRunContext runContext, ) { net.minecraft.test.TestManager.setRunContext(runContext.wrapperContained); }
// public void method_56242(yarnwrap.test.GameTestState test) { wrapperContained.method_56242(test.wrapperContained); }
// public static void method_56242(yarnwrap.test.GameTestState test, ) { net.minecraft.test.TestManager.method_56242(test.wrapperContained); }
// public void startTicking() { wrapperContained.startTicking(); }
// public static void startTicking() { net.minecraft.test.TestManager.startTicking(); }

}