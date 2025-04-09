package yarnwrap.structure;
public class ShipwreckGenerator { public net.minecraft.structure.ShipwreckGenerator wrapperContained; public ShipwreckGenerator(net.minecraft.structure.ShipwreckGenerator wrapperContained) { this.wrapperContained = wrapperContained; }

// public net.minecraft.util.Identifier[] BEACHED_TEMPLATES() { return wrapperContained.BEACHED_TEMPLATES; }
// public net.minecraft.util.Identifier[] REGULAR_TEMPLATES() { return wrapperContained.REGULAR_TEMPLATES; }
// public yarnwrap.util.math.BlockPos DEFAULT_POSITION() { return new yarnwrap.util.math.BlockPos(wrapperContained.DEFAULT_POSITION); }
// public java.util.Map LOOT_TABLES() { return wrapperContained.LOOT_TABLES; }
// public int LARGE_SIZE_LIMIT() { return wrapperContained.LARGE_SIZE_LIMIT; }
public Object addParts(yarnwrap.structure.StructureTemplateManager structureTemplateManager,yarnwrap.util.math.BlockPos pos,yarnwrap.util.BlockRotation rotation,yarnwrap.structure.StructurePiecesHolder holder,yarnwrap.util.math.random.Random random,boolean beached) { return wrapperContained.addParts(structureTemplateManager.wrapperContained,pos.wrapperContained,rotation.wrapperContained,holder.wrapperContained,random.wrapperContained,beached); }

}