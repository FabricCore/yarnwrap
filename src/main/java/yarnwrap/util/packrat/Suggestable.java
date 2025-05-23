package yarnwrap.util.packrat;
public class Suggestable { public net.minecraft.util.packrat.Suggestable wrapperContained; public Suggestable(net.minecraft.util.packrat.Suggestable wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.packrat.Suggestable empty() { return new yarnwrap.util.packrat.Suggestable(wrapperContained.empty()); }
public static yarnwrap.util.packrat.Suggestable empty() { return new yarnwrap.util.packrat.Suggestable(net.minecraft.util.packrat.Suggestable.empty()); }
// public java.util.stream.Stream method_58330(yarnwrap.util.packrat.ParsingState state) { return wrapperContained.method_58330(state.wrapperContained); }
// public static java.util.stream.Stream method_58330(yarnwrap.util.packrat.ParsingState state, ) { return net.minecraft.util.packrat.Suggestable.method_58330(state.wrapperContained); }
public java.util.stream.Stream possibleValues(yarnwrap.util.packrat.ParsingState state) { return wrapperContained.possibleValues(state.wrapperContained); }
// public static java.util.stream.Stream possibleValues(yarnwrap.util.packrat.ParsingState state, ) { return net.minecraft.util.packrat.Suggestable.possibleValues(state.wrapperContained); }

}