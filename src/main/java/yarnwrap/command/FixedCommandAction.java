package yarnwrap.command;
public class FixedCommandAction { public net.minecraft.command.FixedCommandAction wrapperContained; public FixedCommandAction(net.minecraft.command.FixedCommandAction wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String command() { return wrapperContained.command; }
// public void command(java.lang.String value) { wrapperContained.command = value; }
// public static java.lang.String command() { return net.minecraft.command.FixedCommandAction.command; }
// public static void command(java.lang.String value, ) { net.minecraft.command.FixedCommandAction.command = value; }

// public com.mojang.brigadier.context.CommandContext context() { return wrapperContained.context; }
// public void context(com.mojang.brigadier.context.CommandContext value) { wrapperContained.context = value; }
// public static com.mojang.brigadier.context.CommandContext context() { return net.minecraft.command.FixedCommandAction.context; }
// public static void context(com.mojang.brigadier.context.CommandContext value, ) { net.minecraft.command.FixedCommandAction.context = value; }

// public yarnwrap.command.ExecutionFlags flags() { return new yarnwrap.command.ExecutionFlags(wrapperContained.flags); }
// public void flags(yarnwrap.command.ExecutionFlags value) { wrapperContained.flags = value.wrapperContained; }
// public static yarnwrap.command.ExecutionFlags flags() { return new yarnwrap.command.ExecutionFlags(net.minecraft.command.FixedCommandAction.flags); }
// public static void flags(yarnwrap.command.ExecutionFlags value, ) { net.minecraft.command.FixedCommandAction.flags = value.wrapperContained; }

public FixedCommandAction(java.lang.String command,yarnwrap.command.ExecutionFlags flags,com.mojang.brigadier.context.CommandContext context) { this.wrapperContained = new net.minecraft.command.FixedCommandAction(command,flags.wrapperContained,context); }

}