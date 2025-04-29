package yarnwrap.command.argument;
public class LookingPosArgument { public net.minecraft.command.argument.LookingPosArgument wrapperContained; public LookingPosArgument(net.minecraft.command.argument.LookingPosArgument wrapperContained) { this.wrapperContained = wrapperContained; }

// public double z() { return wrapperContained.z; }
// public void z(double value) { wrapperContained.z = value; }
// public static double z() { return net.minecraft.command.argument.LookingPosArgument.z; }
// public static void z(double value, ) { net.minecraft.command.argument.LookingPosArgument.z = value; }

// public double y() { return wrapperContained.y; }
// public void y(double value) { wrapperContained.y = value; }
// public static double y() { return net.minecraft.command.argument.LookingPosArgument.y; }
// public static void y(double value, ) { net.minecraft.command.argument.LookingPosArgument.y = value; }

// public double x() { return wrapperContained.x; }
// public void x(double value) { wrapperContained.x = value; }
// public static double x() { return net.minecraft.command.argument.LookingPosArgument.x; }
// public static void x(double value, ) { net.minecraft.command.argument.LookingPosArgument.x = value; }

// public char CARET() { return wrapperContained.CARET; }
// public void CARET(char value) { wrapperContained.CARET = value; }
public static char CARET() { return net.minecraft.command.argument.LookingPosArgument.CARET; }
// public static void CARET(char value, ) { net.minecraft.command.argument.LookingPosArgument.CARET = value; }

public LookingPosArgument(double x,double y,double z) { this.wrapperContained = new net.minecraft.command.argument.LookingPosArgument(x,y,z); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.command.argument.LookingPosArgument.equals(o); }
// public double readCoordinate(com.mojang.brigadier.StringReader reader,int startingCursorPos) { return wrapperContained.readCoordinate(reader,startingCursorPos); }
// public static double readCoordinate(com.mojang.brigadier.StringReader reader,int startingCursorPos, ) { return net.minecraft.command.argument.LookingPosArgument.readCoordinate(reader,startingCursorPos); }
// public yarnwrap.command.argument.LookingPosArgument parse(com.mojang.brigadier.StringReader reader) { return new yarnwrap.command.argument.LookingPosArgument(wrapperContained.parse(reader)); }
// public static yarnwrap.command.argument.LookingPosArgument parse(com.mojang.brigadier.StringReader reader, ) { return new yarnwrap.command.argument.LookingPosArgument(net.minecraft.command.argument.LookingPosArgument.parse(reader)); }

}