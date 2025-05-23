package yarnwrap.command.argument;
public class ParserBackedArgumentType { public net.minecraft.command.argument.ParserBackedArgumentType wrapperContained; public ParserBackedArgumentType(net.minecraft.command.argument.ParserBackedArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.packrat.Parser parser() { return new yarnwrap.util.packrat.Parser(wrapperContained.parser); }
// public void parser(yarnwrap.util.packrat.Parser value) { wrapperContained.parser = value.wrapperContained; }
// public static yarnwrap.util.packrat.Parser parser() { return new yarnwrap.util.packrat.Parser(net.minecraft.command.argument.ParserBackedArgumentType.parser); }
// public static void parser(yarnwrap.util.packrat.Parser value, ) { net.minecraft.command.argument.ParserBackedArgumentType.parser = value.wrapperContained; }

// public ParserBackedArgumentType(yarnwrap.util.packrat.Parser parser) { this.wrapperContained = new net.minecraft.command.argument.ParserBackedArgumentType(parser.wrapperContained); }
public java.util.concurrent.CompletableFuture listSuggestions(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.listSuggestions(context,builder); }
// public static java.util.concurrent.CompletableFuture listSuggestions(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder, ) { return net.minecraft.command.argument.ParserBackedArgumentType.listSuggestions(context,builder); }
// public java.lang.Object parse(com.mojang.brigadier.StringReader reader) { return wrapperContained.parse(reader); }
// public static java.lang.Object parse(com.mojang.brigadier.StringReader reader, ) { return net.minecraft.command.argument.ParserBackedArgumentType.parse(reader); }

}