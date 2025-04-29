package yarnwrap.command;
public class ExecutionFlags { public net.minecraft.command.ExecutionFlags wrapperContained; public ExecutionFlags(net.minecraft.command.ExecutionFlags wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.command.ExecutionFlags NONE() { return new yarnwrap.command.ExecutionFlags(wrapperContained.NONE); }
// public void NONE(yarnwrap.command.ExecutionFlags value) { wrapperContained.NONE = value.wrapperContained; }
public static yarnwrap.command.ExecutionFlags NONE() { return new yarnwrap.command.ExecutionFlags(net.minecraft.command.ExecutionFlags.NONE); }
// public static void NONE(yarnwrap.command.ExecutionFlags value, ) { net.minecraft.command.ExecutionFlags.NONE = value.wrapperContained; }

// public byte SILENT() { return wrapperContained.SILENT; }
// public void SILENT(byte value) { wrapperContained.SILENT = value; }
// public static byte SILENT() { return net.minecraft.command.ExecutionFlags.SILENT; }
// public static void SILENT(byte value, ) { net.minecraft.command.ExecutionFlags.SILENT = value; }

// public byte INSIDE_RETURN_RUN() { return wrapperContained.INSIDE_RETURN_RUN; }
// public void INSIDE_RETURN_RUN(byte value) { wrapperContained.INSIDE_RETURN_RUN = value; }
// public static byte INSIDE_RETURN_RUN() { return net.minecraft.command.ExecutionFlags.INSIDE_RETURN_RUN; }
// public static void INSIDE_RETURN_RUN(byte value, ) { net.minecraft.command.ExecutionFlags.INSIDE_RETURN_RUN = value; }

public boolean isSilent() { return wrapperContained.isSilent(); }
// public static boolean isSilent() { return net.minecraft.command.ExecutionFlags.isSilent(); }
// public yarnwrap.command.ExecutionFlags set(byte flag) { return new yarnwrap.command.ExecutionFlags(wrapperContained.set(flag)); }
// public static yarnwrap.command.ExecutionFlags set(byte flag, ) { return new yarnwrap.command.ExecutionFlags(net.minecraft.command.ExecutionFlags.set(flag)); }
public yarnwrap.command.ExecutionFlags setSilent() { return new yarnwrap.command.ExecutionFlags(wrapperContained.setSilent()); }
// public static yarnwrap.command.ExecutionFlags setSilent() { return new yarnwrap.command.ExecutionFlags(net.minecraft.command.ExecutionFlags.setSilent()); }
public boolean isInsideReturnRun() { return wrapperContained.isInsideReturnRun(); }
// public static boolean isInsideReturnRun() { return net.minecraft.command.ExecutionFlags.isInsideReturnRun(); }
public yarnwrap.command.ExecutionFlags setInsideReturnRun() { return new yarnwrap.command.ExecutionFlags(wrapperContained.setInsideReturnRun()); }
// public static yarnwrap.command.ExecutionFlags setInsideReturnRun() { return new yarnwrap.command.ExecutionFlags(net.minecraft.command.ExecutionFlags.setInsideReturnRun()); }

}