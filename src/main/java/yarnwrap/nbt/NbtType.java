package yarnwrap.nbt;
public class NbtType { public net.minecraft.nbt.NbtType wrapperContained; public NbtType(net.minecraft.nbt.NbtType wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String getCrashReportName() { return wrapperContained.getCrashReportName(); }
// public static java.lang.String getCrashReportName() { return net.minecraft.nbt.NbtType.getCrashReportName(); }
// public yarnwrap.nbt.NbtType createInvalid(int type) { return new yarnwrap.nbt.NbtType(wrapperContained.createInvalid(type)); }
// public static yarnwrap.nbt.NbtType createInvalid(int type, ) { return new yarnwrap.nbt.NbtType(net.minecraft.nbt.NbtType.createInvalid(type)); }
public java.lang.String getCommandFeedbackName() { return wrapperContained.getCommandFeedbackName(); }
// public static java.lang.String getCommandFeedbackName() { return net.minecraft.nbt.NbtType.getCommandFeedbackName(); }
// public yarnwrap.nbt.NbtElement read(java.io.DataInput input,yarnwrap.nbt.NbtSizeTracker tracker) { return new yarnwrap.nbt.NbtElement(wrapperContained.read(input,tracker.wrapperContained)); }
// public static yarnwrap.nbt.NbtElement read(java.io.DataInput input,yarnwrap.nbt.NbtSizeTracker tracker, ) { return new yarnwrap.nbt.NbtElement(net.minecraft.nbt.NbtType.read(input,tracker.wrapperContained)); }
// public void skip(java.io.DataInput input,yarnwrap.nbt.NbtSizeTracker tracker) { wrapperContained.skip(input,tracker.wrapperContained); }
// public static void skip(java.io.DataInput input,yarnwrap.nbt.NbtSizeTracker tracker, ) { net.minecraft.nbt.NbtType.skip(input,tracker.wrapperContained); }
// public Object doAccept(java.io.DataInput input,yarnwrap.nbt.scanner.NbtScanner visitor,yarnwrap.nbt.NbtSizeTracker tracker) { return wrapperContained.doAccept(input,visitor.wrapperContained,tracker.wrapperContained); }
// public static Object doAccept(java.io.DataInput input,yarnwrap.nbt.scanner.NbtScanner visitor,yarnwrap.nbt.NbtSizeTracker tracker, ) { return net.minecraft.nbt.NbtType.doAccept(input,visitor.wrapperContained,tracker.wrapperContained); }
// public void skip(java.io.DataInput input,int count,yarnwrap.nbt.NbtSizeTracker tracker) { wrapperContained.skip(input,count,tracker.wrapperContained); }
// public static void skip(java.io.DataInput input,int count,yarnwrap.nbt.NbtSizeTracker tracker, ) { net.minecraft.nbt.NbtType.skip(input,count,tracker.wrapperContained); }
// public void accept(java.io.DataInput input,yarnwrap.nbt.scanner.NbtScanner visitor,yarnwrap.nbt.NbtSizeTracker tracker) { wrapperContained.accept(input,visitor.wrapperContained,tracker.wrapperContained); }
// public static void accept(java.io.DataInput input,yarnwrap.nbt.scanner.NbtScanner visitor,yarnwrap.nbt.NbtSizeTracker tracker, ) { net.minecraft.nbt.NbtType.accept(input,visitor.wrapperContained,tracker.wrapperContained); }

}