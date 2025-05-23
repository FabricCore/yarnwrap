package yarnwrap.util.packrat;
public class ParsingRule { public net.minecraft.util.packrat.ParsingRule wrapperContained; public ParsingRule(net.minecraft.util.packrat.ParsingRule wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.Object parse(yarnwrap.util.packrat.ParsingState state) { return wrapperContained.parse(state.wrapperContained); }
// public static java.lang.Object parse(yarnwrap.util.packrat.ParsingState state, ) { return net.minecraft.util.packrat.ParsingRule.parse(state.wrapperContained); }
// public yarnwrap.util.packrat.ParsingRule of(yarnwrap.util.packrat.Term term,Object action) { return new yarnwrap.util.packrat.ParsingRule(wrapperContained.of(term.wrapperContained,action)); }
// public static yarnwrap.util.packrat.ParsingRule of(yarnwrap.util.packrat.Term term,Object action, ) { return new yarnwrap.util.packrat.ParsingRule(net.minecraft.util.packrat.ParsingRule.of(term.wrapperContained,action)); }
// // public yarnwrap.util.packrat.ParsingRule of(yarnwrap.util.packrat.Term term,Object action) { return new yarnwrap.util.packrat.ParsingRule(wrapperContained.of(term.wrapperContained,action)); }
// // public static yarnwrap.util.packrat.ParsingRule of(yarnwrap.util.packrat.Term term,Object action, ) { return new yarnwrap.util.packrat.ParsingRule(net.minecraft.util.packrat.ParsingRule.of(term.wrapperContained,action)); }

}