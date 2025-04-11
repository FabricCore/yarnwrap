package yarnwrap.world.gen.feature.util;
public class DripstoneHelper { public net.minecraft.world.gen.feature.util.DripstoneHelper wrapperContained; public DripstoneHelper(net.minecraft.world.gen.feature.util.DripstoneHelper wrapperContained) { this.wrapperContained = wrapperContained; }

// public double scaleHeightFromRadius(double radius,double scale,double heightScale,double bluntness) { return wrapperContained.scaleHeightFromRadius(radius,scale,heightScale,bluntness); }
// public boolean canGenerate(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.canGenerate(world.wrapperContained,pos.wrapperContained); }
// public void method_33007(yarnwrap.world.WorldAccess state) { wrapperContained.method_33007(state.wrapperContained); }
// public boolean generateDripstoneBlock(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.generateDripstoneBlock(world.wrapperContained,pos.wrapperContained); }
// public boolean canGenerateBase(yarnwrap.world.StructureWorldAccess world,yarnwrap.util.math.BlockPos pos,int height) { return wrapperContained.canGenerateBase(world.wrapperContained,pos.wrapperContained,height); }
// public void generatePointedDripstone(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction,int height,boolean merge) { wrapperContained.generatePointedDripstone(world.wrapperContained,pos.wrapperContained,direction.wrapperContained,height,merge); }
public boolean canReplace(yarnwrap.block.BlockState state) { return wrapperContained.canReplace(state.wrapperContained); }
// public void getDripstoneThickness(yarnwrap.util.math.Direction direction,int height,boolean merge,java.util.function.Consumer callback) { wrapperContained.getDripstoneThickness(direction.wrapperContained,height,merge,callback); }
// public yarnwrap.block.BlockState getState(yarnwrap.util.math.Direction direction,yarnwrap.block.enums.Thickness thickness) { return new yarnwrap.block.BlockState(wrapperContained.getState(direction.wrapperContained,thickness.wrapperContained)); }
public boolean canGenerate(yarnwrap.block.BlockState state) { return wrapperContained.canGenerate(state.wrapperContained); }
public boolean canReplaceOrLava(yarnwrap.block.BlockState state) { return wrapperContained.canReplaceOrLava(state.wrapperContained); }
// public boolean canGenerateOrLava(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.canGenerateOrLava(world.wrapperContained,pos.wrapperContained); }
public boolean canGenerateOrLava(yarnwrap.block.BlockState state) { return wrapperContained.canGenerateOrLava(state.wrapperContained); }
public boolean cannotGenerate(yarnwrap.block.BlockState state) { return wrapperContained.cannotGenerate(state.wrapperContained); }

}