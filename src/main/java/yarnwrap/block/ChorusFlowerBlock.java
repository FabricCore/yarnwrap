package yarnwrap.block;
public class ChorusFlowerBlock { public net.minecraft.block.ChorusFlowerBlock wrapperContained; public ChorusFlowerBlock(net.minecraft.block.ChorusFlowerBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.IntProperty AGE() { return new yarnwrap.state.property.IntProperty(wrapperContained.AGE); }
// public void AGE(yarnwrap.state.property.IntProperty value) { wrapperContained.AGE = value.wrapperContained; }
public static yarnwrap.state.property.IntProperty AGE() { return new yarnwrap.state.property.IntProperty(net.minecraft.block.ChorusFlowerBlock.AGE); }
// public static void AGE(yarnwrap.state.property.IntProperty value, ) { net.minecraft.block.ChorusFlowerBlock.AGE = value.wrapperContained; }

// public yarnwrap.block.Block plantBlock() { return new yarnwrap.block.Block(wrapperContained.plantBlock); }
// public void plantBlock(yarnwrap.block.Block value) { wrapperContained.plantBlock = value.wrapperContained; }
// public static yarnwrap.block.Block plantBlock() { return new yarnwrap.block.Block(net.minecraft.block.ChorusFlowerBlock.plantBlock); }
// public static void plantBlock(yarnwrap.block.Block value, ) { net.minecraft.block.ChorusFlowerBlock.plantBlock = value.wrapperContained; }

// public int MAX_AGE() { return wrapperContained.MAX_AGE; }
// public void MAX_AGE(int value) { wrapperContained.MAX_AGE = value; }
public static int MAX_AGE() { return net.minecraft.block.ChorusFlowerBlock.MAX_AGE; }
// public static void MAX_AGE(int value, ) { net.minecraft.block.ChorusFlowerBlock.MAX_AGE = value; }

// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
// public void SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.ChorusFlowerBlock.SHAPE); }
// public static void SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.ChorusFlowerBlock.SHAPE = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.ChorusFlowerBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.ChorusFlowerBlock.CODEC = value; }

// public ChorusFlowerBlock(yarnwrap.block.Block plantBlock,Object settings) { this.wrapperContained = new net.minecraft.block.ChorusFlowerBlock(plantBlock.wrapperContained,settings); }
// public com.mojang.datafixers.kinds.App method_53994(Object instance) { return wrapperContained.method_53994(instance); }
// public static com.mojang.datafixers.kinds.App method_53994(Object instance, ) { return net.minecraft.block.ChorusFlowerBlock.method_53994(instance); }
// public yarnwrap.block.Block method_53995(yarnwrap.block.ChorusFlowerBlock block) { return new yarnwrap.block.Block(wrapperContained.method_53995(block.wrapperContained)); }
// public static yarnwrap.block.Block method_53995(yarnwrap.block.ChorusFlowerBlock block, ) { return new yarnwrap.block.Block(net.minecraft.block.ChorusFlowerBlock.method_53995(block.wrapperContained)); }
// public void generate(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random,int size) { wrapperContained.generate(world.wrapperContained,pos.wrapperContained,random.wrapperContained,size); }
// public static void generate(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random,int size, ) { net.minecraft.block.ChorusFlowerBlock.generate(world.wrapperContained,pos.wrapperContained,random.wrapperContained,size); }
// public void grow(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,int age) { wrapperContained.grow(world.wrapperContained,pos.wrapperContained,age); }
// public static void grow(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,int age, ) { net.minecraft.block.ChorusFlowerBlock.grow(world.wrapperContained,pos.wrapperContained,age); }
// public boolean isSurroundedByAir(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction exceptDirection) { return wrapperContained.isSurroundedByAir(world.wrapperContained,pos.wrapperContained,exceptDirection.wrapperContained); }
// public static boolean isSurroundedByAir(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction exceptDirection, ) { return net.minecraft.block.ChorusFlowerBlock.isSurroundedByAir(world.wrapperContained,pos.wrapperContained,exceptDirection.wrapperContained); }
// public void die(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { wrapperContained.die(world.wrapperContained,pos.wrapperContained); }
// public static void die(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos, ) { net.minecraft.block.ChorusFlowerBlock.die(world.wrapperContained,pos.wrapperContained); }
// public void generate(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos rootPos,int size,int layer) { wrapperContained.generate(world.wrapperContained,pos.wrapperContained,random.wrapperContained,rootPos.wrapperContained,size,layer); }
// public static void generate(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos rootPos,int size,int layer, ) { net.minecraft.block.ChorusFlowerBlock.generate(world.wrapperContained,pos.wrapperContained,random.wrapperContained,rootPos.wrapperContained,size,layer); }

}