package yarnwrap.entity.boss.dragon;
public class EnderDragonSpawnState { public net.minecraft.entity.boss.dragon.EnderDragonSpawnState wrapperContained; public EnderDragonSpawnState(net.minecraft.entity.boss.dragon.EnderDragonSpawnState wrapperContained) { this.wrapperContained = wrapperContained; }

public void run(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.boss.dragon.EnderDragonFight fight,java.util.List crystals,int tick,yarnwrap.util.math.BlockPos pos) { wrapperContained.run(world.wrapperContained,fight.wrapperContained,crystals,tick,pos.wrapperContained); }

}