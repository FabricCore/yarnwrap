package yarnwrap.item;
public class BowItem { public net.minecraft.item.BowItem wrapperContained; public BowItem(net.minecraft.item.BowItem wrapperContained) { this.wrapperContained = wrapperContained; }

public int TICKS_PER_SECOND() { return wrapperContained.TICKS_PER_SECOND; }
public int RANGE() { return wrapperContained.RANGE; }
public float getPullProgress(int useTicks) { return wrapperContained.getPullProgress(useTicks); }

}