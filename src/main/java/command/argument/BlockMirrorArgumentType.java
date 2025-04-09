package yarnwrap.command.argument;
public class BlockMirrorArgumentType { public net.minecraft.command.argument.BlockMirrorArgumentType wrapperContained; public BlockMirrorArgumentType(net.minecraft.command.argument.BlockMirrorArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.command.argument.EnumArgumentType blockMirror() { return new yarnwrap.command.argument.EnumArgumentType(wrapperContained.blockMirror()); }
public yarnwrap.util.BlockMirror getBlockMirror(com.mojang.brigadier.context.CommandContext context,java.lang.String id) { return new yarnwrap.util.BlockMirror(wrapperContained.getBlockMirror(context,id)); }

}