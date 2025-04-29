package yarnwrap.component;
public class ComponentMapImpl { public net.minecraft.component.ComponentMapImpl wrapperContained; public ComponentMapImpl(net.minecraft.component.ComponentMapImpl wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.component.ComponentMap baseComponents() { return new yarnwrap.component.ComponentMap(wrapperContained.baseComponents); }
// public void baseComponents(yarnwrap.component.ComponentMap value) { wrapperContained.baseComponents = value.wrapperContained; }
// public static yarnwrap.component.ComponentMap baseComponents() { return new yarnwrap.component.ComponentMap(net.minecraft.component.ComponentMapImpl.baseComponents); }
// public static void baseComponents(yarnwrap.component.ComponentMap value, ) { net.minecraft.component.ComponentMapImpl.baseComponents = value.wrapperContained; }

// public it.unimi.dsi.fastutil.objects.Reference2ObjectMap changedComponents() { return wrapperContained.changedComponents; }
// public void changedComponents(it.unimi.dsi.fastutil.objects.Reference2ObjectMap value) { wrapperContained.changedComponents = value; }
// public static it.unimi.dsi.fastutil.objects.Reference2ObjectMap changedComponents() { return net.minecraft.component.ComponentMapImpl.changedComponents; }
// public static void changedComponents(it.unimi.dsi.fastutil.objects.Reference2ObjectMap value, ) { net.minecraft.component.ComponentMapImpl.changedComponents = value; }

// public boolean copyOnWrite() { return wrapperContained.copyOnWrite; }
// public void copyOnWrite(boolean value) { wrapperContained.copyOnWrite = value; }
// public static boolean copyOnWrite() { return net.minecraft.component.ComponentMapImpl.copyOnWrite; }
// public static void copyOnWrite(boolean value, ) { net.minecraft.component.ComponentMapImpl.copyOnWrite = value; }

public ComponentMapImpl(yarnwrap.component.ComponentMap baseComponents) { this.wrapperContained = new net.minecraft.component.ComponentMapImpl(baseComponents.wrapperContained); }
// public ComponentMapImpl(yarnwrap.component.ComponentMap baseComponents,it.unimi.dsi.fastutil.objects.Reference2ObjectMap changedComponents,boolean copyOnWrite) { this.wrapperContained = new net.minecraft.component.ComponentMapImpl(baseComponents.wrapperContained,changedComponents,copyOnWrite); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.component.ComponentMapImpl.equals(o); }
public void setAll(yarnwrap.component.ComponentMap components) { wrapperContained.setAll(components.wrapperContained); }
// public static void setAll(yarnwrap.component.ComponentMap components, ) { net.minecraft.component.ComponentMapImpl.setAll(components.wrapperContained); }
// public boolean shouldReuseChangesMap(yarnwrap.component.ComponentMap baseComponents,it.unimi.dsi.fastutil.objects.Reference2ObjectMap changedComponents) { return wrapperContained.shouldReuseChangesMap(baseComponents.wrapperContained,changedComponents); }
// public static boolean shouldReuseChangesMap(yarnwrap.component.ComponentMap baseComponents,it.unimi.dsi.fastutil.objects.Reference2ObjectMap changedComponents, ) { return net.minecraft.component.ComponentMapImpl.shouldReuseChangesMap(baseComponents.wrapperContained,changedComponents); }
// public yarnwrap.component.ComponentMapImpl create(yarnwrap.component.ComponentMap baseComponents,yarnwrap.component.ComponentChanges changes) { return new yarnwrap.component.ComponentMapImpl(wrapperContained.create(baseComponents.wrapperContained,changes.wrapperContained)); }
// public static yarnwrap.component.ComponentMapImpl create(yarnwrap.component.ComponentMap baseComponents,yarnwrap.component.ComponentChanges changes, ) { return new yarnwrap.component.ComponentMapImpl(net.minecraft.component.ComponentMapImpl.create(baseComponents.wrapperContained,changes.wrapperContained)); }
public void applyChanges(yarnwrap.component.ComponentChanges changes) { wrapperContained.applyChanges(changes.wrapperContained); }
// public static void applyChanges(yarnwrap.component.ComponentChanges changes, ) { net.minecraft.component.ComponentMapImpl.applyChanges(changes.wrapperContained); }
// public void applyChange(yarnwrap.component.ComponentType type,java.util.Optional optional) { wrapperContained.applyChange(type.wrapperContained,optional); }
// public static void applyChange(yarnwrap.component.ComponentType type,java.util.Optional optional, ) { net.minecraft.component.ComponentMapImpl.applyChange(type.wrapperContained,optional); }
public java.lang.Object set(yarnwrap.component.ComponentType type,java.lang.Object value) { return wrapperContained.set(type.wrapperContained,value); }
// public static java.lang.Object set(yarnwrap.component.ComponentType type,java.lang.Object value, ) { return net.minecraft.component.ComponentMapImpl.set(type.wrapperContained,value); }
public java.lang.Object remove(yarnwrap.component.ComponentType type) { return wrapperContained.remove(type.wrapperContained); }
// public static java.lang.Object remove(yarnwrap.component.ComponentType type, ) { return net.minecraft.component.ComponentMapImpl.remove(type.wrapperContained); }
public yarnwrap.component.ComponentChanges getChanges() { return new yarnwrap.component.ComponentChanges(wrapperContained.getChanges()); }
// public static yarnwrap.component.ComponentChanges getChanges() { return new yarnwrap.component.ComponentChanges(net.minecraft.component.ComponentMapImpl.getChanges()); }
public yarnwrap.component.ComponentMapImpl copy() { return new yarnwrap.component.ComponentMapImpl(wrapperContained.copy()); }
// public static yarnwrap.component.ComponentMapImpl copy() { return new yarnwrap.component.ComponentMapImpl(net.minecraft.component.ComponentMapImpl.copy()); }
// public void onWrite() { wrapperContained.onWrite(); }
// public static void onWrite() { net.minecraft.component.ComponentMapImpl.onWrite(); }
public void setChanges(yarnwrap.component.ComponentChanges changes) { wrapperContained.setChanges(changes.wrapperContained); }
// public static void setChanges(yarnwrap.component.ComponentChanges changes, ) { net.minecraft.component.ComponentMapImpl.setChanges(changes.wrapperContained); }

}