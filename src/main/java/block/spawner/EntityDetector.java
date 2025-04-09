package yarnwrap.block.spawner;
public class EntityDetector { public net.minecraft.block.spawner.EntityDetector wrapperContained; public EntityDetector(net.minecraft.block.spawner.EntityDetector wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.block.spawner.EntityDetector SHEEP() { return new yarnwrap.block.spawner.EntityDetector(wrapperContained.SHEEP); }
public yarnwrap.block.spawner.EntityDetector SURVIVAL_PLAYERS() { return new yarnwrap.block.spawner.EntityDetector(wrapperContained.SURVIVAL_PLAYERS); }
public yarnwrap.block.spawner.EntityDetector NON_SPECTATOR_PLAYERS() { return new yarnwrap.block.spawner.EntityDetector(wrapperContained.NON_SPECTATOR_PLAYERS); }
// // public boolean hasLineOfSight(yarnwrap.world.World world,yarnwrap.util.math.Vec3d pos,yarnwrap.util.math.Vec3d entityEyePos) { return wrapperContained.hasLineOfSight(world.wrapperContained,pos.wrapperContained,entityEyePos.wrapperContained); }

}