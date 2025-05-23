package yarnwrap.test;
public class TestException { public net.minecraft.test.TestException wrapperContained; public TestException(net.minecraft.test.TestException wrapperContained) { this.wrapperContained = wrapperContained; }

// public TestException(java.lang.String message) { this.wrapperContained = new net.minecraft.test.TestException(message); }
public yarnwrap.text.Text getText() { return new yarnwrap.text.Text(wrapperContained.getText()); }
// public static yarnwrap.text.Text getText() { return new yarnwrap.text.Text(net.minecraft.test.TestException.getText()); }

}