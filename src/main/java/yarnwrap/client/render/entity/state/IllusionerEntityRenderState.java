package yarnwrap.client.render.entity.state;
public class IllusionerEntityRenderState { public net.minecraft.client.render.entity.state.IllusionerEntityRenderState wrapperContained; public IllusionerEntityRenderState(net.minecraft.client.render.entity.state.IllusionerEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public net.minecraft.util.math.Vec3d[] mirrorCopyOffsets() { return wrapperContained.mirrorCopyOffsets; }
public void mirrorCopyOffsets(net.minecraft.util.math.Vec3d[] value) { wrapperContained.mirrorCopyOffsets = value; }
// public static net.minecraft.util.math.Vec3d[] mirrorCopyOffsets() { return net.minecraft.client.render.entity.state.IllusionerEntityRenderState.mirrorCopyOffsets; }
// public static void mirrorCopyOffsets(net.minecraft.util.math.Vec3d[] value, ) { net.minecraft.client.render.entity.state.IllusionerEntityRenderState.mirrorCopyOffsets = value; }

public boolean spellcasting() { return wrapperContained.spellcasting; }
public void spellcasting(boolean value) { wrapperContained.spellcasting = value; }
// public static boolean spellcasting() { return net.minecraft.client.render.entity.state.IllusionerEntityRenderState.spellcasting; }
// public static void spellcasting(boolean value, ) { net.minecraft.client.render.entity.state.IllusionerEntityRenderState.spellcasting = value; }


}