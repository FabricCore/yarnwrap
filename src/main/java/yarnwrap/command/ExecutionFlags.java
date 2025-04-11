package yarnwrap.command;
public class ExecutionFlags { public net.minecraft.command.ExecutionFlags wrapperContained; public ExecutionFlags(net.minecraft.command.ExecutionFlags wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.command.ExecutionFlags NONE() { return new yarnwrap.command.ExecutionFlags(wrapperContained.NONE); }
// public void NONE(yarnwrap.command.ExecutionFlags value) { wrapperContained.NONE = value.wrapperContained; }
// public byte SILENT() { return wrapperContained.SILENT; }
// public void SILENT(byte value) { wrapperContained.SILENT = value; }
// public byte INSIDE_RETURN_RUN() { return wrapperContained.INSIDE_RETURN_RUN; }
// public void INSIDE_RETURN_RUN(byte value) { wrapperContained.INSIDE_RETURN_RUN = value; }
public boolean isSilent() { return wrapperContained.isSilent(); }
// public yarnwrap.command.ExecutionFlags set(byte flag) { return new yarnwrap.command.ExecutionFlags(wrapperContained.set(flag)); }
public yarnwrap.command.ExecutionFlags setSilent() { return new yarnwrap.command.ExecutionFlags(wrapperContained.setSilent()); }
public boolean isInsideReturnRun() { return wrapperContained.isInsideReturnRun(); }
public yarnwrap.command.ExecutionFlags setInsideReturnRun() { return new yarnwrap.command.ExecutionFlags(wrapperContained.setInsideReturnRun()); }

}