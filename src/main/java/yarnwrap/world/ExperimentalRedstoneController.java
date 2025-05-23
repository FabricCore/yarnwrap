package yarnwrap.world;
public class ExperimentalRedstoneController { public net.minecraft.world.ExperimentalRedstoneController wrapperContained; public ExperimentalRedstoneController(net.minecraft.world.ExperimentalRedstoneController wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Deque powerIncreaseQueue() { return wrapperContained.powerIncreaseQueue; }
// public void powerIncreaseQueue(java.util.Deque value) { wrapperContained.powerIncreaseQueue = value; }
// public static java.util.Deque powerIncreaseQueue() { return net.minecraft.world.ExperimentalRedstoneController.powerIncreaseQueue; }
// public static void powerIncreaseQueue(java.util.Deque value, ) { net.minecraft.world.ExperimentalRedstoneController.powerIncreaseQueue = value; }

// public java.util.Deque powerDecreaseQueue() { return wrapperContained.powerDecreaseQueue; }
// public void powerDecreaseQueue(java.util.Deque value) { wrapperContained.powerDecreaseQueue = value; }
// public static java.util.Deque powerDecreaseQueue() { return net.minecraft.world.ExperimentalRedstoneController.powerDecreaseQueue; }
// public static void powerDecreaseQueue(java.util.Deque value, ) { net.minecraft.world.ExperimentalRedstoneController.powerDecreaseQueue = value; }

// public it.unimi.dsi.fastutil.objects.Object2IntMap wireOrientationsAndPowers() { return wrapperContained.wireOrientationsAndPowers; }
// public void wireOrientationsAndPowers(it.unimi.dsi.fastutil.objects.Object2IntMap value) { wrapperContained.wireOrientationsAndPowers = value; }
// public static it.unimi.dsi.fastutil.objects.Object2IntMap wireOrientationsAndPowers() { return net.minecraft.world.ExperimentalRedstoneController.wireOrientationsAndPowers; }
// public static void wireOrientationsAndPowers(it.unimi.dsi.fastutil.objects.Object2IntMap value, ) { net.minecraft.world.ExperimentalRedstoneController.wireOrientationsAndPowers = value; }

// public yarnwrap.world.block.WireOrientation unpackOrientation(int packed) { return new yarnwrap.world.block.WireOrientation(wrapperContained.unpackOrientation(packed)); }
// public static yarnwrap.world.block.WireOrientation unpackOrientation(int packed, ) { return new yarnwrap.world.block.WireOrientation(net.minecraft.world.ExperimentalRedstoneController.unpackOrientation(packed)); }
// public void update(yarnwrap.world.World world) { wrapperContained.update(world.wrapperContained); }
// public static void update(yarnwrap.world.World world, ) { net.minecraft.world.ExperimentalRedstoneController.update(world.wrapperContained); }
// public yarnwrap.world.block.WireOrientation tweakOrientation(yarnwrap.world.World world,yarnwrap.world.block.WireOrientation orientation) { return new yarnwrap.world.block.WireOrientation(wrapperContained.tweakOrientation(world.wrapperContained,orientation.wrapperContained)); }
// public static yarnwrap.world.block.WireOrientation tweakOrientation(yarnwrap.world.World world,yarnwrap.world.block.WireOrientation orientation, ) { return new yarnwrap.world.block.WireOrientation(net.minecraft.world.ExperimentalRedstoneController.tweakOrientation(world.wrapperContained,orientation.wrapperContained)); }
// public void spreadPowerUpdateToNeighbors(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,int power,yarnwrap.world.block.WireOrientation orientation,boolean canIncreasePower) { wrapperContained.spreadPowerUpdateToNeighbors(world.wrapperContained,pos.wrapperContained,power,orientation.wrapperContained,canIncreasePower); }
// public static void spreadPowerUpdateToNeighbors(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,int power,yarnwrap.world.block.WireOrientation orientation,boolean canIncreasePower, ) { net.minecraft.world.ExperimentalRedstoneController.spreadPowerUpdateToNeighbors(world.wrapperContained,pos.wrapperContained,power,orientation.wrapperContained,canIncreasePower); }
// public void propagatePowerUpdates(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.world.block.WireOrientation orientation) { wrapperContained.propagatePowerUpdates(world.wrapperContained,pos.wrapperContained,orientation.wrapperContained); }
// public static void propagatePowerUpdates(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.world.block.WireOrientation orientation, ) { net.minecraft.world.ExperimentalRedstoneController.propagatePowerUpdates(world.wrapperContained,pos.wrapperContained,orientation.wrapperContained); }
// public void method_61833(yarnwrap.world.World pos,yarnwrap.util.math.BlockPos orientationAndPower) { wrapperContained.method_61833(pos.wrapperContained,orientationAndPower.wrapperContained); }
// public static void method_61833(yarnwrap.world.World pos,yarnwrap.util.math.BlockPos orientationAndPower, ) { net.minecraft.world.ExperimentalRedstoneController.method_61833(pos.wrapperContained,orientationAndPower.wrapperContained); }
// public boolean canProvidePowerTo(yarnwrap.block.BlockState wireState,yarnwrap.util.math.Direction direction) { return wrapperContained.canProvidePowerTo(wireState.wrapperContained,direction.wrapperContained); }
// public static boolean canProvidePowerTo(yarnwrap.block.BlockState wireState,yarnwrap.util.math.Direction direction, ) { return net.minecraft.world.ExperimentalRedstoneController.canProvidePowerTo(wireState.wrapperContained,direction.wrapperContained); }
// public int packOrientationAndPower(yarnwrap.world.block.WireOrientation orientation,int power) { return wrapperContained.packOrientationAndPower(orientation.wrapperContained,power); }
// public static int packOrientationAndPower(yarnwrap.world.block.WireOrientation orientation,int power, ) { return net.minecraft.world.ExperimentalRedstoneController.packOrientationAndPower(orientation.wrapperContained,power); }
// public java.lang.Integer method_61836(yarnwrap.world.block.WireOrientation pos2,int orientationAndPower) { return wrapperContained.method_61836(pos2.wrapperContained,orientationAndPower); }
// public static java.lang.Integer method_61836(yarnwrap.world.block.WireOrientation pos2,int orientationAndPower, ) { return net.minecraft.world.ExperimentalRedstoneController.method_61836(pos2.wrapperContained,orientationAndPower); }
// public void updatePowerAt(yarnwrap.util.math.BlockPos pos,int power,yarnwrap.world.block.WireOrientation defaultOrientation) { wrapperContained.updatePowerAt(pos.wrapperContained,power,defaultOrientation.wrapperContained); }
// public static void updatePowerAt(yarnwrap.util.math.BlockPos pos,int power,yarnwrap.world.block.WireOrientation defaultOrientation, ) { net.minecraft.world.ExperimentalRedstoneController.updatePowerAt(pos.wrapperContained,power,defaultOrientation.wrapperContained); }
// public int unpackPower(int packed) { return wrapperContained.unpackPower(packed); }
// public static int unpackPower(int packed, ) { return net.minecraft.world.ExperimentalRedstoneController.unpackPower(packed); }
// public void spreadPowerUpdateTo(yarnwrap.world.World world,yarnwrap.util.math.BlockPos neighborPos,int power,yarnwrap.world.block.WireOrientation orientation,boolean canIncreasePower) { wrapperContained.spreadPowerUpdateTo(world.wrapperContained,neighborPos.wrapperContained,power,orientation.wrapperContained,canIncreasePower); }
// public static void spreadPowerUpdateTo(yarnwrap.world.World world,yarnwrap.util.math.BlockPos neighborPos,int power,yarnwrap.world.block.WireOrientation orientation,boolean canIncreasePower, ) { net.minecraft.world.ExperimentalRedstoneController.spreadPowerUpdateTo(world.wrapperContained,neighborPos.wrapperContained,power,orientation.wrapperContained,canIncreasePower); }

}