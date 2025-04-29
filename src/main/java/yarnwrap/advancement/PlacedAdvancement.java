package yarnwrap.advancement;
public class PlacedAdvancement { public net.minecraft.advancement.PlacedAdvancement wrapperContained; public PlacedAdvancement(net.minecraft.advancement.PlacedAdvancement wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.advancement.AdvancementEntry advancementEntry() { return new yarnwrap.advancement.AdvancementEntry(wrapperContained.advancementEntry); }
// public void advancementEntry(yarnwrap.advancement.AdvancementEntry value) { wrapperContained.advancementEntry = value.wrapperContained; }
// public static yarnwrap.advancement.AdvancementEntry advancementEntry() { return new yarnwrap.advancement.AdvancementEntry(net.minecraft.advancement.PlacedAdvancement.advancementEntry); }
// public static void advancementEntry(yarnwrap.advancement.AdvancementEntry value, ) { net.minecraft.advancement.PlacedAdvancement.advancementEntry = value.wrapperContained; }

// public yarnwrap.advancement.PlacedAdvancement parent() { return new yarnwrap.advancement.PlacedAdvancement(wrapperContained.parent); }
// public void parent(yarnwrap.advancement.PlacedAdvancement value) { wrapperContained.parent = value.wrapperContained; }
// public static yarnwrap.advancement.PlacedAdvancement parent() { return new yarnwrap.advancement.PlacedAdvancement(net.minecraft.advancement.PlacedAdvancement.parent); }
// public static void parent(yarnwrap.advancement.PlacedAdvancement value, ) { net.minecraft.advancement.PlacedAdvancement.parent = value.wrapperContained; }

// public java.util.Set children() { return wrapperContained.children; }
// public void children(java.util.Set value) { wrapperContained.children = value; }
// public static java.util.Set children() { return net.minecraft.advancement.PlacedAdvancement.children; }
// public static void children(java.util.Set value, ) { net.minecraft.advancement.PlacedAdvancement.children = value; }

public PlacedAdvancement(yarnwrap.advancement.AdvancementEntry advancementEntry,yarnwrap.advancement.PlacedAdvancement parent) { this.wrapperContained = new net.minecraft.advancement.PlacedAdvancement(advancementEntry.wrapperContained,parent.wrapperContained); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.advancement.PlacedAdvancement.equals(o); }
public yarnwrap.advancement.Advancement getAdvancement() { return new yarnwrap.advancement.Advancement(wrapperContained.getAdvancement()); }
// public static yarnwrap.advancement.Advancement getAdvancement() { return new yarnwrap.advancement.Advancement(net.minecraft.advancement.PlacedAdvancement.getAdvancement()); }
// public yarnwrap.advancement.PlacedAdvancement findRoot(yarnwrap.advancement.PlacedAdvancement advancement) { return new yarnwrap.advancement.PlacedAdvancement(wrapperContained.findRoot(advancement.wrapperContained)); }
// public static yarnwrap.advancement.PlacedAdvancement findRoot(yarnwrap.advancement.PlacedAdvancement advancement, ) { return new yarnwrap.advancement.PlacedAdvancement(net.minecraft.advancement.PlacedAdvancement.findRoot(advancement.wrapperContained)); }
public yarnwrap.advancement.AdvancementEntry getAdvancementEntry() { return new yarnwrap.advancement.AdvancementEntry(wrapperContained.getAdvancementEntry()); }
// public static yarnwrap.advancement.AdvancementEntry getAdvancementEntry() { return new yarnwrap.advancement.AdvancementEntry(net.minecraft.advancement.PlacedAdvancement.getAdvancementEntry()); }
public void addChild(yarnwrap.advancement.PlacedAdvancement advancement) { wrapperContained.addChild(advancement.wrapperContained); }
// public static void addChild(yarnwrap.advancement.PlacedAdvancement advancement, ) { net.minecraft.advancement.PlacedAdvancement.addChild(advancement.wrapperContained); }
public yarnwrap.advancement.PlacedAdvancement getParent() { return new yarnwrap.advancement.PlacedAdvancement(wrapperContained.getParent()); }
// public static yarnwrap.advancement.PlacedAdvancement getParent() { return new yarnwrap.advancement.PlacedAdvancement(net.minecraft.advancement.PlacedAdvancement.getParent()); }
public yarnwrap.advancement.PlacedAdvancement getRoot() { return new yarnwrap.advancement.PlacedAdvancement(wrapperContained.getRoot()); }
// public static yarnwrap.advancement.PlacedAdvancement getRoot() { return new yarnwrap.advancement.PlacedAdvancement(net.minecraft.advancement.PlacedAdvancement.getRoot()); }
public java.lang.Iterable getChildren() { return wrapperContained.getChildren(); }
// public static java.lang.Iterable getChildren() { return net.minecraft.advancement.PlacedAdvancement.getChildren(); }

}