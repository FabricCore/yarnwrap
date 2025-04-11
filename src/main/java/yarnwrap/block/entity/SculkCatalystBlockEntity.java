package yarnwrap.block.entity;
public class SculkCatalystBlockEntity { public net.minecraft.block.entity.SculkCatalystBlockEntity wrapperContained; public SculkCatalystBlockEntity(net.minecraft.block.entity.SculkCatalystBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object eventListener() { return wrapperContained.eventListener; }
// // public void eventListener(Object value) { wrapperContained.eventListener = value; }
public void tick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.SculkCatalystBlockEntity blockEntity) { wrapperContained.tick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }

}