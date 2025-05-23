package yarnwrap.client.render.entity.state;
public class DonkeyEntityRenderState { public net.minecraft.client.render.entity.state.DonkeyEntityRenderState wrapperContained; public DonkeyEntityRenderState(net.minecraft.client.render.entity.state.DonkeyEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean hasChest() { return wrapperContained.hasChest; }
public void hasChest(boolean value) { wrapperContained.hasChest = value; }
// public static boolean hasChest() { return net.minecraft.client.render.entity.state.DonkeyEntityRenderState.hasChest; }
// public static void hasChest(boolean value, ) { net.minecraft.client.render.entity.state.DonkeyEntityRenderState.hasChest = value; }


}