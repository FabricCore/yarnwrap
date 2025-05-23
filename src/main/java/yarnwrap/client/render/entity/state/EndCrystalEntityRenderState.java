package yarnwrap.client.render.entity.state;
public class EndCrystalEntityRenderState { public net.minecraft.client.render.entity.state.EndCrystalEntityRenderState wrapperContained; public EndCrystalEntityRenderState(net.minecraft.client.render.entity.state.EndCrystalEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean baseVisible() { return wrapperContained.baseVisible; }
public void baseVisible(boolean value) { wrapperContained.baseVisible = value; }
// public static boolean baseVisible() { return net.minecraft.client.render.entity.state.EndCrystalEntityRenderState.baseVisible; }
// public static void baseVisible(boolean value, ) { net.minecraft.client.render.entity.state.EndCrystalEntityRenderState.baseVisible = value; }

public yarnwrap.util.math.Vec3d beamOffset() { return new yarnwrap.util.math.Vec3d(wrapperContained.beamOffset); }
public void beamOffset(yarnwrap.util.math.Vec3d value) { wrapperContained.beamOffset = value.wrapperContained; }
// public static yarnwrap.util.math.Vec3d beamOffset() { return new yarnwrap.util.math.Vec3d(net.minecraft.client.render.entity.state.EndCrystalEntityRenderState.beamOffset); }
// public static void beamOffset(yarnwrap.util.math.Vec3d value, ) { net.minecraft.client.render.entity.state.EndCrystalEntityRenderState.beamOffset = value.wrapperContained; }


}