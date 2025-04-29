package yarnwrap.command.argument.packrat;
public class Cut { public net.minecraft.command.argument.packrat.Cut wrapperContained; public Cut(net.minecraft.command.argument.packrat.Cut wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.command.argument.packrat.Cut NOOP() { return new yarnwrap.command.argument.packrat.Cut(wrapperContained.NOOP); }
// public void NOOP(yarnwrap.command.argument.packrat.Cut value) { wrapperContained.NOOP = value.wrapperContained; }
public static yarnwrap.command.argument.packrat.Cut NOOP() { return new yarnwrap.command.argument.packrat.Cut(net.minecraft.command.argument.packrat.Cut.NOOP); }
// public static void NOOP(yarnwrap.command.argument.packrat.Cut value, ) { net.minecraft.command.argument.packrat.Cut.NOOP = value.wrapperContained; }


}