package yarnwrap.datafixer.fix;
public class BlockEntityIdFix { public net.minecraft.datafixer.fix.BlockEntityIdFix wrapperContained; public BlockEntityIdFix(net.minecraft.datafixer.fix.BlockEntityIdFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map RENAMED_BLOCK_ENTITIES() { return wrapperContained.RENAMED_BLOCK_ENTITIES; }
// public void RENAMED_BLOCK_ENTITIES(java.util.Map value) { wrapperContained.RENAMED_BLOCK_ENTITIES = value; }
public BlockEntityIdFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.BlockEntityIdFix(outputSchema,changesType); }
// public void method_15575(java.util.HashMap map) { wrapperContained.method_15575(map); }
// public java.lang.String method_15577(java.lang.String oldName) { return wrapperContained.method_15577(oldName); }

}