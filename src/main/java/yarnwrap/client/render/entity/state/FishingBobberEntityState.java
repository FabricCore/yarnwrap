package yarnwrap.client.render.entity.state;
public class FishingBobberEntityState { public net.minecraft.client.render.entity.state.FishingBobberEntityState wrapperContained; public FishingBobberEntityState(net.minecraft.client.render.entity.state.FishingBobberEntityState wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.math.Vec3d pos() { return new yarnwrap.util.math.Vec3d(wrapperContained.pos); }
public void pos(yarnwrap.util.math.Vec3d value) { wrapperContained.pos = value.wrapperContained; }
// public static yarnwrap.util.math.Vec3d pos() { return new yarnwrap.util.math.Vec3d(net.minecraft.client.render.entity.state.FishingBobberEntityState.pos); }
// public static void pos(yarnwrap.util.math.Vec3d value, ) { net.minecraft.client.render.entity.state.FishingBobberEntityState.pos = value.wrapperContained; }


}