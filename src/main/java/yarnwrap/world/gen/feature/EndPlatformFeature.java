package yarnwrap.world.gen.feature;
public class EndPlatformFeature { public net.minecraft.world.gen.feature.EndPlatformFeature wrapperContained; public EndPlatformFeature(net.minecraft.world.gen.feature.EndPlatformFeature wrapperContained) { this.wrapperContained = wrapperContained; }

public void generate(yarnwrap.world.ServerWorldAccess world,yarnwrap.util.math.BlockPos pos,boolean breakBlocks) { wrapperContained.generate(world.wrapperContained,pos.wrapperContained,breakBlocks); }

}