package yarnwrap.client.gui.screen.ingame;
public class MinecartCommandBlockScreen { public net.minecraft.client.gui.screen.ingame.MinecartCommandBlockScreen wrapperContained; public MinecartCommandBlockScreen(net.minecraft.client.gui.screen.ingame.MinecartCommandBlockScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.CommandBlockExecutor commandExecutor() { return new yarnwrap.world.CommandBlockExecutor(wrapperContained.commandExecutor); }

}