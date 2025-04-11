package yarnwrap.nbt;
public class NbtType { public net.minecraft.nbt.NbtType wrapperContained; public NbtType(net.minecraft.nbt.NbtType wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String getCrashReportName() { return wrapperContained.getCrashReportName(); }
// public yarnwrap.nbt.NbtType createInvalid(int type) { return new yarnwrap.nbt.NbtType(wrapperContained.createInvalid(type)); }
public java.lang.String getCommandFeedbackName() { return wrapperContained.getCommandFeedbackName(); }
// public yarnwrap.nbt.NbtElement read(java.io.DataInput input,yarnwrap.nbt.NbtSizeTracker tracker) { return new yarnwrap.nbt.NbtElement(wrapperContained.read(input,tracker.wrapperContained)); }
public boolean isImmutable() { return wrapperContained.isImmutable(); }
// public void skip(java.io.DataInput input,yarnwrap.nbt.NbtSizeTracker tracker) { wrapperContained.skip(input,tracker.wrapperContained); }
// public Object doAccept(java.io.DataInput input,yarnwrap.nbt.scanner.NbtScanner visitor,yarnwrap.nbt.NbtSizeTracker tracker) { return wrapperContained.doAccept(input,visitor.wrapperContained,tracker.wrapperContained); }
// public void skip(java.io.DataInput input,int count,yarnwrap.nbt.NbtSizeTracker tracker) { wrapperContained.skip(input,count,tracker.wrapperContained); }
// public void accept(java.io.DataInput input,yarnwrap.nbt.scanner.NbtScanner visitor,yarnwrap.nbt.NbtSizeTracker tracker) { wrapperContained.accept(input,visitor.wrapperContained,tracker.wrapperContained); }

}