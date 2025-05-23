package yarnwrap.util.packrat;
public class Parser { public net.minecraft.util.packrat.Parser wrapperContained; public Parser(net.minecraft.util.packrat.Parser wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.Object parse(com.mojang.brigadier.StringReader reader) { return wrapperContained.parse(reader); }
// public static java.lang.Object parse(com.mojang.brigadier.StringReader reader, ) { return net.minecraft.util.packrat.Parser.parse(reader); }
public java.util.concurrent.CompletableFuture listSuggestions(com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.listSuggestions(builder); }
// public static java.util.concurrent.CompletableFuture listSuggestions(com.mojang.brigadier.suggestion.SuggestionsBuilder builder, ) { return net.minecraft.util.packrat.Parser.listSuggestions(builder); }
public yarnwrap.util.packrat.Parser withDecoding(com.mojang.serialization.DynamicOps ops,yarnwrap.util.packrat.Parser encodedParser,com.mojang.serialization.Codec codec,com.mojang.brigadier.exceptions.DynamicCommandExceptionType invalidDataError) { return new yarnwrap.util.packrat.Parser(wrapperContained.withDecoding(ops,encodedParser.wrapperContained,codec,invalidDataError)); }
// public static yarnwrap.util.packrat.Parser withDecoding(com.mojang.serialization.DynamicOps ops,yarnwrap.util.packrat.Parser encodedParser,com.mojang.serialization.Codec codec,com.mojang.brigadier.exceptions.DynamicCommandExceptionType invalidDataError, ) { return new yarnwrap.util.packrat.Parser(net.minecraft.util.packrat.Parser.withDecoding(ops,encodedParser.wrapperContained,codec,invalidDataError)); }
public yarnwrap.util.packrat.Parser map(java.util.function.Function mapper) { return new yarnwrap.util.packrat.Parser(wrapperContained.map(mapper)); }
// public static yarnwrap.util.packrat.Parser map(java.util.function.Function mapper, ) { return new yarnwrap.util.packrat.Parser(net.minecraft.util.packrat.Parser.map(mapper)); }

}