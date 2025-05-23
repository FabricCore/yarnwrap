package yarnwrap.client.render.entity.state;
public class PaintingEntityRenderState { public net.minecraft.client.render.entity.state.PaintingEntityRenderState wrapperContained; public PaintingEntityRenderState(net.minecraft.client.render.entity.state.PaintingEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.math.Direction facing() { return new yarnwrap.util.math.Direction(wrapperContained.facing); }
public void facing(yarnwrap.util.math.Direction value) { wrapperContained.facing = value.wrapperContained; }
// public static yarnwrap.util.math.Direction facing() { return new yarnwrap.util.math.Direction(net.minecraft.client.render.entity.state.PaintingEntityRenderState.facing); }
// public static void facing(yarnwrap.util.math.Direction value, ) { net.minecraft.client.render.entity.state.PaintingEntityRenderState.facing = value.wrapperContained; }

public yarnwrap.entity.decoration.painting.PaintingVariant variant() { return new yarnwrap.entity.decoration.painting.PaintingVariant(wrapperContained.variant); }
public void variant(yarnwrap.entity.decoration.painting.PaintingVariant value) { wrapperContained.variant = value.wrapperContained; }
// public static yarnwrap.entity.decoration.painting.PaintingVariant variant() { return new yarnwrap.entity.decoration.painting.PaintingVariant(net.minecraft.client.render.entity.state.PaintingEntityRenderState.variant); }
// public static void variant(yarnwrap.entity.decoration.painting.PaintingVariant value, ) { net.minecraft.client.render.entity.state.PaintingEntityRenderState.variant = value.wrapperContained; }

public int[] lightmapCoordinates() { return wrapperContained.lightmapCoordinates; }
public void lightmapCoordinates(int[] value) { wrapperContained.lightmapCoordinates = value; }
// public static int[] lightmapCoordinates() { return net.minecraft.client.render.entity.state.PaintingEntityRenderState.lightmapCoordinates; }
// public static void lightmapCoordinates(int[] value, ) { net.minecraft.client.render.entity.state.PaintingEntityRenderState.lightmapCoordinates = value; }


}