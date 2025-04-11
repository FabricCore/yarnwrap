package yarnwrap.command.argument;
public class SwizzleArgumentType { public net.minecraft.command.argument.SwizzleArgumentType wrapperContained; public SwizzleArgumentType(net.minecraft.command.argument.SwizzleArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public void EXAMPLES(java.util.Collection value) { wrapperContained.EXAMPLES = value; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType INVALID_SWIZZLE_EXCEPTION() { return wrapperContained.INVALID_SWIZZLE_EXCEPTION; }
// public void INVALID_SWIZZLE_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.INVALID_SWIZZLE_EXCEPTION = value; }
public java.util.EnumSet getSwizzle(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return wrapperContained.getSwizzle(context,name); }
public yarnwrap.command.argument.SwizzleArgumentType swizzle() { return new yarnwrap.command.argument.SwizzleArgumentType(wrapperContained.swizzle()); }
// public java.lang.Object parse(com.mojang.brigadier.StringReader reader) { return wrapperContained.parse(reader); }

}