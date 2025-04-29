package yarnwrap.test;
public class GameTest { public net.minecraft.test.GameTest wrapperContained; public GameTest(net.minecraft.test.GameTest wrapperContained) { this.wrapperContained = wrapperContained; }

public int tickLimit() { return wrapperContained.tickLimit(); }
// public static int tickLimit() { return net.minecraft.test.GameTest.tickLimit(); }
public java.lang.String batchId() { return wrapperContained.batchId(); }
// public static java.lang.String batchId() { return net.minecraft.test.GameTest.batchId(); }
public int rotation() { return wrapperContained.rotation(); }
// public static int rotation() { return net.minecraft.test.GameTest.rotation(); }
public boolean required() { return wrapperContained.required(); }
// public static boolean required() { return net.minecraft.test.GameTest.required(); }
public java.lang.String templateName() { return wrapperContained.templateName(); }
// public static java.lang.String templateName() { return net.minecraft.test.GameTest.templateName(); }
public long duration() { return wrapperContained.duration(); }
// public static long duration() { return net.minecraft.test.GameTest.duration(); }
public int maxAttempts() { return wrapperContained.maxAttempts(); }
// public static int maxAttempts() { return net.minecraft.test.GameTest.maxAttempts(); }
public int requiredSuccesses() { return wrapperContained.requiredSuccesses(); }
// public static int requiredSuccesses() { return net.minecraft.test.GameTest.requiredSuccesses(); }
public boolean skyAccess() { return wrapperContained.skyAccess(); }
// public static boolean skyAccess() { return net.minecraft.test.GameTest.skyAccess(); }
public boolean manualOnly() { return wrapperContained.manualOnly(); }
// public static boolean manualOnly() { return net.minecraft.test.GameTest.manualOnly(); }

}