package yarnwrap.command;
public class FixedCommandAction { public net.minecraft.command.FixedCommandAction wrapperContained; public FixedCommandAction(net.minecraft.command.FixedCommandAction wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String command() { return wrapperContained.command; }
// public com.mojang.brigadier.context.CommandContext context() { return wrapperContained.context; }
// public yarnwrap.command.ExecutionFlags flags() { return new yarnwrap.command.ExecutionFlags(wrapperContained.flags); }

}