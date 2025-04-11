package yarnwrap.command.argument.packrat;
public class ArgumentParser { public net.minecraft.command.argument.packrat.ArgumentParser wrapperContained; public ArgumentParser(net.minecraft.command.argument.packrat.ArgumentParser wrapperContained) { this.wrapperContained = wrapperContained; }

// public void method_58339(yarnwrap.command.argument.packrat.ParseError error,java.util.function.Consumer consumer) { wrapperContained.method_58339(error.wrapperContained,consumer); }
public java.util.Optional startParsing(yarnwrap.command.argument.packrat.ParsingState state) { return wrapperContained.startParsing(state.wrapperContained); }
// public java.lang.Object parse(com.mojang.brigadier.StringReader reader) { return wrapperContained.parse(reader); }
public java.util.concurrent.CompletableFuture listSuggestions(com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.listSuggestions(builder); }

}