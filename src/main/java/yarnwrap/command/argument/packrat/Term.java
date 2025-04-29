package yarnwrap.command.argument.packrat;
public class Term { public net.minecraft.command.argument.packrat.Term wrapperContained; public Term(net.minecraft.command.argument.packrat.Term wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.command.argument.packrat.Term cutting() { return new yarnwrap.command.argument.packrat.Term(wrapperContained.cutting()); }
public static yarnwrap.command.argument.packrat.Term cutting() { return new yarnwrap.command.argument.packrat.Term(net.minecraft.command.argument.packrat.Term.cutting()); }
// public yarnwrap.command.argument.packrat.Term symbol(yarnwrap.command.argument.packrat.Symbol symbol) { return new yarnwrap.command.argument.packrat.Term(wrapperContained.symbol(symbol.wrapperContained)); }
// public static yarnwrap.command.argument.packrat.Term symbol(yarnwrap.command.argument.packrat.Symbol symbol, ) { return new yarnwrap.command.argument.packrat.Term(net.minecraft.command.argument.packrat.Term.symbol(symbol.wrapperContained)); }
// public yarnwrap.command.argument.packrat.Term always(yarnwrap.command.argument.packrat.Symbol symbol,java.lang.Object value) { return new yarnwrap.command.argument.packrat.Term(wrapperContained.always(symbol.wrapperContained,value)); }
// public static yarnwrap.command.argument.packrat.Term always(yarnwrap.command.argument.packrat.Symbol symbol,java.lang.Object value, ) { return new yarnwrap.command.argument.packrat.Term(net.minecraft.command.argument.packrat.Term.always(symbol.wrapperContained,value)); }
public boolean matches(yarnwrap.command.argument.packrat.ParsingState state,yarnwrap.command.argument.packrat.ParseResults results,yarnwrap.command.argument.packrat.Cut cut) { return wrapperContained.matches(state.wrapperContained,results.wrapperContained,cut.wrapperContained); }
// public static boolean matches(yarnwrap.command.argument.packrat.ParsingState state,yarnwrap.command.argument.packrat.ParseResults results,yarnwrap.command.argument.packrat.Cut cut, ) { return net.minecraft.command.argument.packrat.Term.matches(state.wrapperContained,results.wrapperContained,cut.wrapperContained); }
// public yarnwrap.command.argument.packrat.Term optional(yarnwrap.command.argument.packrat.Term term) { return new yarnwrap.command.argument.packrat.Term(wrapperContained.optional(term.wrapperContained)); }
// public static yarnwrap.command.argument.packrat.Term optional(yarnwrap.command.argument.packrat.Term term, ) { return new yarnwrap.command.argument.packrat.Term(net.minecraft.command.argument.packrat.Term.optional(term.wrapperContained)); }
// public yarnwrap.command.argument.packrat.Term sequence(net.minecraft.command.argument.packrat.Term[] terms) { return new yarnwrap.command.argument.packrat.Term(wrapperContained.sequence(terms)); }
// public static yarnwrap.command.argument.packrat.Term sequence(net.minecraft.command.argument.packrat.Term[] terms, ) { return new yarnwrap.command.argument.packrat.Term(net.minecraft.command.argument.packrat.Term.sequence(terms)); }
// public yarnwrap.command.argument.packrat.Term epsilon() { return new yarnwrap.command.argument.packrat.Term(wrapperContained.epsilon()); }
public static yarnwrap.command.argument.packrat.Term epsilon() { return new yarnwrap.command.argument.packrat.Term(net.minecraft.command.argument.packrat.Term.epsilon()); }
// public yarnwrap.command.argument.packrat.Term anyOf(net.minecraft.command.argument.packrat.Term[] terms) { return new yarnwrap.command.argument.packrat.Term(wrapperContained.anyOf(terms)); }
// public static yarnwrap.command.argument.packrat.Term anyOf(net.minecraft.command.argument.packrat.Term[] terms, ) { return new yarnwrap.command.argument.packrat.Term(net.minecraft.command.argument.packrat.Term.anyOf(terms)); }

}