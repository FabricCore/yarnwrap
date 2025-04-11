package yarnwrap.command.argument;
public class LookingPosArgument { public net.minecraft.command.argument.LookingPosArgument wrapperContained; public LookingPosArgument(net.minecraft.command.argument.LookingPosArgument wrapperContained) { this.wrapperContained = wrapperContained; }

// public double z() { return wrapperContained.z; }
// public void z(double value) { wrapperContained.z = value; }
// public double y() { return wrapperContained.y; }
// public void y(double value) { wrapperContained.y = value; }
// public double x() { return wrapperContained.x; }
// public void x(double value) { wrapperContained.x = value; }
public char CARET() { return wrapperContained.CARET; }
// public void CARET(char value) { wrapperContained.CARET = value; }
// public double readCoordinate(com.mojang.brigadier.StringReader reader,int startingCursorPos) { return wrapperContained.readCoordinate(reader,startingCursorPos); }
// public yarnwrap.command.argument.LookingPosArgument parse(com.mojang.brigadier.StringReader reader) { return new yarnwrap.command.argument.LookingPosArgument(wrapperContained.parse(reader)); }

}