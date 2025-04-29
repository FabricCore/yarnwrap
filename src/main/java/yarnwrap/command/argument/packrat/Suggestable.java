package yarnwrap.command.argument.packrat;
public class Suggestable { public net.minecraft.command.argument.packrat.Suggestable wrapperContained; public Suggestable(net.minecraft.command.argument.packrat.Suggestable wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.command.argument.packrat.Suggestable empty() { return new yarnwrap.command.argument.packrat.Suggestable(wrapperContained.empty()); }
public static yarnwrap.command.argument.packrat.Suggestable empty() { return new yarnwrap.command.argument.packrat.Suggestable(net.minecraft.command.argument.packrat.Suggestable.empty()); }
// public java.util.stream.Stream method_58330(yarnwrap.command.argument.packrat.ParsingState state) { return wrapperContained.method_58330(state.wrapperContained); }
// public static java.util.stream.Stream method_58330(yarnwrap.command.argument.packrat.ParsingState state, ) { return net.minecraft.command.argument.packrat.Suggestable.method_58330(state.wrapperContained); }
public java.util.stream.Stream possibleValues(yarnwrap.command.argument.packrat.ParsingState state) { return wrapperContained.possibleValues(state.wrapperContained); }
// public static java.util.stream.Stream possibleValues(yarnwrap.command.argument.packrat.ParsingState state, ) { return net.minecraft.command.argument.packrat.Suggestable.possibleValues(state.wrapperContained); }

}