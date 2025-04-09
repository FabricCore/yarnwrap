package yarnwrap.command.argument;
public class CoordinateArgument { public net.minecraft.command.argument.CoordinateArgument wrapperContained; public CoordinateArgument(net.minecraft.command.argument.CoordinateArgument wrapperContained) { this.wrapperContained = wrapperContained; }

// public double value() { return wrapperContained.value; }
public com.mojang.brigadier.exceptions.SimpleCommandExceptionType MISSING_COORDINATE() { return wrapperContained.MISSING_COORDINATE; }
// public boolean relative() { return wrapperContained.relative; }
public com.mojang.brigadier.exceptions.SimpleCommandExceptionType MISSING_BLOCK_POSITION() { return wrapperContained.MISSING_BLOCK_POSITION; }
// public char TILDE() { return wrapperContained.TILDE; }
// public yarnwrap.command.argument.CoordinateArgument parse(com.mojang.brigadier.StringReader reader) { return new yarnwrap.command.argument.CoordinateArgument(wrapperContained.parse(reader)); }
public double toAbsoluteCoordinate(double offset) { return wrapperContained.toAbsoluteCoordinate(offset); }
public boolean isRelative() { return wrapperContained.isRelative(); }
public boolean isRelative(com.mojang.brigadier.StringReader reader) { return wrapperContained.isRelative(reader); }
// public yarnwrap.command.argument.CoordinateArgument parse(com.mojang.brigadier.StringReader reader,boolean centerIntegers) { return new yarnwrap.command.argument.CoordinateArgument(wrapperContained.parse(reader,centerIntegers)); }

}