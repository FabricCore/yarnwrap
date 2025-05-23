package yarnwrap.test;
public class TestEntry { public net.minecraft.test.TestEntry wrapperContained; public TestEntry(net.minecraft.test.TestEntry wrapperContained) { this.wrapperContained = wrapperContained; }

public TestEntry(java.util.Map tests,yarnwrap.util.Identifier functionId,java.util.function.Consumer function) { this.wrapperContained = new net.minecraft.test.TestEntry(tests,functionId.wrapperContained,function); }
// public TestEntry(java.util.Map function) { this.wrapperContained = new net.minecraft.test.TestEntry(function); }
public TestEntry(yarnwrap.util.Identifier id,yarnwrap.test.TestData data,java.util.function.Consumer function) { this.wrapperContained = new net.minecraft.test.TestEntry(id.wrapperContained,data.wrapperContained,function); }

}