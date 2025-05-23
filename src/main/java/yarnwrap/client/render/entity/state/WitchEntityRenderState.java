package yarnwrap.client.render.entity.state;
public class WitchEntityRenderState { public net.minecraft.client.render.entity.state.WitchEntityRenderState wrapperContained; public WitchEntityRenderState(net.minecraft.client.render.entity.state.WitchEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public int id() { return wrapperContained.id; }
public void id(int value) { wrapperContained.id = value; }
// public static int id() { return net.minecraft.client.render.entity.state.WitchEntityRenderState.id; }
// public static void id(int value, ) { net.minecraft.client.render.entity.state.WitchEntityRenderState.id = value; }

public boolean holdingItem() { return wrapperContained.holdingItem; }
public void holdingItem(boolean value) { wrapperContained.holdingItem = value; }
// public static boolean holdingItem() { return net.minecraft.client.render.entity.state.WitchEntityRenderState.holdingItem; }
// public static void holdingItem(boolean value, ) { net.minecraft.client.render.entity.state.WitchEntityRenderState.holdingItem = value; }

public boolean holdingPotion() { return wrapperContained.holdingPotion; }
public void holdingPotion(boolean value) { wrapperContained.holdingPotion = value; }
// public static boolean holdingPotion() { return net.minecraft.client.render.entity.state.WitchEntityRenderState.holdingPotion; }
// public static void holdingPotion(boolean value, ) { net.minecraft.client.render.entity.state.WitchEntityRenderState.holdingPotion = value; }


}