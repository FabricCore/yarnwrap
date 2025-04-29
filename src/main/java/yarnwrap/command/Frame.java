package yarnwrap.command;
public class Frame { public net.minecraft.command.Frame wrapperContained; public Frame(net.minecraft.command.Frame wrapperContained) { this.wrapperContained = wrapperContained; }

public void fail() { wrapperContained.fail(); }
// public static void fail() { net.minecraft.command.Frame.fail(); }
public void succeed(int returnValue) { wrapperContained.succeed(returnValue); }
// public static void succeed(int returnValue, ) { net.minecraft.command.Frame.succeed(returnValue); }
public void doReturn() { wrapperContained.doReturn(); }
// public static void doReturn() { net.minecraft.command.Frame.doReturn(); }

}