package yarnwrap.client.render.entity.state;
public class HoglinEntityRenderState { public net.minecraft.client.render.entity.state.HoglinEntityRenderState wrapperContained; public HoglinEntityRenderState(net.minecraft.client.render.entity.state.HoglinEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public int movementCooldownTicks() { return wrapperContained.movementCooldownTicks; }
public void movementCooldownTicks(int value) { wrapperContained.movementCooldownTicks = value; }
// public static int movementCooldownTicks() { return net.minecraft.client.render.entity.state.HoglinEntityRenderState.movementCooldownTicks; }
// public static void movementCooldownTicks(int value, ) { net.minecraft.client.render.entity.state.HoglinEntityRenderState.movementCooldownTicks = value; }

public boolean canConvert() { return wrapperContained.canConvert; }
public void canConvert(boolean value) { wrapperContained.canConvert = value; }
// public static boolean canConvert() { return net.minecraft.client.render.entity.state.HoglinEntityRenderState.canConvert; }
// public static void canConvert(boolean value, ) { net.minecraft.client.render.entity.state.HoglinEntityRenderState.canConvert = value; }


}