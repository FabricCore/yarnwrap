package yarnwrap.structure;
public class ShipwreckGenerator { public net.minecraft.structure.ShipwreckGenerator wrapperContained; public ShipwreckGenerator(net.minecraft.structure.ShipwreckGenerator wrapperContained) { this.wrapperContained = wrapperContained; }

// public net.minecraft.util.Identifier[] BEACHED_TEMPLATES() { return wrapperContained.BEACHED_TEMPLATES; }
// public void BEACHED_TEMPLATES(net.minecraft.util.Identifier[] value) { wrapperContained.BEACHED_TEMPLATES = value; }
// public net.minecraft.util.Identifier[] REGULAR_TEMPLATES() { return wrapperContained.REGULAR_TEMPLATES; }
// public void REGULAR_TEMPLATES(net.minecraft.util.Identifier[] value) { wrapperContained.REGULAR_TEMPLATES = value; }
// public yarnwrap.util.math.BlockPos DEFAULT_POSITION() { return new yarnwrap.util.math.BlockPos(wrapperContained.DEFAULT_POSITION); }
// public void DEFAULT_POSITION(yarnwrap.util.math.BlockPos value) { wrapperContained.DEFAULT_POSITION = value.wrapperContained; }
// public java.util.Map LOOT_TABLES() { return wrapperContained.LOOT_TABLES; }
// public void LOOT_TABLES(java.util.Map value) { wrapperContained.LOOT_TABLES = value; }
// public int LARGE_SIZE_LIMIT() { return wrapperContained.LARGE_SIZE_LIMIT; }
// public void LARGE_SIZE_LIMIT(int value) { wrapperContained.LARGE_SIZE_LIMIT = value; }
public Object addParts(yarnwrap.structure.StructureTemplateManager structureTemplateManager,yarnwrap.util.math.BlockPos pos,yarnwrap.util.BlockRotation rotation,yarnwrap.structure.StructurePiecesHolder holder,yarnwrap.util.math.random.Random random,boolean beached) { return wrapperContained.addParts(structureTemplateManager.wrapperContained,pos.wrapperContained,rotation.wrapperContained,holder.wrapperContained,random.wrapperContained,beached); }

}