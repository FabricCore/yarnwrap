package yarnwrap.util;
public class ItemActionResult { public net.minecraft.util.ItemActionResult wrapperContained; public ItemActionResult(net.minecraft.util.ItemActionResult wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean isAccepted() { return wrapperContained.isAccepted(); }
public yarnwrap.util.ItemActionResult success(boolean swingHand) { return new yarnwrap.util.ItemActionResult(wrapperContained.success(swingHand)); }
public yarnwrap.util.ActionResult toActionResult() { return new yarnwrap.util.ActionResult(wrapperContained.toActionResult()); }

}