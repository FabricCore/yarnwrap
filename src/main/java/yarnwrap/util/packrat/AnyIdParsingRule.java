package yarnwrap.util.packrat;
public class AnyIdParsingRule { public net.minecraft.util.packrat.AnyIdParsingRule wrapperContained; public AnyIdParsingRule(net.minecraft.util.packrat.AnyIdParsingRule wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.packrat.ParsingRule INSTANCE() { return new yarnwrap.util.packrat.ParsingRule(wrapperContained.INSTANCE); }
// public void INSTANCE(yarnwrap.util.packrat.ParsingRule value) { wrapperContained.INSTANCE = value.wrapperContained; }
public static yarnwrap.util.packrat.ParsingRule INSTANCE() { return new yarnwrap.util.packrat.ParsingRule(net.minecraft.util.packrat.AnyIdParsingRule.INSTANCE); }
// public static void INSTANCE(yarnwrap.util.packrat.ParsingRule value, ) { net.minecraft.util.packrat.AnyIdParsingRule.INSTANCE = value.wrapperContained; }


}