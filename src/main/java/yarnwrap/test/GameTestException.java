package yarnwrap.test;
public class GameTestException { public net.minecraft.test.GameTestException wrapperContained; public GameTestException(net.minecraft.test.GameTestException wrapperContained) { this.wrapperContained = wrapperContained; }

public GameTestException(java.lang.String message) { this.wrapperContained = new net.minecraft.test.GameTestException(message); }

}