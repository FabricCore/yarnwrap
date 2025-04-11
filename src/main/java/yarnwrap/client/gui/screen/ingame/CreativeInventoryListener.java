package yarnwrap.client.gui.screen.ingame;
public class CreativeInventoryListener { public net.minecraft.client.gui.screen.ingame.CreativeInventoryListener wrapperContained; public CreativeInventoryListener(net.minecraft.client.gui.screen.ingame.CreativeInventoryListener wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }

}