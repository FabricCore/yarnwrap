package yarnwrap.client.gui.screen.ingame;
public class MinecartCommandBlockScreen { public net.minecraft.client.gui.screen.ingame.MinecartCommandBlockScreen wrapperContained; public MinecartCommandBlockScreen(net.minecraft.client.gui.screen.ingame.MinecartCommandBlockScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.CommandBlockExecutor commandExecutor() { return new yarnwrap.world.CommandBlockExecutor(wrapperContained.commandExecutor); }
// public void commandExecutor(yarnwrap.world.CommandBlockExecutor value) { wrapperContained.commandExecutor = value.wrapperContained; }
// public static yarnwrap.world.CommandBlockExecutor commandExecutor() { return new yarnwrap.world.CommandBlockExecutor(net.minecraft.client.gui.screen.ingame.MinecartCommandBlockScreen.commandExecutor); }
// public static void commandExecutor(yarnwrap.world.CommandBlockExecutor value, ) { net.minecraft.client.gui.screen.ingame.MinecartCommandBlockScreen.commandExecutor = value.wrapperContained; }

public MinecartCommandBlockScreen(yarnwrap.world.CommandBlockExecutor commandExecutor) { this.wrapperContained = new net.minecraft.client.gui.screen.ingame.MinecartCommandBlockScreen(commandExecutor.wrapperContained); }

}