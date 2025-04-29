package yarnwrap.advancement;
public class AdvancementManager { public net.minecraft.advancement.AdvancementManager wrapperContained; public AdvancementManager(net.minecraft.advancement.AdvancementManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Set roots() { return wrapperContained.roots; }
// public void roots(java.util.Set value) { wrapperContained.roots = value; }
// public static java.util.Set roots() { return net.minecraft.advancement.AdvancementManager.roots; }
// public static void roots(java.util.Set value, ) { net.minecraft.advancement.AdvancementManager.roots = value; }

// public Object listener() { return wrapperContained.listener; }
// // public void listener(Object value) { wrapperContained.listener = value; }
// // public static Object listener() { return net.minecraft.advancement.AdvancementManager.listener; }
// // public static void listener(Object value, ) { net.minecraft.advancement.AdvancementManager.listener = value; }

// public java.util.Set dependents() { return wrapperContained.dependents; }
// public void dependents(java.util.Set value) { wrapperContained.dependents = value; }
// public static java.util.Set dependents() { return net.minecraft.advancement.AdvancementManager.dependents; }
// public static void dependents(java.util.Set value, ) { net.minecraft.advancement.AdvancementManager.dependents = value; }

// public java.util.Map advancements() { return wrapperContained.advancements; }
// public void advancements(java.util.Map value) { wrapperContained.advancements = value; }
// public static java.util.Map advancements() { return net.minecraft.advancement.AdvancementManager.advancements; }
// public static void advancements(java.util.Map value, ) { net.minecraft.advancement.AdvancementManager.advancements = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.advancement.AdvancementManager.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.advancement.AdvancementManager.LOGGER = value; }

public yarnwrap.advancement.PlacedAdvancement get(yarnwrap.advancement.AdvancementEntry advancement) { return new yarnwrap.advancement.PlacedAdvancement(wrapperContained.get(advancement.wrapperContained)); }
// public static yarnwrap.advancement.PlacedAdvancement get(yarnwrap.advancement.AdvancementEntry advancement, ) { return new yarnwrap.advancement.PlacedAdvancement(net.minecraft.advancement.AdvancementManager.get(advancement.wrapperContained)); }
public void addAll(java.util.Collection advancements) { wrapperContained.addAll(advancements); }
// public static void addAll(java.util.Collection advancements, ) { net.minecraft.advancement.AdvancementManager.addAll(advancements); }
// public boolean tryAdd(yarnwrap.advancement.AdvancementEntry advancement) { return wrapperContained.tryAdd(advancement.wrapperContained); }
// public static boolean tryAdd(yarnwrap.advancement.AdvancementEntry advancement, ) { return net.minecraft.advancement.AdvancementManager.tryAdd(advancement.wrapperContained); }
public java.util.Collection getAdvancements() { return wrapperContained.getAdvancements(); }
// public static java.util.Collection getAdvancements() { return net.minecraft.advancement.AdvancementManager.getAdvancements(); }
public void removeAll(java.util.Set advancements) { wrapperContained.removeAll(advancements); }
// public static void removeAll(java.util.Set advancements, ) { net.minecraft.advancement.AdvancementManager.removeAll(advancements); }
public void clear() { wrapperContained.clear(); }
// public static void clear() { net.minecraft.advancement.AdvancementManager.clear(); }
public java.lang.Iterable getRoots() { return wrapperContained.getRoots(); }
// public static java.lang.Iterable getRoots() { return net.minecraft.advancement.AdvancementManager.getRoots(); }
public yarnwrap.advancement.PlacedAdvancement get(yarnwrap.util.Identifier id) { return new yarnwrap.advancement.PlacedAdvancement(wrapperContained.get(id.wrapperContained)); }
// public static yarnwrap.advancement.PlacedAdvancement get(yarnwrap.util.Identifier id, ) { return new yarnwrap.advancement.PlacedAdvancement(net.minecraft.advancement.AdvancementManager.get(id.wrapperContained)); }
// public void setListener(Object listener) { wrapperContained.setListener(listener); }
// public static void setListener(Object listener, ) { net.minecraft.advancement.AdvancementManager.setListener(listener); }
// public void remove(yarnwrap.advancement.PlacedAdvancement advancement) { wrapperContained.remove(advancement.wrapperContained); }
// public static void remove(yarnwrap.advancement.PlacedAdvancement advancement, ) { net.minecraft.advancement.AdvancementManager.remove(advancement.wrapperContained); }

}