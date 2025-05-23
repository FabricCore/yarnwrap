package yarnwrap.datafixer.fix;
public class BlockEntityIdFix { public net.minecraft.datafixer.fix.BlockEntityIdFix wrapperContained; public BlockEntityIdFix(net.minecraft.datafixer.fix.BlockEntityIdFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map RENAMED_BLOCK_ENTITIES() { return wrapperContained.RENAMED_BLOCK_ENTITIES; }
// public void RENAMED_BLOCK_ENTITIES(java.util.Map value) { wrapperContained.RENAMED_BLOCK_ENTITIES = value; }
public static java.util.Map RENAMED_BLOCK_ENTITIES() { return net.minecraft.datafixer.fix.BlockEntityIdFix.RENAMED_BLOCK_ENTITIES; }
// public static void RENAMED_BLOCK_ENTITIES(java.util.Map value, ) { net.minecraft.datafixer.fix.BlockEntityIdFix.RENAMED_BLOCK_ENTITIES = value; }

// public void method_15575(java.util.HashMap map) { wrapperContained.method_15575(map); }
// public static void method_15575(java.util.HashMap map, ) { net.minecraft.datafixer.fix.BlockEntityIdFix.method_15575(map); }
// public java.lang.String method_15577(java.lang.String oldName) { return wrapperContained.method_15577(oldName); }
// public static java.lang.String method_15577(java.lang.String oldName, ) { return net.minecraft.datafixer.fix.BlockEntityIdFix.method_15577(oldName); }

}