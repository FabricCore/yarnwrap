package yarnwrap.command.argument;
public class ArgumentReaderUtils { public net.minecraft.command.argument.ArgumentReaderUtils wrapperContained; public ArgumentReaderUtils(net.minecraft.command.argument.ArgumentReaderUtils wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String readWhileMatching(com.mojang.brigadier.StringReader stringReader,yarnwrap.util.function.CharPredicate predicate) { return wrapperContained.readWhileMatching(stringReader,predicate.wrapperContained); }
// public static java.lang.String readWhileMatching(com.mojang.brigadier.StringReader stringReader,yarnwrap.util.function.CharPredicate predicate, ) { return net.minecraft.command.argument.ArgumentReaderUtils.readWhileMatching(stringReader,predicate.wrapperContained); }

}