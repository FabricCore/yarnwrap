package yarnwrap.command.argument.packrat;
public class ParsingRule { public net.minecraft.command.argument.packrat.ParsingRule wrapperContained; public ParsingRule(net.minecraft.command.argument.packrat.ParsingRule wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.Optional parse(yarnwrap.command.argument.packrat.ParsingState state) { return wrapperContained.parse(state.wrapperContained); }
// public static java.util.Optional parse(yarnwrap.command.argument.packrat.ParsingState state, ) { return net.minecraft.command.argument.packrat.ParsingRule.parse(state.wrapperContained); }
// public java.util.Optional method_58319(Object state,yarnwrap.command.argument.packrat.ParsingState results) { return wrapperContained.method_58319(state,results.wrapperContained); }
// public static java.util.Optional method_58319(Object state,yarnwrap.command.argument.packrat.ParsingState results, ) { return net.minecraft.command.argument.packrat.ParsingRule.method_58319(state,results.wrapperContained); }
// public yarnwrap.command.argument.packrat.ParsingRule of(yarnwrap.command.argument.packrat.Term term,Object action) { return new yarnwrap.command.argument.packrat.ParsingRule(wrapperContained.of(term.wrapperContained,action)); }
// public static yarnwrap.command.argument.packrat.ParsingRule of(yarnwrap.command.argument.packrat.Term term,Object action, ) { return new yarnwrap.command.argument.packrat.ParsingRule(net.minecraft.command.argument.packrat.ParsingRule.of(term.wrapperContained,action)); }
// // public yarnwrap.command.argument.packrat.ParsingRule of(yarnwrap.command.argument.packrat.Term term,Object action) { return new yarnwrap.command.argument.packrat.ParsingRule(wrapperContained.of(term.wrapperContained,action)); }
// // public static yarnwrap.command.argument.packrat.ParsingRule of(yarnwrap.command.argument.packrat.Term term,Object action, ) { return new yarnwrap.command.argument.packrat.ParsingRule(net.minecraft.command.argument.packrat.ParsingRule.of(term.wrapperContained,action)); }

}