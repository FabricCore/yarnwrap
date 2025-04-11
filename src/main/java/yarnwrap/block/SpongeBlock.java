package yarnwrap.block;
public class SpongeBlock { public net.minecraft.block.SpongeBlock wrapperContained; public SpongeBlock(net.minecraft.block.SpongeBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public int ABSORB_RADIUS() { return wrapperContained.ABSORB_RADIUS; }
// public void ABSORB_RADIUS(int value) { wrapperContained.ABSORB_RADIUS = value; }
public int ABSORB_LIMIT() { return wrapperContained.ABSORB_LIMIT; }
// public void ABSORB_LIMIT(int value) { wrapperContained.ABSORB_LIMIT = value; }
// public net.minecraft.util.math.Direction[] DIRECTIONS() { return wrapperContained.DIRECTIONS; }
// public void DIRECTIONS(net.minecraft.util.math.Direction[] value) { wrapperContained.DIRECTIONS = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public boolean absorbWater(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.absorbWater(world.wrapperContained,pos.wrapperContained); }
// public void update(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { wrapperContained.update(world.wrapperContained,pos.wrapperContained); }
// public boolean method_49829(yarnwrap.util.math.BlockPos currentPos) { return wrapperContained.method_49829(currentPos.wrapperContained); }
// public void method_49830(yarnwrap.util.math.BlockPos currentPos,java.util.function.Consumer queuer) { wrapperContained.method_49830(currentPos.wrapperContained,queuer); }

}