package yarnwrap.util.packrat;
public class Cut { public net.minecraft.util.packrat.Cut wrapperContained; public Cut(net.minecraft.util.packrat.Cut wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.packrat.Cut NOOP() { return new yarnwrap.util.packrat.Cut(wrapperContained.NOOP); }
// public void NOOP(yarnwrap.util.packrat.Cut value) { wrapperContained.NOOP = value.wrapperContained; }
public static yarnwrap.util.packrat.Cut NOOP() { return new yarnwrap.util.packrat.Cut(net.minecraft.util.packrat.Cut.NOOP); }
// public static void NOOP(yarnwrap.util.packrat.Cut value, ) { net.minecraft.util.packrat.Cut.NOOP = value.wrapperContained; }

public void cut() { wrapperContained.cut(); }
// public static void cut() { net.minecraft.util.packrat.Cut.cut(); }
public boolean isCut() { return wrapperContained.isCut(); }
// public static boolean isCut() { return net.minecraft.util.packrat.Cut.isCut(); }

}