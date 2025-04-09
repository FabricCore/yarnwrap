package yarnwrap.block;
public class StructureBlock { public net.minecraft.block.StructureBlock wrapperContained; public StructureBlock(net.minecraft.block.StructureBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.EnumProperty MODE() { return new yarnwrap.state.property.EnumProperty(wrapperContained.MODE); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void doAction(yarnwrap.server.world.ServerWorld world,yarnwrap.block.entity.StructureBlockBlockEntity blockEntity) { wrapperContained.doAction(world.wrapperContained,blockEntity.wrapperContained); }

}