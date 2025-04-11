package yarnwrap.test;
public class TickLimitExceededException { public net.minecraft.test.TickLimitExceededException wrapperContained; public TickLimitExceededException(net.minecraft.test.TickLimitExceededException wrapperContained) { this.wrapperContained = wrapperContained; }

public TickLimitExceededException(java.lang.String message) { this.wrapperContained = new net.minecraft.test.TickLimitExceededException(message); }

}