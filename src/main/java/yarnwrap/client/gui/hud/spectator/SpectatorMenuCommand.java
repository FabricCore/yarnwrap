package yarnwrap.client.gui.hud.spectator;
public class SpectatorMenuCommand { public net.minecraft.client.gui.hud.spectator.SpectatorMenuCommand wrapperContained; public SpectatorMenuCommand(net.minecraft.client.gui.hud.spectator.SpectatorMenuCommand wrapperContained) { this.wrapperContained = wrapperContained; }

public void use(yarnwrap.client.gui.hud.spectator.SpectatorMenu menu) { wrapperContained.use(menu.wrapperContained); }
// public static void use(yarnwrap.client.gui.hud.spectator.SpectatorMenu menu, ) { net.minecraft.client.gui.hud.spectator.SpectatorMenuCommand.use(menu.wrapperContained); }
public void renderIcon(yarnwrap.client.gui.DrawContext context,float brightness,float alpha) { wrapperContained.renderIcon(context.wrapperContained,brightness,alpha); }
// public static void renderIcon(yarnwrap.client.gui.DrawContext context,float brightness,float alpha, ) { net.minecraft.client.gui.hud.spectator.SpectatorMenuCommand.renderIcon(context.wrapperContained,brightness,alpha); }
public yarnwrap.text.Text getName() { return new yarnwrap.text.Text(wrapperContained.getName()); }
// public static yarnwrap.text.Text getName() { return new yarnwrap.text.Text(net.minecraft.client.gui.hud.spectator.SpectatorMenuCommand.getName()); }
public boolean isEnabled() { return wrapperContained.isEnabled(); }
// public static boolean isEnabled() { return net.minecraft.client.gui.hud.spectator.SpectatorMenuCommand.isEnabled(); }

}