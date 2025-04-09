package yarnwrap.item;
public class BrushItem { public net.minecraft.item.BrushItem wrapperContained; public BrushItem(net.minecraft.item.BrushItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public int MAX_BRUSH_TIME() { return wrapperContained.MAX_BRUSH_TIME; }
public int ANIMATION_DURATION() { return wrapperContained.ANIMATION_DURATION; }
// public void addDustParticles(yarnwrap.world.World world,yarnwrap.util.hit.BlockHitResult hitResult,yarnwrap.block.BlockState state,yarnwrap.util.math.Vec3d userRotation,yarnwrap.util.Arm arm) { wrapperContained.addDustParticles(world.wrapperContained,hitResult.wrapperContained,state.wrapperContained,userRotation.wrapperContained,arm.wrapperContained); }
// public yarnwrap.util.hit.HitResult getHitResult(yarnwrap.entity.player.PlayerEntity user) { return new yarnwrap.util.hit.HitResult(wrapperContained.getHitResult(user.wrapperContained)); }

}