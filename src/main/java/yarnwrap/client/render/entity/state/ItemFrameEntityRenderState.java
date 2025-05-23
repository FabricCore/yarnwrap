package yarnwrap.client.render.entity.state;
public class ItemFrameEntityRenderState { public net.minecraft.client.render.entity.state.ItemFrameEntityRenderState wrapperContained; public ItemFrameEntityRenderState(net.minecraft.client.render.entity.state.ItemFrameEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.math.Direction facing() { return new yarnwrap.util.math.Direction(wrapperContained.facing); }
public void facing(yarnwrap.util.math.Direction value) { wrapperContained.facing = value.wrapperContained; }
// public static yarnwrap.util.math.Direction facing() { return new yarnwrap.util.math.Direction(net.minecraft.client.render.entity.state.ItemFrameEntityRenderState.facing); }
// public static void facing(yarnwrap.util.math.Direction value, ) { net.minecraft.client.render.entity.state.ItemFrameEntityRenderState.facing = value.wrapperContained; }

public int rotation() { return wrapperContained.rotation; }
public void rotation(int value) { wrapperContained.rotation = value; }
// public static int rotation() { return net.minecraft.client.render.entity.state.ItemFrameEntityRenderState.rotation; }
// public static void rotation(int value, ) { net.minecraft.client.render.entity.state.ItemFrameEntityRenderState.rotation = value; }

public boolean glow() { return wrapperContained.glow; }
public void glow(boolean value) { wrapperContained.glow = value; }
// public static boolean glow() { return net.minecraft.client.render.entity.state.ItemFrameEntityRenderState.glow; }
// public static void glow(boolean value, ) { net.minecraft.client.render.entity.state.ItemFrameEntityRenderState.glow = value; }

public yarnwrap.component.type.MapIdComponent mapId() { return new yarnwrap.component.type.MapIdComponent(wrapperContained.mapId); }
public void mapId(yarnwrap.component.type.MapIdComponent value) { wrapperContained.mapId = value.wrapperContained; }
// public static yarnwrap.component.type.MapIdComponent mapId() { return new yarnwrap.component.type.MapIdComponent(net.minecraft.client.render.entity.state.ItemFrameEntityRenderState.mapId); }
// public static void mapId(yarnwrap.component.type.MapIdComponent value, ) { net.minecraft.client.render.entity.state.ItemFrameEntityRenderState.mapId = value.wrapperContained; }

public yarnwrap.client.render.MapRenderState mapRenderState() { return new yarnwrap.client.render.MapRenderState(wrapperContained.mapRenderState); }
// public void mapRenderState(yarnwrap.client.render.MapRenderState value) { wrapperContained.mapRenderState = value.wrapperContained; }
// public static yarnwrap.client.render.MapRenderState mapRenderState() { return new yarnwrap.client.render.MapRenderState(net.minecraft.client.render.entity.state.ItemFrameEntityRenderState.mapRenderState); }
// public static void mapRenderState(yarnwrap.client.render.MapRenderState value, ) { net.minecraft.client.render.entity.state.ItemFrameEntityRenderState.mapRenderState = value.wrapperContained; }

public yarnwrap.client.render.item.ItemRenderState itemRenderState() { return new yarnwrap.client.render.item.ItemRenderState(wrapperContained.itemRenderState); }
// public void itemRenderState(yarnwrap.client.render.item.ItemRenderState value) { wrapperContained.itemRenderState = value.wrapperContained; }
// public static yarnwrap.client.render.item.ItemRenderState itemRenderState() { return new yarnwrap.client.render.item.ItemRenderState(net.minecraft.client.render.entity.state.ItemFrameEntityRenderState.itemRenderState); }
// public static void itemRenderState(yarnwrap.client.render.item.ItemRenderState value, ) { net.minecraft.client.render.entity.state.ItemFrameEntityRenderState.itemRenderState = value.wrapperContained; }


}