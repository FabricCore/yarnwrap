package yarnwrap.util;
public class ActionResult { public net.minecraft.util.ActionResult wrapperContained; public ActionResult(net.minecraft.util.ActionResult wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean isAccepted() { return wrapperContained.isAccepted(); }
// public static boolean isAccepted() { return net.minecraft.util.ActionResult.isAccepted(); }
public boolean shouldSwingHand() { return wrapperContained.shouldSwingHand(); }
// public static boolean shouldSwingHand() { return net.minecraft.util.ActionResult.shouldSwingHand(); }
// public yarnwrap.util.ActionResult success(boolean swingHand) { return new yarnwrap.util.ActionResult(wrapperContained.success(swingHand)); }
// public static yarnwrap.util.ActionResult success(boolean swingHand, ) { return new yarnwrap.util.ActionResult(net.minecraft.util.ActionResult.success(swingHand)); }
public boolean shouldIncrementStat() { return wrapperContained.shouldIncrementStat(); }
// public static boolean shouldIncrementStat() { return net.minecraft.util.ActionResult.shouldIncrementStat(); }

}