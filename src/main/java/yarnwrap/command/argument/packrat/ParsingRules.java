package yarnwrap.command.argument.packrat;
public class ParsingRules { public net.minecraft.command.argument.packrat.ParsingRules wrapperContained; public ParsingRules(net.minecraft.command.argument.packrat.ParsingRules wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map rules() { return wrapperContained.rules; }
// public void rules(java.util.Map value) { wrapperContained.rules = value; }
// public static java.util.Map rules() { return net.minecraft.command.argument.packrat.ParsingRules.rules; }
// public static void rules(java.util.Map value, ) { net.minecraft.command.argument.packrat.ParsingRules.rules = value; }

public yarnwrap.command.argument.packrat.ParsingRule get(yarnwrap.command.argument.packrat.Symbol symbol) { return new yarnwrap.command.argument.packrat.ParsingRule(wrapperContained.get(symbol.wrapperContained)); }
// public static yarnwrap.command.argument.packrat.ParsingRule get(yarnwrap.command.argument.packrat.Symbol symbol, ) { return new yarnwrap.command.argument.packrat.ParsingRule(net.minecraft.command.argument.packrat.ParsingRules.get(symbol.wrapperContained)); }
public void set(yarnwrap.command.argument.packrat.Symbol symbol,yarnwrap.command.argument.packrat.ParsingRule rule) { wrapperContained.set(symbol.wrapperContained,rule.wrapperContained); }
// public static void set(yarnwrap.command.argument.packrat.Symbol symbol,yarnwrap.command.argument.packrat.ParsingRule rule, ) { net.minecraft.command.argument.packrat.ParsingRules.set(symbol.wrapperContained,rule.wrapperContained); }
// public void set(yarnwrap.command.argument.packrat.Symbol symbol,yarnwrap.command.argument.packrat.Term term,Object action) { wrapperContained.set(symbol.wrapperContained,term.wrapperContained,action); }
// public static void set(yarnwrap.command.argument.packrat.Symbol symbol,yarnwrap.command.argument.packrat.Term term,Object action, ) { net.minecraft.command.argument.packrat.ParsingRules.set(symbol.wrapperContained,term.wrapperContained,action); }
// // public void set(yarnwrap.command.argument.packrat.Symbol symbol,yarnwrap.command.argument.packrat.Term term,Object action) { wrapperContained.set(symbol.wrapperContained,term.wrapperContained,action); }
// // public static void set(yarnwrap.command.argument.packrat.Symbol symbol,yarnwrap.command.argument.packrat.Term term,Object action, ) { net.minecraft.command.argument.packrat.ParsingRules.set(symbol.wrapperContained,term.wrapperContained,action); }

}