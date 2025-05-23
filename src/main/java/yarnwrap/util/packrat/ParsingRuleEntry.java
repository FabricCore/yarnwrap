package yarnwrap.util.packrat;
public class ParsingRuleEntry { public net.minecraft.util.packrat.ParsingRuleEntry wrapperContained; public ParsingRuleEntry(net.minecraft.util.packrat.ParsingRuleEntry wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.packrat.Symbol getSymbol() { return new yarnwrap.util.packrat.Symbol(wrapperContained.getSymbol()); }
// public static yarnwrap.util.packrat.Symbol getSymbol() { return new yarnwrap.util.packrat.Symbol(net.minecraft.util.packrat.ParsingRuleEntry.getSymbol()); }
public yarnwrap.util.packrat.ParsingRule getRule() { return new yarnwrap.util.packrat.ParsingRule(wrapperContained.getRule()); }
// public static yarnwrap.util.packrat.ParsingRule getRule() { return new yarnwrap.util.packrat.ParsingRule(net.minecraft.util.packrat.ParsingRuleEntry.getRule()); }

}