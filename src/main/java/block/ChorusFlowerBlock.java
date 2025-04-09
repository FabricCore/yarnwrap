package yarnwrap.block;
public class ChorusFlowerBlock { public net.minecraft.block.ChorusFlowerBlock wrapperContained; public ChorusFlowerBlock(net.minecraft.block.ChorusFlowerBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.IntProperty AGE() { return new yarnwrap.state.property.IntProperty(wrapperContained.AGE); }
// public yarnwrap.block.Block plantBlock() { return new yarnwrap.block.Block(wrapperContained.plantBlock); }
public int MAX_AGE() { return wrapperContained.MAX_AGE; }
// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
public void generate(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random,int size) { wrapperContained.generate(world.wrapperContained,pos.wrapperContained,random.wrapperContained,size); }
// public void grow(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,int age) { wrapperContained.grow(world.wrapperContained,pos.wrapperContained,age); }
// public boolean isSurroundedByAir(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction exceptDirection) { return wrapperContained.isSurroundedByAir(world.wrapperContained,pos.wrapperContained,exceptDirection.wrapperContained); }
// public void die(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { wrapperContained.die(world.wrapperContained,pos.wrapperContained); }
// public void generate(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos rootPos,int size,int layer) { wrapperContained.generate(world.wrapperContained,pos.wrapperContained,random.wrapperContained,rootPos.wrapperContained,size,layer); }

}