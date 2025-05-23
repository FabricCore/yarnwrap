package yarnwrap.block;
public class TntBlock { public net.minecraft.block.TntBlock wrapperContained; public TntBlock(net.minecraft.block.TntBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.BooleanProperty UNSTABLE() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.UNSTABLE); }
// public void UNSTABLE(yarnwrap.state.property.BooleanProperty value) { wrapperContained.UNSTABLE = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty UNSTABLE() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.TntBlock.UNSTABLE); }
// public static void UNSTABLE(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.TntBlock.UNSTABLE = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.TntBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.TntBlock.CODEC = value; }

// public boolean primeTnt(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.LivingEntity igniter) { return wrapperContained.primeTnt(world.wrapperContained,pos.wrapperContained,igniter.wrapperContained); }
// public static boolean primeTnt(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.LivingEntity igniter, ) { return net.minecraft.block.TntBlock.primeTnt(world.wrapperContained,pos.wrapperContained,igniter.wrapperContained); }
// public boolean primeTnt(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.primeTnt(world.wrapperContained,pos.wrapperContained); }
// public static boolean primeTnt(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.block.TntBlock.primeTnt(world.wrapperContained,pos.wrapperContained); }

}