package yarnwrap.command.argument.packrat;
public class Cut { public net.minecraft.command.argument.packrat.Cut wrapperContained; public Cut(net.minecraft.command.argument.packrat.Cut wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.command.argument.packrat.Cut NOOP() { return new yarnwrap.command.argument.packrat.Cut(wrapperContained.NOOP); }

}