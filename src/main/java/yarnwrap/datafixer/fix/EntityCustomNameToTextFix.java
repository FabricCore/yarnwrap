package yarnwrap.datafixer.fix;
public class EntityCustomNameToTextFix { public net.minecraft.datafixer.fix.EntityCustomNameToTextFix wrapperContained; public EntityCustomNameToTextFix(net.minecraft.datafixer.fix.EntityCustomNameToTextFix wrapperContained) { this.wrapperContained = wrapperContained; }

public EntityCustomNameToTextFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.EntityCustomNameToTextFix(outputSchema,changesType); }
// public com.mojang.serialization.Dynamic fixCustomName(com.mojang.serialization.Dynamic entityDynamic) { return wrapperContained.fixCustomName(entityDynamic); }
// public static com.mojang.serialization.Dynamic fixCustomName(com.mojang.serialization.Dynamic entityDynamic, ) { return net.minecraft.datafixer.fix.EntityCustomNameToTextFix.fixCustomName(entityDynamic); }
// public com.mojang.datafixers.Typed method_15698(com.mojang.datafixers.OpticFinder entityTyped) { return wrapperContained.method_15698(entityTyped); }
// public static com.mojang.datafixers.Typed method_15698(com.mojang.datafixers.OpticFinder entityTyped, ) { return net.minecraft.datafixer.fix.EntityCustomNameToTextFix.method_15698(entityTyped); }
// public com.mojang.serialization.Dynamic method_15699(com.mojang.datafixers.Typed entityDynamic) { return wrapperContained.method_15699(entityDynamic); }
// public static com.mojang.serialization.Dynamic method_15699(com.mojang.datafixers.Typed entityDynamic, ) { return net.minecraft.datafixer.fix.EntityCustomNameToTextFix.method_15699(entityDynamic); }

}