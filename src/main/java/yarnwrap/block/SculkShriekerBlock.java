package yarnwrap.block;
public class SculkShriekerBlock { public net.minecraft.block.SculkShriekerBlock wrapperContained; public SculkShriekerBlock(net.minecraft.block.SculkShriekerBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.BooleanProperty SHRIEKING() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.SHRIEKING); }
// public void SHRIEKING(yarnwrap.state.property.BooleanProperty value) { wrapperContained.SHRIEKING = value.wrapperContained; }
public yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WATERLOGGED); }
// public void WATERLOGGED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.WATERLOGGED = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
// public void SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.SHAPE = value.wrapperContained; }
public double TOP() { return wrapperContained.TOP; }
// public void TOP(double value) { wrapperContained.TOP = value; }
public yarnwrap.state.property.BooleanProperty CAN_SUMMON() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.CAN_SUMMON); }
// public void CAN_SUMMON(yarnwrap.state.property.BooleanProperty value) { wrapperContained.CAN_SUMMON = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public void method_42317(yarnwrap.world.World worldx,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState statex,yarnwrap.block.entity.SculkShriekerBlockEntity blockEntity) { wrapperContained.method_42317(worldx.wrapperContained,pos.wrapperContained,statex.wrapperContained,blockEntity.wrapperContained); }
// public void method_43132(yarnwrap.server.world.ServerWorld blockEntity) { wrapperContained.method_43132(blockEntity.wrapperContained); }
// public void method_43133(yarnwrap.server.world.ServerWorld blockEntity) { wrapperContained.method_43133(blockEntity.wrapperContained); }
// public void method_43134(yarnwrap.server.world.ServerWorld blockEntity) { wrapperContained.method_43134(blockEntity.wrapperContained); }

}