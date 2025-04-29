package yarnwrap.command.argument;
public class PosArgument { public net.minecraft.command.argument.PosArgument wrapperContained; public PosArgument(net.minecraft.command.argument.PosArgument wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.math.BlockPos toAbsoluteBlockPos(yarnwrap.server.command.ServerCommandSource source) { return new yarnwrap.util.math.BlockPos(wrapperContained.toAbsoluteBlockPos(source.wrapperContained)); }
// public static yarnwrap.util.math.BlockPos toAbsoluteBlockPos(yarnwrap.server.command.ServerCommandSource source, ) { return new yarnwrap.util.math.BlockPos(net.minecraft.command.argument.PosArgument.toAbsoluteBlockPos(source.wrapperContained)); }
public boolean isXRelative() { return wrapperContained.isXRelative(); }
// public static boolean isXRelative() { return net.minecraft.command.argument.PosArgument.isXRelative(); }
public boolean isYRelative() { return wrapperContained.isYRelative(); }
// public static boolean isYRelative() { return net.minecraft.command.argument.PosArgument.isYRelative(); }
public boolean isZRelative() { return wrapperContained.isZRelative(); }
// public static boolean isZRelative() { return net.minecraft.command.argument.PosArgument.isZRelative(); }
public yarnwrap.util.math.Vec3d toAbsolutePos(yarnwrap.server.command.ServerCommandSource source) { return new yarnwrap.util.math.Vec3d(wrapperContained.toAbsolutePos(source.wrapperContained)); }
// public static yarnwrap.util.math.Vec3d toAbsolutePos(yarnwrap.server.command.ServerCommandSource source, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.command.argument.PosArgument.toAbsolutePos(source.wrapperContained)); }
public yarnwrap.util.math.Vec2f toAbsoluteRotation(yarnwrap.server.command.ServerCommandSource source) { return new yarnwrap.util.math.Vec2f(wrapperContained.toAbsoluteRotation(source.wrapperContained)); }
// public static yarnwrap.util.math.Vec2f toAbsoluteRotation(yarnwrap.server.command.ServerCommandSource source, ) { return new yarnwrap.util.math.Vec2f(net.minecraft.command.argument.PosArgument.toAbsoluteRotation(source.wrapperContained)); }

}