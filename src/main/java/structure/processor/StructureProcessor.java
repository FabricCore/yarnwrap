package yarnwrap.structure.processor;
public class StructureProcessor { public net.minecraft.structure.processor.StructureProcessor wrapperContained; public StructureProcessor(net.minecraft.structure.processor.StructureProcessor wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object process(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.BlockPos pivot,Object originalBlockInfo,Object currentBlockInfo,yarnwrap.structure.StructurePlacementData data) { return wrapperContained.process(world.wrapperContained,pos.wrapperContained,pivot.wrapperContained,originalBlockInfo,currentBlockInfo,data.wrapperContained); }
// public yarnwrap.structure.processor.StructureProcessorType getType() { return new yarnwrap.structure.processor.StructureProcessorType(wrapperContained.getType()); }
public java.util.List reprocess(yarnwrap.world.ServerWorldAccess world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.BlockPos pivot,java.util.List originalBlockInfos,java.util.List currentBlockInfos,yarnwrap.structure.StructurePlacementData data) { return wrapperContained.reprocess(world.wrapperContained,pos.wrapperContained,pivot.wrapperContained,originalBlockInfos,currentBlockInfos,data.wrapperContained); }

}