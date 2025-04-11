package yarnwrap.datafixer.fix;
public class ColorlessShulkerEntityFix { public net.minecraft.datafixer.fix.ColorlessShulkerEntityFix wrapperContained; public ColorlessShulkerEntityFix(net.minecraft.datafixer.fix.ColorlessShulkerEntityFix wrapperContained) { this.wrapperContained = wrapperContained; }

public ColorlessShulkerEntityFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.ColorlessShulkerEntityFix(outputSchema,changesType); }
// public com.mojang.serialization.Dynamic method_15678(com.mojang.serialization.Dynamic shulkerDynamic) { return wrapperContained.method_15678(shulkerDynamic); }

}