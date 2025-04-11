package yarnwrap.advancement;
public class AdvancementDisplays { public net.minecraft.advancement.AdvancementDisplays wrapperContained; public AdvancementDisplays(net.minecraft.advancement.AdvancementDisplays wrapperContained) { this.wrapperContained = wrapperContained; }

// public int DISPLAY_DEPTH() { return wrapperContained.DISPLAY_DEPTH; }
// public void DISPLAY_DEPTH(int value) { wrapperContained.DISPLAY_DEPTH = value; }
// public boolean shouldDisplay(yarnwrap.advancement.PlacedAdvancement advancement,it.unimi.dsi.fastutil.Stack statuses,java.util.function.Predicate donePredicate,Object consumer) { return wrapperContained.shouldDisplay(advancement.wrapperContained,statuses,donePredicate,consumer); }
// public void calculateDisplay(yarnwrap.advancement.PlacedAdvancement advancement,java.util.function.Predicate donePredicate,Object consumer) { wrapperContained.calculateDisplay(advancement.wrapperContained,donePredicate,consumer); }
// public Object getStatus(yarnwrap.advancement.Advancement advancement,boolean force) { return wrapperContained.getStatus(advancement.wrapperContained,force); }
// public boolean shouldDisplay(it.unimi.dsi.fastutil.Stack statuses) { return wrapperContained.shouldDisplay(statuses); }

}