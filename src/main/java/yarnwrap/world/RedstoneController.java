package yarnwrap.world;
public class RedstoneController { public net.minecraft.world.RedstoneController wrapperContained; public RedstoneController(net.minecraft.world.RedstoneController wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.RedstoneWireBlock wire() { return new yarnwrap.block.RedstoneWireBlock(wrapperContained.wire); }
// public void wire(yarnwrap.block.RedstoneWireBlock value) { wrapperContained.wire = value.wrapperContained; }
// public static yarnwrap.block.RedstoneWireBlock wire() { return new yarnwrap.block.RedstoneWireBlock(net.minecraft.world.RedstoneController.wire); }
// public static void wire(yarnwrap.block.RedstoneWireBlock value, ) { net.minecraft.world.RedstoneController.wire = value.wrapperContained; }

// public RedstoneController(yarnwrap.block.RedstoneWireBlock wire) { this.wrapperContained = new net.minecraft.world.RedstoneController(wire.wrapperContained); }
public void update(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.world.block.WireOrientation orientation,boolean blockAdded) { wrapperContained.update(world.wrapperContained,pos.wrapperContained,state.wrapperContained,orientation.wrapperContained,blockAdded); }
// public static void update(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.world.block.WireOrientation orientation,boolean blockAdded, ) { net.minecraft.world.RedstoneController.update(world.wrapperContained,pos.wrapperContained,state.wrapperContained,orientation.wrapperContained,blockAdded); }
// public int getWirePowerAt(yarnwrap.util.math.BlockPos world,yarnwrap.block.BlockState pos) { return wrapperContained.getWirePowerAt(world.wrapperContained,pos.wrapperContained); }
// public static int getWirePowerAt(yarnwrap.util.math.BlockPos world,yarnwrap.block.BlockState pos, ) { return net.minecraft.world.RedstoneController.getWirePowerAt(world.wrapperContained,pos.wrapperContained); }
// public int getStrongPowerAt(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.getStrongPowerAt(world.wrapperContained,pos.wrapperContained); }
// public static int getStrongPowerAt(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.world.RedstoneController.getStrongPowerAt(world.wrapperContained,pos.wrapperContained); }
// public int calculateWirePowerAt(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.calculateWirePowerAt(world.wrapperContained,pos.wrapperContained); }
// public static int calculateWirePowerAt(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.world.RedstoneController.calculateWirePowerAt(world.wrapperContained,pos.wrapperContained); }

}