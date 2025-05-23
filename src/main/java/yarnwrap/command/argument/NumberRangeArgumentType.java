package yarnwrap.command.argument;
public class NumberRangeArgumentType { public net.minecraft.command.argument.NumberRangeArgumentType wrapperContained; public NumberRangeArgumentType(net.minecraft.command.argument.NumberRangeArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object intRange() { return wrapperContained.intRange(); }
public static Object intRange() { return net.minecraft.command.argument.NumberRangeArgumentType.intRange(); }
// public Object floatRange() { return wrapperContained.floatRange(); }
public static Object floatRange() { return net.minecraft.command.argument.NumberRangeArgumentType.floatRange(); }

}