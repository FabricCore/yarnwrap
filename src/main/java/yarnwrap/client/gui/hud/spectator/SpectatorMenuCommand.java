package yarnwrap.client.gui.hud.spectator;
public class SpectatorMenuCommand { public net.minecraft.client.gui.hud.spectator.SpectatorMenuCommand wrapperContained; public SpectatorMenuCommand(net.minecraft.client.gui.hud.spectator.SpectatorMenuCommand wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.text.Text getName() { return new yarnwrap.text.Text(wrapperContained.getName()); }
public boolean isEnabled() { return wrapperContained.isEnabled(); }
public void use(yarnwrap.client.gui.hud.spectator.SpectatorMenu menu) { wrapperContained.use(menu.wrapperContained); }
public void renderIcon(yarnwrap.client.gui.DrawContext context,float brightness,int alpha) { wrapperContained.renderIcon(context.wrapperContained,brightness,alpha); }

}