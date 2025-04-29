package yarnwrap.item;
public class CompassItem { public net.minecraft.item.CompassItem wrapperContained; public CompassItem(net.minecraft.item.CompassItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.GlobalPos createSpawnPos(yarnwrap.world.World world) { return new yarnwrap.util.math.GlobalPos(wrapperContained.createSpawnPos(world.wrapperContained)); }
// public static yarnwrap.util.math.GlobalPos createSpawnPos(yarnwrap.world.World world, ) { return new yarnwrap.util.math.GlobalPos(net.minecraft.item.CompassItem.createSpawnPos(world.wrapperContained)); }

}