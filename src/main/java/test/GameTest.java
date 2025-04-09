package yarnwrap.test;
public class GameTest { public net.minecraft.test.GameTest wrapperContained; public GameTest(net.minecraft.test.GameTest wrapperContained) { this.wrapperContained = wrapperContained; }

public int tickLimit() { return wrapperContained.tickLimit(); }
public java.lang.String batchId() { return wrapperContained.batchId(); }
public int rotation() { return wrapperContained.rotation(); }
public boolean required() { return wrapperContained.required(); }
public java.lang.String templateName() { return wrapperContained.templateName(); }
public long duration() { return wrapperContained.duration(); }
public int maxAttempts() { return wrapperContained.maxAttempts(); }
public int requiredSuccesses() { return wrapperContained.requiredSuccesses(); }
public boolean skyAccess() { return wrapperContained.skyAccess(); }
public boolean manualOnly() { return wrapperContained.manualOnly(); }

}