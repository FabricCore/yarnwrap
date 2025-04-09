package yarnwrap.test;
public class TestFunction { public net.minecraft.test.TestFunction wrapperContained; public TestFunction(net.minecraft.test.TestFunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String batchId() { return wrapperContained.batchId; }
// public java.lang.String templatePath() { return wrapperContained.templatePath; }
// public java.lang.String templateName() { return wrapperContained.templateName; }
// public int tickLimit() { return wrapperContained.tickLimit; }
// public java.util.function.Consumer starter() { return wrapperContained.starter; }
// public java.lang.String batchId() { return wrapperContained.batchId(); }
// public java.lang.String templatePath() { return wrapperContained.templatePath(); }
// public java.lang.String templateName() { return wrapperContained.templateName(); }
// public int tickLimit() { return wrapperContained.tickLimit(); }
// public java.util.function.Consumer starter() { return wrapperContained.starter(); }
public void start(yarnwrap.test.TestContext context) { wrapperContained.start(context.wrapperContained); }
public boolean isFlaky() { return wrapperContained.isFlaky(); }

}