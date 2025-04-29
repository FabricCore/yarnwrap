package yarnwrap.entity.attribute;
public class EntityAttributeInstance { public net.minecraft.entity.attribute.EntityAttributeInstance wrapperContained; public EntityAttributeInstance(net.minecraft.entity.attribute.EntityAttributeInstance wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.entry.RegistryEntry type() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.type); }
// public void type(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.type = value.wrapperContained; }
// public static yarnwrap.registry.entry.RegistryEntry type() { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.entity.attribute.EntityAttributeInstance.type); }
// public static void type(yarnwrap.registry.entry.RegistryEntry value, ) { net.minecraft.entity.attribute.EntityAttributeInstance.type = value.wrapperContained; }

// public java.util.Map operationToModifiers() { return wrapperContained.operationToModifiers; }
// public void operationToModifiers(java.util.Map value) { wrapperContained.operationToModifiers = value; }
// public static java.util.Map operationToModifiers() { return net.minecraft.entity.attribute.EntityAttributeInstance.operationToModifiers; }
// public static void operationToModifiers(java.util.Map value, ) { net.minecraft.entity.attribute.EntityAttributeInstance.operationToModifiers = value; }

// public java.util.Map idToModifiers() { return wrapperContained.idToModifiers; }
// public void idToModifiers(java.util.Map value) { wrapperContained.idToModifiers = value; }
// public static java.util.Map idToModifiers() { return net.minecraft.entity.attribute.EntityAttributeInstance.idToModifiers; }
// public static void idToModifiers(java.util.Map value, ) { net.minecraft.entity.attribute.EntityAttributeInstance.idToModifiers = value; }

// public java.util.Map persistentModifiers() { return wrapperContained.persistentModifiers; }
// public void persistentModifiers(java.util.Map value) { wrapperContained.persistentModifiers = value; }
// public static java.util.Map persistentModifiers() { return net.minecraft.entity.attribute.EntityAttributeInstance.persistentModifiers; }
// public static void persistentModifiers(java.util.Map value, ) { net.minecraft.entity.attribute.EntityAttributeInstance.persistentModifiers = value; }

// public double baseValue() { return wrapperContained.baseValue; }
// public void baseValue(double value) { wrapperContained.baseValue = value; }
// public static double baseValue() { return net.minecraft.entity.attribute.EntityAttributeInstance.baseValue; }
// public static void baseValue(double value, ) { net.minecraft.entity.attribute.EntityAttributeInstance.baseValue = value; }

// public boolean dirty() { return wrapperContained.dirty; }
// public void dirty(boolean value) { wrapperContained.dirty = value; }
// public static boolean dirty() { return net.minecraft.entity.attribute.EntityAttributeInstance.dirty; }
// public static void dirty(boolean value, ) { net.minecraft.entity.attribute.EntityAttributeInstance.dirty = value; }

// public double value() { return wrapperContained.value; }
// public void value(double value) { wrapperContained.value = value; }
// public static double value() { return net.minecraft.entity.attribute.EntityAttributeInstance.value; }
// public static void value(double value, ) { net.minecraft.entity.attribute.EntityAttributeInstance.value = value; }

// public java.util.function.Consumer updateCallback() { return wrapperContained.updateCallback; }
// public void updateCallback(java.util.function.Consumer value) { wrapperContained.updateCallback = value; }
// public static java.util.function.Consumer updateCallback() { return net.minecraft.entity.attribute.EntityAttributeInstance.updateCallback; }
// public static void updateCallback(java.util.function.Consumer value, ) { net.minecraft.entity.attribute.EntityAttributeInstance.updateCallback = value; }

// public java.lang.String ID_NBT_KEY() { return wrapperContained.ID_NBT_KEY; }
// public void ID_NBT_KEY(java.lang.String value) { wrapperContained.ID_NBT_KEY = value; }
public static java.lang.String ID_NBT_KEY() { return net.minecraft.entity.attribute.EntityAttributeInstance.ID_NBT_KEY; }
// public static void ID_NBT_KEY(java.lang.String value, ) { net.minecraft.entity.attribute.EntityAttributeInstance.ID_NBT_KEY = value; }

