package yarnwrap.world;
public class StructureWorldAccess { public net.minecraft.world.StructureWorldAccess wrapperContained; public StructureWorldAccess(net.minecraft.world.StructureWorldAccess wrapperContained) { this.wrapperContained = wrapperContained; }

public long getSeed() { return wrapperContained.getSeed(); }
// public static long getSeed() { return net.minecraft.world.StructureWorldAccess.getSeed(); }
public void setCurrentlyGeneratingStructureName(java.util.function.Supplier structureName) { wrapperContained.setCurrentlyGeneratingStructureName(structureName); }
// public static void setCurrentlyGeneratingStructureName(java.util.function.Supplier structureName, ) { net.minecraft.world.StructureWorldAccess.setCurrentlyGeneratingStructureName(structureName); }
public boolean isValidForSetBlock(yarnwrap.util.math.BlockPos pos) { return wrapperContained.isValidForSetBlock(pos.wrapperContained); }
// public static boolean isValidForSetBlock(yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.world.StructureWorldAccess.isValidForSetBlock(pos.wrapperContained); }

}