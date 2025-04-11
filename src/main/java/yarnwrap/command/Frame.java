package yarnwrap.command;
public class Frame { public net.minecraft.command.Frame wrapperContained; public Frame(net.minecraft.command.Frame wrapperContained) { this.wrapperContained = wrapperContained; }

public void fail() { wrapperContained.fail(); }
public void succeed(int returnValue) { wrapperContained.succeed(returnValue); }
public void doReturn() { wrapperContained.doReturn(); }

}