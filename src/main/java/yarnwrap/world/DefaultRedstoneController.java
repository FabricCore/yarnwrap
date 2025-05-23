package yarnwrap.world;
public class DefaultRedstoneController { public net.minecraft.world.DefaultRedstoneController wrapperContained; public DefaultRedstoneController(net.minecraft.world.DefaultRedstoneController wrapperContained) { this.wrapperContained = wrapperContained; }

// public int calculateTotalPowerAt(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.calculateTotalPowerAt(world.wrapperContained,pos.wrapperContained); }
// public static int calculateTotalPowerAt(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.world.DefaultRedstoneController.calculateTotalPowerAt(world.wrapperContained,pos.wrapperContained); }

}