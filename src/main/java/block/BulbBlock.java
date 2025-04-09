package yarnwrap.block;
public class BulbBlock { public net.minecraft.block.BulbBlock wrapperContained; public BulbBlock(net.minecraft.block.BulbBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.state.property.BooleanProperty POWERED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.POWERED); }
public yarnwrap.state.property.BooleanProperty LIT() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.LIT); }
public void update(yarnwrap.block.BlockState state,yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos) { wrapperContained.update(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }

}