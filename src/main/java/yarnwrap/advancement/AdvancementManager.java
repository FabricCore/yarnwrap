package yarnwrap.advancement;
public class AdvancementManager { public net.minecraft.advancement.AdvancementManager wrapperContained; public AdvancementManager(net.minecraft.advancement.AdvancementManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Set roots() { return wrapperContained.roots; }
// public void roots(java.util.Set value) { wrapperContained.roots = value; }
// public Object listener() { return wrapperContained.listener; }
// // public void listener(Object value) { wrapperContained.listener = value; }
// public java.util.Set dependents() { return wrapperContained.dependents; }
// public void dependents(java.util.Set value) { wrapperContained.dependents = value; }
// public java.util.Map advancements() { return wrapperContained.advancements; }
// public void advancements(java.util.Map value) { wrapperContained.advancements = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
public yarnwrap.advancement.PlacedAdvancement get(yarnwrap.advancement.AdvancementEntry advancement) { return new yarnwrap.advancement.PlacedAdvancement(wrapperContained.get(advancement.wrapperContained)); }
public void addAll(java.util.Collection advancements) { wrapperContained.addAll(advancements); }
// public boolean tryAdd(yarnwrap.advancement.AdvancementEntry advancement) { return wrapperContained.tryAdd(advancement.wrapperContained); }
public java.util.Collection getAdvancements() { return wrapperContained.getAdvancements(); }
public void removeAll(java.util.Set advancements) { wrapperContained.removeAll(advancements); }
public void clear() { wrapperContained.clear(); }
public java.lang.Iterable getRoots() { return wrapperContained.getRoots(); }
public yarnwrap.advancement.PlacedAdvancement get(yarnwrap.util.Identifier id) { return new yarnwrap.advancement.PlacedAdvancement(wrapperContained.get(id.wrapperContained)); }
// public void setListener(Object listener) { wrapperContained.setListener(listener); }
// public void remove(yarnwrap.advancement.PlacedAdvancement advancement) { wrapperContained.remove(advancement.wrapperContained); }

}