package yarnwrap.test;
public class TestManager { public net.minecraft.test.TestManager wrapperContained; public TestManager(net.minecraft.test.TestManager wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.test.TestManager INSTANCE() { return new yarnwrap.test.TestManager(wrapperContained.INSTANCE); }
// public java.util.Collection tests() { return wrapperContained.tests; }
// public yarnwrap.test.TestRunContext runContext() { return new yarnwrap.test.TestRunContext(wrapperContained.runContext); }
public void clear() { wrapperContained.clear(); }
public void start(yarnwrap.test.GameTestState test) { wrapperContained.start(test.wrapperContained); }
public void tick() { wrapperContained.tick(); }
public void setRunContext(yarnwrap.test.TestRunContext runContext) { wrapperContained.setRunContext(runContext.wrapperContained); }

}