package yarnwrap.command.argument;
public class SignedArgumentList { public net.minecraft.command.argument.SignedArgumentList wrapperContained; public SignedArgumentList(net.minecraft.command.argument.SignedArgumentList wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.command.argument.SignedArgumentList of(com.mojang.brigadier.ParseResults parseResults) { return new yarnwrap.command.argument.SignedArgumentList(wrapperContained.of(parseResults)); }
// public static yarnwrap.command.argument.SignedArgumentList of(com.mojang.brigadier.ParseResults parseResults, ) { return new yarnwrap.command.argument.SignedArgumentList(net.minecraft.command.argument.SignedArgumentList.of(parseResults)); }
// public java.util.List collectDecoratableArguments(java.lang.String argumentName,com.mojang.brigadier.context.CommandContextBuilder builder) { return wrapperContained.collectDecoratableArguments(argumentName,builder); }
// public static java.util.List collectDecoratableArguments(java.lang.String argumentName,com.mojang.brigadier.context.CommandContextBuilder builder, ) { return net.minecraft.command.argument.SignedArgumentList.collectDecoratableArguments(argumentName,builder); }
// public boolean isNotEmpty(com.mojang.brigadier.ParseResults parseResults) { return wrapperContained.isNotEmpty(parseResults); }
// public static boolean isNotEmpty(com.mojang.brigadier.ParseResults parseResults, ) { return net.minecraft.command.argument.SignedArgumentList.isNotEmpty(parseResults); }
public Object get(java.lang.String name) { return wrapperContained.get(name); }
// public static Object get(java.lang.String name, ) { return net.minecraft.command.argument.SignedArgumentList.get(name); }

}