package yarnwrap.command.argument;
public class DefaultPosArgument { public net.minecraft.command.argument.DefaultPosArgument wrapperContained; public DefaultPosArgument(net.minecraft.command.argument.DefaultPosArgument wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.command.argument.CoordinateArgument y() { return new yarnwrap.command.argument.CoordinateArgument(wrapperContained.y); }
// public void y(yarnwrap.command.argument.CoordinateArgument value) { wrapperContained.y = value.wrapperContained; }
// public static yarnwrap.command.argument.CoordinateArgument y() { return new yarnwrap.command.argument.CoordinateArgument(net.minecraft.command.argument.DefaultPosArgument.y); }
// public static void y(yarnwrap.command.argument.CoordinateArgument value, ) { net.minecraft.command.argument.DefaultPosArgument.y = value.wrapperContained; }

// public yarnwrap.command.argument.CoordinateArgument x() { return new yarnwrap.command.argument.CoordinateArgument(wrapperContained.x); }
// public void x(yarnwrap.command.argument.CoordinateArgument value) { wrapperContained.x = value.wrapperContained; }
// public static yarnwrap.command.argument.CoordinateArgument x() { return new yarnwrap.command.argument.CoordinateArgument(net.minecraft.command.argument.DefaultPosArgument.x); }
// public static void x(yarnwrap.command.argument.CoordinateArgument value, ) { net.minecraft.command.argument.DefaultPosArgument.x = value.wrapperContained; }

// public yarnwrap.command.argument.CoordinateArgument z() { return new yarnwrap.command.argument.CoordinateArgument(wrapperContained.z); }
// public void z(yarnwrap.command.argument.CoordinateArgument value) { wrapperContained.z = value.wrapperContained; }
// public static yarnwrap.command.argument.CoordinateArgument z() { return new yarnwrap.command.argument.CoordinateArgument(net.minecraft.command.argument.DefaultPosArgument.z); }
// public static void z(yarnwrap.command.argument.CoordinateArgument value, ) { net.minecraft.command.argument.DefaultPosArgument.z = value.wrapperContained; }

public DefaultPosArgument(yarnwrap.command.argument.CoordinateArgument x,yarnwrap.command.argument.CoordinateArgument y,yarnwrap.command.argument.CoordinateArgument z) { this.wrapperContained = new net.minecraft.command.argument.DefaultPosArgument(x.wrapperContained,y.wrapperContained,z.wrapperContained); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.command.argument.DefaultPosArgument.equals(o); }
// public yarnwrap.command.argument.DefaultPosArgument absolute(double x,double y,double z) { return new yarnwrap.command.argument.DefaultPosArgument(wrapperContained.absolute(x,y,z)); }
// public static yarnwrap.command.argument.DefaultPosArgument absolute(double x,double y,double z, ) { return new yarnwrap.command.argument.DefaultPosArgument(net.minecraft.command.argument.DefaultPosArgument.absolute(x,y,z)); }
// public yarnwrap.command.argument.DefaultPosArgument absolute(yarnwrap.util.math.Vec2f vec) { return new yarnwrap.command.argument.DefaultPosArgument(wrapperContained.absolute(vec.wrapperContained)); }
// public static yarnwrap.command.argument.DefaultPosArgument absolute(yarnwrap.util.math.Vec2f vec, ) { return new yarnwrap.command.argument.DefaultPosArgument(net.minecraft.command.argument.DefaultPosArgument.absolute(vec.wrapperContained)); }
// public yarnwrap.command.argument.DefaultPosArgument parse(com.mojang.brigadier.StringReader reader) { return new yarnwrap.command.argument.DefaultPosArgument(wrapperContained.parse(reader)); }
// public static yarnwrap.command.argument.DefaultPosArgument parse(com.mojang.brigadier.StringReader reader, ) { return new yarnwrap.command.argument.DefaultPosArgument(net.minecraft.command.argument.DefaultPosArgument.parse(reader)); }
// public yarnwrap.command.argument.DefaultPosArgument parse(com.mojang.brigadier.StringReader reader,boolean centerIntegers) { return new yarnwrap.command.argument.DefaultPosArgument(wrapperContained.parse(reader,centerIntegers)); }
// public static yarnwrap.command.argument.DefaultPosArgument parse(com.mojang.brigadier.StringReader reader,boolean centerIntegers, ) { return new yarnwrap.command.argument.DefaultPosArgument(net.minecraft.command.argument.DefaultPosArgument.parse(reader,centerIntegers)); }
// public yarnwrap.command.argument.DefaultPosArgument zero() { return new yarnwrap.command.argument.DefaultPosArgument(wrapperContained.zero()); }
public static yarnwrap.command.argument.DefaultPosArgument zero() { return new yarnwrap.command.argument.DefaultPosArgument(net.minecraft.command.argument.DefaultPosArgument.zero()); }

}