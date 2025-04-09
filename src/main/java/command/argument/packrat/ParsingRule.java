package yarnwrap.command.argument.packrat;
public class ParsingRule { public net.minecraft.command.argument.packrat.ParsingRule wrapperContained; public ParsingRule(net.minecraft.command.argument.packrat.ParsingRule wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.Optional parse(yarnwrap.command.argument.packrat.ParsingState state) { return wrapperContained.parse(state.wrapperContained); }
// public yarnwrap.command.argument.packrat.ParsingRule of(yarnwrap.command.argument.packrat.Term term,Object action) { return new yarnwrap.command.argument.packrat.ParsingRule(wrapperContained.of(term.wrapperContained,action)); }
// // public yarnwrap.command.argument.packrat.ParsingRule of(yarnwrap.command.argument.packrat.Term term,Object action) { return new yarnwrap.command.argument.packrat.ParsingRule(wrapperContained.of(term.wrapperContained,action)); }

}