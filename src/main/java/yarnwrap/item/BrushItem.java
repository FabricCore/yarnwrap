package yarnwrap.item;
public class BrushItem { public net.minecraft.item.BrushItem wrapperContained; public BrushItem(net.minecraft.item.BrushItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public int MAX_BRUSH_TIME() { return wrapperContained.MAX_BRUSH_TIME; }
// public void MAX_BRUSH_TIME(int value) { wrapperContained.MAX_BRUSH_TIME = value; }
// public static int MAX_BRUSH_TIME() { return net.minecraft.item.BrushItem.MAX_BRUSH_TIME; }
// public static void MAX_BRUSH_TIME(int value, ) { net.minecraft.item.BrushItem.MAX_BRUSH_TIME = value; }

// public int ANIMATION_DURATION() { return wrapperContained.ANIMATION_DURATION; }
// public void ANIMATION_DURATION(int value) { wrapperContained.ANIMATION_DURATION = value; }
public static int ANIMATION_DURATION() { return net.minecraft.item.BrushItem.ANIMATION_DURATION; }
// public static void ANIMATION_DURATION(int value, ) { net.minecraft.item.BrushItem.ANIMATION_DURATION = value; }

// public void addDustParticles(yarnwrap.world.World world,yarnwrap.util.hit.BlockHitResult hitResult,yarnwrap.block.BlockState state,yarnwrap.util.math.Vec3d userRotation,yarnwrap.util.Arm arm) { wrapperContained.addDustParticles(world.wrapperContained,hitResult.wrapperContained,state.wrapperContained,userRotation.wrapperContained,arm.wrapperContained); }
// public static void addDustParticles(yarnwrap.world.World world,yarnwrap.util.hit.BlockHitResult hitResult,yarnwrap.block.BlockState state,yarnwrap.util.math.Vec3d userRotation,yarnwrap.util.Arm arm, ) { net.minecraft.item.BrushItem.addDustParticles(world.wrapperContained,hitResult.wrapperContained,state.wrapperContained,userRotation.wrapperContained,arm.wrapperContained); }
// public yarnwrap.util.hit.HitResult getHitResult(yarnwrap.entity.player.PlayerEntity user) { return new yarnwrap.util.hit.HitResult(wrapperContained.getHitResult(user.wrapperContained)); }
// public static yarnwrap.util.hit.HitResult getHitResult(yarnwrap.entity.player.PlayerEntity user, ) { return new yarnwrap.util.hit.HitResult(net.minecraft.item.BrushItem.getHitResult(user.wrapperContained)); }
// public boolean method_51309(yarnwrap.entity.Entity entity) { return wrapperContained.method_51309(entity.wrapperContained); }
// public static boolean method_51309(yarnwrap.entity.Entity entity, ) { return net.minecraft.item.BrushItem.method_51309(entity.wrapperContained); }

}