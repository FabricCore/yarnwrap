package yarnwrap.datafixer.fix;
public class AttributeIdFix { public net.minecraft.datafixer.fix.AttributeIdFix wrapperContained; public AttributeIdFix(net.minecraft.datafixer.fix.AttributeIdFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map UUID_TO_ID() { return wrapperContained.UUID_TO_ID; }
// public void UUID_TO_ID(java.util.Map value) { wrapperContained.UUID_TO_ID = value; }
// public java.util.Map NAME_TO_ID() { return wrapperContained.NAME_TO_ID; }
// public void NAME_TO_ID(java.util.Map value) { wrapperContained.NAME_TO_ID = value; }
public AttributeIdFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.AttributeIdFix(outputSchema); }
// public com.mojang.datafixers.Typed fixEntity(com.mojang.datafixers.Typed entityTyped) { return wrapperContained.fixEntity(entityTyped); }
// public com.mojang.serialization.Dynamic renameOtherFields(com.mojang.serialization.Dynamic attributeDynamic) { return wrapperContained.renameOtherFields(attributeDynamic); }
// public com.mojang.serialization.Dynamic method_60681(com.mojang.serialization.Dynamic modifiersDynamic) { return wrapperContained.method_60681(modifiersDynamic); }
// public void method_60682(java.util.Map modifierDynamic) { wrapperContained.method_60682(modifierDynamic); }
// public java.util.UUID getUuidFromIntArray(int uuidArray) { return wrapperContained.getUuidFromIntArray(uuidArray); }
// public com.mojang.serialization.Dynamic fixItemStack(com.mojang.serialization.Dynamic stackDataDynamic) { return wrapperContained.fixItemStack(stackDataDynamic); }
// public java.util.stream.Stream fixModifiers(java.util.stream.Stream dynamicStream) { return wrapperContained.fixModifiers(dynamicStream); }
// public com.mojang.serialization.Dynamic fixAttribute(com.mojang.serialization.Dynamic attributeDynamic) { return wrapperContained.fixAttribute(attributeDynamic); }
// public com.mojang.serialization.Dynamic method_60690(com.mojang.serialization.Dynamic remainder) { return wrapperContained.method_60690(remainder); }
// public com.mojang.serialization.Dynamic method_60692(com.mojang.serialization.Dynamic attributesDynamic) { return wrapperContained.method_60692(attributesDynamic); }
// public com.mojang.serialization.Dynamic method_60693(com.mojang.serialization.Dynamic attributeModifiersDynamic) { return wrapperContained.method_60693(attributeModifiersDynamic); }
// public com.mojang.serialization.Dynamic method_60694(com.mojang.serialization.Dynamic modifiersDynamic) { return wrapperContained.method_60694(modifiersDynamic); }
// public com.mojang.serialization.Dynamic method_60695(com.mojang.serialization.Dynamic operationDynamic) { return wrapperContained.method_60695(operationDynamic); }

}