package yarnwrap.util;
public class ActionResult { public net.minecraft.util.ActionResult wrapperContained; public ActionResult(net.minecraft.util.ActionResult wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean isAccepted() { return wrapperContained.isAccepted(); }
public boolean shouldSwingHand() { return wrapperContained.shouldSwingHand(); }
public yarnwrap.util.ActionResult success(boolean swingHand) { return new yarnwrap.util.ActionResult(wrapperContained.success(swingHand)); }
public boolean shouldIncrementStat() { return wrapperContained.shouldIncrementStat(); }

}