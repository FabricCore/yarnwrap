package yarnwrap.datafixer.fix;
public class BlockEntityCustomNameToTextFix { public net.minecraft.datafixer.fix.BlockEntityCustomNameToTextFix wrapperContained; public BlockEntityCustomNameToTextFix(net.minecraft.datafixer.fix.BlockEntityCustomNameToTextFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Set NAMEABLE_BLOCK_ENTITY_IDS() { return wrapperContained.NAMEABLE_BLOCK_ENTITY_IDS; }
// public void NAMEABLE_BLOCK_ENTITY_IDS(java.util.Set value) { wrapperContained.NAMEABLE_BLOCK_ENTITY_IDS = value; }
// public static java.util.Set NAMEABLE_BLOCK_ENTITY_IDS() { return net.minecraft.datafixer.fix.BlockEntityCustomNameToTextFix.NAMEABLE_BLOCK_ENTITY_IDS; }
// public static void NAMEABLE_BLOCK_ENTITY_IDS(java.util.Set value, ) { net.minecraft.datafixer.fix.BlockEntityCustomNameToTextFix.NAMEABLE_BLOCK_ENTITY_IDS = value; }

public BlockEntityCustomNameToTextFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.BlockEntityCustomNameToTextFix(outputSchema); }
// public com.mojang.serialization.Dynamic fixCustomName(com.mojang.serialization.Dynamic dynamic) { return wrapperContained.fixCustomName(dynamic); }
// public static com.mojang.serialization.Dynamic fixCustomName(com.mojang.serialization.Dynamic dynamic, ) { return net.minecraft.datafixer.fix.BlockEntityCustomNameToTextFix.fixCustomName(dynamic); }

}