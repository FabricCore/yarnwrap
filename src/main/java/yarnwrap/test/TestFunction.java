package yarnwrap.test;
public class TestFunction { public net.minecraft.test.TestFunction wrapperContained; public TestFunction(net.minecraft.test.TestFunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String batchId() { return wrapperContained.batchId; }
// public void batchId(java.lang.String value) { wrapperContained.batchId = value; }
// public java.lang.String templatePath() { return wrapperContained.templatePath; }
// public void templatePath(java.lang.String value) { wrapperContained.templatePath = value; }
// public java.lang.String templateName() { return wrapperContained.templateName; }
// public void templateName(java.lang.String value) { wrapperContained.templateName = value; }
// public int tickLimit() { return wrapperContained.tickLimit; }
// public void tickLimit(int value) { wrapperContained.tickLimit = value; }
// public java.util.function.Consumer starter() { return wrapperContained.starter; }
// public void starter(java.util.function.Consumer value) { wrapperContained.starter = value; }
// public java.lang.String batchId() { return wrapperContained.batchId(); }
// public java.lang.String templatePath() { return wrapperContained.templatePath(); }
// public java.lang.String templateName() { return wrapperContained.templateName(); }
// public int tickLimit() { return wrapperContained.tickLimit(); }
// public java.util.function.Consumer starter() { return wrapperContained.starter(); }
public void start(yarnwrap.test.TestContext context) { wrapperContained.start(context.wrapperContained); }
public boolean isFlaky() { return wrapperContained.isFlaky(); }

}