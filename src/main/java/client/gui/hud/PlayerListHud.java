package yarnwrap.client.gui.hud;
public class PlayerListHud { public net.minecraft.client.gui.hud.PlayerListHud wrapperContained; public PlayerListHud(net.minecraft.client.gui.hud.PlayerListHud wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text header() { return new yarnwrap.text.Text(wrapperContained.header); }
// public yarnwrap.text.Text footer() { return new yarnwrap.text.Text(wrapperContained.footer); }
// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public java.util.Comparator ENTRY_ORDERING() { return wrapperContained.ENTRY_ORDERING; }
// public yarnwrap.client.gui.hud.InGameHud inGameHud() { return new yarnwrap.client.gui.hud.InGameHud(wrapperContained.inGameHud); }
// public boolean visible() { return wrapperContained.visible; }
public int MAX_ROWS() { return wrapperContained.MAX_ROWS; }
// public java.util.Map hearts() { return wrapperContained.hearts; }
// public yarnwrap.util.Identifier PING_UNKNOWN_ICON_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.PING_UNKNOWN_ICON_TEXTURE); }
// public yarnwrap.util.Identifier PING_1_ICON_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.PING_1_ICON_TEXTURE); }
// public yarnwrap.util.Identifier PING_2_ICON_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.PING_2_ICON_TEXTURE); }
// public yarnwrap.util.Identifier PING_3_ICON_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.PING_3_ICON_TEXTURE); }
// public yarnwrap.util.Identifier PING_4_ICON_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.PING_4_ICON_TEXTURE); }
// public yarnwrap.util.Identifier PING_5_ICON_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.PING_5_ICON_TEXTURE); }
// public yarnwrap.util.Identifier CONTAINER_HEART_BLINKING_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.CONTAINER_HEART_BLINKING_TEXTURE); }
// public yarnwrap.util.Identifier CONTAINER_HEART_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.CONTAINER_HEART_TEXTURE); }
// public yarnwrap.util.Identifier FULL_HEART_BLINKING_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.FULL_HEART_BLINKING_TEXTURE); }
// public yarnwrap.util.Identifier HALF_HEART_BLINKING_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.HALF_HEART_BLINKING_TEXTURE); }
// public yarnwrap.util.Identifier ABSORBING_FULL_HEART_BLINKING_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.ABSORBING_FULL_HEART_BLINKING_TEXTURE); }
// public yarnwrap.util.Identifier FULL_HEART_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.FULL_HEART_TEXTURE); }
// public yarnwrap.util.Identifier ABSORBING_HALF_HEART_BLINKING_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.ABSORBING_HALF_HEART_BLINKING_TEXTURE); }
// public yarnwrap.util.Identifier HALF_HEART_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.HALF_HEART_TEXTURE); }
public yarnwrap.text.Text getPlayerName(yarnwrap.client.network.PlayerListEntry entry) { return new yarnwrap.text.Text(wrapperContained.getPlayerName(entry.wrapperContained)); }
public void render(yarnwrap.client.gui.DrawContext context,int scaledWindowWidth,yarnwrap.scoreboard.Scoreboard scoreboard,yarnwrap.scoreboard.ScoreboardObjective objective) { wrapperContained.render(context.wrapperContained,scaledWindowWidth,scoreboard.wrapperContained,objective.wrapperContained); }
public void clear() { wrapperContained.clear(); }
public void setVisible(boolean visible) { wrapperContained.setVisible(visible); }
// public void renderScoreboardObjective(yarnwrap.scoreboard.ScoreboardObjective objective,int y,Object scoreDisplayEntry,int left,int right,java.util.UUID uuid,yarnwrap.client.gui.DrawContext context) { wrapperContained.renderScoreboardObjective(objective.wrapperContained,y,scoreDisplayEntry,left,right,uuid,context.wrapperContained); }
// public void renderLatencyIcon(yarnwrap.client.gui.DrawContext context,int width,int x,int y,yarnwrap.client.network.PlayerListEntry entry) { wrapperContained.renderLatencyIcon(context.wrapperContained,width,x,y,entry.wrapperContained); }
public void setFooter(yarnwrap.text.Text footer) { wrapperContained.setFooter(footer.wrapperContained); }
public void setHeader(yarnwrap.text.Text header) { wrapperContained.setHeader(header.wrapperContained); }
// public yarnwrap.text.Text applyGameModeFormatting(yarnwrap.client.network.PlayerListEntry entry,yarnwrap.text.MutableText name) { return new yarnwrap.text.Text(wrapperContained.applyGameModeFormatting(entry.wrapperContained,name.wrapperContained)); }
// public void renderHearts(int y,int left,int right,java.util.UUID uuid,yarnwrap.client.gui.DrawContext context,int score) { wrapperContained.renderHearts(y,left,right,uuid,context.wrapperContained,score); }
// public java.util.List collectPlayerEntries() { return wrapperContained.collectPlayerEntries(); }

}