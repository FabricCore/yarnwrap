package yarnwrap.command.argument.packrat;
public class NbtParsingRule { public net.minecraft.command.argument.packrat.NbtParsingRule wrapperContained; public NbtParsingRule(net.minecraft.command.argument.packrat.NbtParsingRule wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.command.argument.packrat.ParsingRule INSTANCE() { return new yarnwrap.command.argument.packrat.ParsingRule(wrapperContained.INSTANCE); }
// public void INSTANCE(yarnwrap.command.argument.packrat.ParsingRule value) { wrapperContained.INSTANCE = value.wrapperContained; }

}