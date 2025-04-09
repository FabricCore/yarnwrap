package yarnwrap.world;
public class StructureWorldAccess { public net.minecraft.world.StructureWorldAccess wrapperContained; public StructureWorldAccess(net.minecraft.world.StructureWorldAccess wrapperContained) { this.wrapperContained = wrapperContained; }

public void setCurrentlyGeneratingStructureName(java.util.function.Supplier structureName) { wrapperContained.setCurrentlyGeneratingStructureName(structureName); }
public boolean isValidForSetBlock(yarnwrap.util.math.BlockPos pos) { return wrapperContained.isValidForSetBlock(pos.wrapperContained); }
public long getSeed() { return wrapperContained.getSeed(); }

}