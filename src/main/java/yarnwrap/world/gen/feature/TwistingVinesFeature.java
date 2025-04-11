package yarnwrap.world.gen.feature;
public class TwistingVinesFeature { public net.minecraft.world.gen.feature.TwistingVinesFeature wrapperContained; public TwistingVinesFeature(net.minecraft.world.gen.feature.TwistingVinesFeature wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean isNotSuitable(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.isNotSuitable(world.wrapperContained,pos.wrapperContained); }
// public void generateVineColumn(yarnwrap.world.WorldAccess world,yarnwrap.util.math.random.Random random,Object pos,int maxLength,int minAge,int maxAge) { wrapperContained.generateVineColumn(world.wrapperContained,random.wrapperContained,pos,maxLength,minAge,maxAge); }
// public boolean canGenerate(yarnwrap.world.WorldAccess world,Object pos) { return wrapperContained.canGenerate(world.wrapperContained,pos); }

}