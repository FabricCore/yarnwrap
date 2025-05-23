package yarnwrap.util.packrat;
public class ParsingRules { public net.minecraft.util.packrat.ParsingRules wrapperContained; public ParsingRules(net.minecraft.util.packrat.ParsingRules wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map rules() { return wrapperContained.rules; }
// public void rules(java.util.Map value) { wrapperContained.rules = value; }
// public static java.util.Map rules() { return net.minecraft.util.packrat.ParsingRules.rules; }
// public static void rules(java.util.Map value, ) { net.minecraft.util.packrat.ParsingRules.rules = value; }

public yarnwrap.util.packrat.ParsingRuleEntry get(yarnwrap.util.packrat.Symbol symbol) { return new yarnwrap.util.packrat.ParsingRuleEntry(wrapperContained.get(symbol.wrapperContained)); }
// public static yarnwrap.util.packrat.ParsingRuleEntry get(yarnwrap.util.packrat.Symbol symbol, ) { return new yarnwrap.util.packrat.ParsingRuleEntry(net.minecraft.util.packrat.ParsingRules.get(symbol.wrapperContained)); }
public yarnwrap.util.packrat.ParsingRuleEntry set(yarnwrap.util.packrat.Symbol symbol,yarnwrap.util.packrat.ParsingRule rule) { return new yarnwrap.util.packrat.ParsingRuleEntry(wrapperContained.set(symbol.wrapperContained,rule.wrapperContained)); }
// public static yarnwrap.util.packrat.ParsingRuleEntry set(yarnwrap.util.packrat.Symbol symbol,yarnwrap.util.packrat.ParsingRule rule, ) { return new yarnwrap.util.packrat.ParsingRuleEntry(net.minecraft.util.packrat.ParsingRules.set(symbol.wrapperContained,rule.wrapperContained)); }
// public yarnwrap.util.packrat.ParsingRuleEntry set(yarnwrap.util.packrat.Symbol symbol,yarnwrap.util.packrat.Term term,Object action) { return new yarnwrap.util.packrat.ParsingRuleEntry(wrapperContained.set(symbol.wrapperContained,term.wrapperContained,action)); }
// public static yarnwrap.util.packrat.ParsingRuleEntry set(yarnwrap.util.packrat.Symbol symbol,yarnwrap.util.packrat.Term term,Object action, ) { return new yarnwrap.util.packrat.ParsingRuleEntry(net.minecraft.util.packrat.ParsingRules.set(symbol.wrapperContained,term.wrapperContained,action)); }
public void ensureBound() { wrapperContained.ensureBound(); }
// public static void ensureBound() { net.minecraft.util.packrat.ParsingRules.ensureBound(); }
public yarnwrap.util.packrat.Term term(yarnwrap.util.packrat.Symbol symbol,yarnwrap.util.packrat.Symbol nameToStore) { return new yarnwrap.util.packrat.Term(wrapperContained.term(symbol.wrapperContained,nameToStore.wrapperContained)); }
// public static yarnwrap.util.packrat.Term term(yarnwrap.util.packrat.Symbol symbol,yarnwrap.util.packrat.Symbol nameToStore, ) { return new yarnwrap.util.packrat.Term(net.minecraft.util.packrat.ParsingRules.term(symbol.wrapperContained,nameToStore.wrapperContained)); }
// // public yarnwrap.util.packrat.ParsingRuleEntry set(yarnwrap.util.packrat.Symbol symbol,yarnwrap.util.packrat.Term term,Object action) { return new yarnwrap.util.packrat.ParsingRuleEntry(wrapperContained.set(symbol.wrapperContained,term.wrapperContained,action)); }
// // public static yarnwrap.util.packrat.ParsingRuleEntry set(yarnwrap.util.packrat.Symbol symbol,yarnwrap.util.packrat.Term term,Object action, ) { return new yarnwrap.util.packrat.ParsingRuleEntry(net.minecraft.util.packrat.ParsingRules.set(symbol.wrapperContained,term.wrapperContained,action)); }
// public boolean method_68208(Object entry) { return wrapperContained.method_68208(entry); }
// public static boolean method_68208(Object entry, ) { return net.minecraft.util.packrat.ParsingRules.method_68208(entry); }
public yarnwrap.util.packrat.ParsingRuleEntry getOrCreate(yarnwrap.util.packrat.Symbol symbol) { return new yarnwrap.util.packrat.ParsingRuleEntry(wrapperContained.getOrCreate(symbol.wrapperContained)); }
// public static yarnwrap.util.packrat.ParsingRuleEntry getOrCreate(yarnwrap.util.packrat.Symbol symbol, ) { return new yarnwrap.util.packrat.ParsingRuleEntry(net.minecraft.util.packrat.ParsingRules.getOrCreate(symbol.wrapperContained)); }
public yarnwrap.util.packrat.Term term(yarnwrap.util.packrat.Symbol symbol) { return new yarnwrap.util.packrat.Term(wrapperContained.term(symbol.wrapperContained)); }
// public static yarnwrap.util.packrat.Term term(yarnwrap.util.packrat.Symbol symbol, ) { return new yarnwrap.util.packrat.Term(net.minecraft.util.packrat.ParsingRules.term(symbol.wrapperContained)); }
// public Object getOrCreateInternal(yarnwrap.util.packrat.Symbol symbol) { return wrapperContained.getOrCreateInternal(symbol.wrapperContained); }
// public static Object getOrCreateInternal(yarnwrap.util.packrat.Symbol symbol, ) { return net.minecraft.util.packrat.ParsingRules.getOrCreateInternal(symbol.wrapperContained); }

}