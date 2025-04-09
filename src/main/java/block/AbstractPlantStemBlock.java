package yarnwrap.block;
public class AbstractPlantStemBlock { public net.minecraft.block.AbstractPlantStemBlock wrapperContained; public AbstractPlantStemBlock(net.minecraft.block.AbstractPlantStemBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.IntProperty AGE() { return new yarnwrap.state.property.IntProperty(wrapperContained.AGE); }
// public double growthChance() { return wrapperContained.growthChance; }
public int MAX_AGE() { return wrapperContained.MAX_AGE; }
// public boolean chooseStemState(yarnwrap.block.BlockState state) { return wrapperContained.chooseStemState(state.wrapperContained); }
// public int getGrowthLength(yarnwrap.util.math.random.Random random) { return wrapperContained.getGrowthLength(random.wrapperContained); }
// public yarnwrap.block.BlockState copyState(yarnwrap.block.BlockState from,yarnwrap.block.BlockState to) { return new yarnwrap.block.BlockState(wrapperContained.copyState(from.wrapperContained,to.wrapperContained)); }
// public yarnwrap.block.BlockState age(yarnwrap.block.BlockState state,yarnwrap.util.math.random.Random random) { return new yarnwrap.block.BlockState(wrapperContained.age(state.wrapperContained,random.wrapperContained)); }
public yarnwrap.block.BlockState withMaxAge(yarnwrap.block.BlockState state) { return new yarnwrap.block.BlockState(wrapperContained.withMaxAge(state.wrapperContained)); }
public boolean hasMaxAge(yarnwrap.block.BlockState state) { return wrapperContained.hasMaxAge(state.wrapperContained); }

}