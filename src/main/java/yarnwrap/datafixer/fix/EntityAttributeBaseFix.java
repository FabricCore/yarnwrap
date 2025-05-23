package yarnwrap.datafixer.fix;
public class EntityAttributeBaseFix { public net.minecraft.datafixer.fix.EntityAttributeBaseFix wrapperContained; public EntityAttributeBaseFix(net.minecraft.datafixer.fix.EntityAttributeBaseFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String attributeId() { return wrapperContained.attributeId; }
// public void attributeId(java.lang.String value) { wrapperContained.attributeId = value; }
// public static java.lang.String attributeId() { return net.minecraft.datafixer.fix.EntityAttributeBaseFix.attributeId; }
// public static void attributeId(java.lang.String value, ) { net.minecraft.datafixer.fix.EntityAttributeBaseFix.attributeId = value; }

// public java.util.function.DoubleUnaryOperator fixOperator() { return wrapperContained.fixOperator; }
// public void fixOperator(java.util.function.DoubleUnaryOperator value) { wrapperContained.fixOperator = value; }
// public static java.util.function.DoubleUnaryOperator fixOperator() { return net.minecraft.datafixer.fix.EntityAttributeBaseFix.fixOperator; }
// public static void fixOperator(java.util.function.DoubleUnaryOperator value, ) { net.minecraft.datafixer.fix.EntityAttributeBaseFix.fixOperator = value; }

public EntityAttributeBaseFix(com.mojang.datafixers.schemas.Schema outputSchema,java.lang.String name,java.lang.String entityId,java.lang.String attributeId,java.util.function.DoubleUnaryOperator fixOperator) { this.wrapperContained = new net.minecraft.datafixer.fix.EntityAttributeBaseFix(outputSchema,name,entityId,attributeId,fixOperator); }
// public com.mojang.serialization.Dynamic fix(com.mojang.serialization.Dynamic dynamic) { return wrapperContained.fix(dynamic); }
// public static com.mojang.serialization.Dynamic fix(com.mojang.serialization.Dynamic dynamic, ) { return net.minecraft.datafixer.fix.EntityAttributeBaseFix.fix(dynamic); }
// public com.mojang.serialization.Dynamic method_65959(com.mojang.serialization.Dynamic attributesDynamic) { return wrapperContained.method_65959(attributesDynamic); }
// public static com.mojang.serialization.Dynamic method_65959(com.mojang.serialization.Dynamic attributesDynamic, ) { return net.minecraft.datafixer.fix.EntityAttributeBaseFix.method_65959(attributesDynamic); }
// public com.mojang.serialization.Dynamic method_65960(com.mojang.serialization.Dynamic attributeDynamic) { return wrapperContained.method_65960(attributeDynamic); }
// public static com.mojang.serialization.Dynamic method_65960(com.mojang.serialization.Dynamic attributeDynamic, ) { return net.minecraft.datafixer.fix.EntityAttributeBaseFix.method_65960(attributeDynamic); }

}