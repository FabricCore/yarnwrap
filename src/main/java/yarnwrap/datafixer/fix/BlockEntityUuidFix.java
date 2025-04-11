package yarnwrap.datafixer.fix;
public class BlockEntityUuidFix { public net.minecraft.datafixer.fix.BlockEntityUuidFix wrapperContained; public BlockEntityUuidFix(net.minecraft.datafixer.fix.BlockEntityUuidFix wrapperContained) { this.wrapperContained = wrapperContained; }

public BlockEntityUuidFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.BlockEntityUuidFix(outputSchema); }
// public com.mojang.serialization.Dynamic method_26015(com.mojang.serialization.Dynamic ownerDynamic) { return wrapperContained.method_26015(ownerDynamic); }
// public com.mojang.serialization.Dynamic updateSkull(com.mojang.serialization.Dynamic skullDynamic) { return wrapperContained.updateSkull(skullDynamic); }
// public com.mojang.serialization.Dynamic updateConduit(com.mojang.serialization.Dynamic conduitDynamic) { return wrapperContained.updateConduit(conduitDynamic); }
// public com.mojang.serialization.Dynamic method_26019(com.mojang.serialization.Dynamic ownerDynamic) { return wrapperContained.method_26019(ownerDynamic); }

}