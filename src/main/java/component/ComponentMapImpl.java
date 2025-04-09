package yarnwrap.component;
public class ComponentMapImpl { public net.minecraft.component.ComponentMapImpl wrapperContained; public ComponentMapImpl(net.minecraft.component.ComponentMapImpl wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.component.ComponentMap baseComponents() { return new yarnwrap.component.ComponentMap(wrapperContained.baseComponents); }
// public it.unimi.dsi.fastutil.objects.Reference2ObjectMap changedComponents() { return wrapperContained.changedComponents; }
// public boolean copyOnWrite() { return wrapperContained.copyOnWrite; }
public void setAll(yarnwrap.component.ComponentMap components) { wrapperContained.setAll(components.wrapperContained); }
// public boolean shouldReuseChangesMap(yarnwrap.component.ComponentMap baseComponents,it.unimi.dsi.fastutil.objects.Reference2ObjectMap changedComponents) { return wrapperContained.shouldReuseChangesMap(baseComponents.wrapperContained,changedComponents); }
public yarnwrap.component.ComponentMapImpl create(yarnwrap.component.ComponentMap baseComponents,yarnwrap.component.ComponentChanges changes) { return new yarnwrap.component.ComponentMapImpl(wrapperContained.create(baseComponents.wrapperContained,changes.wrapperContained)); }
public void applyChanges(yarnwrap.component.ComponentChanges changes) { wrapperContained.applyChanges(changes.wrapperContained); }
// public void applyChange(yarnwrap.component.ComponentType type,java.util.Optional optional) { wrapperContained.applyChange(type.wrapperContained,optional); }
public java.lang.Object set(yarnwrap.component.ComponentType type,java.lang.Object value) { return wrapperContained.set(type.wrapperContained,value); }
public java.lang.Object remove(yarnwrap.component.ComponentType type) { return wrapperContained.remove(type.wrapperContained); }
public yarnwrap.component.ComponentChanges getChanges() { return new yarnwrap.component.ComponentChanges(wrapperContained.getChanges()); }
public yarnwrap.component.ComponentMapImpl copy() { return new yarnwrap.component.ComponentMapImpl(wrapperContained.copy()); }
// public void onWrite() { wrapperContained.onWrite(); }
public void setChanges(yarnwrap.component.ComponentChanges changes) { wrapperContained.setChanges(changes.wrapperContained); }

}