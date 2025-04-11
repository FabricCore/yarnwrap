package yarnwrap.datafixer.fix;
public class WolfHealthFix { public net.minecraft.datafixer.fix.WolfHealthFix wrapperContained; public WolfHealthFix(net.minecraft.datafixer.fix.WolfHealthFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String WOLF_ENTITY_ID() { return wrapperContained.WOLF_ENTITY_ID; }
// public void WOLF_ENTITY_ID(java.lang.String value) { wrapperContained.WOLF_ENTITY_ID = value; }
// public java.lang.String MAX_HEALTH_ATTRIBUTE_ID() { return wrapperContained.MAX_HEALTH_ATTRIBUTE_ID; }
// public void MAX_HEALTH_ATTRIBUTE_ID(java.lang.String value) { wrapperContained.MAX_HEALTH_ATTRIBUTE_ID = value; }
public WolfHealthFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.WolfHealthFix(outputSchema); }
// public com.mojang.serialization.Dynamic method_56948(com.mojang.serialization.Dynamic wolfDynamic) { return wrapperContained.method_56948(wolfDynamic); }
// public com.mojang.serialization.Dynamic method_56949(org.apache.commons.lang3.mutable.MutableBoolean attributesDynamic) { return wrapperContained.method_56949(attributesDynamic); }
// public com.mojang.serialization.Dynamic method_56950(com.mojang.serialization.Dynamic healthDynamic) { return wrapperContained.method_56950(healthDynamic); }
// public com.mojang.serialization.Dynamic method_56951(org.apache.commons.lang3.mutable.MutableBoolean attributeDynamic) { return wrapperContained.method_56951(attributeDynamic); }
// public com.mojang.serialization.Dynamic method_56952(org.apache.commons.lang3.mutable.MutableBoolean baseDynamic) { return wrapperContained.method_56952(baseDynamic); }

}