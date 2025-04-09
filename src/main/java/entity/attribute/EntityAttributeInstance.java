package yarnwrap.entity.attribute;
public class EntityAttributeInstance { public net.minecraft.entity.attribute.EntityAttributeInstance wrapperContained; public EntityAttributeInstance(net.minecraft.entity.attribute.EntityAttributeInstance wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.entry.RegistryEntry type() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.type); }
// public java.util.Map operationToModifiers() { return wrapperContained.operationToModifiers; }
// public java.util.Map idToModifiers() { return wrapperContained.idToModifiers; }
// public java.util.Map persistentModifiers() { return wrapperContained.persistentModifiers; }
// public double baseValue() { return wrapperContained.baseValue; }
// public boolean dirty() { return wrapperContained.dirty; }
// public double value() { return wrapperContained.value; }
// public java.util.function.Consumer updateCallback() { return wrapperContained.updateCallback; }
public java.lang.String ID_NBT_KEY() { return wrapperContained.ID_NBT_KEY; }
// public java.lang.String BASE_NBT_KEY() { return wrapperContained.BASE_NBT_KEY; }
// public java.lang.String MODIFIERS_NBT_KEY() { return wrapperContained.MODIFIERS_NBT_KEY; }
public void setFrom(yarnwrap.entity.attribute.EntityAttributeInstance other) { wrapperContained.setFrom(other.wrapperContained); }
public void readNbt(yarnwrap.nbt.NbtCompound nbt) { wrapperContained.readNbt(nbt.wrapperContained); }
// public java.util.Collection getModifiersByOperation(Object operation) { return wrapperContained.getModifiersByOperation(operation); }
public void addTemporaryModifier(yarnwrap.entity.attribute.EntityAttributeModifier modifier) { wrapperContained.addTemporaryModifier(modifier.wrapperContained); }
public void addPersistentModifier(yarnwrap.entity.attribute.EntityAttributeModifier modifier) { wrapperContained.addPersistentModifier(modifier.wrapperContained); }
// public void onUpdate() { wrapperContained.onUpdate(); }
public yarnwrap.nbt.NbtCompound toNbt() { return new yarnwrap.nbt.NbtCompound(wrapperContained.toNbt()); }
// public double computeValue() { return wrapperContained.computeValue(); }
public void updateModifier(yarnwrap.entity.attribute.EntityAttributeModifier modifier) { wrapperContained.updateModifier(modifier.wrapperContained); }
public void overwritePersistentModifier(yarnwrap.entity.attribute.EntityAttributeModifier modifier) { wrapperContained.overwritePersistentModifier(modifier.wrapperContained); }
public void setBaseValue(double baseValue) { wrapperContained.setBaseValue(baseValue); }
// public java.util.Map getModifiers(Object operation) { return wrapperContained.getModifiers(operation); }
public double getValue() { return wrapperContained.getValue(); }
public java.util.Set getModifiers() { return wrapperContained.getModifiers(); }
public boolean hasModifier(yarnwrap.util.Identifier id) { return wrapperContained.hasModifier(id.wrapperContained); }
// public void addModifier(yarnwrap.entity.attribute.EntityAttributeModifier modifier) { wrapperContained.addModifier(modifier.wrapperContained); }
public yarnwrap.registry.entry.RegistryEntry getAttribute() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getAttribute()); }
public yarnwrap.entity.attribute.EntityAttributeModifier getModifier(yarnwrap.util.Identifier id) { return new yarnwrap.entity.attribute.EntityAttributeModifier(wrapperContained.getModifier(id.wrapperContained)); }
public boolean removeModifier(yarnwrap.util.Identifier id) { return wrapperContained.removeModifier(id.wrapperContained); }
public double getBaseValue() { return wrapperContained.getBaseValue(); }
public void removeModifier(yarnwrap.entity.attribute.EntityAttributeModifier modifier) { wrapperContained.removeModifier(modifier.wrapperContained); }
public void clearModifiers() { wrapperContained.clearModifiers(); }

}