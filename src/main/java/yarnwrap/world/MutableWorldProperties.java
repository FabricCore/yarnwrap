package yarnwrap.world;
public class MutableWorldProperties { public net.minecraft.world.MutableWorldProperties wrapperContained; public MutableWorldProperties(net.minecraft.world.MutableWorldProperties wrapperContained) { this.wrapperContained = wrapperContained; }

public void setSpawnPos(yarnwrap.util.math.BlockPos pos,float angle) { wrapperContained.setSpawnPos(pos.wrapperContained,angle); }

}