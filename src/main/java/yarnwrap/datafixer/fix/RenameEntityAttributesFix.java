package yarnwrap.datafixer.fix;
public class RenameEntityAttributesFix { public net.minecraft.datafixer.fix.RenameEntityAttributesFix wrapperContained; public RenameEntityAttributesFix(net.minecraft.datafixer.fix.RenameEntityAttributesFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.UnaryOperator renames() { return wrapperContained.renames; }
// public void renames(java.util.function.UnaryOperator value) { wrapperContained.renames = value; }
// public java.lang.String description() { return wrapperContained.description; }
// public void description(java.lang.String value) { wrapperContained.description = value; }
public RenameEntityAttributesFix(com.mojang.datafixers.schemas.Schema outputSchema,java.lang.String description,java.util.function.UnaryOperator renames) { this.wrapperContained = new net.minecraft.datafixer.fix.RenameEntityAttributesFix(outputSchema,description,renames); }
// public com.mojang.serialization.Dynamic updateAttributeName(com.mojang.serialization.Dynamic attributeNameDynamic) { return wrapperContained.updateAttributeName(attributeNameDynamic); }
// public com.mojang.datafixers.Typed method_26809(com.mojang.datafixers.OpticFinder itemStackTyped) { return wrapperContained.method_26809(itemStackTyped); }
// public com.mojang.datafixers.Typed updateAttributeModifiers(com.mojang.datafixers.Typed tagTyped) { return wrapperContained.updateAttributeModifiers(tagTyped); }
// public com.mojang.datafixers.Typed updateEntityAttributes(com.mojang.datafixers.Typed entityTyped) { return wrapperContained.updateEntityAttributes(entityTyped); }
// public java.util.stream.Stream method_28162(java.util.stream.Stream attributes) { return wrapperContained.method_28162(attributes); }
// public com.mojang.serialization.Dynamic method_28163(com.mojang.serialization.Dynamic entityDynamic) { return wrapperContained.method_28163(entityDynamic); }
// public java.util.stream.Stream method_28164(java.util.stream.Stream attributeModifiers) { return wrapperContained.method_28164(attributeModifiers); }
// public com.mojang.serialization.Dynamic method_28165(com.mojang.serialization.Dynamic attributesDynamic) { return wrapperContained.method_28165(attributesDynamic); }
// public com.mojang.serialization.Dynamic method_28166(com.mojang.serialization.Dynamic attributeDynamic) { return wrapperContained.method_28166(attributeDynamic); }
// public com.mojang.serialization.Dynamic method_28167(com.mojang.serialization.Dynamic tagDynamic) { return wrapperContained.method_28167(tagDynamic); }
// public com.mojang.serialization.Dynamic method_28168(com.mojang.serialization.Dynamic attributeModifiersDynamic) { return wrapperContained.method_28168(attributeModifiersDynamic); }
// public com.mojang.serialization.Dynamic method_28169(com.mojang.serialization.Dynamic attributeModifierDynamic) { return wrapperContained.method_28169(attributeModifierDynamic); }

}