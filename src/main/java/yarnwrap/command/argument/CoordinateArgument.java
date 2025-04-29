package yarnwrap.command.argument;
public class CoordinateArgument { public net.minecraft.command.argument.CoordinateArgument wrapperContained; public CoordinateArgument(net.minecraft.command.argument.CoordinateArgument wrapperContained) { this.wrapperContained = wrapperContained; }

// public double value() { return wrapperContained.value; }
// public void value(double value) { wrapperContained.value = value; }
// public static double value() { return net.minecraft.command.argument.CoordinateArgument.value; }
// public static void value(double value, ) { net.minecraft.command.argument.CoordinateArgument.value = value; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType MISSING_COORDINATE() { return wrapperContained.MISSING_COORDINATE; }
// public void MISSING_COORDINATE(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.MISSING_COORDINATE = value; }
public static com.mojang.brigadier.exceptions.SimpleCommandExceptionType MISSING_COORDINATE() { return net.minecraft.command.argument.CoordinateArgument.MISSING_COORDINATE; }
// public static void MISSING_COORDINATE(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value, ) { net.minecraft.command.argument.CoordinateArgument.MISSING_COORDINATE = value; }

// public boolean relative() { return wrapperContained.relative; }
// public void relative(boolean value) { wrapperContained.relative = value; }
// public static boolean relative() { return net.minecraft.command.argument.CoordinateArgument.relative; }
// public static void relative(boolean value, ) { net.minecraft.command.argument.CoordinateArgument.relative = value; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType MISSING_BLOCK_POSITION() { return wrapperContained.MISSING_BLOCK_POSITION; }
// public void MISSING_BLOCK_POSITION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.MISSING_BLOCK_POSITION = value; }
public static com.mojang.brigadier.exceptions.SimpleCommandExceptionType MISSING_BLOCK_POSITION() { return net.minecraft.command.argument.CoordinateArgument.MISSING_BLOCK_POSITION; }
// public static void MISSING_BLOCK_POSITION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value, ) { net.minecraft.command.argument.CoordinateArgument.MISSING_BLOCK_POSITION = value; }

// public char TILDE() { return wrapperContained.TILDE; }
// public void TILDE(char value) { wrapperContained.TILDE = value; }
// public static char TILDE() { return net.minecraft.command.argument.CoordinateArgument.TILDE; }
// public static void TILDE(char value, ) { net.minecraft.command.argument.CoordinateArgument.TILDE = value; }

public CoordinateArgument(boolean relative,double value) { this.wrapperContained = new net.minecraft.command.argument.CoordinateArgument(relative,value); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.command.argument.CoordinateArgument.equals(o); }
// public yarnwrap.command.argument.CoordinateArgument parse(com.mojang.brigadier.StringReader reader) { return new yarnwrap.command.argument.CoordinateArgument(wrapperContained.parse(reader)); }
// public static yarnwrap.command.argument.CoordinateArgument parse(com.mojang.brigadier.StringReader reader, ) { return new yarnwrap.command.argument.CoordinateArgument(net.minecraft.command.argument.CoordinateArgument.parse(reader)); }
public double toAbsoluteCoordinate(double offset) { return wrapperContained.toAbsoluteCoordinate(offset); }
// public static double toAbsoluteCoordinate(double offset, ) { return net.minecraft.command.argument.CoordinateArgument.toAbsoluteCoordinate(offset); }
public boolean isRelative() { return wrapperContained.isRelative(); }
// public static boolean isRelative() { return net.minecraft.command.argument.CoordinateArgument.isRelative(); }
// public boolean isRelative(com.mojang.brigadier.StringReader reader) { return wrapperContained.isRelative(reader); }
// public static boolean isRelative(com.mojang.brigadier.StringReader reader, ) { return net.minecraft.command.argument.CoordinateArgument.isRelative(reader); }
// public yarnwrap.command.argument.CoordinateArgument parse(com.mojang.brigadier.StringReader reader,boolean centerIntegers) { return new yarnwrap.command.argument.CoordinateArgument(wrapperContained.parse(reader,centerIntegers)); }
// public static yarnwrap.command.argument.CoordinateArgument parse(com.mojang.brigadier.StringReader reader,boolean centerIntegers, ) { return new yarnwrap.command.argument.CoordinateArgument(net.minecraft.command.argument.CoordinateArgument.parse(reader,centerIntegers)); }

}