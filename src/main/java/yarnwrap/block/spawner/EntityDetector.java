package yarnwrap.block.spawner;
public class EntityDetector { public net.minecraft.block.spawner.EntityDetector wrapperContained; public EntityDetector(net.minecraft.block.spawner.EntityDetector wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.block.spawner.EntityDetector SHEEP() { return new yarnwrap.block.spawner.EntityDetector(wrapperContained.SHEEP); }
// public void SHEEP(yarnwrap.block.spawner.EntityDetector value) { wrapperContained.SHEEP = value.wrapperContained; }
public yarnwrap.block.spawner.EntityDetector SURVIVAL_PLAYERS() { return new yarnwrap.block.spawner.EntityDetector(wrapperContained.SURVIVAL_PLAYERS); }
// public void SURVIVAL_PLAYERS(yarnwrap.block.spawner.EntityDetector value) { wrapperContained.SURVIVAL_PLAYERS = value.wrapperContained; }
public yarnwrap.block.spawner.EntityDetector NON_SPECTATOR_PLAYERS() { return new yarnwrap.block.spawner.EntityDetector(wrapperContained.NON_SPECTATOR_PLAYERS); }
// public void NON_SPECTATOR_PLAYERS(yarnwrap.block.spawner.EntityDetector value) { wrapperContained.NON_SPECTATOR_PLAYERS = value.wrapperContained; }
// // public boolean hasLineOfSight(yarnwrap.world.World world,yarnwrap.util.math.Vec3d pos,yarnwrap.util.math.Vec3d entityEyePos) { return wrapperContained.hasLineOfSight(world.wrapperContained,pos.wrapperContained,entityEyePos.wrapperContained); }

}