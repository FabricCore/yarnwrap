package yarnwrap.structure;
public class OceanRuinGenerator { public net.minecraft.structure.OceanRuinGenerator wrapperContained; public OceanRuinGenerator(net.minecraft.structure.OceanRuinGenerator wrapperContained) { this.wrapperContained = wrapperContained; }

// public net.minecraft.util.Identifier[] BIG_WARM_RUINS() { return wrapperContained.BIG_WARM_RUINS; }
// public void BIG_WARM_RUINS(net.minecraft.util.Identifier[] value) { wrapperContained.BIG_WARM_RUINS = value; }
// public net.minecraft.util.Identifier[] BIG_BRICK_RUINS() { return wrapperContained.BIG_BRICK_RUINS; }
// public void BIG_BRICK_RUINS(net.minecraft.util.Identifier[] value) { wrapperContained.BIG_BRICK_RUINS = value; }
// public net.minecraft.util.Identifier[] BIG_MOSSY_RUINS() { return wrapperContained.BIG_MOSSY_RUINS; }
// public void BIG_MOSSY_RUINS(net.minecraft.util.Identifier[] value) { wrapperContained.BIG_MOSSY_RUINS = value; }
// public net.minecraft.util.Identifier[] BRICK_RUINS() { return wrapperContained.BRICK_RUINS; }
// public void BRICK_RUINS(net.minecraft.util.Identifier[] value) { wrapperContained.BRICK_RUINS = value; }
// public net.minecraft.util.Identifier[] CRACKED_RUINS() { return wrapperContained.CRACKED_RUINS; }
// public void CRACKED_RUINS(net.minecraft.util.Identifier[] value) { wrapperContained.CRACKED_RUINS = value; }
// public net.minecraft.util.Identifier[] BIG_CRACKED_RUINS() { return wrapperContained.BIG_CRACKED_RUINS; }
// public void BIG_CRACKED_RUINS(net.minecraft.util.Identifier[] value) { wrapperContained.BIG_CRACKED_RUINS = value; }
// public net.minecraft.util.Identifier[] WARM_RUINS() { return wrapperContained.WARM_RUINS; }
// public void WARM_RUINS(net.minecraft.util.Identifier[] value) { wrapperContained.WARM_RUINS = value; }
// public net.minecraft.util.Identifier[] MOSSY_RUINS() { return wrapperContained.MOSSY_RUINS; }
// public void MOSSY_RUINS(net.minecraft.util.Identifier[] value) { wrapperContained.MOSSY_RUINS = value; }
// public yarnwrap.structure.processor.StructureProcessor SUSPICIOUS_SAND_PROCESSOR() { return new yarnwrap.structure.processor.StructureProcessor(wrapperContained.SUSPICIOUS_SAND_PROCESSOR); }
// public void SUSPICIOUS_SAND_PROCESSOR(yarnwrap.structure.processor.StructureProcessor value) { wrapperContained.SUSPICIOUS_SAND_PROCESSOR = value.wrapperContained; }
// public yarnwrap.structure.processor.StructureProcessor SUSPICIOUS_GRAVEL_PROCESSOR() { return new yarnwrap.structure.processor.StructureProcessor(wrapperContained.SUSPICIOUS_GRAVEL_PROCESSOR); }
// public void SUSPICIOUS_GRAVEL_PROCESSOR(yarnwrap.structure.processor.StructureProcessor value) { wrapperContained.SUSPICIOUS_GRAVEL_PROCESSOR = value.wrapperContained; }
// public java.util.List getRoomPositions(yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos pos) { return wrapperContained.getRoomPositions(random.wrapperContained,pos.wrapperContained); }
// public void addPieces(yarnwrap.structure.StructureTemplateManager manager,yarnwrap.util.math.BlockPos pos,yarnwrap.util.BlockRotation rotation,yarnwrap.structure.StructurePiecesHolder holder,yarnwrap.util.math.random.Random random,yarnwrap.world.gen.structure.OceanRuinStructure structure,boolean large,float integrity) { wrapperContained.addPieces(manager.wrapperContained,pos.wrapperContained,rotation.wrapperContained,holder.wrapperContained,random.wrapperContained,structure.wrapperContained,large,integrity); }
// public yarnwrap.util.Identifier getRandomWarmRuin(yarnwrap.util.math.random.Random random) { return new yarnwrap.util.Identifier(wrapperContained.getRandomWarmRuin(random.wrapperContained)); }
// public void addCluster(yarnwrap.structure.StructureTemplateManager manager,yarnwrap.util.math.random.Random random,yarnwrap.util.BlockRotation rotation,yarnwrap.util.math.BlockPos pos,yarnwrap.world.gen.structure.OceanRuinStructure structure,yarnwrap.structure.StructurePiecesHolder pieces) { wrapperContained.addCluster(manager.wrapperContained,random.wrapperContained,rotation.wrapperContained,pos.wrapperContained,structure.wrapperContained,pieces.wrapperContained); }
// public yarnwrap.util.Identifier getRandomBigWarmRuin(yarnwrap.util.math.random.Random random) { return new yarnwrap.util.Identifier(wrapperContained.getRandomBigWarmRuin(random.wrapperContained)); }
public void addPieces(yarnwrap.structure.StructureTemplateManager manager,yarnwrap.util.math.BlockPos pos,yarnwrap.util.BlockRotation rotation,yarnwrap.structure.StructurePiecesHolder holder,yarnwrap.util.math.random.Random random,yarnwrap.world.gen.structure.OceanRuinStructure structure) { wrapperContained.addPieces(manager.wrapperContained,pos.wrapperContained,rotation.wrapperContained,holder.wrapperContained,random.wrapperContained,structure.wrapperContained); }
// public yarnwrap.structure.processor.StructureProcessor createArchaeologyStructureProcessor(yarnwrap.block.Block baseBlock,yarnwrap.block.Block suspiciousBlock,yarnwrap.registry.RegistryKey lootTable) { return new yarnwrap.structure.processor.StructureProcessor(wrapperContained.createArchaeologyStructureProcessor(baseBlock.wrapperContained,suspiciousBlock.wrapperContained,lootTable.wrapperContained)); }

}