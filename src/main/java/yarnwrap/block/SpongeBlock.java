package yarnwrap.block;
public class SpongeBlock { public net.minecraft.block.SpongeBlock wrapperContained; public SpongeBlock(net.minecraft.block.SpongeBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public int ABSORB_RADIUS() { return wrapperContained.ABSORB_RADIUS; }
// public void ABSORB_RADIUS(int value) { wrapperContained.ABSORB_RADIUS = value; }
public static int ABSORB_RADIUS() { return net.minecraft.block.SpongeBlock.ABSORB_RADIUS; }
// public static void ABSORB_RADIUS(int value, ) { net.minecraft.block.SpongeBlock.ABSORB_RADIUS = value; }

// public int ABSORB_LIMIT() { return wrapperContained.ABSORB_LIMIT; }
// public void ABSORB_LIMIT(int value) { wrapperContained.ABSORB_LIMIT = value; }
public static int ABSORB_LIMIT() { return net.minecraft.block.SpongeBlock.ABSORB_LIMIT; }
// public static void ABSORB_LIMIT(int value, ) { net.minecraft.block.SpongeBlock.ABSORB_LIMIT = value; }

// public net.minecraft.util.math.Direction[] DIRECTIONS() { return wrapperContained.DIRECTIONS; }
// public void DIRECTIONS(net.minecraft.util.math.Direction[] value) { wrapperContained.DIRECTIONS = value; }
// public static net.minecraft.util.math.Direction[] DIRECTIONS() { return net.minecraft.block.SpongeBlock.DIRECTIONS; }
// public static void DIRECTIONS(net.minecraft.util.math.Direction[] value, ) { net.minecraft.block.SpongeBlock.DIRECTIONS = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.SpongeBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.SpongeBlock.CODEC = value; }

// public boolean absorbWater(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.absorbWater(world.wrapperContained,pos.wrapperContained); }
// public static boolean absorbWater(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.block.SpongeBlock.absorbWater(world.wrapperContained,pos.wrapperContained); }
// public void update(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { wrapperContained.update(world.wrapperContained,pos.wrapperContained); }
// public static void update(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos, ) { net.minecraft.block.SpongeBlock.update(world.wrapperContained,pos.wrapperContained); }
// public Object method_49829(yarnwrap.util.math.BlockPos currentPos) { return wrapperContained.method_49829(currentPos.wrapperContained); }
// public static Object method_49829(yarnwrap.util.math.BlockPos currentPos, ) { return net.minecraft.block.SpongeBlock.method_49829(currentPos.wrapperContained); }
// public void method_49830(yarnwrap.util.math.BlockPos currentPos,java.util.function.Consumer queuer) { wrapperContained.method_49830(currentPos.wrapperContained,queuer); }
// public static void method_49830(yarnwrap.util.math.BlockPos currentPos,java.util.function.Consumer queuer, ) { net.minecraft.block.SpongeBlock.method_49830(currentPos.wrapperContained,queuer); }

}