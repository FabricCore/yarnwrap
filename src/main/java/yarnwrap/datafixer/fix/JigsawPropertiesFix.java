package yarnwrap.datafixer.fix;
public class JigsawPropertiesFix { public net.minecraft.datafixer.fix.JigsawPropertiesFix wrapperContained; public JigsawPropertiesFix(net.minecraft.datafixer.fix.JigsawPropertiesFix wrapperContained) { this.wrapperContained = wrapperContained; }

public JigsawPropertiesFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.JigsawPropertiesFix(outputSchema,changesType); }
// public com.mojang.serialization.Dynamic renameProperties(com.mojang.serialization.Dynamic blockEntityDynamic) { return wrapperContained.renameProperties(blockEntityDynamic); }
// public static com.mojang.serialization.Dynamic renameProperties(com.mojang.serialization.Dynamic blockEntityDynamic, ) { return net.minecraft.datafixer.fix.JigsawPropertiesFix.renameProperties(blockEntityDynamic); }

}