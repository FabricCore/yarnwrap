package yarnwrap.block.spawner;
public class EntityDetector { public net.minecraft.block.spawner.EntityDetector wrapperContained; public EntityDetector(net.minecraft.block.spawner.EntityDetector wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.block.spawner.EntityDetector SHEEP() { return new yarnwrap.block.spawner.EntityDetector(wrapperContained.SHEEP); }
// public void SHEEP(yarnwrap.block.spawner.EntityDetector value) { wrapperContained.SHEEP = value.wrapperContained; }
public yarnwrap.block.spawner.EntityDetector SURVIVAL_PLAYERS() { return new yarnwrap.block.spawner.EntityDetector(wrapperContained.SURVIVAL_PLAYERS); }
// public void SURVIVAL_PLAYERS(yarnwrap.block.spawner.EntityDetector value) { wrapperContained.SURVIVAL_PLAYERS = value.wrapperContained; }
public yarnwrap.block.spawner.EntityDetector NON_SPECTATOR_PLAYERS() { return new yarnwrap.block.spawner.EntityDetector(wrapperContained.NON_SPECTATOR_PLAYERS); }
// public void NON_SPECTATOR_PLAYERS(yarnwrap.block.spawner.EntityDetector value) { wrapperContained.NON_SPECTATOR_PLAYERS = value.wrapperContained; }
// public java.util.List detect(yarnwrap.server.world.ServerWorld world,Object selector,yarnwrap.util.math.BlockPos center,double radius,boolean spawner) { return wrapperContained.detect(world.wrapperContained,selector,center.wrapperContained,radius,spawner); }
// public java.util.List method_55155(yarnwrap.server.world.ServerWorld world,Object selector,yarnwrap.util.math.BlockPos center,double radius,boolean spawner) { return wrapperContained.method_55155(world.wrapperContained,selector,center.wrapperContained,radius,spawner); }
// public java.util.List method_56720(yarnwrap.server.world.ServerWorld world,Object selector,yarnwrap.util.math.BlockPos center,double radius,boolean spawner) { return wrapperContained.method_56720(world.wrapperContained,selector,center.wrapperContained,radius,spawner); }
// public boolean method_56721(yarnwrap.util.math.BlockPos player) { return wrapperContained.method_56721(player.wrapperContained); }
// public java.util.List method_56722(yarnwrap.server.world.ServerWorld world,Object selector,yarnwrap.util.math.BlockPos center,double radius,boolean spawner) { return wrapperContained.method_56722(world.wrapperContained,selector,center.wrapperContained,radius,spawner); }
// public boolean method_56723(yarnwrap.util.math.BlockPos player) { return wrapperContained.method_56723(player.wrapperContained); }
// // public boolean hasLineOfSight(yarnwrap.world.World world,yarnwrap.util.math.Vec3d pos,yarnwrap.util.math.Vec3d entityEyePos) { return wrapperContained.hasLineOfSight(world.wrapperContained,pos.wrapperContained,entityEyePos.wrapperContained); }
// public boolean method_58697(boolean entity) { return wrapperContained.method_58697(entity); }
// public boolean method_58698(boolean entity) { return wrapperContained.method_58698(entity); }
// public boolean method_58699(boolean entity) { return wrapperContained.method_58699(entity); }

}