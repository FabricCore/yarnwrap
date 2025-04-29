package yarnwrap.datafixer.fix;
public class EntityShulkerColorFix { public net.minecraft.datafixer.fix.EntityShulkerColorFix wrapperContained; public EntityShulkerColorFix(net.minecraft.datafixer.fix.EntityShulkerColorFix wrapperContained) { this.wrapperContained = wrapperContained; }

public EntityShulkerColorFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.EntityShulkerColorFix(outputSchema,changesType); }
public com.mojang.serialization.Dynamic fixShulkerColor(com.mojang.serialization.Dynamic shulkerDynamic) { return wrapperContained.fixShulkerColor(shulkerDynamic); }
// public static com.mojang.serialization.Dynamic fixShulkerColor(com.mojang.serialization.Dynamic shulkerDynamic, ) { return net.minecraft.datafixer.fix.EntityShulkerColorFix.fixShulkerColor(shulkerDynamic); }

}