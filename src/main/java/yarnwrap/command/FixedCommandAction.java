package yarnwrap.command;
public class FixedCommandAction { public net.minecraft.command.FixedCommandAction wrapperContained; public FixedCommandAction(net.minecraft.command.FixedCommandAction wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String command() { return wrapperContained.command; }
// public void command(java.lang.String value) { wrapperContained.command = value; }
// public com.mojang.brigadier.context.CommandContext context() { return wrapperContained.context; }
// public void context(com.mojang.brigadier.context.CommandContext value) { wrapperContained.context = value; }
// public yarnwrap.command.ExecutionFlags flags() { return new yarnwrap.command.ExecutionFlags(wrapperContained.flags); }
// public void flags(yarnwrap.command.ExecutionFlags value) { wrapperContained.flags = value.wrapperContained; }

}