package yarnwrap.client.render.debug;
public class RedstoneUpdateOrderDebugRenderer { public net.minecraft.client.render.debug.RedstoneUpdateOrderDebugRenderer wrapperContained; public RedstoneUpdateOrderDebugRenderer(net.minecraft.client.render.debug.RedstoneUpdateOrderDebugRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public static yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(net.minecraft.client.render.debug.RedstoneUpdateOrderDebugRenderer.client); }
// public static void client(yarnwrap.client.MinecraftClient value, ) { net.minecraft.client.render.debug.RedstoneUpdateOrderDebugRenderer.client = value.wrapperContained; }

// public java.util.List updateOrders() { return wrapperContained.updateOrders; }
// public void updateOrders(java.util.List value) { wrapperContained.updateOrders = value; }
// public static java.util.List updateOrders() { return net.minecraft.client.render.debug.RedstoneUpdateOrderDebugRenderer.updateOrders; }
// public static void updateOrders(java.util.List value, ) { net.minecraft.client.render.debug.RedstoneUpdateOrderDebugRenderer.updateOrders = value; }

// public RedstoneUpdateOrderDebugRenderer(yarnwrap.client.MinecraftClient client) { this.wrapperContained = new net.minecraft.client.render.debug.RedstoneUpdateOrderDebugRenderer(client.wrapperContained); }
public void addUpdateOrder(yarnwrap.network.packet.s2c.custom.DebugRedstoneUpdateOrderCustomPayload updateOrder) { wrapperContained.addUpdateOrder(updateOrder.wrapperContained); }
// public static void addUpdateOrder(yarnwrap.network.packet.s2c.custom.DebugRedstoneUpdateOrderCustomPayload updateOrder, ) { net.minecraft.client.render.debug.RedstoneUpdateOrderDebugRenderer.addUpdateOrder(updateOrder.wrapperContained); }

}