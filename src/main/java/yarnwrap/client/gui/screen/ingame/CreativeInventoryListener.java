package yarnwrap.client.gui.screen.ingame;
public class CreativeInventoryListener { public net.minecraft.client.gui.screen.ingame.CreativeInventoryListener wrapperContained; public CreativeInventoryListener(net.minecraft.client.gui.screen.ingame.CreativeInventoryListener wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public static yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(net.minecraft.client.gui.screen.ingame.CreativeInventoryListener.client); }
// public static void client(yarnwrap.client.MinecraftClient value, ) { net.minecraft.client.gui.screen.ingame.CreativeInventoryListener.client = value.wrapperContained; }

public CreativeInventoryListener(yarnwrap.client.MinecraftClient client) { this.wrapperContained = new net.minecraft.client.gui.screen.ingame.CreativeInventoryListener(client.wrapperContained); }

}