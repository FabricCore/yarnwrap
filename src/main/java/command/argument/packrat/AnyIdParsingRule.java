package yarnwrap.command.argument.packrat;
public class AnyIdParsingRule { public net.minecraft.command.argument.packrat.AnyIdParsingRule wrapperContained; public AnyIdParsingRule(net.minecraft.command.argument.packrat.AnyIdParsingRule wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.command.argument.packrat.ParsingRule INSTANCE() { return new yarnwrap.command.argument.packrat.ParsingRule(wrapperContained.INSTANCE); }

}