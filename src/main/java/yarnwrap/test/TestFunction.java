package yarnwrap.test;
public class TestFunction { public net.minecraft.test.TestFunction wrapperContained; public TestFunction(net.minecraft.test.TestFunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String batchId() { return wrapperContained.batchId; }
// public void batchId(java.lang.String value) { wrapperContained.batchId = value; }
// public static java.lang.String batchId() { return net.minecraft.test.TestFunction.batchId; }
// public static void batchId(java.lang.String value, ) { net.minecraft.test.TestFunction.batchId = value; }

// public java.lang.String templatePath() { return wrapperContained.templatePath; }
// public void templatePath(java.lang.String value) { wrapperContained.templatePath = value; }
// public static java.lang.String templatePath() { return net.minecraft.test.TestFunction.templatePath; }
// public static void templatePath(java.lang.String value, ) { net.minecraft.test.TestFunction.templatePath = value; }

// public java.lang.String templateName() { return wrapperContained.templateName; }
// public void templateName(java.lang.String value) { wrapperContained.templateName = value; }
// public static java.lang.String templateName() { return net.minecraft.test.TestFunction.templateName; }
// public static void templateName(java.lang.String value, ) { net.minecraft.test.TestFunction.templateName = value; }

// public int tickLimit() { return wrapperContained.tickLimit; }
// public void tickLimit(int value) { wrapperContained.tickLimit = value; }
// public static int tickLimit() { return net.minecraft.test.TestFunction.tickLimit; }
// public static void tickLimit(int value, ) { net.minecraft.test.TestFunction.tickLimit = value; }

// public java.util.function.Consumer starter() { return wrapperContained.starter; }
// public void starter(java.util.function.Consumer value) { wrapperContained.starter = value; }
// public static java.util.function.Consumer starter() { return net.minecraft.test.TestFunction.starter; }
// public static void starter(java.util.function.Consumer value, ) { net.minecraft.test.TestFunction.starter = value; }

public TestFunction(java.lang.String batchId,java.lang.String templatePath,java.lang.String templateName,int tickLimit,long duration,boolean required,java.util.function.Consumer starter) { this.wrapperContained = new net.minecraft.test.TestFunction(batchId,templatePath,templateName,tickLimit,duration,required,starter); }
public TestFunction(java.lang.String batchId,java.lang.String templatePath,java.lang.String templateName,yarnwrap.util.BlockRotation rotation,int tickLimit,long setupTicks,boolean required,java.util.function.Consumer starter) { this.wrapperContained = new net.minecraft.test.TestFunction(batchId,templatePath,templateName,rotation.wrapperContained,tickLimit,setupTicks,required,starter); }
// public TestFunction(java.lang.String batchId,java.lang.String templatePath,java.lang.String templateName,yarnwrap.util.BlockRotation rotation,int tickLimit,long duration,boolean required) { this.wrapperContained = new net.minecraft.test.TestFunction(batchId,templatePath,templateName,rotation.wrapperContained,tickLimit,duration,required); }
// public java.lang.String batchId() { return wrapperContained.batchId(); }
// // public static java.lang.String batchId() { return net.minecraft.test.TestFunction.batchId(); }
// public java.lang.String templatePath() { return wrapperContained.templatePath(); }
// // public static java.lang.String templatePath() { return net.minecraft.test.TestFunction.templatePath(); }
// public java.lang.String templateName() { return wrapperContained.templateName(); }
// // public static java.lang.String templateName() { return net.minecraft.test.TestFunction.templateName(); }
// public int tickLimit() { return wrapperContained.tickLimit(); }
// // public static int tickLimit() { return net.minecraft.test.TestFunction.tickLimit(); }
// public java.util.function.Consumer starter() { return wrapperContained.starter(); }
// // public static java.util.function.Consumer starter() { return net.minecraft.test.TestFunction.starter(); }
public void start(yarnwrap.test.TestContext context) { wrapperContained.start(context.wrapperContained); }
// public static void start(yarnwrap.test.TestContext context, ) { net.minecraft.test.TestFunction.start(context.wrapperContained); }
public boolean isFlaky() { return wrapperContained.isFlaky(); }
// public static boolean isFlaky() { return net.minecraft.test.TestFunction.isFlaky(); }

}