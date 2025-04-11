package yarnwrap.command.argument.packrat;
public class IdentifierSuggestable { public net.minecraft.command.argument.packrat.IdentifierSuggestable wrapperContained; public IdentifierSuggestable(net.minecraft.command.argument.packrat.IdentifierSuggestable wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.stream.Stream possibleIds() { return wrapperContained.possibleIds(); }

}