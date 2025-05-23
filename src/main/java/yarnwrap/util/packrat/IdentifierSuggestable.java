package yarnwrap.util.packrat;
public class IdentifierSuggestable { public net.minecraft.util.packrat.IdentifierSuggestable wrapperContained; public IdentifierSuggestable(net.minecraft.util.packrat.IdentifierSuggestable wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.stream.Stream possibleIds() { return wrapperContained.possibleIds(); }
// public static java.util.stream.Stream possibleIds() { return net.minecraft.util.packrat.IdentifierSuggestable.possibleIds(); }

}