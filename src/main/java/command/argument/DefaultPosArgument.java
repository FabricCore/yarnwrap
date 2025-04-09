package yarnwrap.command.argument;
public class DefaultPosArgument { public net.minecraft.command.argument.DefaultPosArgument wrapperContained; public DefaultPosArgument(net.minecraft.command.argument.DefaultPosArgument wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.command.argument.CoordinateArgument y() { return new yarnwrap.command.argument.CoordinateArgument(wrapperContained.y); }
// public yarnwrap.command.argument.CoordinateArgument x() { return new yarnwrap.command.argument.CoordinateArgument(wrapperContained.x); }
// public yarnwrap.command.argument.CoordinateArgument z() { return new yarnwrap.command.argument.CoordinateArgument(wrapperContained.z); }
public yarnwrap.command.argument.DefaultPosArgument absolute(double x,double y,double z) { return new yarnwrap.command.argument.DefaultPosArgument(wrapperContained.absolute(x,y,z)); }
public yarnwrap.command.argument.DefaultPosArgument absolute(yarnwrap.util.math.Vec2f vec) { return new yarnwrap.command.argument.DefaultPosArgument(wrapperContained.absolute(vec.wrapperContained)); }
// public yarnwrap.command.argument.DefaultPosArgument parse(com.mojang.brigadier.StringReader reader) { return new yarnwrap.command.argument.DefaultPosArgument(wrapperContained.parse(reader)); }
// public yarnwrap.command.argument.DefaultPosArgument parse(com.mojang.brigadier.StringReader reader,boolean centerIntegers) { return new yarnwrap.command.argument.DefaultPosArgument(wrapperContained.parse(reader,centerIntegers)); }
public yarnwrap.command.argument.DefaultPosArgument zero() { return new yarnwrap.command.argument.DefaultPosArgument(wrapperContained.zero()); }

}