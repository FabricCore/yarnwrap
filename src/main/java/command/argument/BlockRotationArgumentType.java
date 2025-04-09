package yarnwrap.command.argument;
public class BlockRotationArgumentType { public net.minecraft.command.argument.BlockRotationArgumentType wrapperContained; public BlockRotationArgumentType(net.minecraft.command.argument.BlockRotationArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.command.argument.BlockRotationArgumentType blockRotation() { return new yarnwrap.command.argument.BlockRotationArgumentType(wrapperContained.blockRotation()); }
public yarnwrap.util.BlockRotation getBlockRotation(com.mojang.brigadier.context.CommandContext context,java.lang.String id) { return new yarnwrap.util.BlockRotation(wrapperContained.getBlockRotation(context,id)); }

}