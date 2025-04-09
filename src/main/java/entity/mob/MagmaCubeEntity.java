package yarnwrap.entity.mob;
public class MagmaCubeEntity { public net.minecraft.entity.mob.MagmaCubeEntity wrapperContained; public MagmaCubeEntity(net.minecraft.entity.mob.MagmaCubeEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean canMagmaCubeSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.canMagmaCubeSpawn(type.wrapperContained,world.wrapperContained,spawnReason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
public Object createMagmaCubeAttributes() { return wrapperContained.createMagmaCubeAttributes(); }

}