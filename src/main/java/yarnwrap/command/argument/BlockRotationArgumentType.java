package yarnwrap.command.argument;
public class BlockRotationArgumentType { public net.minecraft.command.argument.BlockRotationArgumentType wrapperContained; public BlockRotationArgumentType(net.minecraft.command.argument.BlockRotationArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.command.argument.BlockRotationArgumentType blockRotation() { return new yarnwrap.command.argument.BlockRotationArgumentType(wrapperContained.blockRotation()); }
public static yarnwrap.command.argument.BlockRotationArgumentType blockRotation() { return new yarnwrap.command.argument.BlockRotationArgumentType(net.minecraft.command.argument.BlockRotationArgumentType.blockRotation()); }
// public yarnwrap.util.BlockRotation getBlockRotation(com.mojang.brigadier.context.CommandContext context,java.lang.String id) { return new yarnwrap.util.BlockRotation(wrapperContained.getBlockRotation(context,id)); }
// public static yarnwrap.util.BlockRotation getBlockRotation(com.mojang.brigadier.context.CommandContext context,java.lang.String id, ) { return new yarnwrap.util.BlockRotation(net.minecraft.command.argument.BlockRotationArgumentType.getBlockRotation(context,id)); }

}