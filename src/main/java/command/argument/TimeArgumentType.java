package yarnwrap.command.argument;
public class TimeArgumentType { public net.minecraft.command.argument.TimeArgumentType wrapperContained; public TimeArgumentType(net.minecraft.command.argument.TimeArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType TICK_COUNT_TOO_LOW_EXCEPTION() { return wrapperContained.TICK_COUNT_TOO_LOW_EXCEPTION; }
// public int minimum() { return wrapperContained.minimum; }
// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType INVALID_UNIT_EXCEPTION() { return wrapperContained.INVALID_UNIT_EXCEPTION; }
// public it.unimi.dsi.fastutil.objects.Object2IntMap UNITS() { return wrapperContained.UNITS; }
public yarnwrap.command.argument.TimeArgumentType time(int minimum) { return new yarnwrap.command.argument.TimeArgumentType(wrapperContained.time(minimum)); }
public yarnwrap.command.argument.TimeArgumentType time() { return new yarnwrap.command.argument.TimeArgumentType(wrapperContained.time()); }

}