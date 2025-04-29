package yarnwrap.datafixer.fix;
public class EntityEquipmentToArmorAndHandFix { public net.minecraft.datafixer.fix.EntityEquipmentToArmorAndHandFix wrapperContained; public EntityEquipmentToArmorAndHandFix(net.minecraft.datafixer.fix.EntityEquipmentToArmorAndHandFix wrapperContained) { this.wrapperContained = wrapperContained; }

public EntityEquipmentToArmorAndHandFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.EntityEquipmentToArmorAndHandFix(outputSchema,changesType); }
// public com.mojang.datafixers.Typed method_15700(com.mojang.datafixers.OpticFinder entityTyped) { return wrapperContained.method_15700(entityTyped); }
// public static com.mojang.datafixers.Typed method_15700(com.mojang.datafixers.OpticFinder entityTyped, ) { return net.minecraft.datafixer.fix.EntityEquipmentToArmorAndHandFix.method_15700(entityTyped); }
// public com.mojang.datafixers.TypeRewriteRule fixEquipment(com.mojang.datafixers.types.Type itemStackType) { return wrapperContained.fixEquipment(itemStackType); }
// public static com.mojang.datafixers.TypeRewriteRule fixEquipment(com.mojang.datafixers.types.Type itemStackType, ) { return net.minecraft.datafixer.fix.EntityEquipmentToArmorAndHandFix.fixEquipment(itemStackType); }

}