// public java.lang.String BASE_NBT_KEY() { return wrapperContained.BASE_NBT_KEY; }
// public void BASE_NBT_KEY(java.lang.String value) { wrapperContained.BASE_NBT_KEY = value; }
// public static java.lang.String BASE_NBT_KEY() { return net.minecraft.entity.attribute.EntityAttributeInstance.BASE_NBT_KEY; }
// public static void BASE_NBT_KEY(java.lang.String value, ) { net.minecraft.entity.attribute.EntityAttributeInstance.BASE_NBT_KEY = value; }

// public java.lang.String MODIFIERS_NBT_KEY() { return wrapperContained.MODIFIERS_NBT_KEY; }
// public void MODIFIERS_NBT_KEY(java.lang.String value) { wrapperContained.MODIFIERS_NBT_KEY = value; }
// public static java.lang.String MODIFIERS_NBT_KEY() { return net.minecraft.entity.attribute.EntityAttributeInstance.MODIFIERS_NBT_KEY; }
// public static void MODIFIERS_NBT_KEY(java.lang.String value, ) { net.minecraft.entity.attribute.EntityAttributeInstance.MODIFIERS_NBT_KEY = value; }

public EntityAttributeInstance(yarnwrap.registry.entry.RegistryEntry type,java.util.function.Consumer updateCallback) { this.wrapperContained = new net.minecraft.entity.attribute.EntityAttributeInstance(type.wrapperContained,updateCallback); }
public void setFrom(yarnwrap.entity.attribute.EntityAttributeInstance other) { wrapperContained.setFrom(other.wrapperContained); }
// public static void setFrom(yarnwrap.entity.attribute.EntityAttributeInstance other, ) { net.minecraft.entity.attribute.EntityAttributeInstance.setFrom(other.wrapperContained); }
// public void method_26832(Object operation,java.util.Map modifiers) { wrapperContained.method_26832(operation,modifiers); }
// public static void method_26832(Object operation,java.util.Map modifiers, ) { net.minecraft.entity.attribute.EntityAttributeInstance.method_26832(operation,modifiers); }
public void readNbt(yarnwrap.nbt.NbtCompound nbt) { wrapperContained.readNbt(nbt.wrapperContained); }
// public static void readNbt(yarnwrap.nbt.NbtCompound nbt, ) { net.minecraft.entity.attribute.EntityAttributeInstance.readNbt(nbt.wrapperContained); }
// public java.util.Collection getModifiersByOperation(Object operation) { return wrapperContained.getModifiersByOperation(operation); }
// public static java.util.Collection getModifiersByOperation(Object operation, ) { return net.minecraft.entity.attribute.EntityAttributeInstance.getModifiersByOperation(operation); }
public void addTemporaryModifier(yarnwrap.entity.attribute.EntityAttributeModifier modifier) { wrapperContained.addTemporaryModifier(modifier.wrapperContained); }
// public static void addTemporaryModifier(yarnwrap.entity.attribute.EntityAttributeModifier modifier, ) { net.minecraft.entity.attribute.EntityAttributeInstance.addTemporaryModifier(modifier.wrapperContained); }
// public java.util.Map method_26836(Object operationx) { return wrapperContained.method_26836(operationx); }
// public static java.util.Map method_26836(Object operationx, ) { return net.minecraft.entity.attribute.EntityAttributeInstance.method_26836(operationx); }
public void addPersistentModifier(yarnwrap.entity.attribute.EntityAttributeModifier modifier) { wrapperContained.addPersistentModifier(modifier.wrapperContained); }
// public static void addPersistentModifier(yarnwrap.entity.attribute.EntityAttributeModifier modifier, ) { net.minecraft.entity.attribute.EntityAttributeInstance.addPersistentModifier(modifier.wrapperContained); }
// public void onUpdate() { wrapperContained.onUpdate(); }
// public static void onUpdate() { net.minecraft.entity.attribute.EntityAttributeInstance.onUpdate(); }
public yarnwrap.nbt.NbtCompound toNbt() { return new yarnwrap.nbt.NbtCompound(wrapperContained.toNbt()); }
// public static yarnwrap.nbt.NbtCompound toNbt() { return new yarnwrap.nbt.NbtCompound(net.minecraft.entity.attribute.EntityAttributeInstance.toNbt()); }
// public double computeValue() { return wrapperContained.computeValue(); }
// public static double computeValue() { return net.minecraft.entity.attribute.EntityAttributeInstance.computeValue(); }
public void updateModifier(yarnwrap.entity.attribute.EntityAttributeModifier modifier) { wrapperContained.updateModifier(modifier.wrapperContained); }
// public static void updateModifier(yarnwrap.entity.attribute.EntityAttributeModifier modifier, ) { net.minecraft.entity.attribute.EntityAttributeInstance.updateModifier(modifier.wrapperContained); }
public void overwritePersistentModifier(yarnwrap.entity.attribute.EntityAttributeModifier modifier) { wrapperContained.overwritePersistentModifier(modifier.wrapperContained); }
// public static void overwritePersistentModifier(yarnwrap.entity.attribute.EntityAttributeModifier modifier, ) { net.minecraft.entity.attribute.EntityAttributeInstance.overwritePersistentModifier(modifier.wrapperContained); }
public void setBaseValue(double baseValue) { wrapperContained.setBaseValue(baseValue); }
// public static void setBaseValue(double baseValue, ) { net.minecraft.entity.attribute.EntityAttributeInstance.setBaseValue(baseValue); }
// public java.util.Map getModifiers(Object operation) { return wrapperContained.getModifiers(operation); }
// public static java.util.Map getModifiers(Object operation, ) { return net.minecraft.entity.attribute.EntityAttributeInstance.getModifiers(operation); }
public double getValue() { return wrapperContained.getValue(); }
// public static double getValue() { return net.minecraft.entity.attribute.EntityAttributeInstance.getValue(); }
public java.util.Set getModifiers() { return wrapperContained.getModifiers(); }
// // public static java.util.Set getModifiers() { return net.minecraft.entity.attribute.EntityAttributeInstance.getModifiers(); }
public boolean hasModifier(yarnwrap.util.Identifier id) { return wrapperContained.hasModifier(id.wrapperContained); }
// public static boolean hasModifier(yarnwrap.util.Identifier id, ) { return net.minecraft.entity.attribute.EntityAttributeInstance.hasModifier(id.wrapperContained); }
// public void addModifier(yarnwrap.entity.attribute.EntityAttributeModifier modifier) { wrapperContained.addModifier(modifier.wrapperContained); }
// public static void addModifier(yarnwrap.entity.attribute.EntityAttributeModifier modifier, ) { net.minecraft.entity.attribute.EntityAttributeInstance.addModifier(modifier.wrapperContained); }
public yarnwrap.registry.entry.RegistryEntry getAttribute() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getAttribute()); }
// public static yarnwrap.registry.entry.RegistryEntry getAttribute() { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.entity.attribute.EntityAttributeInstance.getAttribute()); }
public yarnwrap.entity.attribute.EntityAttributeModifier getModifier(yarnwrap.util.Identifier id) { return new yarnwrap.entity.attribute.EntityAttributeModifier(wrapperContained.getModifier(id.wrapperContained)); }
// public static yarnwrap.entity.attribute.EntityAttributeModifier getModifier(yarnwrap.util.Identifier id, ) { return new yarnwrap.entity.attribute.EntityAttributeModifier(net.minecraft.entity.attribute.EntityAttributeInstance.getModifier(id.wrapperContained)); }
public boolean removeModifier(yarnwrap.util.Identifier id) { return wrapperContained.removeModifier(id.wrapperContained); }
// public static boolean removeModifier(yarnwrap.util.Identifier id, ) { return net.minecraft.entity.attribute.EntityAttributeInstance.removeModifier(id.wrapperContained); }
public double getBaseValue() { return wrapperContained.getBaseValue(); }
// public static double getBaseValue() { return net.minecraft.entity.attribute.EntityAttributeInstance.getBaseValue(); }
public void removeModifier(yarnwrap.entity.attribute.EntityAttributeModifier modifier) { wrapperContained.removeModifier(modifier.wrapperContained); }
// public static void removeModifier(yarnwrap.entity.attribute.EntityAttributeModifier modifier, ) { net.minecraft.entity.attribute.EntityAttributeInstance.removeModifier(modifier.wrapperContained); }
public void clearModifiers() { wrapperContained.clearModifiers(); }
// public static void clearModifiers() { net.minecraft.entity.attribute.EntityAttributeInstance.clearModifiers(); }

}