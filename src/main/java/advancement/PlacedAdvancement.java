package yarnwrap.advancement;
public class PlacedAdvancement { public net.minecraft.advancement.PlacedAdvancement wrapperContained; public PlacedAdvancement(net.minecraft.advancement.PlacedAdvancement wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.advancement.AdvancementEntry advancementEntry() { return new yarnwrap.advancement.AdvancementEntry(wrapperContained.advancementEntry); }
// public yarnwrap.advancement.PlacedAdvancement parent() { return new yarnwrap.advancement.PlacedAdvancement(wrapperContained.parent); }
// public java.util.Set children() { return wrapperContained.children; }
public yarnwrap.advancement.Advancement getAdvancement() { return new yarnwrap.advancement.Advancement(wrapperContained.getAdvancement()); }
public yarnwrap.advancement.PlacedAdvancement findRoot(yarnwrap.advancement.PlacedAdvancement advancement) { return new yarnwrap.advancement.PlacedAdvancement(wrapperContained.findRoot(advancement.wrapperContained)); }
public yarnwrap.advancement.AdvancementEntry getAdvancementEntry() { return new yarnwrap.advancement.AdvancementEntry(wrapperContained.getAdvancementEntry()); }
public void addChild(yarnwrap.advancement.PlacedAdvancement advancement) { wrapperContained.addChild(advancement.wrapperContained); }
public yarnwrap.advancement.PlacedAdvancement getParent() { return new yarnwrap.advancement.PlacedAdvancement(wrapperContained.getParent()); }
public yarnwrap.advancement.PlacedAdvancement getRoot() { return new yarnwrap.advancement.PlacedAdvancement(wrapperContained.getRoot()); }
public java.lang.Iterable getChildren() { return wrapperContained.getChildren(); }

}