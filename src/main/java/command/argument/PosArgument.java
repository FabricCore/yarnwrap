package yarnwrap.command.argument;
public class PosArgument { public net.minecraft.command.argument.PosArgument wrapperContained; public PosArgument(net.minecraft.command.argument.PosArgument wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.math.BlockPos toAbsoluteBlockPos(yarnwrap.server.command.ServerCommandSource source) { return new yarnwrap.util.math.BlockPos(wrapperContained.toAbsoluteBlockPos(source.wrapperContained)); }
public boolean isXRelative() { return wrapperContained.isXRelative(); }
public boolean isYRelative() { return wrapperContained.isYRelative(); }
public boolean isZRelative() { return wrapperContained.isZRelative(); }
public yarnwrap.util.math.Vec3d toAbsolutePos(yarnwrap.server.command.ServerCommandSource source) { return new yarnwrap.util.math.Vec3d(wrapperContained.toAbsolutePos(source.wrapperContained)); }
public yarnwrap.util.math.Vec2f toAbsoluteRotation(yarnwrap.server.command.ServerCommandSource source) { return new yarnwrap.util.math.Vec2f(wrapperContained.toAbsoluteRotation(source.wrapperContained)); }

}